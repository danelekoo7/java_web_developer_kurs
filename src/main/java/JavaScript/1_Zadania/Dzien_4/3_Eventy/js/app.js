$(function () {
    console.log("ready")

    const buttons = $(".hero-buttons").find("button");
    const first = buttons.eq(0)
    const second = buttons.eq(1)
    const third = buttons.eq(2)

    first.on("click", () => {
        console.log("kliknięto mnie")
    })

    second.one("click", () => {
        console.log("kliknięto mnie, ale już drugi raz nie dam się kliknac")
    })

    third.on("click", () => {
        first.off()
        second.off()
    });

    // Zad 3
    const superheroDescription = $(".superhero-description");
    superheroDescription.find("dd").hide()
    superheroDescription.find("dt").on("click", function () {
        const dd = $(this).next()
        if (dd.is(":visible")) {
            dd.hide()
        } else {
            dd.show()
        }
    })

    // Zad 4
    $("form.login")
        .find(".show-hide-btn").on("click", function (event) {
        // event.preventDefault()
        console.log("działam")

        const pswd = $(this).prev()
        const type = pswd.attr("type");
        if (type === "password") {
            pswd.attr("type", "text")
        } else {
            pswd.attr("type", "password")
        }
    })

    // Zad 5
    $(".menu").on("mouseenter", function () {
        console.log("Hura")
    })

    // Zad 6
    const loginForm = $("form.login").find("input");
    loginForm.on("focus", function () {
        $(this).css("background-color", "white")
        $(this).css("box-shadow", "0px 0px 5px 5px green");
    })

    loginForm.on("blur", function () {
        $(this).css("box-shadow", "")
        $(this).css("background-color", "grey")
    })
})