// a)
var elements = document.querySelectorAll(".sample_class");

function getElementsTag(elements) {
    var array = [];
    for (let i = 0; i < elements.length; i++) {
        array[i] = elements[i].tagName;
    }
    return array;
}

// test
console.log(elements);
var table = getElementsTag(elements);
for (let i = 0; i < table.length; i++) {
    console.log(table[i]);
}

// b)
var element = document.querySelector("#sample_id");

function getElementsClass(element) {
    var array = element.classList;
    return array;
}

// test
console.log(element);
var task2 = getElementsClass(element);
for (let i = 0; i < task2.length; i++) {
    console.log(task2[i]);
}

// c)
var liElements = document.querySelectorAll(".sample_class_2 li");

function getElementsInnerText(liElements) {
    var array = [];
    for (let i = 0; i < liElements.length; i++) {
        array[i] = liElements[i].innerText
    }
    return array;
}

// test
console.log(liElements);
var task3 = getElementsInnerText(liElements);
for (let i = 0; i < task3.length; i++) {
    console.log(task3[i]);
}

// d)
var aElements = document.querySelectorAll("a");

function getElementsAddress(aElements) {
    var array = [];

    for (let i = 0; i < aElements.length; i++) {
        if (aElements[i].hasAttribute("href")) {
            array[i] = aElements[i].getAttribute("href");
        }
    }
    return array;
}

// test
console.log(aElements);
var task4 = getElementsAddress(aElements);
for (let i = 0; i < task4.length; i++) {
    console.log(task4[i]);
}

// e)
var classChildren = document.querySelector(".sample_class_3").children;

// test
console.log(classChildren);
var task5 = getElementsTag(classChildren);
for (let i = 0; i < task5.length; i++) {
    console.log(task5[i]);
}