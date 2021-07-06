document.addEventListener("DOMContentLoaded", function () {
    const button = document.querySelector(".button")
    var listToRemove = document.querySelectorAll(".list li");

    button.addEventListener("click", function () {
        listToRemove.forEach(i => {
            i.parentElement.removeChild(i);
        })
    })
});



