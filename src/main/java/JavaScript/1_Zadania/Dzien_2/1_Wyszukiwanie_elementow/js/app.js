//Co oznaca poniższy kod dowiecie się w dalszej części modułu
document.addEventListener("DOMContentLoaded", function () {
    //tag article o klasie first.
    // <article class="first" />
    const firstArticle = document.querySelector("article.first")
    console.log(firstArticle)

    // wypisz w konsoli, ile elementów h1 znajduje się w tym tagu.
    const headersInArticle = document.querySelectorAll("article h1")
    console.log(headersInArticle.length)

    ////////////////////
    // wyszukiwanie h2
    ////////////////////

    // wyszukanie po wszystkich odrazu
    const headers2InArticle = document.querySelectorAll("article h2")
    console.log(headers2InArticle.length)

    // wyszukanie tylko dla pierwszego
    const article = document.querySelector("article")
    const h2 = article.querySelectorAll("h2")
    console.log(h2.length)

    // wyszukanie wszystkich krok po kroku
    const articles = document.querySelectorAll("article")
    let h2inAllArticles = 0;
    for (let art of articles) {
        h2inAllArticles += art.querySelectorAll("h2").length
    }
    console.log(h2inAllArticles)

    // wyszukaj w nim wszystkie elementy o klasie offers, przeiteruj je i wypisz je w konsoli,
    // <article ... >
    //      <p class="offers" />
    // </article>
    const articleOffers = document.querySelectorAll("article .offers")
    console.log(articleOffers.length)
    articleOffers.forEach(offer => {
        console.log(offer)
    })

    // wyszukaj w nim wszystkie elementy div, przeiteruj je i wypisz je w konsoli.
    // <article ... >
    //     <div ...>
    // </article>
    const articleDivs = document.querySelectorAll("article div")
    console.log(articleDivs.length)
    articleDivs.forEach(div => {
        console.log(div)
    })

    // 2
    // gdybyśmy mogli użyć wyszukiwania po id...
    let exercise2 = document.getElementById("exercise2")
    console.log(exercise2)

    exercise2 = document.querySelector("#exercise2")
    console.log(exercise2)

    exercise2 = document.querySelector("nav > ul > li:nth-child(5) > a")
    console.log(exercise2)


//    zadanie 3

    let task3Id = document.getElementById("home");
    console.log(task3Id);

    task3Id = document.querySelector("#home");
    console.log(task3Id);

    let task3Li = document.querySelector(" li:not([data-direction])");
    console.log(task3Li);

    let task3Block = document.querySelector(".block");
    console.log(task3Block);

//    zadanie 4

    const task4Li = document.querySelectorAll("nav li")
    console.log(task4Li.length)
    console.log(task4Li)

    const task4P = document.querySelectorAll("div p")
    console.log(task4P.length)
    console.log(task4P)

    const task4Div = document.querySelectorAll("article div")
    console.log(task4Div.length)
    console.log(task4Div)

//    zadanie dodatkowe



});