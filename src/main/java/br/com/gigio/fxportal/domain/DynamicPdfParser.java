package br.com.gigio.fxportal.domain;

import java.util.List;

public class DynamicPdfParser implements DynamicParser<byte[]> {
	private String name;


	public DynamicPdfParser() {
		this.name = DynamicPdfParser.class.getSimpleName();
	}


	public List<Operation> parser(byte[] byteArray) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getName(){
		return this.name;
	}

}
