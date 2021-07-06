document.addEventListener("DOMContentLoaded", function () {

    var buttons = document.querySelectorAll("button");
    var spans = document.querySelectorAll("span");


    // opcja 1
    var counter = [];
    for (let i = 0; i < buttons.length; i++) {
         counter[i] = 0;
        buttons[i].addEventListener("click",function() {
            spans[i].innerText = ++counter[i];
        });
    }


    // opcja 2
    // var counter1 = 0;
    // buttons[0].addEventListener("click",function() {
    //     spans[0].innerText = ++counter1
    // });
    //
    // var counter2 = 0;
    // buttons[1].addEventListener("click",function() {
    //     spans[1].innerText = ++counter2
    // });
    //
    // var counter3 = 0;
    // buttons[2].addEventListener("click",function() {
    //     spans[2].innerText = ++counter3
    // });

});
