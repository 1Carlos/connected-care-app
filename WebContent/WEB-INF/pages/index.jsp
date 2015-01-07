<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	
    <script type="text/javascript">
    window.onload = function () {
        var chart2 = new CanvasJS.Chart("chartContainer2",
                {
                  title:{
                    text: "Cases by Month"    
                  },
                  axisY: {
                    title: "Total"
                  },
                  legend: {
                    verticalAlign: "bottom",
                    horizontalAlign: "center"
                  },
                  theme: "theme2",
                  backgroundColor:"white",
                  data: [
                         {        
                           type: "column",  
                           showInLegend: true, 
                           legendMarkerColor: "black",
                           legendText: "Cases per Month",
                           dataPoints: [ 
										<c:forEach var="value" items="${chartData}">
											{
											 y: <c:out value="${value.quantity}"/>,
											 label: "<c:out value="${value.month}"/>"
											}
										</c:forEach>
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
          backgroundColor:"white",
          data: [
          {        
            type: "column",  
            showInLegend: true, 
            legendMarkerColor: "blue",
            legendText: "Appt Adherence",
            dataPoints: [      
            {y: 30, label: "Sep"},
            {y: 50, label: "Oct"},
            {y: 50, label: "Nov"},
            {y: 20, label: "Dec"},
            {y: 15, label: "Jan"},
            {y: 15, label: "Feb"}
            ] //Appt Adherence
          },   
          {        
            type: "column",  
            showInLegend: true, 
            legendMarkerColor: "red",
            legendText: "Rx Adherence",
            dataPoints: [      
            {y: 80,  label: "Sep" },
            {y: 80,  label: "Oct" },
            {y:100,  label: "Nov" },
            {y: 60,  label: "Dec" },
            {y: 20,  label: "Jan" },
            {y: 15,  label: "Feb" }
            ] //Rx Adherence
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
          backgroundColor:"white",
          data: [
          {        
            type: "column",  
            showInLegend: true, 
            legendMarkerColor: "blue",
            legendText: "Gaps in Care",
            dataPoints: [      
            {y: 400, label: "Sep"},
            {y: 500, label: "Oct"},
            {y: 650, label: "Nov"},
            {y: 300, label: "Dec"},
            {y: 150, label: "Jan"},
            {y: 100, label: "Feb"}
            ] //Appt Adherence
          },   
          {        
            type: "column",  
            showInLegend: true, 
            legendMarkerColor: "red",
            legendText: "Readmissions",
            dataPoints: [      
            {y: 100,  label: "Sep" },
            {y: 200,  label: "Oct" },
            {y: 300,  label: "Nov" },
            {y: 100,  label: "Dec" },
            {y: 60,  label: "Jan" },
            {y: 40,  label: "Feb" }
            ] //Rx Adherence
          }]
        });

        chart4.render();
    	
    	var chart5 = new CanvasJS.Chart("chartContainer5",
        {
          title:{
            text: "Rx vs Gaps in Care per Month"    
          },
          axisY: {
            title: "Unit"
          },
          legend: {
            verticalAlign: "bottom",
            horizontalAlign: "center"
          },
          theme: "theme2",
          backgroundColor:"white",
          data: [
          {        
            type: "column",  
            showInLegend: true, 
            legendMarkerColor: "blue",
            legendText: "Rx Adherence",
            dataPoints: [      
            {y: 40000,  label: "Sep" },
            {y: 40000,  label: "Oct" },
            {y: 50000,  label: "Nov" },
            {y: 30000,  label: "Dec" }
            ] //Appt Adherence
          },   
          {        
            type: "column",  
            showInLegend: true, 
            legendMarkerColor: "red",
            legendText: "Gaps in Care",
            dataPoints: [      
            {y: 80000,  label: "Sep" },
            {y: 80000,  label: "Oct" },
            {y:100000,  label: "Nov" },
            {y: 60000,  label: "Dec" }
            ] //Rx Adherence
          }]
        });

        chart5.render();
        
      }
  </script>


  
  <script type="text/javascript" src="resources/scripts/canvasjs.min.js"></script>
  <script src="resources/scripts/Chart.min.js"></script>
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
      <!-- Main component for a primary marketing message or call to action -->
      <div class="page-header">
        <h1>Welcome to Connected Care</h1>
        <p class="lead">In this page you will see quickly all information represented in these charts.</p>
        <div class="row">
		   <div align="center" class="col-xs-6" style="background-color:white;border:0">
			  <div id="chartContainer2" style="height: 300px; width: 80%;"></div>
		   </div>
		   <div align="center" class="col-xs-6" style="background-color:white;border:0">
			  <div id="chartContainer3" style="height: 300px; width: 80%;"></div>
		   </div>
        </div>
        <div align="center"  class="row">
   			<div class="col-xs-6" style="background-color:white;border:0">
   				<div id="chartContainer4" style="height: 300px; width: 80%;"></div>
   			</div>
   			<div align="center"  class="col-xs-6" style="background-color:white;border:0">
   				<div id="chartContainer5" style="height:300px;width:80%" ></div>
   			</div>
        </div>
        <div align="center"  class="row">
   			<div class="col-xs-6" style="background-color:white;border:0">
        		[Highchart]<div id="highcontainer" style="width:100%;"></div>
   			</div>
   			<div align="center"  class="col-xs-6" style="background-color:white;border:0">
   			</div>
        </div>
  	  </div>
    </div>

  <script>
  		$(function () { 
		    $('#highcontainer').highcharts({
		        chart: {
		            type: 'bar'
		        },
		        title: {
		            text: 'Fruit Consumption'
		        },
		        xAxis: {
		            categories: ['Apples', 'Bananas', 'Oranges']
		        },
		        yAxis: {
		            title: {
		                text: 'Fruit eaten'
		            }
		        },
		        series: [{
		            name: 'Jane',
		            data: [1, 0, 4]
		        }, {
		            name: 'John',
		            data: [5, 7, 3]
		        }]
		    });
		});  
  </script>

    <!-- Bootstrap core JavaScript
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
	<script src="http://code.highcharts.com/adapters/standalone-framework.js"></script>
  </body>
</html>