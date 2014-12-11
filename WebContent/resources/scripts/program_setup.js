$(document).ready(function() {
	$("#cancel-data-validation").click(function() {
		window.location = "program_setup";
	});

	$("#button-new-record").click(function() {
		window.location = "program_new";
	});

	$("#button-edit-record").click(function() {
		var record = $("input:radio[name='icd10ProgramsId']:checked");
		var index = record.index();
		var icd10ProgramValue = record.val();
		if (index < 0){
			alert("Please, select one ICD Code.");
			return false;
		}
		
		
		var icdCode = record.closest('td').next().find('input').val();
		//var icdCode = $("input:radio[name='icd10ProgramsId']:checked").next().text();
		//alert("icdCode:closet>"+icdCode);
		//console.log("icdCode:closet>"+icdCode);

		var DTO = Object();

		DTO.icd10ProgramsId = icd10ProgramsId;
		
		var url = "program_edit";
		var form = $("<form action='" + url + "' method='get'>" +
					   "<input type='hidden' name='icd10ProgramsId' value='" + icd10ProgramValue + "' />" +
					   /*"<input type='hidden' name='icdCode' value='" + icdCode + "' />" +*/
		  			 "</form>");
		
		$("body").append(form);
		form.submit();
		
		//window.location = "program_edit";
	});

	$("#button-delete-record").click(function() {
		var record = $("input:radio[name='icd10ProgramsId']:checked");
		var index = record.index();
		var icd10ProgramValue = record.val();
		if (index < 0){
			alert("Please, select one ICD Code.");
			return false;
		}
		if ( window.confirm("Confirm to delete this ICD Code?") ){
		
			var DTO = Object();

			DTO.icd10ProgramsId = icd10ProgramValue;

			$.ajax({
				type: "POST",
				dataType: "JSON",
				contentType: "application/json",
				url: "services/deleteIcd10Programs",
				data: JSON.stringify(DTO)
			}).done(function(data) {
				goRefresh();
			});

		}		

	});
	
	/* Add ICd10 Code*/
	$("#confirm-new-data").click(function() {
		//var icd10ProgramsId = $("#icd10ProgramsId").val();
		//var icdCodeId 		= $("#icdCodeId").val();
		var icdCode 		= $("#icdCode").val();
		var rxAdherence 	= $("#rxAdherence").val();
		var apptAdherence 	= $("#apptAdherence").val();
		var education 		= $("#education").val();
		
		var DTO = Object();
		//DTO.icd10ProgramsId = icd10ProgramsId;
		//DTO.icdCodeId 		= icdCodeId;
		DTO.icdCode 		= icdCode;
		DTO.rxAdherence 	= rxAdherence;
		DTO.apptAdherence 	= apptAdherence;
		DTO.education 		= education;

		$.ajax({
			type: "POST",
			dataType: "JSON",
			contentType: "application/json",
			url: "services/addIcd10Programs",
			data: JSON.stringify(DTO)
		}).done(function(data) {
			goRefresh();
		});
		
		var url = "program_setup";
		var form = $("<form action='" + url + "' method='POST'>" +
		  			 "</form>");
		
		$("body").append(form);
		form.submit();
		
		//window.location = "program_setup";
		document.location.href ="program_setup"; 
		
	});

	/* Update ICd10 Code in Programs Setup */
	$("#confirm-edit-data").click(function() {
		var icd10ProgramsId = $("#icd10ProgramsId").val();
		var icdCodeId 		= $("#icdCodeId").val();
		var icdCode 		= $("#icdCode").val();
		var rxAdherence 	= $("#rxAdherence").val();
		var apptAdherence 	= $("#apptAdherence").val();
		var education 		= $("#education").val();

		
		var DTO = Object();
		DTO.icd10ProgramsId = icd10ProgramsId;
		DTO.icdCodeId 		= icdCodeId;
		DTO.icdCode 		= icdCode;
		console.log(icdCode);
		DTO.rxAdherence 	= rxAdherence;
		console.log(rxAdherence);
		DTO.apptAdherence 	= apptAdherence;
		console.log(apptAdherence);
		DTO.education 		= education;
		console.log(education);
		
		console.log(JSON.stringify(DTO));
		
		$.ajax({
			type: "POST",
			dataType: "JSON",
			contentType: "application/json",
			url: "services/upDateIcd10Programs",
			data: JSON.stringify(DTO)
		}).done(function(data) {
			goRefresh();
		});

		//window.location = "program_setup";
		document.location.href ="program_setup"; 
		
	});
	
});


function goRefresh(){
	window.location = "program_setup";
}
