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
        <h1>Configure Priority Set</h1>
        <p class="lead">Define the rules that drive the priority set</p>
        <div class="row">
        </div>
		<!-- TABLE -->
		<div align="right">

		</div><!--END/RIGHT -->
	  </div><!-- END/Page-Header -->

	<div class="fixed-table-container" style="height: 244px; padding-bottom: 37px;">
	  </br>
<!-- Priority Head Description -->
            <table class="table table-hover table-condensed" style="margin-top:-41px;">
              <thead>
              <tr>
                <th style="width:600px">Description</th>
                <th style="">Priority Value</th>
                <th style=""></th>
                <th style=""></th>
                <th style=""></th>
              </tr>
              </thead>
              <tbody>
                <tr>
  						    <td><input type="text" value="Men 75+ with Diabetes and Glaucoma" size=70></td>
  						    <td><input type="text" value="100" size=10></td>
                  <td></td>
                  <td></td>
                  <td></td>
						    </tr>
              </tbody>
              </table>
<!-- Priority Set Rules -->
              </br>
              <h4>Priority Set Rules</h4>
              </br></br></br>
              <table class="table table-hover table-condensed" style="margin-top:-41px;">
              <thead>
                <tr>
                  <th style=""></th>
                  <th style="">Type</th>
                  <th style="">Operator</th>
                  <th style="">Constant 1</th>
                  <th style="">Constant 2</th>
                </tr>
              </thead>
              <tbody>
<!-- RECORD #1-->
                <tr>
                  <td>
                    <!--TOOLBAR-->
                    <div class="btn-toolbar right" role="toolbar" aria-label="">
                      <button id="button-new-record" type="button" class="btn btn-default" aria-label="Add ICD Code">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"> </span>
                      </button>
                      <button id="button-delete-record" type="button" class="btn btn-default" aria-label="Remove ICD Code">
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"> </span>
                      </button>
                    </div><!--END/TOOLBAR-->  
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Rule Type...</option>
                      <option value"0">Diagnosis Code</option>
                      <option value"0" selected>Gender</option>
                      <option value"0">Age</option>
                      <option value"0">Order Type</option>
                      <option value"0">Order Detail</option>
                      <option value"0">Order Age in Days</option>
                      <option value"0">Case Age in Days</option>
                    </select>
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Operator...</option>
                      <option value"0" selected>Equals (=)</option>
                      <option value"0">is greather than (>)</option>
                      <option value"0">is greather than or equal to (>=)</option>
                      <option value"0">is less than (<)</option>
                      <option value"0">is less than or equal to (<=)</option>
                      <option value"0">is between</option>
                      <option value"0">is in the list</option>
                      <option value"0">start with</option>
                    </select>
                  </td>
                  <td>
                    <input type="text" value="M" size=10>
                  </td>
                  <td>
                    <input type="text" value="" size=10>
                  </td>
                </tr>
<!-- RECORD #2-->
                <tr>
                  <td>
                    <!--TOOLBAR-->
                    <div class="btn-toolbar right" role="toolbar" aria-label="">
                      <button id="button-new-record" type="button" class="btn btn-default" aria-label="Add ICD Code">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"> </span>
                      </button>
                      <button id="button-delete-record" type="button" class="btn btn-default" aria-label="Remove ICD Code">
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"> </span>
                      </button>
                    </div><!--END/TOOLBAR-->  
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Rule Type...</option>
                      <option value"0" selected>Diagnosis Code</option>
                      <option value"0">Gender</option>
                      <option value"0">Age</option>
                      <option value"0">Order Type</option>
                      <option value"0">Order Detail</option>
                      <option value"0">Order Age in Days</option>
                      <option value"0">Case Age in Days</option>
                    </select>
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Operator...</option>
                      <option value"0" selected>Equals (=)</option>
                      <option value"0">is greather than (>)</option>
                      <option value"0">is greather than or equal to (>=)</option>
                      <option value"0">is less than (<)</option>
                      <option value"0">is less than or equal to (<=)</option>
                      <option value"0">is between</option>
                      <option value"0">is in the list</option>
                      <option value"0">start with</option>
                    </select>
                  </td>
                  <td>
                    <input type="text" value="E11" size=10>
                  </td>
                  <td>
                    <input type="text" value="" size=10>
                  </td>
                </tr>
