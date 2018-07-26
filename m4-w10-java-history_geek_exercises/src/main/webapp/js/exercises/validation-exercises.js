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
      },
      ExpirationDate: {
          required: true,
      },
    },
    messages: {
       
    },
    errorClass: "error",
    validClass: "valid"


});
});


$.validator.addMethod("dotGovEmail", function(value, index) {
	   return value.toLowerCase().endsWith(".gov");
	}, "Needs to be a government email address");


    // Email address - required
    // Email address - .gov only (BONUS)
    // Password - required, length 8 or more
    // ConfirmPassword