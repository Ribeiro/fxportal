package br.com.gigio.fxportal.enums;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import br.com.gigio.fxportal.domain.DynamicExcelParser;
import br.com.gigio.fxportal.domain.DynamicParser;
import br.com.gigio.fxportal.domain.DynamicPdfParser;
import br.com.gigio.fxportal.domain.DynamicTextParser;

public enum DynamicParserFactory {
	INSTANCE;
	
	private Map<Key, DynamicParser<?>> parsers;
	
	private DynamicParserFactory() {
		parsers = new HashMap<Key, DynamicParser<?>>();
		parsers.put(new Key(String.class), new DynamicTextParser());
		parsers.put(new Key(byte[].class), new DynamicPdfParser());
		parsers.put(new Key(HSSFWorkbook.class), new DynamicExcelParser());
	}
	
	public static DynamicParserFactory getInstance() {
		return INSTANCE;
	}
	
	@SuppressWarnings("unchecked")
	public <F> DynamicParser<F> getParser(Class<F> fromType) {
		return (DynamicParser<F>) parsers.get(new Key(fromType));
	}
	
	private class Key {
		private Object class1;

		public Key(Object class1) {
			this.class1 = class1;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result
					+ ((class1 == null) ? 0 : class1.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (class1 == null) {
				if (other.class1 != null)
					return false;
			} else if (!class1.equals(other.class1))
				return false;
			return true;
		}


		private DynamicParserFactory getOuterType() {
			return DynamicParserFactory.this;
		}

	}
}
