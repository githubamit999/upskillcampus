<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Music Player - Settings</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/validation.js" defer></script>
</head>
<body>
    <div class="container text-center mt-5">
        <h1>Settings</h1>

        <!-- Display success or error messages -->
        <c:if test="${not empty errorMessage}">
            <div class="alert alert-danger">${errorMessage}</div>
        </c:if>
        <c:if test="${not empty successMessage}">
            <div class="alert alert-success">${successMessage}</div>
        </c:if>

        <!-- Form -->
        <form class="mt-4" onsubmit="return validateSettingsForm()" action="SettingsServlet" method="post">
            <div class="mb-3">
                <label for="themeSelect" class="form-label">Theme</label>
                <select class="form-select" id="themeSelect" name="themeSelect" required>
                    <option value="">-- Select Theme --</option>
                    <option value="light">Light</option>
                    <option value="dark">Dark</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="volumeInput" class="form-label">Volume (0-100)</label>
                <input type="number" id="volumeInput" name="volumeInput" class="form-control" min="0" max="100" required>
            </div>
            <button type="submit" class="btn btn-primary">Save Changes</button>
        </form>
        <div class="mt-3">
            <a href="index.jsp" class="btn btn-secondary">Back to Home</a>
        </div>
    </div>
</body>
</html>
