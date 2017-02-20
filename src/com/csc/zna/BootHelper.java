package com.csc.zna;

import java.util.Map;
import java.util.HashMap;

public class BootHelper {
	
	public static final String HTMLSTART="<!DOCTYPE html> \n "
			+ " <html lang='en'>\n"
			+ "	<head>\n"
			+ " <title>Bootstrap Example</title>\n"
			+ " <meta charset='utf-8'>\n"
			+ " <meta name='viewport' content='width=device-width, initial-scale=1'>\n"
			+ " <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'> \n"
			+ " <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>\n "
			+ " <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>\n"
			+ " </head>\n"
			+ " <body>\n"
			+ "	<div class='container'>\n"
			+ "	<h2> AWD Form </h2>\n"
			+ "<form class='form-horizontal'> \n ";
	
	public static final String HTMLEND = " </form> \n </div> \n </body>\n </html>";
	
	/*	<!DOCTYPE html>
	<html lang="en">
	<head>
	  <title>Bootstrap Example</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>

	<div class="container">
	  <h2>Horizontal form</h2>
	  
	  */
	
	public static final String FORM_CTRL=" class='form-control'";
	public static final String FORM_DIV_GROIP =" <div class='form-group'>\n"; 
	public static final String DIV_END="</div>\n";
	
	public static final String CTRL_DIV_GROIP =" <div class='col-sm-10'>\n";
	
	public static final String MAXLENGTH =" maxlength=";
	
	
	public static final String LABEL_START=" <label class='control-label col-sm-2' for='"; 
	public static final String LABEL_CLOSE=" </label>\n"; 
	public static final String SCOLAN_END="'> ";
	public static final String SCOLAN="' ";
	
	
	public static final String FROM_CTRL_CALSS=" class='form-control' id='";
	public static final String TEXT= "TEXT";
	public static final String TEXT_CTRL_START=" <input type='text' value='' id='";
	
	
	
	public static final String PASSWORD="PASSWORD";
	public static final String PWD_CTRL_START=" <input type='password' value='' id='";
	
	public static final String SELECTBOX ="SELECTBOX";	
	
	
	public static final String SELECTBOX_CTRL_START ="\n <select  id='";
	public static final String SELECTBOX_CTRL_END = " \n<option value='0'>--SELECT--</option>\n"
													+ " <option value='1'>1</option>\n"
													+ " <option value='2'>2</option>\n"
													+ " </select>\n ";	
	public static final String RIGHT_END =">";	
	
	
	 
	public static final String LISTBOX ="LISTBOX";
	public static final String LISTBOX_CTRL_START ="\n<select multiple id='";
	
	
	public static final String TEXTAREA ="TEXTAREA";	
	public static final String TEXTAREA_CTRL_START ="<textarea  rows='5' id='";
	public static final String TEXTAREA_CTRL_END ="</textarea>";
	
	
	public static final String CHECKBOX = "CHECKBOX" ;	
	public static final String CHECKBOX_CTRL_START	= " \n<label class='checkbox-inline'>" +
													  " <input type='checkbox' value='1' id='";
	public static final String CHECKBOX_CTRL_END 	= "'>ONE</label>\n";
	public static final String CHECKBOX_CTRL_START2	= " <label class='checkbox-inline'>\n" +
			 										  " <input type='checkbox' value='2' id='";
	public static final String CHECKBOX_CTRL_END2 	= "'>TWO</label>\n";

	
	public static final String RADIO 			= "RADIO" ;	
	public static final String RADIO_CTRL_START	= "\n<label class='checkbox-inline'>" +
													  "\n <input type='checkbox' value='1' id='";
	public static final String RADIO_CTRL_END 	= "'>ONE</label>\n";
	
	public static final String RADIO_CTRL_START2= "<label class='checkbox-inline'>\n" +
			 									  " <input type='checkbox' value='2' id='";
	public static final String RADIO_CTRL_END2 	= "'>TWO</label>\n";
	
	
	
	
	
	public static final String DATE ="DATE";	
	public static final String DATE_CTRL_START ="DATE";
	
	public static final String FILE ="FILE" ;
	public static final String FILE_CTRL_START ="FILE";
	
	

/*	<label class="checkbox-inline">
    	<input type="radio" name="name1" value="">Option 1
    </label>
    */
	
 
	Map<String, String> formCtrlType =null;
	
	BootHelper(){
	 if(formCtrlType==null)
		 formCtrlType = new HashMap<String, String>();
	 
		 formCtrlType.put(TEXT, TEXT_CTRL_START+FROM_CTRL_CALSS);
		 formCtrlType.put(PASSWORD, PWD_CTRL_START+FROM_CTRL_CALSS);
		 
		
		 formCtrlType.put(SELECTBOX, SELECTBOX_CTRL_START+FROM_CTRL_CALSS);
		 formCtrlType.put(LISTBOX, LISTBOX_CTRL_START+FROM_CTRL_CALSS);
		 
		 formCtrlType.put(TEXTAREA, TEXT_CTRL_START+FROM_CTRL_CALSS);
		 
		 formCtrlType.put(CHECKBOX, TEXT_CTRL_START+FROM_CTRL_CALSS);
		 formCtrlType.put(DATE, TEXT_CTRL_START+FROM_CTRL_CALSS);
		 formCtrlType.put(FILE, TEXT_CTRL_START+FROM_CTRL_CALSS);
		 formCtrlType.put(RADIO, TEXT_CTRL_START+FROM_CTRL_CALSS);
		 
	}
    
 	/*  <textarea class="form-control" rows="5" id="comment"></textarea>
 	 
			 	" <OPTION VALUE='TEXTBOX'>TEXTBOX</OPTION>"+
				" <OPTION VALUE='PASSWORD'>PASSWORD</OPTION> "+
				" <OPTION VALUE='SELECTBOX'>SELECTBOX</OPTION>"+
				" <OPTION VALUE='LISTBOX'>LISTBOX</OPTION>"+
				" <OPTION VALUE='TEXTAREA'>TEXTAREA</OPTION> "+				
				" <OPTION VALUE='DATE'>DATE</OPTION>"+
				" <OPTION VALUE='CHECKBOX'>CHECKBOX</OPTION>"+
				" <OPTION VALUE='FILE'>FILE</OPTION>"+
	
			 <input type="text" class="form-control" id="usr">
			 <input type="password" class="form-control" id="pwd">
	
		<label class="radio-inline"><input type="radio" name="optradio">Option 3</label>
		<label class="radio-inline"><input type="radio" name="optradio">Option 3</label>
	
	
	 */

	
	

}
