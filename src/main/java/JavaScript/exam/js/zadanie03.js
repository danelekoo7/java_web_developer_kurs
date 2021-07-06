document.addEventListener("DOMContentLoaded", function () {
    var buttons = document.querySelectorAll("button");

    var divElement = document.querySelector("div");
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener("click", function () {
            divElement.innerText = this.dataset.text;
            console.log(this.dataset.text)
        })
    }
});