package br.com.gigio.fxportal.domain;

import java.util.List;

public interface DynamicParser <FROM>{
	public List<Operation> parser(FROM aFromObject);
	public String getName();

}