<!--RECORD #3-->
                <tr>
                  <td>
                    <!--TOOLBAR-->
                    <div class="btn-toolbar right" role="toolbar" aria-label="">
                      <button id="button-new-record" type="button" class="btn btn-default" aria-label="Add ICD Code">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"> </span>
                      </button>
                      <button id="button-delete-record" type="button" class="btn btn-default" aria-label="Remove ICD Code">
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"> </span>
                      </button>
                    </div><!--END/TOOLBAR-->  
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Rule Type...</option>
                      <option value"0" selected>Diagnosis Code</option>
                      <option value"0">Gender</option>
                      <option value"0">Age</option>
                      <option value"0">Order Type</option>
                      <option value"0">Order Detail</option>
                      <option value"0">Order Age in Days</option>
                      <option value"0">Case Age in Days</option>
                    </select>
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Operator...</option>
                      <option value"0" selected>Equals (=)</option>
                      <option value"0">is greather than (>)</option>
                      <option value"0">is greather than or equal to (>=)</option>
                      <option value"0">is less than (<)</option>
                      <option value"0">is less than or equal to (<=)</option>
                      <option value"0">is between</option>
                      <option value"0">is in the list</option>
                      <option value"0">start with</option>
                    </select>
                  </td>
                  <td>
                    <input type="text" value="E77" size=10>
                  </td>
                  <td>
                    <input type="text" value="" size=10>
                  </td>
                </tr>
<!--RECORD #4-->
                <tr>
                  <td>
                    <!--TOOLBAR-->
                    <div class="btn-toolbar right" role="toolbar" aria-label="">
                      <button id="button-new-record" type="button" class="btn btn-default" aria-label="Add ICD Code">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"> </span>
                      </button>
                      <button id="button-delete-record" type="button" class="btn btn-default" aria-label="Remove ICD Code">
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"> </span>
                      </button>
                    </div><!--END/TOOLBAR-->  
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Rule Type...</option>
                      <option value"0">Diagnosis Code</option>
                      <option value"0">Gender</option>
                      <option value"0" selected>Age</option>
                      <option value"0">Order Type</option>
                      <option value"0">Order Detail</option>
                      <option value"0">Order Age in Days</option>
                      <option value"0">Case Age in Days</option>
                    </select>
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Operator...</option>
                      <option value"0">Equals (=)</option>
                      <option value"0">is greather than (>)</option>
                      <option value"0" selected>is greather than or equal to (>=)</option>
                      <option value"0">is less than (<)</option>
                      <option value"0">is less than or equal to (<=)</option>
                      <option value"0">is between</option>
                      <option value"0">is in the list</option>
                      <option value"0">start with</option>
                    </select>
                  </td>
                  <td>
                    <input type="text" value="75" size=10>
                  </td>
                  <td>
                    <input type="text" value="" size=10>
                  </td>
                </tr>
<!--RECORD #5-->
                <tr>
                  <td>
                    <!--TOOLBAR-->
                    <div class="btn-toolbar right" role="toolbar" aria-label="">
                      <button id="button-new-record" type="button" class="btn btn-default" aria-label="Add ICD Code">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"> </span>
                      </button>
                      <button id="button-delete-record" type="button" class="btn btn-default" aria-label="Remove ICD Code">
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"> </span>
                      </button>
                    </div><!--END/TOOLBAR-->  
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Rule Type...</option>
                      <option value"0">Diagnosis Code</option>
                      <option value"0">Gender</option>
                      <option value"0">Age</option>
                      <option value"0">Order Type</option>
                      <option value"0">Order Detail</option>
                      <option value"0">Order Age in Days</option>
                      <option value"0">Case Age in Days</option>
                    </select>
                  </td>
                  <td>
                    <select>
                      <option value"0">Select a Operator...</option>
                      <option value"0">Equals (=)</option>
                      <option value"0">is greather than (>)</option>
                      <option value"0">is greather than or equal to (>=)</option>
                      <option value"0">is less than (<)</option>
                      <option value"0">is less than or equal to (<=)</option>
                      <option value"0">is between</option>
                      <option value"0">is in the list</option>
                      <option value"0">start with</option>
                    </select>
                  </td>
                  <td>
                    <input type="text" value="" size=10>
                  </td>
                  <td>
                    <input type="text" value="" size=10>
                  </td>
                </tr>
<!-- Records from the database -->
                </tbody>
              </table>
              <div class="row" align="center">
                <!--/Save Button-->
              </br></br>
                <tr>
                  <td>
                    <a class="btn btn-primary btn-sm" href="priority_setup" role="button">Cancel Changes</a>
                    <a class="btn btn-primary btn-sm" href="priority_setup" role="button">Save Changes</a>
                  </td>
                </tr>
              </div> <!-- /container -->

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
    <script src="resources/scripts/priority_setup.js"></script>

</body>
</html>