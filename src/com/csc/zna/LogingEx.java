package com.csc.zna;
import com.opensymphony.xwork2.ActionSupport;

public class LogingEx extends ActionSupport {

	private static final long serialVersionUID = -2613425890762568273L;

	public String welcome()	{
		return "welcome";		
	}
	
	public String page1()
	{
		return "page1";		
	}
	public String page2()
	{
		return "page2";		
	}	
	public String about()
	{
		return "about";		
	}	
	
	public String generate()
	{
		return "generate";		
	}	
	
	
}
