$(document).ready(function() {
	$(":file").filestyle({buttonText: "Search File", buttonName: "btn-primary", input: true});

	$("#events-result").hide();	
	
	$("#file-upload-button").click(function() {
		$("#process-modal").modal("show");
	});
	
	$("#process-modal").on("shown.bs.modal", function(e) {
		$("#file-upload-form").submit();
	});
	
	$("#file-upload-form").submit(function(e) {
	    var formData = new FormData($(this)[0]);

	    $.ajax({
	        url: "services/uploadFileService",
	        type: "POST",
	        data: formData,
	        async: false,
	        cache: false,
	        contentType: false,
	        processData: false,
	        success: function(data) {
	        	$(":file").filestyle("clear");
	        	$("#process-modal").modal("hide");
	        	
	        	if(data.response.code == 0) {
	        		var url = "data_validation";
	        		var form = $("<form action='" + url + "' method='post'>" +
	        					   "<input type='hidden' name='idFile' value='" + data.idFile + "' />" +
	        					   "<input type='hidden' name='rowsInFile' value='" + data.rowsInFile + "' />" +
	        		  			 "</form>");
	        		$("body").append(form);
	        		form.submit();
	        	} else {
	        		$("#events-result").show();
		        	$("#events-result").text(data.response.message);
	        	}
	        },
	        error: function() {
	        	$(":file").filestyle('clear');
	        	$("#events-result").show();
	        	$("#events-result").text("Error connecting server.");
	        }
	    });
	    
	    e.preventDefault();
	});
});


