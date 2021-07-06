$(function () {

    console.log("2 dziala");
    // Zad 1
    const task1 = $("span[data-task='_task1']");

    console.log(task1);
    const closestSibling = task1.siblings("p").closest();
    console.log(closestSibling);
    const ancestor = task1.closest("section");
    console.log(ancestor);
    const nextParent = ancestor.next();
    console.log(nextParent);
    const containers = nextParent.find(".container");
    containers.css("background-color", "green");
    containers.addClass("answerTask1");
    console.log(containers);

    setTimeout(() => {
        console.log("slide down");
        containers.slideUp(4000)
    }, 4000);


    // Zad 2

    const task2 = $("span[data-task='_task2']")
    const shoppingSection = task2.parent().prev();
    const secondDivChild = shoppingSection.children("div").eq(1);
    const button = secondDivChild.find("button");
    button.closest(".cart-item").addClass("cart-updated")


});