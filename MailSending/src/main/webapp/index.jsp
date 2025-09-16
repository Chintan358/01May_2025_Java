<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored ="false"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Email Form</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
  <div class="container py-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card shadow-lg border-0 rounded-4">
          <div class="card-body p-4">
            <h3 class="card-title mb-4 text-center">Send Email</h3>
            
            <form  action="send" method="post">
              <!-- To -->
              <span>${message}</span>
              <div class="mb-3">
                <label for="toEmail" class="form-label">To</label>
                <input type="email" class="form-control" id="toEmail" name="email" placeholder="recipient@example.com" required>
              </div>

              <!-- Subject -->
              <div class="mb-3">
                <label for="subject" class="form-label">Subject</label>
                <input type="text" class="form-control" id="subject" name="subject" placeholder="Enter subject" required>
              </div>

              <!-- Message -->
              <div class="mb-3">
                <label for="message" class="form-label">Message</label>
                <textarea class="form-control" id="message" rows="5" name="message" placeholder="Write your message..." required></textarea>
              </div>

              <div class="d-grid">
                <button type="submit" class="btn btn-primary btn-lg">Send</button>
              </div>
            </form>

            <!-- Status -->
            <div id="status" class="mt-3 text-center text-muted small">Ready</div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
    