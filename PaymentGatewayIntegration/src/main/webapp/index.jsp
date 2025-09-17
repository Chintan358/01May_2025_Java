<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
</head>
<body>
	<input type="text" id="amt" placeholder="enter amount">
	<button id="rzp-button1">Pay with Razorpay</button>
	<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
	<script>
		document.getElementById('rzp-button1').onclick = function(e) {

			e.preventDefault();
			var amt = $("#amt").val()
			$.get('payment', {amt}, function(rt) {
				const order = JSON.parse(rt)

				var options = {
					"key" : "rzp_test_R8LF6p6eS7swQn", // Enter the Key ID generated from the Dashboard
					"amount" : order.amount, // Amount is in currency subunits. 
					"currency" : "INR",
					"name" : "Acme Corp",
					"description" : "Test Transaction",
					"image" : "https://example.com/your_logo",
					"order_id" : order.id, //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
					"handler" : function(response) {
						alert(response.razorpay_payment_id);
						alert(response.razorpay_order_id);
						alert(response.razorpay_signature)
					},
					"prefill" : {
						"name" : "harshani",
						"email" : "harshani@gmail.com",
						"contact" : "85749685252"
					},
					"notes" : {
						"address" : "Razorpay Corporate Office"
					},
					"theme" : {
						"color" : "#3399cc"
					}
				};
				var rzp1 = new Razorpay(options);
				rzp1.on('payment.failed', function(response) {
					alert(response.error.code);
					alert(response.error.description);
					alert(response.error.source);
					alert(response.error.step);
					alert(response.error.reason);
					alert(response.error.metadata.order_id);
					alert(response.error.metadata.payment_id);
				});

				rzp1.open();
			})

		}
	</script>

</body>
</html>