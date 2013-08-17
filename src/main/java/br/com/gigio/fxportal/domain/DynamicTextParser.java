package br.com.gigio.fxportal.domain;

import java.util.List;

public class DynamicTextParser implements DynamicParser<String> {
	private String name;
	
	public DynamicTextParser(){
		this.name = DynamicTextParser.class.getSimpleName();
	}

	public List<Operation> parser(String aFromObject) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return this.name;
	}

}
