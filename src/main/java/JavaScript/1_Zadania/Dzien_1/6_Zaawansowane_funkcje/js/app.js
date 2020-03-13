// zadanie 1
function boilEgg(sec) {
    const interval = setInterval(
        () => {
            console.log("Jajko się gotuje...")
        },
        5000
    )

    setTimeout(
        () => {
            console.log("Jajko ugotowane")
            clearInterval(interval)
        },
        sec * 1000
    );
}

boilEgg(20)



function maxNumber(...args) {
    let max = args[0];

    // pierwszy for each zwraca indeksy
    // for (let i in args) {
    //     if (args[i] > max) {
    //         max = args[i]
    //     }
    // }

    // drugi for each zwraca wartości
    // for (let i of args) {
    //     if (i > max) {
    //         max = i;
    //     }
    // }

    // trzeci for each na tablicy
    args.forEach(i => {
        if (i > max) {
            max = i;
        }
    })

    return max;
}

console.log(maxNumber(5, 29, 6, 4, 34, 56, 2, 3));
console.log(maxNumber(5, 29, 6, 4, 34, 2, 3));
console.log(maxNumber(5, 29, 2, 3));
console.log(maxNumber(5, 29, 2, 3));
console.log(maxNumber(5, 29, 99));