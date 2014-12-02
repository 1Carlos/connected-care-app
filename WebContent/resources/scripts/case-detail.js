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
		"<tr>" +
			"<td>" +
			    date +
			"</td>" +
			"<td>" +
				noteDescription +
			"</td>" +
		"</tr>";
	
	$("#progressNoteTable tbody").append(row);
}