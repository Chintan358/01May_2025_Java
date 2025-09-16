<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>OTP Validation</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background: linear-gradient(135deg, #6a11cb 0%, #2575fc 100%);
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .otp-box {
      background: #fff;
      padding: 30px;
      border-radius: 15px;
      box-shadow: 0 8px 20px rgba(0,0,0,0.2);
      text-align: center;
      width: 400px;
    }
    .otp-input {
      width: 50px;
      height: 50px;
      font-size: 20px;
      text-align: center;
      margin: 0 5px;
      border-radius: 10px;
      border: 1px solid #ccc;
    }
    .otp-input:focus {
      border-color: #2575fc;
      outline: none;
      box-shadow: 0 0 5px #2575fc;
    }
  </style>
</head>
<body>
  <div class="otp-box">
    <h4 class="mb-3">OTP Verification</h4>
    <p class="text-muted">Enter the 6-digit OTP sent to your email/phone</p>
    <span>${err}</span>
    <form action="verify" method="post">
    <div class="d-flex justify-content-center mb-4">
      <input type="text" maxlength="6" class="form-control" id="otp1" name="otp">
    </div>
    <button class="btn btn-primary w-100" onclick="validateOTP()">Verify OTP</button>
    </form>
    
    
  </div>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
  
</body>
</html>
