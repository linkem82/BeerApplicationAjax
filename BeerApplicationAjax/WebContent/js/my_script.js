$(document).ready(function() {
	$('form').on("submit", getColor);
});

function getColor(event) {
	event.preventDefault();
	var form = $(this);
	$.ajax($('form').attr('action'), {
		type: 'POST',
		success : function(response) {
			$('#Beers').remove();
			var advicesList = $("<ul id='Beers'></ul>");
			$('h2').hide();
			advicesList.hide();			
			response.forEach(function(value) {
				advicesList.append($('<li>' + value + '</li>' ));
			});			
			$('.col-lg-3.col-offset-1').append(advicesList);
			$('h2').slideDown();
			advicesList.slideDown();
		},		
		data : form.serialize(),
		dataType : 'json',
		contentType : "application/x-www-form-urlencoded",
		error : function(request, errorType, errorMessage) {
			alert("An error occured: " + errorType + " " + errorMessage)
		}
	});
}
