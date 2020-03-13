document.addEventListener("DOMContentLoaded", function () {
    const mainBtn = document.querySelector("#mainBtn");

    function printHurra() {
        console.log("Hura! Działa!")
    }

    mainBtn.addEventListener("click", printHurra)
});
