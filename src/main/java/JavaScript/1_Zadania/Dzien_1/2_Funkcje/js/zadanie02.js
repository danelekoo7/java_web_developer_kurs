var calculateAreaAndPerimeter = function (radius) {
    if (typeof radius !== 'number') {
        return false;
    }
    var area = Math.PI * radius * radius;
    var perimeter = Math.PI * 2 * radius;
    var result = (`Radius: ${radius}, area: ${area}, perimeter: ${perimeter} `)
    return result;
}

console.log(calculateAreaAndPerimeter(3));

console.log(calculateAreaAndPerimeter("aa"));