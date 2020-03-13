document.addEventListener("DOMContentLoaded", function () {

    var buttons = document.querySelectorAll("button");
    var span = document.querySelector(" span");

    var counter = 0;
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener("click",function() {
            span.innerText = ++counter
        });
    }
});
