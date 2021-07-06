/**
 * Zagnieżdżanie funkcji.
 * Prześledź krok po kroku każdą linijkę kodu. Każdą!
 * Spróbuj napisać komentarze dla każdej z linijek kodu
 */


// funkcja zewnetrzna nr1
function jeden() {

    // zmienna wewnatrz funkcji nr1
    var zmienna1 = 1;

    // funkcja wenetrzna nr 2
    function dwa() {

        // zmienna zewnetrzna wenwatrz funkcji wenetrznej
        console.log(zmienna1);

        // zmienna wewnetrzna wenwatrz funkcji wenetrznej
        var zmienna2 = 3;
    }

    // wywolanie funkcji wenetrznej wewnatrz funkcji zewnetrznej
    dwa();

    // proba wyswietlenia zmiennej z funkcji wewnetrznej poza ta funkcja
    // nie ma tu do niej dosetepu
    //  console.log(zmienna2)
}

// wywolanie funkcji zewnetrznej
jeden()