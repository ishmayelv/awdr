<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
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
  <h2> Download Source </h2>
  <form class="form-horizontal">
   
     <div class="form-group">
      <label class="control-label col-sm-2" for="email">This is page : <s:property value="source"/> </label>
      
      <div class="col-sm-10">
        <a href='<s:property value="source" />'class="btn btn-info" role="button">Link Button</a>
      </div>
    </div>
   
  </form>
</div>

</body>
</html>
