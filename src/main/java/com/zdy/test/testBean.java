package com.zdy.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testBean {
	@Autowired
	FunctionService a;
	@Autowired
	UseFunctionService b;
	
	public String givemeName(String name)
	{
		return b.SayHello(name);
	}
}
