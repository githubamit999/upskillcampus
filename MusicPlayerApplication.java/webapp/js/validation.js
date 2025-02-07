function validateSettingsForm() {
    const themeSelect = document.getElementById("themeSelect").value;
    const volume = document.getElementById("volumeInput").value;

    // Check if theme is selected
    if (themeSelect === "") {
        alert("Please select a theme.");
        return false;
    }

    // Check if volume is within range
    if (volume === "" || volume < 0 || volume > 100) {
        alert("Volume must be between 0 and 100.");
        return false;
    }

    alert("Settings saved successfully!");
    return true;
}
