<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="resources/favicon.ico">
    <link href="resources/styles/grid.css" rel="stylesheet">

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
            <!-- <li class="active"><a href="#">Home</a></li> -->
            <li class="dropdown">
              <a href="index" class="dropdown-toggle" aria-expanded="false"><span class="glyphicon glyphicon-home"></span> Home </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="index">Dashboard </a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Data Management <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
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
                        <li><a href="http://www.4thsource.com" style="padding-top: 0px;
                                                          padding-right: 0px;
                                                          padding-bottom: 0px;
                                                          padding-left: 0px;">
                <img alt="4thSource Logo" src="resources/images/logo_4thsource.jpg">
                </a>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <!-- Main component for a primary marketing message or call to action -->
      <div class="page-header">
        <h1>Priority Setup</h1>
        <p class="lead">Prioritize patients and cases based on customized risk profiles.</p>
	    </div><!-- END/Page-Header -->
    </br></br>
      <div class="row" style="">
            <table class="table table-hover table-condensed" style="margin-top:-41px;">
              <thead>
              <tr>
                <th style="width:15%;">
                  <div class="th-inner "></div>
                  <div class="fht-cell"></div>
                </th>
                <th style="width:45%;">
                  <div class="th-inner ">Description</div>
                  <div class="fht-cell"></div>
                </th>
                <th style="width:20%;">
                  <div class="th-inner ">Priority Value</div>
                  <div class="fht-cell"></div>
                </th>
                <th class="bs-checkbox " style="width:20%;">
                  <div class="th-inner">Apply Priorities</div>
                  <div class="fht-cell"></div>
                </th>
              </tr>
              </thead>
              <tbody>
<!-- Records from the database -->
                <c:forEach var="listValue" items="${list}">
				<tr>
					<td width="10%">
				    	<input type="hidden" name="prioritySetId" id="prioritySetId" value="<c:out value="${listValue.prioritySetId}"/>">

	                    <!--COMMANDS-->
	                    <div class="btn-toolbar right" role="toolbar" aria-label="">
	                      <a href="#" style="text-decoration:none;">
	                      <button id="button-new-priority" type="button" class="btn btn-default" aria-label="Add">
	                        <span class="glyphicon glyphicon-plus" aria-hidden="true"> </span>
	                      </button>
	                      </a>
	                      <a href="javascript:editPriority( <c:out value="${listValue.prioritySetId}"/> )" style="text-decoration:none;">
	                      <button id="button-update-priority" type="button" class="btn btn-default" aria-label="Update">
	                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"> </span>
	                      </button>
	                      </a>
	                      <a href="#" style="text-decoration:none;">
	                      <button id="button-delete-priority" type="button" class="btn btn-default" aria-label="Delete">
	                        <span class="glyphicon glyphicon-trash" aria-hidden="true"> </span>
	                      </button>
	                      </a>
	                    </div><!--END/COMMANDS-->  
    				</td>
				    <td width="50%"><c:out value="${listValue.description}"/></td>
				    <td width="15%"><c:out value="${listValue.priorityValue}"/></td>
    				<td width="15%"><input type="checkbox" 
					    <c:choose>
						    <c:when test="${listValue.enabledFlag}">
		        				checked
		    				</c:when>
	    				</c:choose>    				
    				></td>
			    </tr>
			    </c:forEach>
<!-- Records from the database -->
                </tbody>
              </table>
     </div>
<!-- TABLE -->
    <script> 
		function editPriority(id) {
			var url = "priority_rules_setup";
			var form = $("<form action='" + url + "' method='POST'>" +
						   "<input type='hidden' name='prioritySetId' value='" + id + "' />" +
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