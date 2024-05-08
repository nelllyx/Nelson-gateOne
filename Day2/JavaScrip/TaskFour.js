let numbers = [21,2,18,17,32,65,10,13,15,8]


function evenArray(arr){


for(let index = 0; index < arr.length; index++)

if(index % 2 == 0){

arr[index] += index



}

return arr 

}

console.log(evenArray(numbers))