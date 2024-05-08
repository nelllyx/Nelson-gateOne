const prompt = require("prompt-sync")();

let number;

let secondNumber;

let operators;

let answer;


let count = 0

let counter = 0

function randomQuestions(){

number = Math.floor(Math.random()*100 + 1);

secondNumber = Math.floor(Math.random()*100 + 1);

operators = Math.floor(Math.random()*5 + 1);

}

console.log("======================================")



console.log("Welcome to Today's Arithmetic Quiz")

console.log("You have 30 minutes for this Test, GOODLUCK!!!")

console.log("===========================================")



function quiz(){

if(operators == 1){

userInput = parseInt(prompt(`What is ${number} + ${secondNumber}: `));

answer = number + secondNumber;

if(answer == userInput ){

console.log(" Correct ")

count++

}else{

console.log(" Incorrect ")

counter++

}


}

else if(operators == 2){

userInput = parseInt(prompt(`What is ${number} - ${secondNumber}: `));

answer = number - secondNumber;

if(answer == userInput ){

console.log(" Correct ")

count++

}else{

console.log(" Incorrect ")

counter++

}


}

else if(operators == 3){

userInput = parseInt(prompt(`What is ${number} * ${secondNumber}: `));

answer  = number * secondNumber;

if(answer == userInput ){

console.log(" Correct ")

count++

}else{

console.log(" Incorrect ")

counter++

}

}


else if(operators == 4){

userInput = parseInt(prompt(`What is ${number} % ${secondNumber}: `));

answer  = number % secondNumber;

if(answer == userInput ){

console.log(" Correct ")

count++

}else{

console.log(" Incorrect ")

counter++

}

}

else if(operators == 5){

userInput = parseInt(prompt(`What is ${number} / ${secondNumber}: `));

answer  = number / secondNumber;

if(answer == userInput ){

console.log(" Correct ")

count++

}else{

console.log(" Incorrect ")

counter++

}

}

}

for(let index = 1; index <= 10; index++){

randomQuestions()

quiz()

}

console.log(`You got ${count} correct questions and and failed      ${counter}  questions`)

if(count > 5){

console.log('Congratulations, You passed the test!!')

}else if(counter < 5){

console.log('You failed the test. Better luck next time')


}
