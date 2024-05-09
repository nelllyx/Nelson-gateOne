const prompt = require("prompt-sync")();

let count = 0

let counter = 0

for(let index = 1; index <= 9; index++){

let userInput = prompt("Enter between X or O ")

let userResponse = prompt("What column do you want to place " + userInput + ": "  )

if(userInput == 'x'){

count++

if(userInput == 'x'){

console.log("Your last input was X")

index--

}

}

else if(userInput == 'o'){

counter++

if(userInput == 'x')

console.log("Your last input was O")

index--


}

}

//console.log(userInput);

