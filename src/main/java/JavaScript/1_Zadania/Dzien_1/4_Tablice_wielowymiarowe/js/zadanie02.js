function print2DArray(array) {
    for (let i = 0; i <array.length ; i++) {
        for (let j = 0; j <array[i].length ; j++) {
            console.log(array[i][j])
        }
    }
}

var arr = [];
arr[0] = [3, 4, 56, 773, 1];
arr[1] = [7, 12, 0, 98, 34, 381];
arr[2] = [12, 66, 96, 54, 10];


print2DArray(arr)