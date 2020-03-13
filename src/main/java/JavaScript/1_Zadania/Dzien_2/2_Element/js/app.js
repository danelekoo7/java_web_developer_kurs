/**
 * Created by Jacek on 2016-01-11.
 */

document.addEventListener("DOMContentLoaded", function () {
    const homeElement = document.getElementById("home");
    const childElements = document.querySelector(".offers").children;
    const banner = document.querySelector(".ban");
    const blocks = document.querySelectorAll(".block");
    const links = document.querySelector(".links").children;

    // 1
    const homeElementClass = homeElement.className
    const homeElementId = homeElement.id

    homeElement.className = homeElementId
    homeElement.id = homeElementClass

    console.log(homeElement)

    // 2
    console.log("Elementy", "I ich typy")

    console.log(homeElement, typeof homeElement)
    console.log(childElements, typeof childElements)
    console.log(banner, typeof banner)

    for (let block of blocks) {
        console.log(block, typeof block)
    }

    for (let link of links) {
        console.log(link, typeof link)
    }

//    zadanie 3

    for (let block of blocks) {
        //pokazuje wartość wewnatrz "block"
        console.log(block.innerHTML);
        block.innerHTML = "Nowa wartość diva o klasie blocks.";
        //pokazuje wartość wewnatrz "block" razem z "block"
        console.log(block.outerHTML);
    }

//    zadanie 4

    console.log(homeElement.id);

//    zadanie 5

    for (let childElement of childElements) {
        console.log(childElement.tagName)
    }


    // zadanie 6

    for (let link of links) {
        console.log(link.dataset)
    }

    // zadanie 7

    var classList = banner.classList;
    console.log(classList);
    console.log(typeof classList)
    var className = banner.className;
    console.log(className);
    console.log(typeof className)

});