/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {
	 $('#BillingPostalCode').on('change', function (event) {
		 console.log("it fired");
		 if (event.target.value.length !== 5){
			 $("#tax span").html("$0.00");
			 return;
		 };
	        $.ajax({
	            url: "/m4-java-historygeek-exercises/api/getTax?billingZipCode=" + event.target.value  + "&subtotal=" + $("#subtotal .price").text().replace("$", ""),
	            type: "GET",
	            dataType: "json"
	        }).done(function (data) {
	        	console.log(data);
	            $("#tax span").html("$" + data);
	            console.log("here");
	            calculateGrandTotal();
	            
	        }).fail(function (xhr, status, error) {
	            console.log(error);
	        });
	    });

});