$(document).ready(function(){
	var api_Key = config.API_KEY;
	var apiURL = "https://holidayapi.com/v1/holidays?pretty&country=US&year=2020&key=" + api_Key;
	
	
	$("#register-form").hide();
	
	 $.getJSON(apiURL, function(data) {
      console.log(data);
	  if(data.holidays.weekday.date.name = "Thursday"){
		document.body.style.backgroundColor = rgb(20, 65, 37);
	}
	

      
     
  });
});