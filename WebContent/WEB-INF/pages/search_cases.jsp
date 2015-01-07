<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <link href="resources/styles/jasny-bootstrap.min.css" rel="stylesheet">
    <link href="resources/styles/jquery.dataTables.css" rel="stylesheet">

    <title>Connected Care Solution by 4th Source Inc</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/styles/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/styles/navbar-fixed-top.css" rel="stylesheet">
    <link rel="stylesheet" href="resources/styles/jquery-ui.css" />

    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/jquery-ui.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <script src="resources/scripts/search-cases.js"></script>
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
            <li><span></span></li>
            <li><span></span></li>
            <li>
              <a href="http://www.4thsource.com" style="padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px;">
                <img alt="4thSource Logo" src="resources/images/logo_4thsource.jpg">
              </a>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container">
      <!-- Main component for a primary marketing message or call to action -->
      <div class="page-header">
        <h1>Search Cases</h1>
        <div class="row" style="margin-bottom:0px;">
          <div class="col-md-6" style="background-color:white; border:0;">
            <p class="lead">List of all cases.</p>
          </div>
        </div>
        <!-- Search fields -->
        <div class="row">
          <table class="table-condensed" style="border:1px solid #DDDDDD; ">
            <tbody>
              <tr>
                <td><strong>Case Id: </strong></td>
                <td><input id="caseId" type="text" class="form-control"></td>
                <td><strong>Patient Name: </strong></td>
                <td><input id="patientName" type="text" class="form-control"></td>
              </tr>
              <tr>
                <td><strong>Case Worker: </strong></td>
                <td><input id="caseWorker" type="text" class="form-control"></td>
                <td><strong>Follow Up Date: </strong></td>
                <td>
                	From 
                	<input type="text" size="12" id="fromFollowUpDate" class="form-control datepicker" style="width:100px; display:inline;" /> 
                	To 
                	<input type="text" size="12" id="toFollowUpDate" class="form-control datepicker" style="width:100px; display:inline;" />
                </td>
              </tr>
              <tr>
                <td><strong>Case Status: </strong></td>
                <td>
                  <select id="caseStatus" class="form-control">
                    <option value="2">All</option>
                    <option value="0">Open</option>
                    <option value="1">Close</option>
                  </select>
                </td>
                <td></td>
                <td></td>
              </tr>
              <tr>
                <td>
                </td>
                <td>
                  <br/>
                  <p><a id="search-button" class="btn btn-primary btn-lg" href="javascript:void(0);" role="button">Search</a></p>
                </td>
                <td>
                </td>
                <td>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <br/>
        <div class="row">
          <table id="table-cases" data-height="300" class="table table-striped table-hover display" style="margin-top:-40px;">
            <thead>
	            <tr>
		            <th style="">
		              <div class="th-inner ">Case</div>
		              <div class="fht-cell"></div>
		            </th>
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
<!-- 
		            <th style="">
		              <div class="th-inner ">Diagnosis Code</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Order Actual Date</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Order Schedule Date</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Source Type / Name </div>
		              <div class="fht-cell"></div>
		            </th>
 -->
		            <th style="">
		              <div class="th-inner ">Case Worker</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Follow Up Date</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Order Type</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Case Status</div>
		              <div class="fht-cell"></div>
		            </th>
		    	</tr>
            </thead>
            <tbody data-link="row" class="rowlink">
            </tbody>
          </table>
        </div>
	  </div>
    </div>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
    <script src="resources/scripts/jasny-bootstrap.min.js"></script>
    <script src="resources/scripts/jquery.dataTables.min.js"></script>
    
  </body>
</html>