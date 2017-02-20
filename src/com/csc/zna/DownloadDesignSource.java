package com.csc.zna;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DownloadDesignSource extends ActionSupport implements ModelDriven<GenerateForm> {

	SourceGenerator sg=null;
	private String source		= "D:\\htmlGenerate\\one.html";
	private String contextPath	= null;
	
	public HttpServletRequest request=null;
	
	
 	@Override
	public String execute(){
 		
 		System.out.println("getNoOfCtrls 		:"+ user.getNoOfCtrls() ); 		
 		System.out.println("getSourceSelected 	:"+ user.getSourceSelected());
 		
 		System.out.println("getCtrlType : "+ user.getCtrlType().length);
 		
 		request=ServletActionContext.getRequest();
 		contextPath = request.getContextPath();
 		
 		System.out.println("contextPath: "+ contextPath );
 		System.out.println("getRealPath: "+ request.getRealPath("/") );
 		
 		System.out.println("getRequestURI: "+ request.getRequestURI() );
 		
 		
 		String strLableNames[]=user.getLabelName();
 		if(sg==null)
 			sg=new SourceGenerator();
 		
 		
 		sg.generateSource(user);
 		
 		for (String a  : strLableNames) {
 	         System.out.print( a+ " ");
 	    }
 		
 	
 		return "downLoadFile";
 		
	}
 
 	public String getSource() {
		return source;
	}
 	
 	
	
	private GenerateForm user = new GenerateForm();
	
	
	 

	@Override
	public GenerateForm getModel() {
		return user;
	}

	public GenerateForm getUser() {
		return user;
	}

	public void setUser(GenerateForm user) {
		this.user = user;
	}

}
