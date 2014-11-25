$(document).ready(function() {
	$("#events-result-success").hide();
	$("#events-result-error").hide();
	
	$("#start-reconciliation").click(function() {
		$.ajax({
			type: "POST",
			dataType: "JSON",
			contentType: "application/json",
			url: "services/callReconciliationProcess",
		}).done(function(data) {
			$("#events-result-success").show();
		}).error(function(jqXHR, textStatus, errorThrown) {
			$("#events-result-error").show();
		});
	});
});
