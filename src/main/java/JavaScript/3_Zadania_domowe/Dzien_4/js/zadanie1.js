$(function () {
    const spinner = $("#spinnerValue");
    const buttons = $(".btn-xs");
    const up = buttons.eq(0);
    const down = buttons.eq(1);
    const save = $(".saveSettings");
    const progressBar = $(".progressInner");
    let counter = 0;
    let percentAdd = 0;
    var interval = null;

    let percentBar = 0;
    let min = Number.parseFloat($("#min").attr("value"));
    console.log(min);
    let max = Number.parseFloat($("#max").attr("value"));
    console.log(max);
    let step = Number.parseFloat($("#step").attr("value"));
    console.log(step);

    percentAdd = (step * 100) / (max - min);
    progressBar.attr("style", "width: 0%");

    save.on("click", function () {
        min = Number.parseFloat($("#min").val());
        max = Number.parseFloat($("#max").val());
        step = Number.parseFloat($("#step").val());

        percentAdd = (step * 100) / (max - min);
        progressBar.attr("style", "width: 0%");
        percentBar = 0;
        counter = min;
        spinner.attr("value", counter);
    });

    var functionUp = function () {
        if (Number.parseFloat(spinner.attr("value")) + step <= max) {
            counter = counter + step;
            spinner.attr("value", counter);
            percentBar = percentBar + percentAdd;
            progressBar.attr("style", "width: " + percentBar + "%");
            console.log(percentAdd)
        }
    };

    up.on("mousedown ", function () {
        interval = setInterval(
            () => {
                functionUp()
            }, 200)
    });

    up.on("click", function () {
        functionUp()
    });

    up.on("mouseup mouseout", function () {
        clearInterval(interval);
    });

    var functionDown = function () {
        if (Number.parseFloat(spinner.attr("value")) - step >= min) {
            counter = counter - step;
            spinner.attr("value", counter)
            percentBar = percentBar - percentAdd;
            progressBar.attr("style", "width: " + percentBar + "%")
            console.log(percentAdd)
        }
    };

    down.on("click", () => {
        functionDown();
    });

    down.on("mousedown ", function () {
        interval = setInterval(
            () => {
                functionDown()
            }, 200)
    });

    down.on("mouseup mouseout", function () {
        clearInterval(interval);
    })
});