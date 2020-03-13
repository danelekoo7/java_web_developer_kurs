document.addEventListener("DOMContentLoaded", function () {
//do dokonczenia
    var divElement = document.querySelector("div");

    var spans = document.querySelectorAll("span");

    var globalX = document.querySelector("#globalX");
    var globalY = document.querySelector("#globalY");
    var localX = document.querySelector("#localX");
    var localY = document.querySelector("#localY");

    divElement.addEventListener("mousemove", function (event) {
        globalX.innerText = event.pageX
        globalY.innerText = event.pageY
        const rect = event.target.getBoundingClientRect();
        localX.innerText = (event.pageX - rect.left)
        localY.innerText = (event.pageY - rect.top)

    });

    //
    // for (var i = 0; i < spans.length; i++) {
    //     spans[i].addEventListener("click", function (event) {
    //         spans[i].innerText = event.clientX;
    //         spans[i].innerText = event.clientX;
    //         spans[i].innerText = event.clientX;
    //         spans[i].innerText = event.clientX;
    //
    //
    //     });
    // }
});
