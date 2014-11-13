<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<body>
		<form action="services/uploadFileService" method="post" enctype="multipart/form-data">
      		<p>Select a file : <input type="file" name="file" size="50" /></p>
      		<input type="submit" value="Upload" />
   		</form>
	</body>
</html>