$(document).ready(function () {

$("#register #form0").validate({

      rules:   {
        email: {
           required: true,
           dotGovEmail: true
        },
        password: {
            required: true,
            minlength: 8,
            lettersonly:true,
        },
        confirmPassword: {
            equalTo: "#password"
        },
      },
      messages: {
         email: {
             required: "Your gonna want to put a valid email address here bud."
         },
         password: {
             required: "You need a password",
//             dotGovEmail: "needs to be a government email"
         },
         confirmPassword: {
            equalTo: "This password needs to be the same as your other password field"
         }
      },
      errorClass: "error",
      validClass: "valid"


});

$("#login #form0").validate({
    rules:   {
      email: {
         required: true,
         dotGovEmail: true
      },
      password: {
          required: true,
          minlength: 8,
          lettersonly:true,
      },
    },
    messages: {
       email: {
           required: "Your gonna want to put a valid email address here bud."
       },
       password: {
           required: "You need a password",
       },
    },
    errorClass: "error",
    validClass: "valid"


});

$("#checkout").validate({
    rules:   {
      BillingAddress1: {
         required: true,
      },
      BillingCity: {
         required: true,
      },
      BillingState: {
          required: true,
      },
      BillingPostalCode: {
          required: true,
      },
      ShippingAddress1: {
          required: true,
      },
      ShippingCity: {
          required: true,
      },
      ShippingState: {
          required: true,
      },
      ShippingPostalCode: {
          required: true,
      },
      NameOnCard: {
          required: true,
      },
      CreditCardNumber: {
          required: true,
          minlength: 15,
          maxlength: 16,
          number:true,
      },
      ExpirationDate: {
          required: true,
      },
    },
    messages: {
    	 BillingAddress1: {
    	 	required: "The billing address is required"
    	 },
    	
    	 BillingCity: {
            required: "Billing city is required",
		 },
		 BillingState: {
		     required: "Billing state is required",
		 },
		 BillingPostalCode: {
		     required: "Billing postal code is required",
		 },
		 ShippingAddress1: {
		     required: "Shipping Address is required",
		 },
		 ShippingCity: {
		     required: "Shipping city is required",
		 },
		 ShippingState: {
		     required: "Shipping state is required",
		 },
		 ShippingPostalCode: {
		     required: "Shipping postal code is required",
		 },
		 NameOnCard: {
		     required: "Name on card is required",
		 },
		 CreditCardNumber: {
		     required: "Credit card number is required",
		     minlength: "Card number needs to be more than 14 digits",
		     maxlength: "Card number needs to be less than 17 digits",
		     number: "Card number can only contain numbers"
		 },
		 ExpirationDate: {
		     required: "Expiration date is required",
		 },
		

       
    },
    errorClass: "error",
    validClass: "valid",
    errorContainer: $('#errorSummary'),
    errorLabelContainer: $('#errorSummary #errors'),
    wrapper: 'li'


});
});


$.validator.addMethod("dotGovEmail", function(value, index) {
	   return value.toLowerCase().endsWith(".gov");
	}, "Needs to be a government email address");
