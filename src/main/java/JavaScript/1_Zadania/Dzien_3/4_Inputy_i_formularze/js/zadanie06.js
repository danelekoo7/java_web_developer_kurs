document.addEventListener("DOMContentLoaded", function () {
    const team1 = document.querySelector("#team1");
    const team2 = document.querySelector("#team2");
    const points1 = document.querySelector("#points1");
    const points2 = document.querySelector("#points2");

    const form = document.querySelector("form");

    form.addEventListener("submit", function (event) {
        event.preventDefault();
        let invalid = false;

        if (team1.value === team2.value) {
            invalid = true
        } else if (points1.value < 0) {
            invalid = true
        } else if (points2.value < 0) {
            invalid = true
        }

        if (invalid) {
            alert("Formualrz niepoprawny");
            return
        }

        const row = document.createElement("tr");
        const team1Column = document.createElement("td");
        team1Column.innerText = team1.value;
        row.appendChild(team1Column);

        const team2Column = document.createElement("td");
        team2Column.innerText = team2.value;
        row.appendChild(team2Column);

        const resultColumn = document.createElement("td");
        resultColumn.innerText = points1.value + " - " + points2.value;
        row.appendChild(resultColumn);

        document.querySelector("table tbody").appendChild(row);
    })
});