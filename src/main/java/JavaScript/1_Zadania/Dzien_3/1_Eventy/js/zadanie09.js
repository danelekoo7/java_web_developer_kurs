document.addEventListener("DOMContentLoaded", function () {

    const windowWidth = document.getElementById("windowWidth")
    const windowHeight = document.getElementById("windowHeight")

    function setWindowSize () {
        const width = document.documentElement.clientWidth;
        const heigh = document.documentElement.clientHeight;
        windowHeight.innerText = heigh
        windowWidth.innerText = width
    }

    window.addEventListener("resize", setWindowSize)

});
