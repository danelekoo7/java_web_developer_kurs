document.addEventListener("DOMContentLoaded", function() {
    const menu = document.querySelector(".menu")
    const button = document.querySelector(".button")

    button.addEventListener("click", () => {
        const li = document.createElement("li")
        li.innerText = "Element " + menu.children.length;
        menu.appendChild(li)
    })
});