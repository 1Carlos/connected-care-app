$(document).ready(function() {
	$("#confirm-data-validation").click(function() {
		var idFile = $("#idFile").val();
		var rowsLoaded = $("#rowsLoaded").val();
		
		var url = "normalization";
		var form = $("<form action='" + url + "' method='post'>" +
					   "<input type='hidden' name='idFile' value='" + idFile + "' />" +
					   "<input type='hidden' name='rowsLoaded' value='" + rowsLoaded + "' />" +
		  			 "</form>");
		
		$("body").append(form);
		form.submit();
	});
	
	$("#cancel-data-validation").click(function() {
		var idFile = $("#idFile").val();
		
		var DTO = Object();
		DTO.idFile = idFile;
		
		$.ajax({
			type: "POST",
			dataType: "JSON",
			contentType: "application/json",
			url: "services/deleteByCSVHeadId",
			data: JSON.stringify(DTO)
		}).done(function(data) {
		});
		
		window.location = "import_data";
	});
});


