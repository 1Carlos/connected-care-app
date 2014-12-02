<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="resources/favicon.ico" />
	<link href="resources/styles/grid.css" rel="stylesheet" />

    <title>Connected Care Solution by 4th Source Inc</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/styles/bootstrap.min.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="resources/styles/navbar-fixed-top.css" rel="stylesheet" />
    <link rel="stylesheet" href="resources/styles/jquery-ui.css" />

	<script src="resources/scripts/jquery.min.js"></script>
    <script src="resources/scripts/jquery-ui.js"></script>
    <script src="resources/scripts/validator.js"></script>
    <script src="resources/scripts/case-detail.js"></script>
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
      <div class="row">
        <div class="col-md-4" style="background-color:white; border:0">
            <h4>Case Information</h4>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:35%">Case ID:</td>
                  <td style="width:65%"><strong><c:out value="${object.id}"/></strong></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Patient Name:</td>   
                  <td style="width:65%"><c:out value="${object.patientId.lastName}"/>, <c:out value="${object.patientId.firstName}"/></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Date of Birth:</td>
                  <td style="width:65%"><fmt:formatDate pattern="yyyy-MM-dd" value="${object.patientId.dateOfBirth}" /></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Gender: </td>
                  <td style="width:65%">
                    <c:choose>
					  <c:when test="${object.patientId.gender == 0}">
	        			F
	    			  </c:when>
	    			  <c:otherwise>
	        			M
	    			  </c:otherwise>
    				</c:choose>
                  </td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Address:</td>  
                  <td style="width:65%">
                    <c:forEach var="listPatientAddress" items="${object.patientId.patientAddressEntity}" varStatus="loop">
                      <c:if test="${loop.first}">
                	    <c:out value="${listPatientAddress.addressLine1}"/> <c:out value="${listPatientAddress.city}"/>, 
                	    <c:out value="${listPatientAddress.state}"/> <c:out value="${listPatientAddress.zipCode}"/>
                	  </c:if>
                    </c:forEach>
                  </td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Phone:</td>  
                  <td style="width:65%">
                    <c:forEach var="listPatientPhone" items="${object.patientId.patientPhoneEntity}" varStatus="loop">
                      <c:if test="${loop.first}">
                	    <c:out value="${listPatientPhone.phone}"/>
                	  </c:if>
                    </c:forEach>
                  </td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Case Worker:</td>
                  <td style="width:65%"><c:out value="${object.caseWorkerId.lastName}"/>, <c:out value="${object.caseWorkerId.firstName}"/></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%">Follow-up Date:</td>    
                  <td style="width:65%"><fmt:formatDate pattern="yyyy-MM-dd" value="${object.followUpDate}" /></td>
                </tr>
              </tbody>
            </table>
        </div>
        <div class="col-md-4" style="background-color:white; border:0">
            <h4>Diagnosis Information</h4>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>ICD Code</strong></td>
                  <td style="width:65%"><strong>ICD Description</strong></td>
                </tr>
                <c:forEach var="listDiagnosis" items="${object.patientDiagnosisEntity}">
                  <tr style="height:15.0pt">
                    <td style="width:35%"><c:out value="${listDiagnosis.diagnosisId.icdCode}"/></td>
                    <td style="width:65%"><c:out value="${listDiagnosis.diagnosisId.codeDescription1}"/></td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4" style="background-color:white; border:0">
            <h4>Case Details</h4>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:20%;height:15.0pt"><strong>Order</strong></td>
                  <td style="width:20%;height:15.0pt"><strong>Order Detail</strong></td>
                  <td style="width:20%;height:15.0pt"><strong>Date</strong></td>
                  <td style="width:20%;height:15.0pt"><strong>Status</strong></td>
                </tr>
                <c:forEach var="listOrders" items="${object.ordersEntity}">
                  <tr style="height:15.0pt">
                    <td style="width:20%;height:15.0pt">
                      <c:if test="${listOrders.orderType == 1}">
   				        Rx
			          </c:if>
                      <c:if test="${listOrders.orderType == 2}">
   				        Appt
			          </c:if>
			          <c:if test="${listOrders.orderType == 3}">
   				        Education
			          </c:if>
			          <c:if test="${listOrders.orderType == 4}">
   				        Measurement
			          </c:if>
                    </td>
                    <td style="width:20%;height:15.0pt"><c:out value="${listOrders.orderDetails}"/></td>
                    <td style="width:20%;height:15.0pt"><fmt:formatDate pattern="yyyy-MM-dd" value="${listOrders.orderActualDate}" /></td>
                    <td style="width:20%;height:15.0pt"><c:out value="${listOrders.orderStatusDescription}"/></td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>            
        </div>
        <div class="col-md-4" style="background-color:white; border:0">
            <h4>Progress Notes</h4>
            <table id="progressNoteTable" class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:35%;height:15.0pt"><strong>Date</strong></td>
                  <td style="width:65%;height:15.0pt"><strong>Progress Notes</strong></td>
                </tr>
                <c:forEach var="listOrders" items="${object.ordersEntity}" varStatus="loop">
                    <c:if test="${loop.first}">
                      <c:set var="idOrder" value="${listOrders.id}"/>
                    </c:if>
                	<c:forEach var="listNotes" items="${listOrders.noteEntity}">
		                <tr style="height:15.0pt">
		                  <td style="width:35%"><fmt:formatDate pattern="yyyy-MM-dd" value="${listNotes.creationDate}" /></td>
		                  <td style="width:65%"><c:out value="${listNotes.noteDetails}"/></td>
		                </tr>
	                </c:forEach>
                </c:forEach>
              </tbody>
            </table>            
        </div>
      </div>
      <div class="row" >
        <div class="col-md-8" style="background-color:white; border:0">
          <form id="addNoteForm" action="javascript:addProgressNote();" class="form-horizontal" data-toggle="validator" role="form">
            <h4>Update Case / Add Notes</h4>
            <input id="idCase" type="hidden" value="${object.id}"/>
            <input id="idOrder" type="hidden" value="${idOrder}"/>
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:50%;height:15.0pt">
                    <h4>Note</h4>
                  </td>
                  <td>
                  </td>
                  <td>
                  </td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="height:15.0pt">
                    <div class="form-group">
                      <textarea id="noteDescription" rows="5" cols="35" class="form-control" style="width:90%;" placeholder="Please add note..." required></textarea>
                    </div>
                  </td>
                  <td style="height:15.0pt">
                    <div class="form-group">
                      <label for="nextFollowUpDate" class="control-label" style="width:180px;">Next Follow Up:</label>
                      <input id="nextFollowUpDate" type="text" size="12" class="form-control datepicker" style="display:inline; width:100px;" required/>
                    </div>
                    <div class="form-group">
                      <label for="checkBoxFollowUpRequired" class="control-label" style="width:180px;">Follow-up Not Required:</label>
                      <input id="checkBoxFollowUpRequired" type="checkbox" class="form-control" style="display:inline; width:40px;"/>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
            <button type="submit" class="btn btn-primary btn-md">Save Note</button>
          </form>
        </div>
      </div>
    </div>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>