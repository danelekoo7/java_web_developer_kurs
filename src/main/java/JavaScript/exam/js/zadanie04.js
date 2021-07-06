document.addEventListener("DOMContentLoaded", function () {
    var button1 = document.querySelector("#button-1");
    var button2 = document.querySelector("#button-2");
    var button3 = document.querySelector("#button-3");
    var shoppingList = document.querySelector("#shopping-list");

    button1.addEventListener("click", function () {
        const product = document.createElement("p")
        product.innerText = "czekolada";
        shoppingList.appendChild(product)
    });

    button2.addEventListener("click", function () {
        shoppingList.removeChild(shoppingList.lastElementChild);
    });

    button3.addEventListener("click", function () {
        if (shoppingList.children.length>=2){
            const secondProduct = shoppingList.children[1];
            var newProduct = secondProduct.cloneNode(true);
            shoppingList.appendChild(newProduct)
        } else {
            console.log("nie ma drugiego produktu na liscie")
        }
    });
});