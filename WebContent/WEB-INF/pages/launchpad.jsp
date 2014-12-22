<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <link rel="icon" href="favicon.ico">
	  <link href="./css/grid.css" rel="stylesheet">
    <link href="./css/jasny-bootstrap.min.css" rel="stylesheet">

    <title>Connected Care Solution by 4th Source Inc</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/navbar-fixed-top.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./scripts/ie-emulation-modes-warning.js"></script>

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
        <hr/>
        </br>
        <div class="row">
          <!--/Table Records data-row-style="rowStyle"class="table table-hover"--> 
          <table id="table-style" data-height="299" class="table table-hover table-stripped table-condensed" style="margin-top: -41px;" >
            <thead>
              <th>File Name</th>              
              <th>File Summary</th>              
              <th>Import Summary</th>              
            </thead>
            <tbody>
            <!-- File #1 -->
            <tr class="imported" id="imported">              
              <td style="" width="">
                <table class="table table-condensed table-hover">
                  <body>
                    <tr>
                      <td colspan="4">[St MaryÂ´s Appoinments File] </td>
                    </tr>
                    <tr>
                      <td colspan="4"> 
                        <div class="btn-group" role="group" aria-label="...">
                          <button type="button" class="btn btn-default disabled" style="background-color:lightgray">Loaded</button>
                          <button type="button" class="btn btn-default" style="background-color:lightgray" onClick="parent.location.href='preview.html' ">Preview</button>
                          <button id="hide" type="button" class="btn btn-default" style="background-color:lightgray" onClick="hideRow('imported');">Hide</button>
                        </div>
                      </td>
                    </tr>
                  </body>
                </table>
              </td>
              
              <td style="" width="">
                
                <table class="table table-bordered table-condensed table-striped">
                  <body>
                    <tr>
                      <th>Source Name </th>
                      <th>Patients </th>
                      <th>Prescriptions </th>
                      <th>Appoinments </th>
                    </tr>
                    <tr>
                      <td>St. MaryÂ´s Hospital </td>
                      <td>1500 </td>
                      <td>0 </td>
                      <td>950 </td>
                    </tr>
                    <tr>
                      <td>Little Company of Mary </td>
                      <td>750 </td>
                      <td>0 </td>
                      <td>200 </td>
                    </tr>
                  </body>
                </table>              
              </td>
              
              <td style="" width="">
                <table class="table table-bordered table-condensed">
                  <body>
                    <tr>
                      <th>Category </th>
                      <th># </th>
                    </tr>
                    <tr>
                      <td><strong>Total Patients </strong></td>
                      <td>1150 </td>
                    </tr>
                    <tr>
                      <td>&nbsp;New </td>
                      <td>650 </td>
                    </tr>
                    <tr>
                      <td>&nbsp;Existing </td>
                      <td>500 </td>
                    </tr>
                    <tr>
                      <td><strong>Prescriptions </strong></td>
                      <td>1000 </td>
                    </tr>
                    <tr>
                      <td>&nbsp;Scheduled </td>
                      <td>650 </td>
                    </tr>
                    <tr>
                      <td>&nbsp;Sold </td>
                      <td>350 </td>
                    </tr>
                    <tr>
                      <td><strong>Appoinments </strong></td>
                      <td>400 </td>
                    </tr>
                    <tr>
                      <td>&nbsp;Scheduled </td>
                      <td>250 </td>
                    </tr>
                    <tr>
                      <td>&nbsp;Kept </td>
                      <td>150 </td>
                    </tr>
                  </body>
                </table>              
              </td>
              
            </tr> <!-- End/File #1 -->
            <!-- File #2 -->
            <tr id="row2">              
              <td style="">
                <table class="table">
                  <body>
                    <tr>
                      <td colspan="4">[St MaryÂ´s Rx File] </td>
                    </tr>
                    <tr>
                      <td colspan="4"> 
                        <div class="btn-group" role="group" aria-label="..." >
                          <button type="button" class="btn btn-default" style="background-color:lightgray" id="btnRow2" onClick="loadFile('btnRow2');">Load to Connected Care</button>
                          <button type="button" class="btn btn-default" style="background-color:lightgray" onClick="goPreview();">Preview</button>
                          <button type="button" class="btn btn-default" style="background-color:lightgray" onClick="hideRow('row2')">Remove</button>
                        </div>
                      </td>
                    </tr>
                  </body>
                </table>
              </td>
              
              <td style="">
                <table class="table table-bordered table-condensed table-striped">
                  <body>
                    <tr>
                      <th>Source Name </th>
                      <th>Patients </th>
                      <th>Prescriptions </th>
                      <th>Appoinments </th>
                    </tr>
                    <tr>
                      <td>St. MaryÂ´s Hospital </td>
                      <td>300 </td>
                      <td>450 </td>
                      <td>0 </td>
                    </tr>
                    <tr>
                      <td>Little Company of Mary </td>
                      <td>250 </td>
                      <td>350 </td>
                      <td>0 </td>
                    </tr>
                  </body>
                </table>              
              </td>
              
              <td style="">
                <table class="table table-bordered table-condensed table-striped">
                  <body>
                  </body>
                </table>              
              </td>
              
            </tr><!-- End/File #2 -->
            <!-- File #3 -->
            <tr id="row3">              
              <td style="">
                <table class="table">
                  <body>
                    <tr>
                      <td colspan="4">[WalgreenÂ´s Prescriptions] </td>
                    </tr>
                      <td colspan="4"> 
                        <div class="btn-group" role="group" aria-label="...">
                          <button id="btnRow3" type="button" class="btn btn-default" style="background-color:lightgray" onClick="loadFile('btnRow3');">Load to Connected Care</button>
                          <button type="button" class="btn btn-default" style="background-color:lightgray" onClick="goPreview();">Preview</button>
                          <button type="button" class="btn btn-default" style="background-color:lightgray" onClick="hideRow('row3')">Remove</button>
                        </div>
                      </td>
                  </body>
                </table>
              </td>
              
              <td style="">
                <table class="table table-bordered table-condensed table-striped">
                  <body>
                    <tr>
                      <th>Source Name </th>
                      <th>Patients </th>
                      <th>Prescriptions </th>
                      <th>Appoinments </th>
                    </tr>
                    <tr>
                      <td>St. MaryÂ´s Hospital </td>
                      <td>700 </td>
                      <td>1250 </td>
                      <td>0 </td>
                    </tr>
                  </body>
                </table>              
              </td>
              
              <td style="">
                <table class="table table-bordered table-condensed table-striped">
                  <body>
                  </body>
                </table>              
              </td>
              
            </tr><!-- End/File #3 -->
              
            </tbody>
          </table>    				
        </div>
      </div>
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

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./scripts/jquery.min.js"></script>
    <script src="./scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./scripts/ie10-viewport-bug-workaround.js"></script>
    <script src="./scripts/jasny-bootstrap.min.js"></script>
  

</body>
</html>