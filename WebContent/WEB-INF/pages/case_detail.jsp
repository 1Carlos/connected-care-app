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
    <script src="resources/scripts/search-cases.js"></script>
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
                <li><a href="clear_data">Clear Data </a></li>
                <li><a href="import_data.html">Import Data </a></li>
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
<!-- Row 1 / Col 1 -->	
        
        <div class="col-md-4" style="width:275.0pt;height:250.0pt;background-color:white;border:1px solid #99cbed;border-radius:10px;margin-right:10px;margin-left:10px;margin-top:-10px;">
          <p class="text-left" style=margin-top:-10px;></p><h4>Case Information</h4><p></p>
          <table class="table table-condensed table-striped" border="0">
            <tbody>
              <tr style="height:15.0pt">
                <td style="width:35%"><strong>Case ID:</strong></td>
                <td style="width:65%"><strong><c:out value="${object.id}"/></strong></td>
              </tr>
              <tr style="height:15.0pt">
                <td style="width:35%"><strong>Patient Name:</strong></td>   
                <td style="width:65%"><c:out value="${object.patientId.lastName}"/>, <c:out value="${object.patientId.firstName}"/></td>
              </tr>
              <tr style="height:15.0pt">
                <td style="width:35%"><strong>Date of Birth:</strong></td>
                <td style="width:65%"><fmt:formatDate pattern="yyyy-MM-dd" value="${object.patientId.dateOfBirth}" /></td>
              </tr>
              <tr style="height:15.0pt">
                <td style="width:35%"><strong>Gender: </strong></td>
                <td style="width:65%">
                  <c:choose>
				    <c:when test="${object.patientId.gender == 0}">F</c:when>
	    			<c:otherwise>M</c:otherwise>
    			  </c:choose>
                </td>
                </tr>
           <!--
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>Address:</strong></td>  
                  <td style="width:65%">
                    <c:forEach var="listPatientAddress" items="${object.patientId.patientAddressEntity}" varStatus="loop">
                      <c:if test="${loop.first}">
                	    <c:out value="${listPatientAddress.addressLine1}"/> <c:out value="${listPatientAddress.city}"/>, 
                	    <c:out value="${listPatientAddress.state}"/> <c:out value="${listPatientAddress.zipCode}"/>
                	  </c:if>
                    </c:forEach>
                  </td>
                </tr>
            -->	
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>Phone:</strong></td>  
                  <td style="width:65%">
                    <c:forEach var="listPatientPhone" items="${object.patientId.patientPhoneEntity}" varStatus="loop">
                      <c:if test="${loop.first}">
                	    <c:out value="${listPatientPhone.phone}"/>
                	  </c:if>
                    </c:forEach>
                  </td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>Case Worker:</strong></td>
                  <td style="width:65%"><label id="caseWorkerName" for="caseWorkerName" class="control-label" style="font-style:normal;font-weight:normal;"><c:out value="${object.caseWorkerId.lastName}"/>, <c:out value="${object.caseWorkerId.firstName}"/></label></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>F/U Date:</strong></td>    
                  <td style="width:65%"><fmt:formatDate pattern="yyyy-MM-dd" value="${object.followUpDate}" /></td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>Case Status:</strong></td>    
                  <td style="width:65%">
                    <c:choose>
					  <c:when test="${object.caseStatus == 0}">Open</c:when>
	    			  <c:otherwise>Closed</c:otherwise>
    				</c:choose>
                  </td>
                </tr>
                <tr style="height:15.0pt">
                  <td style="width:35%"><strong>Priority:</strong></td>
                  <td style="width:65%">
                    <c:choose>
					  <c:when test="${object.priority >= 0 && object.priority <= 99}">
	        			4 - Low
	    			  </c:when>
	    			  <c:when test="${object.priority >= 100 && object.priority <= 999}">
	        			3 - Medium
	    			  </c:when>
	    			  <c:when test="${object.priority >= 1000 && object.priority <= 9999}">
	        			2 - High
	    			  </c:when>
	    			  <c:otherwise>
	        			1 - Urgent
	    			  </c:otherwise>
    				</c:choose>
                  </td>
                </tr>                 
              </tbody>
            </table>
        </div> <!-- END Row 1 / Col 1 -->	

