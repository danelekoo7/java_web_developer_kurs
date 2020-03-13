document.addEventListener("DOMContentLoaded", function () {
    let validEmail = false;
    let validName = false;
    let validSurname = false;
    let validPass = false;
    let pass1temp = false;
    let pass2temp = false;
    let validCheckbox = false;

    const email = document.querySelector("#email");
    email.addEventListener("change", function () {
        console.log(email.value);
        if (new RegExp("@").test(email.value)) {
            validEmail = true;
        } else {
            validEmail = false
        }
    });

    const name = document.querySelector("#name");
    name.addEventListener("change", function () {
        console.log(name.value);

        if (new RegExp("^[a-zA-Z]{5,}$").test(name.value)) {
            validName = true;
            console.log(true)
        } else {
            validName = false
            console.log(false)
        }
    });

    const surname = document.querySelector("#surname");
    surname.addEventListener("change", function () {
        console.log(surname.value);
        if (new RegExp("^[a-zA-Z]{5,}$").test(surname.value)) {
            validSurname = true;
            console.log(true)
        } else {
            validSurname = false
            console.log(false)
        }
    });

    const pass1 = document.querySelector("#pass1");
    pass1.addEventListener("change", function () {
        console.log(pass1.value);
        pass1temp = pass1.value;
    });

    const pass2 = document.querySelector("#pass2");
    pass2.addEventListener("change", function () {
        console.log(pass2.value);
        pass2temp = pass2.value;
    });

    if (pass1temp === pass2temp) {
        console.log(pass1temp);
        console.log(pass2temp);
        validPass = true;
    }

    const checkbox = document.querySelector("#agree")

    checkbox.addEventListener("click", function () {
        if (checkbox.checked) {
            validCheckbox = true;
            console.log(true)
        } else {
            validCheckbox = false;
            console.log(false)
        }
    })

    const form = document.querySelector("form");
    form.addEventListener("submit", function (event) {
        if (!validPass || !validName || !validSurname || !validEmail || !validCheckbox) {
            event.preventDefault();
        }
    });
});