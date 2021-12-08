$(document).ready(function(){
	var api_Key = config.API_KEY;
	var apiURL = "https://holidayapi.com/v1/holidays?pretty&country=US&year=2020&key=" + api_Key;
	
	
	$("#register-form").hide();
	
	$('#newUser').click(function(event){
		event.preventDefault();
		$("#register-form").show();
	});
	
	 $.getJSON(apiURL, function(data) {
      console.log(data);
	  if(data.holidays.weekday.date.name = "Saturday"){
		document.body.style.backgroundColor = rgb(20, 65, 37);
	}
	

      
     
  });
});