var yearOfBirth = [1980, 1990, 1995, 1999, 2018];
var currentYear = 2020;

function calculationAge(array) {
    var minYear;
    var maxYear;

    while (true) {
        calcYear = array.pop();

        if (calcYear=== undefined){
            break;
        }

        if (minYear===undefined){
            minYear=calcYear
        }
        if (maxYear===undefined){
            maxYear=calcYear
        }

        if (calcYear<minYear){
            minYear=calcYear;
        }
        if (calcYear > maxYear) {
            maxYear = calcYear;
        }
    }

    console.log(`Oldest: ${minYear}, Age: ${currentYear - minYear}`);
    console.log(`Youngest: ${maxYear}, Age: ${currentYear - maxYear}`);
}

calculationAge(yearOfBirth);