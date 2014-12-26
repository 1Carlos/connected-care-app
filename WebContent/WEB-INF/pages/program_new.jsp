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
	<link href="resources/styles/ui-element.css" rel="stylesheet">

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
        <h1>Program Setup</h1>
        <p class="lead">In this page you will set all ICD-10 codes that need for follow-up in all patient's cases.</p>
        <div class="row">
			<!-- <div class="col-lg">Here add, update and delete the ICD-10 codes for the main program.
			</div>  -->
        </div>
		<!-- TABLE -->
		<div align="right">
		  <!--TOOLBAR-->
		  <div class="btn-toolbar right" role="toolbar" aria-label="">
		    <button id="cancel-data-validation" type="button" class="btn btn-default" aria-label="Cancel">
		      <span class="glyphicon glyphicon-remove" aria-hidden="true">  </span>
		    </button>
		    <button id="confirm-new-data" type="button" class="btn btn-default" aria-label="Save">
		      <span class="glyphicon glyphicon-ok" aria-hidden="true">  </span>
		    </button>
		  </div><!--END/TOOLBAR-->  
		</div><!--END/RIGHT -->
	  </div><!-- END/Page-Header -->

	<div class="fixed-table-container" style="height: 244px; padding-bottom: 37px;">
	  </br>
            <table class="table table-hover table-condensed" style="margin-top:-41px;">
                        <thead>
                        <tr>
                          <th class="bs-checkbox " style="width: 36px; ">
                            <div class="th-inner "></div>
                            <div class="fht-cell"></div>
                          </th>
                          <th style="">
                            <div class="th-inner ">ICD-10</div>
                            <div class="fht-cell"></div>
                          </th>
                          <th style="">
                            <div class="th-inner ">Rx Adherence</div>
                            <div class="fht-cell"></div>
                          </th>
                          <th style="">
                            <div class="th-inner ">Appt Adherenece</div>
                            <div class="fht-cell"></div>
                          </th>
                          <th style="">
                            <div class="th-inner ">Education</div>
                            <div class="fht-cell"></div>
                          </th>
                        </tr>
                        </thead>
                    <tbody>
		               	  <tr>
							<td></td>
							<td>
								<input type="text" id="icdCode" size="6" required>
							</td>
							<td>
								<select name="rxAdherence" id="rxAdherence" required>
								  <option value="1">Yes</option>
								  <option value="0">No</option>
								</select>
							</td>
							<td>
								<select name="apptAdherence" id="apptAdherence" required>
								  <option value="1">Yes</option>
								  <option value="0">No</option>
								</select>
							</td>
							<td>
								<select name="education" id="education" required>
								  <option value="1">Yes</option>
								  <option value="0">No</option>
								</select>
							</td>
		               	  </tr>

<!-- Records from the database -->
		                <c:forEach var="listValue" items="${list}">
		               	  <tr>
						    <td>
						    	<input type="hidden" name="icd10ProgramsId" value="<c:out value="${listValue.icd10ProgramsId}"/>">
							    <input type="hidden" name="icdCodeId" value="<c:out value="${listValue.icdCodeId.icdCodeId}"/>">
						    </td>
						    <td>
							    <c:out value="${listValue.icdCodeId.icdCode} - ${listValue.icdCodeId.codeDesc1}"/>
						    </td>
						    <td>
							    <c:choose>
								    <c:when test="${listValue.rxAdherence == 0}">
				        				NO
				    				</c:when>
				    				<c:otherwise>
				        				YES
				    				</c:otherwise>
			    				</c:choose>
		    				</td>
		    				<td>
							    <c:choose>
								    <c:when test="${listValue.apptAdherence == 0}">
				        				NO
				    				</c:when>
				    				<c:otherwise>
				        				YES
				    				</c:otherwise>
			    				</c:choose>
		    				</td>
		    				<td>
							    <c:choose>
								    <c:when test="${listValue.education == 0}">
				        				NO
				    				</c:when>
				    				<c:otherwise>
				        				YES
				    				</c:otherwise>
			    				</c:choose>
		    				</td>
						  </tr>
					    </c:forEach>
<!-- Records from the database -->
                      </tbody>
                    </table>
            </div>
     </div>
<!-- TABLE -->





    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript" src="resources/scripts/bootstrap-filestyle.min.js"></script>  
    <script src="resources/scripts/program_setup.js"></script>

</body>
</html>