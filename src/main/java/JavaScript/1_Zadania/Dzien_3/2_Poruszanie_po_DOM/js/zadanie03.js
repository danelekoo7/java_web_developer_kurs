document.addEventListener("DOMContentLoaded", function () {
    var buttons = document.querySelectorAll(".button");

    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const parent = this.parentElement;
            var randomColor = "#" + Math.floor(Math.random()*16777215).toString(16);
            parent.style.backgroundColor = randomColor;
        })
    })

})