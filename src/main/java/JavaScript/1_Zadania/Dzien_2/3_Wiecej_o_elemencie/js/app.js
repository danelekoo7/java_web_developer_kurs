document.addEventListener("DOMContentLoaded", function () {
    /*
    Poniżej napisz kod rozwiązujący zadania
     */
//    Dodaj atrybut data-direction nastawiony na wartość up każdemu elementowi li, który nie ma tego atrybutu.

    // Zad 1
    const list = document.querySelectorAll(".ex1 li")

    for (let i = 0; i < list.length; i++) {
        let elem = list[i]
        if (!elem.dataset.direction) {
            elem.dataset.direction = "up"
        }

        if (i % 2 === 0) {
            elem.style.backgroundColor = "green"
        }

        if (i === 5) {
            elem.classList.toggle("big")
        }

        if (i % 3 === 0) {
            elem.style.textDecoration = "underline"
        }
    }

    // list.forEach(elem => {
    //     if(!elem.dataset.direction) {
    //         elem.dataset.direction = "up"
    //     }
    //     console.log(elem.dataset)
    // })

    // Zad 2
    // W zadaniu (plik index.html) znajduje się prosty formularz z polem wyboru select.
    //


    const options = document.querySelectorAll(".ex2 option")
    options.forEach(option => {
        // Ustaw każdemu elementowi option wartość opisu z atrybutu value.
        const value = option.getAttribute("value")
        option.innerText = value

        // Dodaj każdemu elementowi atrybut data-year, użyj dataset, ale wynikowa wartość ma być o 20 większa niż w atrybucie value,
        // np. 2020 -> 2040.
        option.dataset.year = Number.parseInt(value) + 20
    })

    // zadanie 3 d

// Zad 3
    const browsers = document.querySelectorAll(".ex3 div")

    browsers.forEach(browser => {
        if (!browser.children.length) {
            return;
        }

        let clazzDiv = browser.querySelector("div");
        const clazz = clazzDiv.getAttribute("class")

        const anchor = browser.querySelector("a")
        if (clazz === "chrome") {
            clazzDiv.style.width = "100px"
            anchor.innerText = "Chrome"
        }

        if (clazz === "edge") {
            clazzDiv.style.backgroundImage = "url(assets/img/edge.png)"
            anchor.setAttribute("href", "https://www.microsoft.com/en-us/edge")
        }

        if (clazz === "firefox") {
            clazzDiv.style.backgroundImage = "url(assets/img/firefox.png)"
            anchor.setAttribute("href", "https://www.mozilla.org/en-US/firefox/new/")
            anchor.innerText = "Firefox"
        }


        // Zad 4
        const name = document.querySelector(".ex4 span#name");
        const color = document.querySelector(".ex4 span#fav_color");
        const meal = document.querySelector(".ex4 span#fav_meal");

        name.innerHTML = "Arek"
        color.innerHTML = "Niebieski"
        meal.innerHTML = "Rolada Śląska"


        // Zad 5
        const ul = document.querySelector(".ex5 ul")
        console.log(ul)
        ul.classList.add("menu")
        const listElements = ul.querySelectorAll("li")

        listElements.forEach(element => {
            element.classList.add("menuElement")
            element.classList.remove("error")
        });

        // Zad 6
        const ex6List = document.querySelectorAll(".ex6 li")
        let idx = 1;
        ex6List.forEach(element => {
            element.dataset.id = idx
            element.setAttribute("id", idx)
            idx++
        })

    });
});