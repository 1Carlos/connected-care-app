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
	
  <!--  Code for a couple of charts/jmartinez-->
  <script type="text/javascript">
  window.onload = function () {
    var chart1 = new CanvasJS.Chart("chartContainer1",
    {
      title:{
        text: "Readmissions by Month by ICD-10"    
      },
      axisY: {
        title: "Patients(Quantity)"
      },
      legend: {
        verticalAlign: "bottom",
        horizontalAlign: "center"
      },
      theme: "theme2",
      data: [

      {        
        type: "column",  
        showInLegend: true, 
        legendMarkerColor: "grey",
        legendText: "ICD-10 Codes",
        dataPoints: [      
        {y: 205, label: "J15 Bacterial pneumonia"},
        {y: 150,  label: "A19 Miliary tuberculosis" },
        {y: 190,  label: "J310 Chronic rhinitis"},
        {y: 220,  label: "J455 Severe persistent asthma"},
        {y: 140,  label: "J45 Bronchiectasis"},
        {y: 50, label: "M230 Cystic meniscus"}
        ]
      }   
      ]
    });

    chart1.render();
    
  var chart2 = new CanvasJS.Chart("chartContainer2",
    {
      title:{
        text: "Readmissions by Month"    
      },
      axisY: {
        title: "Quantity"
      },
      legend: {
        verticalAlign: "bottom",
        horizontalAlign: "center"
      },
      theme: "theme2",
      data: [

      {        
        type: "column",  
        showInLegend: true, 
        legendMarkerColor: "grey",
        legendText: "Months",
        dataPoints: [      
        {y: 750, label: "January"},
        {y: 905,  label: "Febrary" },
        {y: 1000,  label: "March"},
        {y: 755,  label: "April"},
        {y: 650,  label: "June"},
        {y: 800, label: "July"}
        ]
      }   
      ]
    });

    chart2.render();

  var chart3 = new CanvasJS.Chart("chartContainer3",
    {
      title:{
        text: "Gaps in Care By Month"    
      },
      axisY: {
        title: "Unit"
      },
      legend: {
        verticalAlign: "bottom",
        horizontalAlign: "center"
      },
      theme: "theme2",
      data: [

      {        
        type: "column",  
        showInLegend: true, 
        legendMarkerColor: "grey",
        legendText: "Type",
        dataPoints: [      
        {y: 2500, label: "Appt Adherence"},
        {y: 3000,  label: "Rx Adherence" }
        ]
      }   
      ]
    });

    chart3.render();

  var chart4 = new CanvasJS.Chart("chartContainer4",
    {
      title:{
        text: "Gaps in Care v. Readmissions"    
      },
      axisY: {
        title: "Units"
      },
      legend: {
        verticalAlign: "bottom",
        horizontalAlign: "center"
      },
      theme: "theme2",
      data: [

      {        
        type: "column",  
        showInLegend: true, 
        legendMarkerColor: "grey",
        legendText: "Months",
        dataPoints: [      
        {y: 297571, label: "January"},
        {y: 267017,  label: "Febrary" },
        {y: 175200,  label: "March"}
        ]
      }   
      ]
    });

    chart4.render();
  
  var chart5 = new CanvasJS.Chart("chartContainer5",
    {
      title:{
        text: "Rx x Months"    
      },
      axisY: {
        title: "Unit"
      },
      legend: {
        verticalAlign: "bottom",
        horizontalAlign: "center"
      },
      theme: "theme1",
      data: [

      {        
        type: "column",  
        showInLegend: true, 
        legendMarkerColor: "grey",
        legendText: "Months",
        dataPoints: [      
        {y: 297571, label: "January"},
        {y: 267017,  label: "Febrary" },
        {y: 175200,  label: "March"},
        {y: 154580,  label: "April"},
        {y: 116000,  label: "June"},
        {y: 97800, label: "July"}
        ]
      }   
      ]
    });

    chart5.render();
  
  }
  </script>
  <script type="text/javascript" src="resources/scripts/canvasjs.min.js"></script>
  <script src="resources/scripts/Chart.min.js"></script>
  
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
        <h1>Dashboard Setup</h1>
        <p class="lead">In this page you will set, update and add all charts.</p>
        <div class="row">
			   <div class="col-md-4">Chart #1
          <select class="form-control">
            <option>Readmissions by Month by ICD-10</option>
            <option>Readmissions by Month</option>
            <option>Gaps in Care By Month</option>
            <option>Gaps in Care v. Readmissions</option>
            <option>Rx x Months</option>
          </select>
				  <div id="chartContainer1" style="height: 300px; width: 100%;"></div>
			   </div>
			  <div class="col-md-4">Chart #2
          <select class="form-control">
            <option>Readmissions by Month by ICD-10</option>
            <option>Readmissions by Month</option>
            <option>Gaps in Care By Month</option>
            <option>Gaps in Care v. Readmissions</option>
            <option>Rx x Months</option>
          </select>
				  <div id="chartContainer2" style="height: 300px; width: 100%;"></div>
			   </div>
			   <div class="col-md-4">Chart #3
          <select class="form-control">
            <option>Readmissions by Month by ICD-10</option>
            <option>Readmissions by Month</option>
            <option>Gaps in Care By Month</option>
            <option>Gaps in Care v. Readmissions</option>
            <option>Rx x Months</option>
          </select>
				  <div id="chartContainer3" style="height: 300px; width: 100%;"></div>
			   </div>
        </div>
        <div class="row">
    			<div class="col-xs-6">Chart #4
          <select class="form-control">
            <option>Readmissions by Month by ICD-10</option>
            <option>Readmissions by Month</option>
            <option>Gaps in Care By Month</option>
            <option>Gaps in Care v. Readmissions</option>
            <option>Rx x Months</option>
          </select>
    				<div id="chartContainer4" style="height: 300px; width: 100%;"></div>
    			</div>
    			<div class="col-xs-6">Chart #5
          <select class="form-control">
            <option>Readmissions by Month by ICD-10</option>
            <option>Readmissions by Month</option>
            <option>Gaps in Care By Month</option>
            <option>Gaps in Care v. Readmissions</option>
            <option>Rx x Months</option>
          </select>
    				<div id="chartContainer5" style="height: 300px; width: 100%;"></div>
    			</div>
        </div>

  	  </div>

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