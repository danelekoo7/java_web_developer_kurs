document.addEventListener("DOMContentLoaded", function() {
    const listContainers = document.querySelectorAll(".listContainer")

    listContainers.forEach(container =>  {
        container.addEventListener("mouseover", function () {
            this.classList.toggle("hovered")

            const list = container.children[0]
            const elements = list.children
            // Pierwszy element w liście ma mieć kolor czerwony.
            list.firstElementChild.style.backgroundColor = "red"
            // Ostatni element w liście ma mieć kolor niebieski.
            list.lastElementChild.style.backgroundColor = "blue"

            // Wszystkie inne elementy mają mieć kolor zielony.
            for (let i = 1; i < elements.length - 1; i++) {
                elements[i].style.backgroundColor = "green"
            }
        })
    })
})