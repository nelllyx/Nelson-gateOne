let arr = [2,6,5,3,7,9]

for(let index = 0; index < arr.length; index++){


for(let column = 1; column < arr.length - 1; column++){

if(arr[column] < arr[column - 1]){

let temp = arr[column]

arr[column] = arr[column -1]

arr[column -1] = temp

}


}




}

console.log(arr)