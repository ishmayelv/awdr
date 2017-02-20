package com.csc.zna;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SourceGenerator {
	
	public String generateSource(GenerateForm formInfo) {
		
		String sbFile=null;
	/*	private String noOfCtrls;
		private String sourceSelected;

		private String[] labelName;
		private String[] ctrlName;
		private String[] ctrlType;
		private String[] ctrlInputSize;*/
		
		System.out.println("Condition 2 "+ formInfo.getSourceSelected() );
		System.out.println("Condition One "+isEmpty(formInfo.getSourceSelected()));

		
	
		sbFile = GenerateBootStrapSource.createBootstrapSource(formInfo);
		
		if( isEmpty(formInfo.getSourceSelected())  && SourceHelper.HTML.equals(formInfo.getSourceSelected() ) )
		{
			sbFile = GenerateBootStrapSource.createBootstrapSource(formInfo);
		}
		try{
			createFile(sbFile,"","");
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		return "";
		
	}
	
	//TO CREATE THE FILE
	private String createFile(String sbFileCreate, String FileName, String path ) throws IOException
	{
			
		//File file = new File( path +FileName );		 
		File file = new File("D:\\htmlGenerate\\one.html");
		System.out.println("sbFileCreate: "+sbFileCreate);
		
		if(file.exists()){
			file.delete();
			System.out.println("File already exist - ");
		}
		//else{
			FileWriter fileWriter = null;
			BufferedWriter bufferedWriter = null;
			try 
			{
				fileWriter 		= new FileWriter(file);
				bufferedWriter  = new BufferedWriter(fileWriter);			
				bufferedWriter.write(sbFileCreate);	
				//bufferedWriter.append("\n");
				bufferedWriter.flush();
				fileWriter.flush();	
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				fileWriter.close();
				bufferedWriter.close();
			}				
		//}//end of else block
		
		return "SUCCESS";
	}
	
	
	private boolean isEmpty(String inputStr){

			if(inputStr != null && inputStr.length() != 0)
			    return true; 
			else
				return false;
	
	}

 

}
