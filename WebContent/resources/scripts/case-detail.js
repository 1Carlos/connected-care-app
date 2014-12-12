$(document).ready(function() {
	$(".datepicker").datepicker({
		dateFormat: "dd/mm/yy"
	});
})

function addProgressNote() {
	var idCase = $("#idCase").val();
	var idOrder = $("#idOrder").val();
	var noteDescription = $("#noteDescription").val();
	var nextFollowUpDate = $("#nextFollowUpDate").datepicker("getDate");
	var checkBoxFollowUpRequired = $("#checkBoxFollowUpRequired").is(":checked");
	var caseWorkerName = $("#caseWorkerName").html();
	
	var DTO = Object();
	DTO.caseId = idCase;
	DTO.orderId = idOrder;
	DTO.noteDescription = noteDescription;
	DTO.nextFollowUpDate = nextFollowUpDate;
	DTO.followUpRequired = checkBoxFollowUpRequired;
	
	$.ajax({
		type: "POST",
		dataType: "JSON",
		contentType: "application/json",
		url: "services/addProgressNote",
		data: JSON.stringify(DTO)
	}).done(function(data) {
	});
	
	$("#addNoteForm")[0].reset();
	var date = $.datepicker.formatDate("yy-mm-dd", new Date());
	
	var row =
        "<tr style=\"\">" + 
		"  <td style=\"width:30%;vertical-align:top;\"><b><i>" + date + "</i></b></td>"+
        "  <td style=\"width:70%;vertical-align:right;\" align=\"right\"><strong><i>" + caseWorkerName + "</i></strong></td>" + 
        "</tr>" + 
        "<tr style=\"height:15.0pt\">" + 
          "<td style=\"vertical-align:top;\" colspan=\"2\" >" + noteDescription + "</td>"
        "</tr>";
	
	$("#progressNoteTable tbody").append(row);
}