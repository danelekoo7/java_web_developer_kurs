document.addEventListener("DOMContentLoaded", function () {
    const links = document.querySelectorAll("a");
    const link1 = links[0];
    const link2 = links[1];
    link1.addEventListener("click", function () {
        this.nextElementSibling.style.display = "block"
    });
    link2.addEventListener("mouseover", function () {
        this.nextElementSibling.style.display = "block"
    });
    link2.addEventListener("mouseleave", function () {
        this.nextElementSibling.style.display = "none"
    });
});
