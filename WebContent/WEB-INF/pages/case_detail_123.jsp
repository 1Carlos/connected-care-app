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
          <a class="navbar-brand" href="index.html">Connected Care</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <!-- <li class="active"><a href="#">Home</a></li> -->
            <li class="dropdown">
              <a href="index.html" class="dropdown-toggle" aria-expanded="false"><span class="glyphicon glyphicon-home"></span> Home </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="index.html">Dashboard </a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Data Management <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="import_data.html">Import Data </a></li>
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
            <li><a href="help.html"><span class="glyphicon glyphicon-question-sign"></span> Help</a></li>
            <li><a href="http://www.4thsource.com" style="padding-top: 0px;
                                                          padding-right: 0px;
                                                          padding-bottom: 0px;
                                                          padding-left: 0px;">
                <img alt="4thSource Logo" src="logo_4thsource.jpg">
                </a>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <!--IMPROVE #2-->
    <div class="container">
      <div class="row">
        <div class="col-md-4" style="background-color:white;border:0">
        <p class="text-left"><h4>Case Information</h4></p>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>Case ID:</strong></td>
                  <td style="width:65%"><strong>123</strong></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Patient Name:</td>   
                  <td style="width:65%">Keenan, Maynard James</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Date of Birth:</td>
                  <td style="width:65%">4/30/1964</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Gender: </td>
                  <td style="width:65%">M</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Address:</td>  
                  <td style="width:65%">100 Main St Sedona, AZ 19882</td>
                </tr>
              </tbody>
            </table>
        </div>
        <div class="col-md-4" style="background-color:white;border:0">
        <p class="text-left"><h4>&nbsp;</h4></p>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:35%;height:15.0pt">&nbsp;</td>
                  <td style="width:65%;height:15.0pt">&nbsp;</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Diagnosis:</td>
                  <td style="width:65%">J17 - Pneumonia</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Case Worker:</td>
                  <td style="width:65%">Smith, Joe</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Follow-up Date:</td>    
                  <td style="width:65%">12/1/2014</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Phone </td>  
                  <td style="width:65%">310-709-6976</td>
                </tr>
              </tbody>
            </table>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4" style="background-color:white;border:0">
          <p class="text-left"><h4>Progress Notes</h4></p>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:35%;height:15.0pt"><strong>Date</strong></td>
                  <td style="width:65%;height:15.0pt"><strong>Progress Notes</strong></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">9/28/2014</td>
                  <td style="width:65%">Patient Admitted to ER with difficulty breathing</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">9/28/2014</td>
                  <td style="width:65%">Patient given breathing treatments and Rx intravenously</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">9/28/2014</td>    
                  <td style="width:65%">Patient discharged with orders for Rxs and follow up appointment</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">9/28/2014</td>  
                  <td style="width:65%">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </td>
                </tr>
              </tbody>
            </table>            
        </div>
        <div class="col-md-4" style="background-color:white;border:0">
          <p class="text-left"><h4>Case Details</h4></p>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:20%;height:15.0pt"><strong>Order</strong></td>
                  <td style="width:20%;height:15.0pt"><strong>Order Detail</strong></td>
                  <td style="width:20%;height:15.0pt"><strong>Written</strong></td>
                  <td style="width:20%;height:15.0pt"><strong>Date</strong></td>
                  <td style="width:20%;height:15.0pt"><strong>Status</strong></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:20%;height:15.0pt">Rx</td>
                  <td style="width:20%;height:15.0pt">Levaquin</td>
                  <td style="width:20%;height:15.0pt">Dr Ford</td>
                  <td style="width:20%;height:15.0pt">10/1/2014</td>
                  <td style="width:20%;height:15.0pt">NOT SOLD</td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:20%;height:15.0pt">Appt</td>
                  <td style="width:20%;height:15.0pt">Follow Up with Dr. Hardy</td>
                  <td style="width:20%;height:15.0pt">Dr Ford</td>
                  <td style="width:20%;height:15.0pt">10/1/2014</td>
                  <td style="width:20%;height:15.0pt">NOT KEPT</td>
                </tr>
              </tbody>
            </table>            
        </div>
      </div>

      <div class="row" >
        <div class="col-md-8" style="background-color:white;border:0">
          <p class="text-left"><h4>Update Case / Add Notes</h4></p>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:50%;height:15.0pt">
                    <p class="text-left"><h4>Note</h4></p>
                  </td>
                  <td>
                  </td>
                  <td>
                  </td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%;height:15.0pt">
                    <textarea rows="5" cols="35">Please add the note...</textarea>
                  </td>
                  <td height="60px" style="width:30%;height:15.0pt">
                    Next Follow Up:
                    </br></br></br>Follow-up Not Required:
                  </td>
                  <td style="width:15%;height:15.0pt">
                    <input type="text" size="12" id="datepicker">
                    </br></br></br><input type="checkbox">
                  </td>
                </tr>
                <tr>
                  <td></td>
                  <td></td>
                  <td></td>
                </tr>
                <!--<tr style="height:15.0pt">
                  <td style="width:40%;height:15.0pt">
                  </td>
                  <td style="width:30%;height:15.0pt">
                    Follow-up Not Required:
                  </td>
                  <td style="width:30%;height:15.0pt">
                    <input type="checkbox">
                  </td>
                </tr>-->
              </tbody>
            </table>    
        </div>
      </div>


<!--Finished design/-->
    <div class="container">
            <!--/Save Button-->
            <tr>
              <td><a href="view_open_cases"><span><button type="button" class="btn btn-default btn-md">Save Case</span></a>
              </td>
            </tr>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./scripts/jquery.min.js"></script>
    <script src="./scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./scripts/ie10-viewport-bug-workaround.js"></script>
    <link rel="stylesheet" href="./css/jquery-ui.css">
    <script src="./scripts/jquery-1.10.2.js"></script>
    <script src="./scripts/jquery-ui.js"></script>
    <!--<link rel="stylesheet" href="./css/style.css">-->
    <script>
    $(function() {
      $( "#datepicker" ).datepicker();
    });
    </script>


</body>
</html>