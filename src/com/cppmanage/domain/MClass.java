package com.cppmanage.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class MClass {
	private String clsid;
	private String clsname;
	private String tchid;
	
	@Override
	public String toString()
	{
		return "MClass [clsid=" + clsid + ",clsname=" + clsname + ",tchid=" + tchid;
	}
}
