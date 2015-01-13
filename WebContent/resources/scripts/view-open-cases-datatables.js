$(document).ready(function() {
    $('#open-cases-table').DataTable({
        "pageLength":10
    });
} );

function goToCaseDetail(id) {
	var url = "case_detail";
	var form = $("<form action='" + url + "' method='post'>" +
				   "<input type='hidden' name='caseId' value='" + id + "' />" +
	  			 "</form>");
	
	$("body").append(form);
	form.submit();
}