<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>AWDR - Generate Web Page </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<SCRIPT LANGUAGE="JavaScript">

$(document).ready(function(){  
       
    /*$("#noOfCtrls").blur(
	function(){  
		alert("test");
		
	  var name= $("#recipientname").val();
	   alert(name);
		
	if( name>0 )
		//addHtmlContent(name);
	else
		return false;
	} 
     ); */
     
    $("#noOfCtrls").blur(function(){  
	//alert("blur test");
      var name= $("#noOfCtrls").val();
	// alert(name);
      if( name>0 )
	 		addHtmlContent(name);
      else
	 		return false;
    }); 
    
    /* $("#sourceDown").click(function(){  
       $("#sourceDown").hide();  
    }); 
    */
    
    
    
});  

 
function addHtmlContent(noControlsReq){
	//alert(noControlsReq);

	var htmlContent="";
	/*var htmlContent="<table class=\"table table-bordered\"><thead>"+
			"<tr> <th>Label Name</th> "+
			"<th>Enter Name to control </th>"+
			"<th>Select control type </th>"+
			"<th>Size of control </th>  </tr></thead> <tbody>"+
			"<tr> <td> <input type='text' class='col-xs-8'></td>"+
			"<td> <input type='text' class='col-xs-8'></td>"+
			"<td> <select class='form-control' id='exampleSelect1'>"+
					 " <option value=''>- Select - </option>"+
					 " <option>TextBox</option>"+
					 " <option>Password</option> "+
					 " <option>SelectBox</option>"+
					 " <option>ListBox</option>"+
					 " <option>TextArea</option> "+
					 " <option>File</option>"+
					 " <option>Date</option>"+
					 " <option>CheckBox</option>"+
					 " </select> </td>"+
			"<td> <input type='text' class='col-xs-4'> </td> </tr> </table>";
			*/
			
		//}
		
	htmlContent="<table class=\"table table-bordered\"><thead>"+
		"<tr> <th>Label Name</th> "+
		"<th>Enter Name to control </th>"+
		"<th>Select control type </th>"+
		"<th>Size of control </th> </tr></thead> <tbody>"; 
	for (var i = 0; i < noControlsReq; i++) {
		htmlContent = htmlContent + "<tr> <td> <input type='text' name='labelName' class='col-xs-8'></td>"+
		"<td> <input type='text' name='ctrlName'  class='col-xs-8'></td>"+
		"<td> <select class='form-control' name='ctrlType' >"+
				 " <option value=''>- Select - </option>"+
				 " <option value='TEXT'>TextBox</option>"+
				 " <option value='PASSWORD'>Password</option> "+
				 " <option value='SELECTBOX'>SelectBox</option>"+
				 " <option value='LISTBOX'>ListBox</option>"+
				 " <option value='TEXTAREA'>TextArea</option> "+				
				 " <option value='DATE'>Date</option>"+
				 " <option value='CHECKBOX'>CheckBox</option>"+
				 " <option value='FILE'>File</option>"+
				 " </select> </td>"+
		"<td> <input type='text' name='ctrlInputSize' class='col-xs-4'> </td> </tr>";
	 }
	
	 htmlContent= htmlContent + " </table>";
	 //alert(htmlContent);
	 $("#grd").html(htmlContent);
	 $("#sourceDown").show();
 
} 


</SCRIPT>
 
</head>

<body>

<div class="container">

	 <form class="form-horizontal"  id="taginsertform" action="submitform" method="post" >
		<br/>
		<div class="form-group row">
			<div class="col-xs-8">
				<img  align="right"  src="zip2017.gif" class="img-responsive">
			</div>
			<div class="col-xs-4">
				<img align="left" src="csc.png" class="img-responsive">
		    </div>			
		</div>

		<div class="form-group">
		 <div class="col-xs-12">
		  <h3 align="center"> ZiP 2017 - Automate web design and Reuse </h3>
		 </div>
		</div>
	 
		<div class="form-group">
			<label for="txtNoForms" class="control-label col-xs-4">Enter No.of form controls required </label>
			<div class="col-xs-2">
				<input type="text" class="form-control danger" id="noOfCtrls" name="noOfCtrls" placeholder="Enter number" required>
			</div>
		</div>

		<div id="grd" class="form-group">
		<table class="table table-bordered">
			<thead>
			  <tr> <th>Label Name</th>
				<th>Enter Name to control </th>
				<th>Select control type </th>
				<th>Size of control </th>
			  </tr>
			</thead>
			<tbody>
			<tr>
				<td> <input type="text" class="col-xs-8" ></td>
				<td> <input type="text" class="col-xs-8"></td>
				<td> <select class="form-control" id="exampleSelect1">
						  <option>- Select - </option>
						  <option>TextBox</option>
						  <option>Password</option>
						  <option>SelectBox</option>
						  <option>ListBox</option>
						  <option>TextArea</option>
						  <option>File</option>
						  <option>Date</option>
						  <option>CheckBox</option>
					</select> </td>
				<td> <input type="text" class="col-xs-4"></td>
			</tr>
			<tr>
				<td> <input type="text" class="col-xs-8" ></td>
				<td> <input type="text" class="col-xs-8"></td>
				<td> <select class="form-control" id="exampleSelect1">
						  <option>- Select - </option>
						  <option>TextBox</option>
						  <option>Password</option>
						  <option>SelectBox</option>
						  <option>ListBox</option>
						  <option>TextArea</option>
						  <option>File</option>
						  <option>Date</option>
					</select>
				</td>
				<td> <input type="text" class="col-xs-4"></td>
			</tr>
			<tr>
				<td> <input type="text" class="col-xs-8" ></td>
				<td> <input type="text" class="col-xs-8"></td>
				<td> 
					<select class="form-control" id="exampleSelect1">
						  <option>- Select - </option>
						  <option>TextBox</option>
						  <option>Password</option>
						  <option>SelectBox</option>
						  <option>ListBox</option>
						  <option>TextArea</option>
						  <option>File</option>
						  <option>Date</option>

					</select>
					</td>
				<td> <input type="text" class="col-xs-4"></td>
			  </tr>


			</tbody>
		  </table>
		</div>
		
		<div id="sourceDown" class="form-group" >  
			<div class="form-group">
				<label for="txtNoForms" class="control-label col-xs-4">Select the source code required </label>
				<div class="col-xs-2">
					<select class="form-control" name="sourceSelected"  >
						<option value="0">- Select - </option>
						<option value="html">html</option>
						<option value="jsp">jsp</option>
						<option value="vb">VB</option>
					</select>
				</div>
			</div>
			<br/>			
			<div class="row">
				<div class="col-xs-5" >	</div>
				<div class="col-xs-2" >
					<input type="submit" class="btn btn-primary " value="Download">
				</div>
			 </div>
		</div>
		
		
	
	
	</form>
 </div>

</body>
</html>
