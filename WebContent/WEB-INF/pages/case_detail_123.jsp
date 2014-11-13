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
                <li><a href="run_reconciliation.html">Run Reconciliation </a></li>
                <li><a href="program_setup.html">Program Setup </a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Case Management <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="dashboard_setup.html">Dashboard </a></li>
                <li><a href="view_open_cases.html">View Open Cases </a></li>
                <li><a href="search_cases.html">Search Cases </a></li>
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="help.html"><span class="glyphicon glyphicon-question-sign"></span> Help</a></li>
            <li><a href="http://www.4thsource.com"><img alt="4thSource Logo" src="resources/images/resources/images/logo_4thsource.jpg"></a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <!-- Main component for a primary marketing message or call to action -->
      <div class="page-header">
        <h1>Case #123</h1>
        <p class="lead"></p>
        <div class="row"></br></div>
        <!--/Header Case-->
        <div class="row">
          <div class="col-lg">
            <table class="table">
              <thead>
                <tr>
                  <th>Case</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>Case ID:</td>
                  <td class="active">123</td>
                  <td></td>
                  <td>Patient Diagnosis</td>
                  <td class="active">J17 – Pneumonia</td>
                </tr>
                <tr>
                  <td>Patient Name:</td> 
                  <td class="active">Jones, Don</td>
                  <td></td>
                  <td>Case Worker Name:</td>
                  <td class="active">Smith, Joe</td>
                </tr>
                <tr>
                  <td>Patient DOB:</td>  
                  <td class="active">1/1/1940</td>
                  <td></td>
                  <td>Follow Up Date:</td>
                  <td class="active">10/3/2014</td>
                <tr>
                  <td>Patient Gender:</td>   
                  <td class="active">M</td>
                  <td></td>
                  <td>Patient Address:</td>
                  <td class="active">100 Main Street NOLA 70125</td>
                </tr>
                <tr>
                  <td></td>   
                  <td></td>
                  <td></td>
                  <td>Phone:</td>
                  <td class="active">(504) 555-1212</td>
                </tr>
              </tbody>
            </table>
          </div>
          <!--<div class="col-md-6">
            <table class="table">
              <tbody>
                <tr>
                  <td>Patient Diagnosis</td>
                  <td>J17 – Pneumonia</td>
                </tr>
                <tr>
                  <td>Case Worker Name:</td>
                  <td>Smith, Joe</td>
                </tr>
                <tr>
                  <td>Follow Up Date:</td>
                  <td>10/3/2014</td>
                </tr>
                <tr>
                  <td>Patient Address:</td>
                  <td>100 Main Street NOLA 70125</td>
                </tr>
                <tr>
                  <td>Phone:</td>
                  <td>(504) 555-1212</td>
                </tr>
              </tbody>
            </table>
          </div> /-->
        </div>
        <div class="row">
          <!--/Progress Notes-->
          <div class="col-md-6">
            <table class="table">
              <thead>
                <tr>
                  <th>Progress Notes</th>
                </tr>
                <tr>
                  <th>Date</th>
                  <th>Progress Notes</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td class="active">9/28/2014</td>
                  <td class="active">Patient Admitted to ER with difficulty breathing</td>
                </tr>
                <tr>
                  <td class="active">9/28/2014</td>
                  <td class="active">Patient given breathing treatments and Rx intravenously</td>
                </tr>
                <tr>
                  <td class="active">9/28/2014</td>
                  <td class="active">Patient discharged with orders for Rxs and follow up appointment</td>
                </tr>
              </tbody>
            </table>
          </div>
          <!--/Case Details-->
          <div class="col-md-6">
            <table class="table">
              <thead>
                <tr>
                  <th>Case Details</th>
                </tr>
                <tr>
                  <th>Order</th>
                  <th>Order Detail</th>
                  <th>Written by</th>
                  <th>Date</th>
                  <th>Status</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td class="active">Rx</td>
                  <td class="active">Levaquin</td>
                  <td class="active">Dr Ford</td>
                  <td class="active">10/1/2014</td>
                  <td class="active">NOT SOLD</td>
                </tr>
                <tr>
                  <td class="active">Appt</td> 
                  <td class="active">Follow Up with Dr. Hardy</td>
                  <td class="active">Dr Ford</td>
                  <td class="active">10/1/2014</td>
                  <td class="active">NOT KEPT</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
        <div class="row">
          <!--/Add Notes-->
          <div class="col-lg">
            <table class="table">
              <thead>
                <tr>
                  <th>Update Case / Add-Notes</th>
                </tr>
                <tr>
                  <th>Note</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td class="active">
                    <input type="text" class="form-control">
                  </td>
                </tr>
              </tbody>
            </table>
          </div>

        </div>
        <div class="row">
          <div class="col-lg" align="right">
          <!--<div class="col-md-6">-->

            Next Follow Up: <input class="text" placeholder="mm/dd/yyyy">
            Not Required:   <input type="checkbox" form-control>

          <!--</div>-->
            <!--<div class="col-md-6" align="right">-->
              <span><button type="button" class="btn btn-default btn-md">Save Case</span>
            <!--</div>-->
          <!--</div>-->
        </div>

          <!--<div class="row">
        <table id="table-style" data-height="299" class="table table-hover" style="margin-top: -41px;" data-row-style="rowStyle">
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
        <tbody>
          <tr data-index="0" class="">
            <td style="">
              <a href="case_123.html">
                <button type="button" class="btn btn-default btn-sm">
                  <span class="glyphicon glyphicon-pencil"></span> 123
                </button>                          
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
            <td style="">
              <a href="case_124.html">
                <button type="button" class="btn btn-default btn-sm">
                  <span class="glyphicon glyphicon-pencil"></span> 124
                </button>
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
        </div> --> <!--/row-->
  	  </div> <!-- /page-header -->
    </div> <!-- /container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
  

</body>
</html>