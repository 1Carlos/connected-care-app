$(document).ready(function() {
	$("#table-cases").hide();
	
	$(".datepicker").datepicker({
		dateFormat: "dd/mm/yy"
	});

    $('#datatable').DataTable();
	
	$("#search-button").click(function() {
		var patientName = $("#patientName").val();
		var caseId = $("#caseId").val();
		var fromFollowUpDate = $("#fromFollowUpDate").datepicker("getDate");
		var toFollowUpDate = $("#toFollowUpDate").datepicker("getDate");
		var caseStatus = $("#caseStatus").val();
		var caseWorker = $("#caseWorker").val();
		
		/*
		var icdInformation = $("#icdInformation").val();
		var fromOrderDate = $("#fromOrderActualDate").datepicker("getDate");
		var toOrderDate = $("#toOrderActualDate").datepicker("getDate");
		var fromScheduleDate = $("#fromScheduleDate").datepicker("getDate");
		var toScheduleDate = $("#toScheduleDate").datepicker("getDate");
		var sourceType = $("#sourceType").val();
		var orderType = $("#orderType").val();
		*/
		
		var DTO = Object();
		DTO.patientName = patientName;
		DTO.caseId = caseId;
		DTO.fromFollowUpDate = fromFollowUpDate;
		DTO.toFollowUpDate = toFollowUpDate;
		DTO.caseStatus = caseStatus;
		DTO.caseWorker = caseWorker;
		
		/*DTO.icdInformation = icdInformation;
		DTO.fromOrderDate = fromOrderDate;
		DTO.toOrderDate = toOrderDate;
		DTO.fromScheduleDate = fromScheduleDate;
		DTO.toScheduleDate = toScheduleDate;
		DTO.sourceType = sourceType;
		DTO.orderType = orderType;*/
		
		$("#table-cases").show();
		
		var loading = 
			"<tr>" +
				"<th colspan='10' style='text-align: center'>" +
					"<img alt='Loading' src='resources/images/loading.gif' style='width: 10%;' />" +
				"</th>" +
			"</tr>";
		
		$("#table-cases tbody").html(loading);
		
		$.ajax({
			type: "POST",
			dataType: "JSON",
			contentType: "application/json",
			url: "services/getCasesView",
			data: JSON.stringify(DTO)
		}).done(function(data) {
			var table = "";
			
			if(data.list.length > 0) {
				for(var i = 0; i < data.list.length; i++) {
					table = table + getHTMLRow(data.list[i]);
				}
			} else {
				table = 
					"<tr>" +
						"<th colspan='10' style='text-align: center'>" +
		        			"<div class='alert alert-warning' role='alert'>This query didn't return results.</div>" +
		        		"</th>" +
		        	"</tr>"
			}
			
			$("#table-cases tbody").html(table);
		}).error(function(jqXHR, textStatus, errorThrown) {
			var error = 
				"<tr>" +
					"<th colspan='10' style='text-align: center'>" +
	        			"<div class='alert alert-danger' role='alert'>There has been an error: Internal server error.</div>" +
	        		"</th>" +
	        	"</tr>"
			
			$("#table-cases tbody").html(error);
		});
	});
});

function getHTMLRow(object) {
	var caseId = object.caseId == null ? "" : object.caseId;
	var patientLastName = object.patientLastName == null ? "" : object.patientLastName;
	var patientFirstName = object.patientFirstName == null ? "" : object.patientFirstName;
	var patientDOB = object.patientDOB == null ? "" : $.datepicker.formatDate("yy-mm-dd", new Date(object.patientDOB));
	var patientGender = object.patientGender == null ? "" : object.patientGender;
	//var diagnosisCode = object.diagnosisCode == null ? "" : object.diagnosisCode;
	//var diagnosisName = object.diagnosisName == null ? "" : object.diagnosisName;
	//var orderActualDate = object.orderActualDate == null ? "" : $.datepicker.formatDate("yy-mm-dd", new Date(object.orderActualDate));
	//var orderScheduleDate = object.orderScheduleDate == null ? "" : $.datepicker.formatDate("yy-mm-dd", new Date(object.orderScheduleDate));
	//var sourceType = object.sourceType == null ? "" : object.sourceType;
	//var sourceName = object.sourceName == null ? "" : object.sourceName;
	var caseWorkerLastName = object.caseWorkerLastName == null ? "" : object.caseWorkerLastName;
	var caseWorkerFirstName = object.caseWorkerFirstName == null ? "" : object.caseWorkerFirstName;
	var caseStatus = object.caseStatus == null ? "" : object.caseStatus;
	var orderType = object.orderType == null ? "" : object.orderType;
	var followUpDate = object.followUpDate == null ? "" : $.datepicker.formatDate("yy-mm-dd", new Date(object.followUpDate));
	
	var row =
		"<tr>" +
			"<td>" +
				"<a href='javascript:goToCaseDetail(" + caseId + ");'>" +
					caseId +
				"</a>" +
			"</td>" +
			"<td>" + patientLastName + "</td>" +
			"<td>" + patientFirstName + "</td>" +
			"<td>" + patientDOB + "</td>" +
			"<td>" + patientGender + "</td>" +
			/*"<td>" + diagnosisCode + " - " + diagnosisName + "</td>" +
			"<td>" + orderActualDate + "</td>" +
			"<td>" + orderScheduleDate + "</td>" +
			"<td>" + sourceType + " / " + sourceName + "</td>" +*/
			"<td>" + caseWorkerLastName + "," + caseWorkerFirstName + "</td>" +
			"<td>" + followUpDate + "</td>" +
			"<td>" + orderType + "</td>" +
			"<td>" + (caseStatus == 0 ? "OPEN" : "CLOSED") + "</td>" +
    	"</tr>";
  
  	return row;
}

function goToCaseDetail(id) {
	var url = "case_detail";
	var form = $("<form action='" + url + "' method='post'>" +
				   "<input type='hidden' name='caseId' value='" + id + "' />" +
	  			 "</form>");
	
	$("body").append(form);
	form.submit();
}
