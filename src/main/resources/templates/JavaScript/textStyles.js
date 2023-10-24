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


