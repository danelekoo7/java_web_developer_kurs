document.addEventListener("DOMContentLoaded", function() {
    const button = document.querySelector("#addBtn");

    // inputy
    const orderId = document.querySelector("#orderId")
    const item = document.querySelector("#item")
    const quantity = document.querySelector("#quantity")

    const table = document.querySelector("#orders")

    button.addEventListener("click", function () {
        console.log(orderId.value)
        console.log(item.value)
        console.log(quantity.value)

        const orderIdElem = document.createElement("td")
        orderIdElem.innerText = orderId.value

        const itemElem = document.createElement("td")
        itemElem.innerText = item.value

        const quertityElem = document.createElement("td")
        quertityElem.innerText = quantity.value

        const row = document.createElement("tr")
        row.appendChild(orderIdElem)
        row.appendChild(itemElem)
        row.appendChild(quertityElem)

        table.appendChild(row)
    })
});