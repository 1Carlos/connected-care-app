<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

    <script src="resources/scripts/ie-emulation-modes-warning.js"></script>

    <!-- Code for a couple of charts - jmartinez -->
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
	      data: [{        
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
	      }]
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
	      data: [{        
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
	      }]
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
	      data: [{        
	        type: "column",  
	        showInLegend: true, 
	        legendMarkerColor: "grey",
	        legendText: "Type",
	        dataPoints: [      
	          {y: 2500, label: "Appt Adherence"},
	          {y: 3000,  label: "Rx Adherence" }
	        ]
	      }]
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
	      data: [{        
	        type: "column",  
	        showInLegend: true, 
	        legendMarkerColor: "grey",
	        legendText: "Months",
	        dataPoints: [      
	          {y: 297571, label: "January"},
	          {y: 267017,  label: "Febrary" },
	          {y: 175200,  label: "March"}
	        ]
	      }]
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
	      data: [{        
	        type: "column",  
	        showInLegend: true, 
	        legendMarkerColor: "grey",
	        legendText: "Months",
	        dataPoints: [      
	          {y: 297571, label: "January"},
	          {y: 267017,  label: "Febrary" },
	          {y : 175200,  label: "March"},
	          {y: 154580,  label: "April"},
	          {y: 116000,  label: "June"},
	          {y: 97800, label: "July"}
	        ]
	      }]
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
        </div>
      </div>
    </nav>
    <div class="container">
      <div class="row">
        <div class="col-md-4">
          <h2>Import External File</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="import_data" role="button">Import Data »</a></p>
        </div>
        <div class="col-md-4">
          <h2>Program Reconciliation</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="run_reconciliation.html" role="button">Run Reconciliation »</a></p>
       </div>
        <div class="col-md-4">
          <h2>Case Managment</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. </p>
          <p><a class="btn btn-default" href="view_open_cases.html" role="button">View Open Cases »</a></p>
        </div>
      </div>
    </div>
    <div class="container">
      <!-- Main component for a primary marketing message or call to action -->
      <div class="page-header">
        <h1>Dashboard</h1>
        <p class="lead">In this page you will see quickly all information represented in these charts.</p>
        <div class="row">
		   <div class="col-md-4">
			  <div id="chartContainer1" style="height: 300px; width: 100%;"></div>
		   </div>
		  <div class="col-md-4">
			  <div id="chartContainer2" style="height: 300px; width: 100%;"></div>
		   </div>
		   <div class="col-md-4">
			  <div id="chartContainer3" style="height: 300px; width: 100%;"></div>
		   </div>
        </div>
        <div class="row">
   			<div class="col-xs-6">
   				<div id="chartContainer4" style="height: 300px; width: 100%;"></div>
   			</div>
   			<div class="col-xs-6">
   				<div id="chartContainer5" style="height: 300px; width: 100%;"></div>
   			</div>
        </div>
  	  </div>
    </div>
    <!-- Bootstrap core JavaScript -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>