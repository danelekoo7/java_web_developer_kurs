document.addEventListener("DOMContentLoaded", function () {
    const select = document.querySelector(".form-control")

    const images = document.querySelectorAll("img");

    for (let i = 0; i < images.length; i++) {
        images[i].className = "hidden";
    }
    select.addEventListener("change", function () {
        if (this.value === "Windows") {
            images[0].classList.add("hidden");
            images[1].classList.add("hidden");
            images[2].classList.remove("hidden");
        } else if (this.value === "Os X") {
            images[0].classList.remove("hidden");
            images[1].classList.add("hidden");
            images[2].classList.add("hidden");
        } else if (this.value === "Ubuntu") {
            images[0].classList.add("hidden");
            images[1].classList.remove("hidden");
            images[2].classList.add("hidden");
        }
    })
});