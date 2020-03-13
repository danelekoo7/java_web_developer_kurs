document.addEventListener("DOMContentLoaded", function () {
    const allButtons = document.querySelectorAll(".checkbox");
    const price = document.querySelector("#price");
    const submit = document.querySelector(".btn-primary");

    var total = 0.00;

    for (let i = 0; i < allButtons.length; i++) {
        allButtons[i].firstElementChild.firstElementChild.addEventListener("click", function () {
            if (i === 0) {
                total = 0.00;
                if (allButtons[0].firstElementChild.firstElementChild.checked) {
                    for (let j = 1; j < allButtons.length - 1; j++) {
                        allButtons[j].firstElementChild.firstElementChild.checked = true;
                        total += Number.parseFloat(allButtons[j].firstElementChild.firstElementChild.dataset.price);
                        console.log(total);
                        price.innerText = total.toFixed(2) + " zł"
                    }
                } else {
                    for (let j = 1; j < allButtons.length - 1; j++) {
                        allButtons[j].firstElementChild.firstElementChild.checked = false;

                        total = 0.00;
                        price.innerText = total.toFixed(2) + " zł"
                    }
                }
            } else if (i >= 1 && i < allButtons.length - 1) {

                if (allButtons[i].firstElementChild.firstElementChild.checked) {
                    total += Number.parseFloat(allButtons[i].firstElementChild.firstElementChild.dataset.price);
                    price.innerText = total.toFixed(2) + " zł"
                } else {
                    total -= Number.parseFloat(allButtons[i].firstElementChild.firstElementChild.dataset.price);
                    price.innerText = total.toFixed(2) + " zł"
                }

            } else if (i === allButtons.length - 1) {
                for (let j = 0; j < allButtons.length; j++) {
                    allButtons[j].firstElementChild.firstElementChild.checked = false;
                    total = 0.00
                    price.innerText = total.toFixed(2) + " zł"
                }
            }
        })
    }

    submit.addEventListener("click", function () {
        alert("Pizza kosztuje: " + total.toFixed(2));
    });
});