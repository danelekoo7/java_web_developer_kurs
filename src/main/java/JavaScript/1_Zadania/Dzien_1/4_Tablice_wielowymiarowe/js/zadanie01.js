const checkArray = function (array2D) {

    const result = [];
    for (let i = 0; i < array2D.length; ++i) {
        const array = array2D[i];
        let isEven = true;
        for (let j = 0; j < array.length; ++j) {
            if (array[j] % 2 !== 0) {
                isEven = false;
                break;
            }
        }
        result.push(isEven);
    }
    return result;


};
var arr = [
    [11, 12],
    [42, 2],
    [-4, -120],
    [0, 0],
    [1, 34],
];

var arr2 = [];
arr2[0] = [3, 4, 56, 773, 1];
arr2[1] = [7, 12, 0, 98, 34, 381];
arr2[2] = [12, 66, 96, 54, 10];

console.log(checkArray(arr));
console.log(checkArray(arr2));

