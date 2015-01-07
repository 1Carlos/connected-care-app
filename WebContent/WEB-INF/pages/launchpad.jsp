<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="resources/favicon.ico">
    <link href="resources/styles/grid.css" rel="stylesheet">
    <link href="./css/jasny-bootstrap.min.css" rel="stylesheet">

    <title>Connected Care Solution by 4th Source Inc</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/styles/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/styles/navbar-fixed-top.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="resources/scripts/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
        function goPreview(){
            window.location='preview.html';
        }
    </script>
    <script>
      function hideRow(objName) {
          document.getElementById(objName).style.visibility = "hidden";
      }
    </script>
    <script>
      function loadFile(objName) {
          document.getElementById(objName).innerHTML = "Loading file...";
      }
    </script>
  
  </head>

  <body>

    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index">Connected Care</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="dropdown">
              <a href="index" class="dropdown-toggle" aria-expanded="false"><span class="glyphicon glyphicon-home"></span> Home </a>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Data Management <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="clear_data">Clear Data </a></li>
                <li><a href="import_data">Import Data </a></li>
                <li><a href="launchpad">Launchpad </a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Program Reconciliation <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="run_reconciliation">Run Reconciliation </a></li>
                <li><a href="program_setup">Program Setup </a></li>
                <li><a href="priority_setup">Configure Prioritization </a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Case Management <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="dashboard_setup">Dashboard </a></li>
                <li><a href="view_open_cases">View Open Cases </a></li>
                <li><a href="search_cases">Search Cases </a></li>
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="help"><span class="glyphicon glyphicon-question-sign"></span> Help</a></li>
            <li></li>
            <li>
              <a href="http://www.4thsource.com" style="padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px;">
                <img alt="4thSource Logo" src="resources/images/logo_4thsource.jpg">
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container">
      <div class="page-header">
        <h2>Load External Data - Launchpad</h2>
            <div class="row">
              <!--/Table Records data-row-style="rowStyle"class="table table-hover"--> 
              <table id="table-style"  class="table table-hover table-stripped table-condensed" >
              <thead>
                <th width="30%">File Name</th>              
                <th width="40%">File Summary</th>              
                <th width="30%">Import Summary</th>              
              </thead>
              <tbody>
              <!-- File #1 -->
            	<c:forEach var="listValue" items="${list}">
	        		<tr>
	            	  <td>
	            		<strong><c:out value="${listValue.fileDesc}"/></strong> 
	            		[<c:out value="${listValue.csvName}"/>] 
				   		  <c:choose>
					  	    <c:when test="${listValue.fileStatus == null}">
                              <p><a class="btn btn-success" href="javascript:goToNormalization(<c:out value="${listValue.csvId}"/>)">Load</a>
                       		     <a class="btn btn-info"    href="javascript:previewFile(<c:out value="${listValue.csvId}"/>)">Preview</a>
                        	     <a class="btn btn-danger"  href="javascript:removeFile(<c:out value="${listValue.csvId}"/>)">Remove</a>
                          	  </p>
		    			  	</c:when>
	    					<c:otherwise>
	    				 	  <p><a class="btn btn-warning" >Loaded</a>
		        			     <a class="btn btn-info" href="javascript:previewFile(<c:out value="${listValue.csvId}"/>)">Preview</a>
		        			  </p>
	    				 	</c:otherwise>
	   					  </c:choose>
	            		</td>
	           			<td>
	          			  <!-- Statistics File Summary -->
	     			      <table id="table-fsummary" class="table table-hover" style="width:100%;">
	  			            <thead>
	             			  <tr>
		          	  		    <th style="">
		                   		  <div class="th-inner ">Source Name</div>
		                    	  <div class="fht-cell"></div>
		                		</th>
		                		<th style="">
		                    	  <div class="th-inner ">Patients</div>
		                    	  <div class="fht-cell"></div>
		                		</th>
		                		<th style="">
		                		  <div class="th-inner ">Prescriptions</div>
		                   		  <div class="fht-cell"></div>
		                		</th>
		                		<th style="">
		                   		  <div class="th-inner ">Appointments</div>
		                   	  	  <div class="fht-cell"></div>
		               			</th>
		            		  </tr>
           	                </thead>
                            <c:forEach var="statis" items="${listSummary}">
			    	          <c:choose>
				    	        <c:when test="${listValue.csvId == statis.csvId}">
			            	      <tr>
			            	        <td width="220"><c:out value="${statis.sourceName}"/></td>
			            	        <td width="40" align="right"><c:out value="${statis.patientCount}"/></td>
			            	        <td width="40" align="right"><c:out value="${statis.rx}"/></td>
			            	        <td width="40" align="right"><c:out value="${statis.appt}"/></td>
			            	      </tr>
			                    </c:when>
			                  </c:choose>
	                        </c:forEach>
	                      </table>
	                      <!-- End / Statistics File Summary -->
	                    </td>

	           			<td>
	          			  <!-- Statistics Import Summary -->
	     			      <table id="table-impsummary" class="table table-hover" style="width:100%;">
	  			            
                            <c:forEach var="statim" items="${listImpSummary}">
			    	          <c:choose>
				    	        <c:when test="${listValue.csvId == statim.csvId}">
			            	      <tr>
			            	        <td width="200" align="left"><c:out value="${statim.descrip}"/></td>
			            	        <td width="40" align="right"><c:out value="${statim.quantity}"/></td>			
			            	      </tr>
			                    </c:when>
			                  </c:choose>
	                        </c:forEach>
	                      </table>
	                      <!-- End / Statistics Import Summary -->
	                    </td>	                    
	                    <td>
	                  </td>
	                </tr>	
                  </c:forEach>
                </tbody>
              </table>    				
        </div>  <!-- /row -->
      </div> <!-- /page-header -->
    </div> <!-- /container -->
    
    <script>
    $(function()
    {
        $('hide').click(function()
        {
           $('tr.imported').hide();
        });
    });
    </script> 
    <script> 
		function goToNormalization(id) {
			var url = "normalizationById";
			var form = $("<form action='" + url + "' method='post'>" +
						   "<input type='hidden' name='csvId' value='" + id + "' />" +
			  			 "</form>");
			
			$("body").append(form);
			form.submit();
		}    
	</script> 
    <script>
		function previewFile(id) {
			var url = "previewFile";
			var form = $("<form action='" + url + "' method='post'>" +
						   "<input type='hidden' name='csvId' value='" + id + "' />" +
			  			 "</form>");
			
			$("body").append(form);
			form.submit();
		}    
	</script> 
    <script> 
		function removeFile(id) {
			var url = "removeFileById";
			var form = $("<form action='" + url + "' method='post'>" +
						   "<input type='hidden' name='csvId' value='" + id + "' />" +
			  			 "</form>");
			
			$("body").append(form);
			form.submit();
		}    
	</script> 

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
    <script type="text/javascript" src="resources/scripts/bootstrap-filestyle.min.js"></script>
    <script src="resources/scripts/priority_setup.js"></script>
  

</body>
</html>