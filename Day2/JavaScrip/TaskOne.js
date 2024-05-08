const prompt = require("prompt-sync")();


let scores = [];


for(let index = 0; index <= 10; index++){

scores[index] = parseInt(prompt("Enter a score: "))


}

console.log(scores)