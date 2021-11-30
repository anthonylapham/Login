$(document).ready(function(){
	var apiURL = "https://holidayapi.com/v1/holidays?pretty&country=US&year=2020&key=" + api_Key;
	var api_Key = config.API_KEY;
	
	 $.getJSON(apiURL, function(data) {
      console.log(data);
	  if(data.holidays.name = "Christmas Day"){
		document.body.style.backgroundColor = rgb(20, 65, 37);
	}
      
     
  });
});