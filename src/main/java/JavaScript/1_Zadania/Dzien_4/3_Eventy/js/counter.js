$(function () {
    console.log("works")
    const textarea = $("textarea")
    const counter = $("#counter")
    textarea.on("input", function (event) {
        const text = $(this).val()
        const count = text.length;
        counter.text(count + "/100")

        if (count <= 33) {
            $(this).css("background", "green");
        } else if (count <= 66) {
            $(this).css("background", "yellow");
        } else {
            $(this).css("background", "red");
        }
    })
})