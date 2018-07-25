//// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {
	$('#SameShipping').click( function() {
		if ($(this).is(":checked")) {
			$("[id^='Shipping']").each(function() {
				data=$(this).attr("id");
				tmpID = data.split("Shipping");
				$(this).val($("#Billing" + tmpID[1]).val())
			})
		
	} else {
		$("[id^='Shipping']").each(function() {
			$(this).val("");
		})
	}
	})
	
	$('#shipping-info input').click(function(){
		let shippingCost = parseFloat($(this).data('cost'));
		$('#shipping span').text("$" + shippingCost);
		
		let subTotal = parseFloat($('#subtotal .price').text().slice(1, -1));
		let tax = parseFloat($('#tax .price').text().slice(1, -1));
		let grandTotal = (tax + subTotal + shippingCost).toFixed(2);
		let strgrandTotal = ( "$" + grandTotal);
		$('#grandtotal .price').text(strgrandTotal);
	})
	
	
});
