var add = function (array) {
    var result = 0;
    for (var i = 0; i < array.length; ++i) {
        result += array[i];
    }
    return result;
};


var multiply = function (array) {
    var result = 1;
    for (var i = 0; i < array.length; i++) {
        result *= array[i];
    }
    return result
};


var array = [4, 5, 6];
console.log(add(array));
console.log(multiply(array));