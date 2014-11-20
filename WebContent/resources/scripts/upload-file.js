$(document).ready(function() {
	$(":file").filestyle({buttonText: "Search File", buttonName: "btn-primary", input: true});

	$('#fileUploadButton').click(function() {
		$("#fileUploadForm").submit();
	});
	
	$("#fileUploadForm").submit(function(event){
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
	        	alert(data.response.message);
	        	$(":file").filestyle('clear');
	        },
	        error: function(){
	            alert("Error trying reach the service");
	            $(":file").filestyle('clear');
	        }
	    });
	    
	    event.preventDefault();
	});
});
