document.addEventListener("DOMContentLoaded", function () {

        // zad 1

        var firstElement = document.querySelector(".first")
            .firstElementChild.children[2];
        console.log(firstElement);


        // zad 2

        var secondElement = document.querySelector("#second")
            .parentElement.children[3];

        console.log(secondElement);


        // zad 3

        var thirdElementTemp = document.querySelector("[data-ex='third']")
            .parentElement.parentElement.lastElementChild.firstElementChild.children;
        var thirdElement = thirdElementTemp[Math.ceil((thirdElementTemp.length) / 2) - 1]
        console.log(thirdElement);


        // zadanie 4

        var fourthElementStep1 = document.querySelector("div.fourth")
            .parentElement.children;
        var fourthElementStep2;
        var fourthElement;
        var counter = 0;

        for (let i = 0; i < fourthElementStep1.length; i++) {

            if (fourthElementStep1[i].localName === "article") {
                fourthElementStep2 = fourthElementStep1[i];
                // console.log(fourthElementStep2);

                for (let j = 0; j < fourthElementStep2.children.length; j++) {
                    if (fourthElementStep2.children[j].localName === "p") {
                        counter++;
                        if (counter === 2) {
                            fourthElement = fourthElementStep2.children[j];
                            console.log(fourthElement);
                        }
                    }
                }
            }
        }
    }
);

