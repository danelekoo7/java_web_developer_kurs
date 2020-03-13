$(function () {
    console.log("dziala");

    // zadanie 2

    $("section.main").find("li").addClass("borderClass")

    $(".showMore").eq(0).css("color", "red");


    // zadanie 3

    $("section.main").find("li").addClass("colorText backgroundElement")

    $("section.main").find("li").fadeOut(5000);
    $("section.main").find("li").fadeIn(50000);


    // zadanie 4

    // $(".menu").find("a").css("color", "red");

    $(".menu").find("a").addClass("redLinks");
    $(".menu").find("a").eq(0).addClass("biggerFont");


    // zadanie 5
    if (!$('h1').hasClass('creepyHeader')) {
        $('h1').addClass('creepyHeader');
    } else {
        console.log('nagłówek ma klasę creepyHeader');
    }
});


