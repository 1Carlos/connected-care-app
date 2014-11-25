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

    <title>Connected Care Solution by 4th Source Inc</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/styles/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/styles/navbar-fixed-top.css" rel="stylesheet">

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
                <li><a href="program_setup.html">Program Setup </a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Case Management <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="dashboard_setup.html">Dashboard </a></li>
                <li><a href="view_open_cases">View Open Cases </a></li>
                <li><a href="search_cases.html">Search Cases </a></li>
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li>
              <a href="http://www.4thsource.com" style="padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px;">
                <img alt="4thSource Logo" src="resources/images/logo_4thsource.jpg">
              </a>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="help.html"><span class="glyphicon glyphicon-question-sign"></span> Help</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container">
      <!-- Main component for a primary marketing message or call to action -->
      <div class="page-header">
        <h1>View Cases Open</h1>
        <p class="lead">List of all open patients cases.</p>
        <div class="row"></br></div>
        <div class="row">
	        <table id="table-style" data-height="299" class="table table-hover" style="margin-top: -41px;">
	          <thead>
		          <tr>
		            <th style="">
		              <div class="th-inner ">Case ID</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Patient Last</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Patient First</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Patient DOB</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Diagnosis Code</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Gender</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Case Worker Name</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Order Date</div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Source Type/Name </div>
		              <div class="fht-cell"></div>
		            </th>
		            <th style="">
		              <div class="th-inner ">Gap Type</div>
		              <div class="fht-cell"></div>
		            </th>
		          </tr>
	          </thead>
	          <tbody data-link="row" class="rowlink">
		          <tr>
		            <td>
		              <a href="case_detail_123.html">
		                  123
		              </a>
		            </td>
		            <td style="">Jones</td>
		            <td style="">Don</td>
		            <td style="">1/1/1940</td>
		            <td style="">J17 - Pneumonia</td>
		            <td style="">M</td>
		            <td style="">Smith, Joe</td>
		            <td style="">10/1/2014</td>
		            <td style="">Hospital / St Mary’s</td>
		            <td style="">Rx, Appt</td>
		          </tr>
		          <tr>
		            <td style="">
		              <a href="case_detail_123.html">
		                 124              
		              </a>
		            </td>
		            <td style="">Fayette</td>
		            <td style="">Marge</td>
		            <td style="">3/1/1950</td>
		            <td style="">I25.2 – Myocardial Infacrtion</td>
		            <td style="">F</td>
		            <td style="">Wood, Fran</td>
		            <td style="">10/1/2014</td>
		            <td style="">Hospital / St Mary’s</td>
		            <td style="">Rx</td>
	          	  </tr>
	          </tbody>
	        </table>
        </div>
	  </div>
    </div> 
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
    <script src="resources/scripts/jasny-bootstrap.min.js"></script>
  </body>
</html>