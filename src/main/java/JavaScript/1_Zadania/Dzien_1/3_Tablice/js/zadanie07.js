function getMissingElement(arr) {
    for (var i = 0; i <arr.length-1 ; i++) {
        if (arr[i] + 1 !==arr[i+1]){
            return arr[i] +1;
        }
    }
    return null
}

console.log(getMissingElement([1,2,3,4,5,6,7]));// => null
console.log(getMissingElement([6,7,8,10,11,12,13,14,15]));// => 9
console.log(getMissingElement([-4,-3,-2,0,1,2,3,4]));// => -1
