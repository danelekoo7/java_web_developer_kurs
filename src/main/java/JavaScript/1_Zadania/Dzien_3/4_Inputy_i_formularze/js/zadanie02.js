document.addEventListener("DOMContentLoaded", function () {
    const checkbox = document.querySelector(".checkbox").firstElementChild.firstElementChild
    const form = document.querySelector(".checkbox").nextElementSibling

    form.className = "hidden";
    checkbox.addEventListener("click", function () {
        if (checkbox.checked) {
            form.classList.remove("hidden");
        } else {
            form.className = "hidden";
        }
    })
});