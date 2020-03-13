document.addEventListener("DOMContentLoaded", function() {
    const button = document.querySelector(".button")
    var toDelete = document.querySelector("#remove");

    button.addEventListener("click", function () {
        toDelete.parentElement.removeChild(toDelete);
    })
});



