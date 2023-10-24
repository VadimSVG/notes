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

function toggleItalic() {
    var elements = document.querySelectorAll('.input-field');
    var isItalic = elements[0].style.fontStyle !== "italic";
    var isBold = elements[0].style.fontWeight === "bold";

    for (var i = 0; i < elements.length; i++) {
        elements[i].style.fontStyle = isItalic ? "italic" : "normal";
        elements[i].style.fontWeight = isBold ? "bold" : "normal";
    }
    document.getElementById("isItalic").value = isItalic;
    document.getElementById("isBold").value = isBold;
}

function toggleBold() {
    var elements = document.querySelectorAll('.input-field');
    var isItalic = elements[0].style.fontStyle === "italic";
    var isBold = elements[0].style.fontWeight !== "bold";

    for (var i = 0; i < elements.length; i++) {
        elements[i].style.fontStyle = isItalic ? "italic" : "normal";
        elements[i].style.fontWeight = isBold ? "bold" : "normal";
    }
    document.getElementById("isItalic").value = isItalic;
    document.getElementById("isBold").value = isBold;
}
