// zadnaie 1

var menu = document.querySelector("#menu");
console.log(menu);

var getDataInfo = function (element) {
    var list = element.querySelectorAll("li");
    var array = [];

    for (let i = 0; i < list.length; i++) {
        array[i] = list[i];
    }
    return array;
};

console.log(getDataInfo(menu));


// zadnaie 2

var mainContener = document.querySelector("#main-contener");
console.log(mainContener);

var getElementClass = function (element) {
    var list = element.children;
    var array = [];
    for (let i = 0; i < list.length; i++) {
        array[i] = list[i].className;
    }
    return array;
};

console.log(getElementClass(mainContener));


// zadanie 3

var pink = document.querySelector(".pink-color");
console.log(pink);

var getElementText = function (element) {
    return element.innerText
};

console.log(getElementText(pink));


// zadanie 4

var images = document.querySelectorAll(".images");
console.log(images);

var getElementAlt = function (element) {
    var array = [];
    for (let i = 0; i < element.length; i++) {
        array[i] = element[i].alt;
    }
    return array;
};

console.log(getElementAlt(images));


// zadanie 5


var links = document.querySelectorAll(".my-link");
console.log(links);

var getElementHref = function (element) {
    var array = [];
    for (let i = 0; i < element.length; i++) {
        array[i] = element[i].href;
    }
    return array;
};

console.log(getElementHref(links));

