document.addEventListener("DOMContentLoaded", function () {
    var dives = document.querySelectorAll("div");
    for(var i = 0; i < dives.length; i++) {
        dives[i].addEventListener("click", function() {
            var randomColor = "#" + Math.floor(Math.random()*16777215).toString(16);
            this.style.backgroundColor = randomColor;
        });
    }
});
