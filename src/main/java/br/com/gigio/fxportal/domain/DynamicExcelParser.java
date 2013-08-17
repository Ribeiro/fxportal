package br.com.gigio.fxportal.domain;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DynamicExcelParser implements DynamicParser<HSSFWorkbook>{
	private String name;
	
	public DynamicExcelParser(){
		this.name = DynamicExcelParser.class.getSimpleName();
	}


	public String getName() {
		return this.name;
	}


	public List<Operation> parser(HSSFWorkbook aFromObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
