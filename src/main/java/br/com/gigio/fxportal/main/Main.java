package br.com.gigio.fxportal.main;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import br.com.gigio.fxportal.domain.DynamicParser;
import br.com.gigio.fxportal.enums.DynamicParserFactory;

public class Main {
	
	public static void main(String[] args) {
		DynamicParserFactory parserFactory = DynamicParserFactory.getInstance();
		DynamicParser<String> firstParser = parserFactory.getParser(String.class);
		DynamicParser<byte[]> secondParser = parserFactory.getParser(byte[].class);
		DynamicParser<HSSFWorkbook> thirdParser = parserFactory.getParser(HSSFWorkbook.class);
		
		System.out.println("First Parser => " + firstParser.getName());
		System.out.println("Second Parser => " + secondParser.getName());
		System.out.println("Third Parser => " + thirdParser.getName());
		
		
	}

}
