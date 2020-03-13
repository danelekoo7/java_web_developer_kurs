document.addEventListener("DOMContentLoaded", function () {
    const buttons = document.querySelectorAll(".deleteBtn")
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const parent = this.parentElement.parentElement;
            if (parent) {
                parent.parentElement.removeChild(parent);
            }
        })
    })
});