<!-- Row 1 / Col 2 -->	

        <div class="col-md-4" style="width:275.0pt;height:250.0pt;background-color:white;border:1px solid #99cbed;border-radius:10px;margin-right:12px;margin-left:10px;margin-top:-10px;">
            <p class="text-left" style=margin-top:-10px;></p><h4>Diagnosis Information</h4><p></p>
            <p class="text-left" style=margin-top:-10px;></p><h4>&nbsp</h4><p></p>
            <p class="text-left" style=margin-top:-10px;></p><h5><strong>ICD Code ICD Description</strong></h5><p></p>
           
            <div class="col-md-4" style="width:270.0pt;background-color:white;border:0;height:100px;weight:30px;overflow:auto;margin-top:-1px;margin-left:-15px;">
            
            <table id="diagnosisTable" class="table table-condensed table-striped" style="width:240.0pt;height:60.0pt;weight:30.0px;margin-top:-10px" border="0">
              <tbody>
                
                <c:forEach var="listDiagnosis" items="${object.patientDiagnosisEntity}">
                  <tr style="height:14px;margin-top:-15px">
                    <td style="width:20%"><c:out value="${listDiagnosis.diagnosisId.icdCode}"/></td>
                    <td style="width:80%"><c:out value="${listDiagnosis.diagnosisId.codeDesc1}"/></td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
            </div>

            <div class="col-md-4" style="width:248.0pt;height:100.0pt;background-color:white;border:0px solid #99cbed;margin-left:-15px;margin-top:-10px">
              <p class="text-left" style="width:150.0pt;margin-top:-1px"></p><h4>Case Details</h4><p></p>                 
                <table id="caseDetailsTableHead" class="table table-condensed" border="0" style="margin-top:-10px">  
                  <thead>
                    <tr style="height:15px;margin-top:-10px">
	                  <td style="width:10%"><strong>Order</strong></td>
	                  <td style="width:25%"><strong>Detail</strong></td>
	                  <td style="width:30%"><strong>Date</strong></td>
	                  <td style="width:35%"><strong>Status</strong></td>
	                </tr>
	               </thead>
	             </table>
	             <div class="col-md-4" style="width:270.0pt;background-color:white;border:0;height:90px;weight:80px;overflow:auto;margin-top:-30px;margin-left:-15px">
	               <table id="caseDetailsTable" class="table table-condensed table-striped" border="0" style="margin-top:-10px;">
                    <tbody>
                      <c:forEach var="listOrders" items="${object.ordersEntity}" varStatus="loop">    	
	                  <tr>
	                    <td style="width:10%;height:15.0pt">
	                      <c:if test="${listOrders.orderType == 1}">Rx</c:if>
	                      <c:if test="${listOrders.orderType == 2}">Appt</c:if>
				          <c:if test="${listOrders.orderType == 3}">Education</c:if>
				          <c:if test="${listOrders.orderType == 4}">Measurement</c:if>
	                    </td>
	                    <td style="width:25%;height:15.0pt"><c:out value="${listOrders.orderDetails}"/></td>
	                    <td style="width:30%;height:15.0pt"><fmt:formatDate pattern="yyyy-MM-dd" value="${listOrders.orderActualDate}" /></td>
	                    <td style="width:35%;height:15.0pt"><c:out value="${listOrders.orderStatusDescription}"/></td>
	                  </tr>
	                </c:forEach>
	              </tbody>
	            </table>            
	          </div>
            </div>
          </div>  <!-- END Row 1 / Col 2 -->	

