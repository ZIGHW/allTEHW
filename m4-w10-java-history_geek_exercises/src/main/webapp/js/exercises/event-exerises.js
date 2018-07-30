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
	
	$('#shipping-info input').click(function(e){
		let shippingCost = parseFloat($(e.target).data('cost'));
		$('#shipping span').text("$" + shippingCost);
		
		calculateGrandTotal();
	})
	
	
});

const calculateGrandTotal = () => {
	let shippingCost = parseFloat($('#shipping .price').text().slice(1, -1));
	let subTotal = parseFloat($('#subtotal .price').text().slice(1, -1));
	let tax = parseFloat($('#tax .price').text().replace("$", ""));
	console.log(tax);
	let grandTotal = (tax + subTotal + shippingCost).toFixed(2);
	let strgrandTotal = ( "$" + grandTotal);
	$('#grandtotal .price').text(strgrandTotal);
}
