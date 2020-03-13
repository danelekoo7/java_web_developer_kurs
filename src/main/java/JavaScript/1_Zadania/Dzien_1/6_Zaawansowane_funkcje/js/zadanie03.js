/**
 * Funkcje wyższego rzędu.
 * Prześledź krok po kroku każdą linijkę kodu. Każdą!
 * Spróbuj napisać komentarze dla każdej z linijek kodu
 */

// funkcja sortująca
function sortArray() {

    // liczby do posortowania
    var points = [41, 3, 6, 1, 114, 54, 64];

// wywołanie funkcji sortującej
    points.sort(function(a, b) {
       // pokazanie w jaki posób liczby mają być sortowane
        return b-a;
    });

    // tablica z posortowanymi liczbami
    return points;

}

//wyswietlenie wyniku
console.log(sortArray());
