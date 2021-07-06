document.addEventListener("DOMContentLoaded", function() {
    const buttons = document.querySelectorAll(".button")
    console.log(buttons)

    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const sibling = this.nextElementSibling;
            if (sibling) {
                const prevDisplay = sibling.className
                console.log(prevDisplay)
                sibling.classList.toggle("hidden")
            }
        })
    })
})