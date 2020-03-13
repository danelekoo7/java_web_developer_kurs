//zadanie 1
function getNumber(num, arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] === num) {
            return true
        }
    }
    return false
}

console.log(getNumber(2, [33, 54, 2, 1, 4, 100]));// => true
console.log(getNumber(5, [33, 54, 2, 1, 4, 100]));// => false


// zadanie 2

function createIdentityMatrix(rows) {
    var array = [];
    for (let i = 0; i < rows; i++) {
        array[i] = [];
        for (let j = 0; j < rows; j++) {
            if (i === j) {
                array[i][j] = 1;
            } else {
                array[i][j] = 0;
            }
        }
    }
    return array
}

console.log(createIdentityMatrix(4));

// zadanie 3

var Tree = function (type) {
    this.type = type;
};


var klon = new Tree("lisciaste");
var choinka = new Tree("iglaste");
var dab = new Tree("twarde");

Tree.prototype.bloom = function () {
    return "I'm blooming"
};

//nie do końca rozumiem co mam tu sprawdzić
console.log(klon.type);
console.log(klon.hasOwnProperty("bloom()"));
console.log(klon.bloom());
console.log(choinka.type);
console.log(choinka.hasOwnProperty("bloom()"));
console.log(choinka.bloom());
console.log(dab.type);
console.log(dab.hasOwnProperty("bloom()"));
console.log(dab.bloom());

// zadanie dodatkowe

// Zadanie 1 - dodatkowe


function addTheSameNumbers(num, arr) {
    var sum = 0;
    var exists = false;
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] === num) {
            sum += num;
            exists = true;
        }
    }
    if (exists) {
        return sum;
    } else {
        return null
    }
}

console.log(addTheSameNumbers(7, [4, 7, 24, 7, 0, 10]));// => 14
console.log(addTheSameNumbers(9, [33, 54, 2, 1, 9, 100]));// => 9
console.log(addTheSameNumbers(0, [33, 0, 2, 0, 9, 0]));// => 0
console.log(addTheSameNumbers(43, [6, 0, 2, 2, 3, 46]));// => null

// Zadanie 2 - dodatkowe

function powers(num) {
    var array = [];
    if (num <= 0) {
        return array;
    } else {
        number = 1;
        while (number < 200) {
            number = number * num;
            if (number < 200) {
                array = array.concat(number);
            }
        }
        return array.reverse();
    }
}

console.log(powers(2));// => [ 128, 64, 32, 16, 8, 4, 2 ]
console.log(powers(5));// => [ 125, 25, 5 ]
console.log(powers(-4));// => []

// Zadanie 3 - dodatkowe

function getFirstWrongElement(array) {
    for (let i = 0; i < array.length - 1; i++) {
        if (array[i + 1] % array[i] !== 0) {
            return array[i + 1]
        }
    }
    return null
}

console.log(getFirstWrongElement([1, 5, 10, 14, 28, 84]));//=> 14
console.log(getFirstWrongElement([3, 5, 15, 45]));// => 5
console.log(getFirstWrongElement([1, 8, 32, 128, 1024]));// => null

// Zadanie 4 - dodatkowe

function getLastNumbers(num, arr) {
    var array = [];
    if ((typeof num) === "number") {
        for (let i = arr.length - num; i < arr.length; i++) {
            array = array.concat(arr[i])
        }
    }
    return array;
}

console.log(getLastNumbers(2, [1, 2, 3, 4, 5, 6, 7]));// => [6, 7]
console.log(getLastNumbers(4, [6, 7, 8, 10, 11, 12, 13, 14, 15]));// => [12, 13, 14, 15]
console.log(getLastNumbers([-4, -3, -2, 0, 1, 2, 3, 4]));// => []
console.log(getLastNumbers('ala', [-4, -3, -2, 0, 1, 2, 3, 4]));// => []
