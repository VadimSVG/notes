function changeFontFamily() {
    var elements = document.querySelectorAll('.input-field');
    var fontFamily = document.getElementById("fontFamily").value;
    for (var i = 0; i < elements.length; i++) {
        elements[i].style.fontFamily = fontFamily;
    }
    document.getElementById("fontFamilyInput").value = fontFamily;
}

function changeFontSize() {
    var elements = document.querySelectorAll('.input-field');
    var fontSize = document.getElementById("fontSize").value;
    for (var i = 0; i < elements.length; i++) {
        elements[i].style.fontSize = fontSize;
    }
    document.getElementById("fontSizeInput").value = fontSize;
}
