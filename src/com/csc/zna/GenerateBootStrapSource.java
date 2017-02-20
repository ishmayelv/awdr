package com.csc.zna;

public class GenerateBootStrapSource {
	
	public static String createBootstrapSource( GenerateForm formInfo){
		
		/*	private String noOfCtrls;
		private String sourceSelected;

		private String[] labelName;
		private String[] ctrlName;
		private String[] ctrlType;
		private String[] ctrlInputSize;*/
		
		int noOfControls = Integer.parseInt( formInfo.getNoOfCtrls() ); 
		
		
		StringBuffer sbBootStrap =new StringBuffer();
		sbBootStrap.append(BootHelper.HTMLSTART);
		
		System.out.println("noOfControls:"+noOfControls);
		
		for(int i=0; i< noOfControls ; i++ ){					
			//LABEL			
			sbBootStrap.append(BootHelper.FORM_DIV_GROIP);
			
			sbBootStrap.append(BootHelper.LABEL_START);
			sbBootStrap.append( formInfo.getCtrlName()[i]);
			sbBootStrap.append(BootHelper.SCOLAN_END);
			sbBootStrap.append( formInfo.getLabelName()[i]);
			sbBootStrap.append(BootHelper.LABEL_CLOSE);
			
			sbBootStrap.append(BootHelper.CTRL_DIV_GROIP);
			 
			// ADDING FORM CONTROL
			System.out.println("formInfo.getCtrlType()[i]) "+ i+" -" +formInfo.getCtrlType()[i] );
			//TEXT BOX	
			if(BootHelper.TEXT.equals(formInfo.getCtrlType()[i])){
				sbBootStrap.append(BootHelper.TEXT_CTRL_START);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.SCOLAN);
				
				sbBootStrap.append(BootHelper.MAXLENGTH);
				sbBootStrap.append(BootHelper.SCOLAN);
				sbBootStrap.append( formInfo.getCtrlInputSize()[i] ) ;
				sbBootStrap.append(BootHelper.SCOLAN);
				sbBootStrap.append(BootHelper.RIGHT_END);
			}//PASSWORD
			else if(BootHelper.PASSWORD.equals(formInfo.getCtrlType()[i])){
				sbBootStrap.append(BootHelper.PWD_CTRL_START);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.SCOLAN);
				sbBootStrap.append(BootHelper.MAXLENGTH);
				sbBootStrap.append(BootHelper.SCOLAN);
				sbBootStrap.append( formInfo.getCtrlInputSize()[i] ) ;
				sbBootStrap.append(BootHelper.SCOLAN);
				sbBootStrap.append(BootHelper.RIGHT_END);
			} // SELECT BOX-DROP DOWN
			else if(BootHelper.SELECTBOX.equals(formInfo.getCtrlType()[i])){
				sbBootStrap.append(BootHelper.SELECTBOX_CTRL_START);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.SCOLAN);				
				sbBootStrap.append(BootHelper.RIGHT_END);
				
				sbBootStrap.append(BootHelper.SELECTBOX_CTRL_END);
				
				
			}//List Box			
			else if(BootHelper.LISTBOX.equals(formInfo.getCtrlType()[i])){
				sbBootStrap.append(BootHelper.LISTBOX_CTRL_START);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.SCOLAN);				
				sbBootStrap.append(BootHelper.RIGHT_END);
				
				sbBootStrap.append(BootHelper.SELECTBOX_CTRL_END);	
			}//text area
			else if(BootHelper.TEXTAREA.equals(formInfo.getCtrlType()[i])){
				sbBootStrap.append(BootHelper.TEXTAREA_CTRL_START);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.SCOLAN);
				
				sbBootStrap.append(BootHelper.MAXLENGTH);
				sbBootStrap.append( formInfo.getCtrlInputSize()[i] ) ;
				sbBootStrap.append(BootHelper.RIGHT_END);
				sbBootStrap.append(BootHelper.TEXTAREA_CTRL_END);
			}
			else if(BootHelper.CHECKBOX.equals(formInfo.getCtrlType()[i])){
				sbBootStrap.append(BootHelper.CHECKBOX_CTRL_START);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.CHECKBOX_CTRL_END);
				
				sbBootStrap.append(BootHelper.CHECKBOX_CTRL_START2);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.CHECKBOX_CTRL_END2);
			}
			else if(BootHelper.RADIO.equals(formInfo.getCtrlType()[i])){
				sbBootStrap.append(BootHelper.RADIO_CTRL_START);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.RADIO_CTRL_END);
				
				sbBootStrap.append(BootHelper.RADIO_CTRL_START2);
				sbBootStrap.append( formInfo.getCtrlName()[i]);
				sbBootStrap.append(BootHelper.RADIO_CTRL_END2);
			}
			
			sbBootStrap.append(BootHelper.DIV_END);
			sbBootStrap.append(BootHelper.DIV_END);
			sbBootStrap.append("\n");			
		}
		
		sbBootStrap.append(BootHelper.HTMLEND);
		
		System.out.println("sbBootStrap.toString() :"+sbBootStrap.toString());
		
		return sbBootStrap.toString();
	}	
	
	private boolean isEmpty(String inputStr){		
		if(inputStr != null && inputStr.length() == 0)
			return true; 
		else
			return false;
	}
		

}
