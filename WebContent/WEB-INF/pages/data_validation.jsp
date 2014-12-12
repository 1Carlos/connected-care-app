<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

    <title>Connected Care Solution by 4th Source Inc</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/styles/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/styles/navbar-fixed-top.css" rel="stylesheet">

	<script src="resources/scripts/jquery.min.js"></script>
	<script src="resources/scripts/data-validation.js"></script>
    <script src="resources/scripts/ie-emulation-modes-warning.js"></script>
  </head>
  <body>
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
              <ul class="dropdown-menu" role="menu">
                <li><a href="index">Dashboard </a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Data Management <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="import_data">Import Data </a></li>
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
      <!-- Main component for a primary marketing message or call to action -->
      <div class="page-header">
        <h1>Data Validation</h1>
        <p class="lead"></p>
      </div>
        <center>
          <div class="" style="col-md-6">
            <center>
            <br/>
            <br/>
            <p>
            	<a id="confirm-data-validation" class="btn btn-primary btn-lg" role="button">Confirm to Import</a>
            	<a id="cancel-data-validation" class="btn btn-danger btn-lg" role="button">Cancel</a>
            </p>
            <br/>
            <div class="alert alert-success">File was loaded.</div>
            <div class="alert alert-warning" role="alert"><c:out value="${rowsLoaded}"/> of <c:out value="${rowsInFile}"/> records were loaded.</div>
            <c:if test="${rowsNotLoaded > 0}">
   				<div class="alert alert-danger" role="alert"><c:out value="${rowsNotLoaded}"/> record(s) cannot be loaded...</div>
			</c:if>
            <br/>
            <br/>
            <input type="hidden" id="idFile" value="<c:out value="${idFile}"/>" />
            <input type="hidden" id="rowsLoaded" value="<c:out value="${rowsLoaded}"/>" />
           	<table id="table-style" data-height="299" class="table table-hover" style="margin-top: -41px;" data-row-style="rowStyle">
              <thead>
                <tr>
                  <th style="">
                    <div class="th-inner ">Patient Last Name</div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Patient First Name</div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Patient DOB</div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Gender</div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Diagnosis Code</div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Case Worker Name</div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Order Actual Date</div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Source Type / Name </div>
                    <div class="fht-cell"></div>
                  </th>
                  <th style="">
                    <div class="th-inner ">Order Type</div>
                    <div class="fht-cell"></div>
                  </th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="listValue" items="${list}">
               	  <tr>
				    <td><c:out value="${listValue.patientLastName}"/></td>
				    <td><c:out value="${listValue.patientFirstName}"/></td>
				    <td><fmt:formatDate pattern="yyyy-MM-dd" value="${listValue.patientDateOfBirth}" /></td>
				    <c:choose>
					    <c:when test="${listValue.patientGender == 0}">
	        				<td>F</td>
	    				</c:when>
	    				<c:otherwise>
	        				<td>M</td>
	    				</c:otherwise>
    				</c:choose>
    				<td><c:out value="${listValue.diagnosisCode1}"/></td>
				    <td><c:out value="${listValue.caseWorkerLastName}, ${listValue.caseWorkerFirstName}"/></td>
				    <td><fmt:formatDate pattern="yyyy-MM-dd" value="${listValue.orderActualDate}" /></td>
				    <td><c:out value="${listValue.sourceType} / ${listValue.sourceName}"/></td>
				    <td><c:out value="${listValue.orderType}"/></td>
				  </tr>
			    </c:forEach>
              </tbody>
            </table>  
            </center>
          </div>
        </center>
      </div>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript" src="resources/scripts/bootstrap-filestyle.min.js"></script>  
  </body>
</html>