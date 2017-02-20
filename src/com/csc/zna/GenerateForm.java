package com.csc.zna;

public class GenerateForm {

	private String noOfCtrls;
	private String sourceSelected;

	private String[] labelName;
	private String[] ctrlName;
	private String[] ctrlType;
	private String[] ctrlInputSize;
	
	public String getNoOfCtrls() {
		
		return noOfCtrls;
	}
	public void setNoOfCtrls(String noOfCtrls) {
		this.noOfCtrls = noOfCtrls;
	}
	
	public String[] getLabelName() {		
		return labelName;
	}
	public void setLabelName(String[] labelName) {
		this.labelName = labelName;
	}
	
	public String[] getCtrlName() {
		return ctrlName;
	}
	public void setCtrlName(String[] ctrlName) {
		this.ctrlName = ctrlName;
	}
	
	public String[] getCtrlType() {
		return ctrlType;
	}
	public void setCtrlType(String[] ctrlType) {
		this.ctrlType = ctrlType;
	}
	
	public String[] getCtrlInputSize() {
		return ctrlInputSize;
	}
	public void setCtrlInputSize(String[] ctrlInputSize) {
		this.ctrlInputSize = ctrlInputSize;
	}
	
	public String getSourceSelected() {
		return sourceSelected;
	}
	
	public void setSourceSelected(String sourceSelected) {
		this.sourceSelected = sourceSelected;
	}
	
}
