document.addEventListener("DOMContentLoaded", function () {
    var buttons = document.querySelectorAll(".moveBtn");
    const list1 = document.querySelector("#list1");
    const list2 = document.querySelector("#list2");
    buttons.forEach(button => {
        button.addEventListener("click", function () {
            const parent = this.parentElement;
            if (parent) {
                if (parent.parentElement.id === "list1") {
                    parent.parentElement.removeChild(parent);
                    list2.appendChild(parent);
                } else if (parent.parentElement.id === "list2") {
                    parent.parentElement.removeChild(parent);
                    list1.appendChild(parent);
                }
            }
        })
    })
});



