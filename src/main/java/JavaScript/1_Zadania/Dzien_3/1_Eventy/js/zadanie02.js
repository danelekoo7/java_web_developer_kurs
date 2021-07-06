document.addEventListener("DOMContentLoaded", function() {
    // Napisz jeden event dla wszystkich guzików, który ma być podpięty do elementu rodzica o id bubblingButtons,
    //     który spowoduje, że po kliknięciu licznik znajdujący się w atrybucie data-counter zwiększy wartość o jeden.

    // wspólna funkcja
    function incrementButtonCounter(event) {
        const target = event.target
        const counter = target.dataset.counter
        target.dataset.counter = Number.parseInt(counter) + 1
    }

    // // Na każdy przycisk
    // const buttons = document.querySelectorAll("#bubblingButtons button")
    //
    // buttons.forEach(button => {
    //     button.addEventListener("click", incrementButtonCounter)
    // })

    // Na cały div (event propagation bubbling z przycisku na div)
    const bubblingButtons = document.querySelector("#bubblingButtons")

    bubblingButtons.addEventListener("click", incrementButtonCounter)
});