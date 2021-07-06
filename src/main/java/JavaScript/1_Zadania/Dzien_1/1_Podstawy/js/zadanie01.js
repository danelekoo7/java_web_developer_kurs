function mathInfo() {
    var randomNumber = Math.floor(Math.random() * 100);
    //poniżej napisz rozwiązanie zadania

    //1
    if (randomNumber % 2 === 0) {
        console.log("liczba parzysta: " + randomNumber)
    } else {
        console.log("liczba nieparzysta: " + randomNumber)
    }

    //2

    var dividers = "1, "
    for (var i = 2; i < randomNumber; i++) {
        if (randomNumber % i === 0) {
            dividers += i + ", "
        }
    }
    console.log(dividers)

    //3

    var index = randomNumber % 5;
    console.log(Math.pow(randomNumber, index))

}

//to wywołanie ma spowodować wyświetlenie w konsoli informacji z zadania
mathInfo();
