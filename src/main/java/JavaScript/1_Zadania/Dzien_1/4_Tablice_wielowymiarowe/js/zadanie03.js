function create2DArray(rows,column) {
    var array = [];
    var number=1;
    for (let i = 0; i < rows; i++) {
        array[i]=[];
        for (let j = 0; j <column ; j++) {
            array[i][j]=number++;
        }
    }
    return array
}

function print2DArray(array) {
    for (let i = 0; i <array.length ; i++) {
        for (let j = 0; j <array[i].length ; j++) {
            console.log(array[i][j])
        }
    }
}

var array = create2DArray(14,100);
print2DArray(array);

