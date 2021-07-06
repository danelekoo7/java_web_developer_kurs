// zadanie 1

String.prototype.upperLower = function () {
    var result = "";
    var idx = 0;
    for (var i = 0; i < this.length; i++) {
        var character = this.charAt(i);

        if (character === " ") {
            result += character;
            continue;
        }
        if (idx++ % 2 !== 0) {
            result += character.toUpperCase();
        } else {
            result += character.toLowerCase();
        }
    }
    return result
};

var funnyText = "Smiesznie".upperLower();
var funnyTextWithSpace = "Javascript jest super".upperLower();

console.log(funnyText);
console.log(funnyTextWithSpace);


// zadanie 2

var Car = function (brand, color) {
    this.brand = brand;
    this.color = color;
    this.km = 0;

//    pierwszy sposob

    this.printCarInfo = function () {
        console.log(`Brand: ${this.brand} Color: ${this.color}  Km: ${this.km}`)
    }
};


var opel = new Car("opel", "black");
opel.printCarInfo();

// drugi spsosob

Car.prototype.drive = function (km) {
    this.km += km;
};


opel.drive(10)
opel.drive(100)
opel.printCarInfo()

//
// // zadane 3
//
// // opel.inspection =["2021","2022"];
// Car.prototype.inspection = [];
//
// Car.prototype.addInspection = function(inspection){
//   this.inspection.push(inspection);
// };
//
// opel.addInspection("2020");
// opel.addInspection("2022");
// opel.addInspection("2025");
//
// Car.prototype.printInspection = function(){
//     console.log(`inspection : ${this.inspection}`)
// }
// opel.printInspection()
//
// var vw = new  Car("VW", "white");
// vw.addInspection("2000");
// vw.printInspection()
//


class ServisableCar extends Car {
    constructor(brand, type) {
        super(brand, type);
        this.services = []
    }

    addService = function (service) {
        this.services.push(service)
    }
}

ServisableCar.prototype.global = []

const skoda = new ServisableCar("Skoda", "blue")
const honda = new ServisableCar("Honda", "red")

skoda.addService("21-02-2020")
skoda.addService("22-02-2020")
honda.addService("22-02-2020")

console.log(opel.services)
console.log(skoda.services)
console.log(honda.services)

console.log(opel.hasOwnProperty('services'))
console.log(skoda.hasOwnProperty('services'))
console.log(honda.hasOwnProperty('services'))

console.log(opel.hasOwnProperty('global'))
console.log(skoda.hasOwnProperty('global'))
console.log(honda.hasOwnProperty('global'))


// zadanie 5

var Rectangle = function (a, b) {
    this.a = a;
    this.b = b;
};

Rectangle.prototype.getArea = function () {
    return this.a * this.b;
};


Rectangle.prototype.getPerimiter = function () {
    return this.a * 2 + this.b * 2;
};


var firstObject = new Rectangle(3, 10);
console.log(firstObject.getArea());
console.log(firstObject.getPerimiter());


var secondObject = new Rectangle(4, 4);
console.log(secondObject.getArea());
console.log(secondObject.getPerimiter());


var thirdObject = new Rectangle(2, 8);
console.log(thirdObject.getArea());
console.log(thirdObject.getPerimiter());


// zadanie 6

var Calculator = function () {
    this.arr = [];
};

Calculator.prototype.add = function (num1, num2) {
    var result = num1 + num2;
    this.arr.push(`added ${num1} to ${num2} got ${result}`)
    return result;
};


Calculator.prototype.multiply = function (num1, num2) {
    var result = num1 * num2;
    this.arr.push(`multiplied ${num1} with ${num2} got ${result}`)
    return result;
};

Calculator.prototype.subtract = function (num1, num2) {
    var result = num2 - num1;
    this.arr.push(`substracted ${num1} from ${num2} got ${result}`)
    return result;
};

Calculator.prototype.divide = function (num1, num2) {
    var result = num1 / num2;
    this.arr.push(`divided ${num1} by ${num2} got ${result}`)
    return result;
};


Calculator.prototype.printOperation = function () {
    for (let i = 0; i < this.arr.length; i++) {
        console.log(this.arr[i])
    }
};


Calculator.prototype.clearOperation = function () {
    this.arr = []
};

var task6b = new Calculator();
task6b.add(1, 2);
var task6a = new Calculator();

task6a.add(2, 8);


task6a.multiply(4, 6);
task6a.subtract(10, 5);
task6a.divide(10,5);
task6a.printOperation();
task6a.clearOperation();
task6a.printOperation();
console.log(task6a);


console.log(task6b);
