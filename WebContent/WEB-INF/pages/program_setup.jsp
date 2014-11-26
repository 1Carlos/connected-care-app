<!DOCTYPE html>
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
            <li><a href="http://www.4thsource.com"><img alt="4thSource Logo" src="resources/images/logo_4thsource.jpg"></a></li>
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
			<div class="col-lg">Here add, update and delete the ICD-10 codes for the main program.
			</div>
        </div>
<!-- TABLE -->
<div align="right">
  <!--TOOLBAR-->
  <div class="btn-toolbar right" role="toolbar" aria-label="">
    <button type="button" class="btn btn-default" aria-label="Add ICD Code">
      <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
    </button>
    <button type="button" class="btn btn-default" aria-label="Modify ICD Code">
      <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
    </button>
    <button type="button" class="btn btn-default" aria-label="Modify ICD Code">
      <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
    </button>
  </div>  
</div>
</div>
<div class="fixed-table-container" style="height: 244px; padding-bottom: 37px;">
  </br>
            <div class="fixed-table-body">
              <div class="fixed-table-loading" style="top: 37px; display: none;">Loading, please wait…</div>
            <table data-url="data3.json" data-height="299" data-show-columns="true" data-id-field="id" class="table table-hover" style="margin-top: -41px;">
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
                          <th style="">
                            <div class="th-inner ">Measurement</div>
                            <div class="fht-cell"></div>
                          </th>
                        </tr>
                        </thead>
                    <tbody>
                      <tr data-index="0" class="">
                        <td class="bs-checkbox">
                          <input data-index="0" name="btSelectItem" type="radio" value="0">
                        </td>
                        <td style="">J17 - Pneumonia</td>
                        <td style="">Yes</td>
                        <td style="">Yes</td>
                        <td style="">No</td>
                        <td style="">Yes</td>
                      </tr>
                      <tr data-index="0" class="">
                        <td class="bs-checkbox">
                          <input data-index="0" name="btSelectItem" type="radio" value="0">
                        </td>
                        <td style="">I25.2 – Myocardial Infarction</td>
                        <td style="">Yes</td>
                        <td style="">Yes</td>
                        <td style="">No</td>
                        <td style="">Yes</td>
                      </tr>
                      <tr data-index="0" class="">
                        <td class="bs-checkbox">
                          <input data-index="0" name="btSelectItem" type="radio" value="0">
                        </td>
                        <td style="">Z96.4 – Hip Replacement</td>
                        <td style="">No</td>
                        <td style="">No</td>
                        <td style="">No</td>
                        <td style="">No</td>
                      </tr>
                        
                      </tbody>
                    </table>
                  </div>
                  <div class="fixed-table-pagination">
                  </div>
                </div>
              </div>
<!-- TABLE -->



	  </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript" src="resources/scripts/bootstrap-filestyle.min.js"></script>  

</body>
</html>