<!-- Row 1 / Col 3 -->	

        <div class="col-md-4" style="width:275.0pt;height:250.0pt;background-color:white;border:1px solid #99cbed;border-radius:10px;margin-right:10px;margin-left:10px;margin-top:-10px;">
          <p class="text-left" style=margin-top:-10px;></p><h4>Progress Notes</h4><p></p>
            <div class="" style="background-color:white;border:0;height:210.0pt;weight:350px;overflow:auto;margin-top:0px;">
            <table id="progressNoteTable" class="table-condensed table-striped" border="0" style="">
              <tbody>
                
                <c:forEach var="listOrders" items="${object.ordersEntity}" varStatus="loop">
                    <c:if test="${loop.first}">
                      <c:set var="idOrder" value="${listOrders.id}"/>
                    </c:if>

                	<c:forEach var="listNotes" items="${listOrders.noteEntity}">
		                <tr style="">
		                  <td style="width:50%;vertical-align:left;"><b><i><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${listNotes.creationDate}" /></i></b></td>
						  <td style="width:50%;vertical-align:right;" align="right"><strong><i>
							  <c:if test="${listNotes.creationDate != null}">
				                  <c:out value="${listOrders.caseId.caseWorkerId.lastName}"/>,<c:out value="${listOrders.caseId.caseWorkerId.firstName}"/>
			                  </c:if>
						  	  </i></strong></td>
						</tr>
						<tr style="height:15.0pt">
	                  		<td style="vertical-align:top;" colspan="2"><c:out value="${listNotes.noteDetails}"/></td>
						</tr>
	                </c:forEach>
                </c:forEach>
	          </tbody>
	        </table>   
        </div>
      </div>

<!-- Row 2 -->

      <div class="row">
<!-- Row 2 / Column 1 -->

        <div class="col-md-4" style="width:275.0pt;height:160.0pt;background-color:white;border:1px solid #99cbed;border-radius:10px;margin-right:10px;margin-left:24px;margin-top:25px;">
          <form id="addNoteForm" action="javascript:addProgressNote();" class="form-horizontal" data-toggle="validator" role="form" novalidate="true">
            <p class="text-left" style=margin-top:-10px;></p><h4>Add Notes</h4><p></p>
            <input id="idCase" type="hidden" value="${object.id}">
            <input id="idOrder" type="hidden" value="${idOrder}">
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td style="width:250.0pt;height:15pt">
                    <textarea id="noteDescription" class="form-control" rows="4" cols="50" style="resize:none;" wrap="off" placeholder="Please add the note here..."; required=""></textarea>
                  </td>
                </tr>
              </tbody>
            </table>
          </form>
        </div>

        <div class="col-md-4" style="width:275.0pt;height:160.0pt;background-color:white;border:1px solid #99cbed;border-radius:10px;margin-right:10px;margin-left:10px;margin-top:25px;">
          <form id="addNoteForm" action="javascript:addProgressNote();" class="form-horizontal" data-toggle="validator" role="form" novalidate="true">
            <p class="text-left" style=margin-top:-10px;></p><h4>&nbsp</h4><p></p>
            <input id="idCase" type="hidden" value="${object.id}">
            <input id="idOrder" type="hidden" value="${idOrder}">
            <table class="table table-condensed" border="0">
              <tbody>
                <tr style="height:15.0pt">
                  <td height="60px" style="width:30%;height:20.0pt">
                    <label for="nextFollowUpDate" class="control-label" style="width:180px;"><strong>Next Follow Up:</strong></label>
                  
                    <label for="checkBoxFollowUpRequired" class="control-label" style="width:180px;"><strong>Follow-up Not Required:</strong></label>
                  </td>
                  <td style="width:15%;height:15.0pt">
                    <input id="nextFollowUpDate" type="text" size="12" class="form-control datepicker" style="display:inline; width:100px;" required="">
                    <input id="checkBoxFollowUpRequired" type="checkbox" class="form-control" style="display:inline; width:20px;">
                  </td>
                </tr>
              </tbody>
            </table>
            <button type="submit" class="btn btn-primary btn-md disabled" style="pointer-events: all; cursor: pointer;">Save Note</button>
          </form>
        </div>
<!-- Row 2 / Column 2 -->
        

        
        
      </div> <!-- End of Row 2-->
     </div>
    </div> <!-- End of Container -->
                      
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/scripts/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/scripts/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>