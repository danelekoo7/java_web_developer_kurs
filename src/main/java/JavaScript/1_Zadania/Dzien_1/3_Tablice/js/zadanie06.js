function factors(i) {
    const result = [];
    if (i <= 0) {
        return console.log([]);
    } else {
        for (var j = 1; j <= i; j++) {
            if (i % j === 0) {
                result.push(j)
            }

        }

        result.reverse()
        return console.log(result)
    }
}


factors(2);// => [2, 1]
factors(54);// => [54, 27, 18, 9, 6, 3, 2, 1]
factors(-4);// => []