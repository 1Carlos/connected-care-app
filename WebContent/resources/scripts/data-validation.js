$(document).ready(function() {
	$("#confirm-data-validation").click(function() {
		$("#process-modal").modal("show");
	});
	
	$("#cancel-data-validation").click(function() {
		var idFile = $("#idFile").val();
		
		var DTO = Object();
		DTO.idFile = idFile;
		
		$.ajax({
			type: "POST",	      
			contentType: "application/json",
			url: "services/deleteByCSVHeadId",
			dataType: "JSON",
			data: JSON.stringify(DTO)
		}).done(function(data) {
		});
		
		//window.location = "import_data";
	});
});


