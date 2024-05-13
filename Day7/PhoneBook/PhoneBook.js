const prompt = require("prompt-sync")();


let userOption = prompt( ' Welcome to your phone book page\n\n Select your preferred option\n\n 1 -> Add a new contact\n\n 2 -> Remove contact\n\n 3 -> Find contact by phone number\n\n 4 -> Find contact by first name\n\n 5 -> Find contact by last name\n\n 6 -> Edit contact\n')

console.log(userOption)

//let userResponse = prompt()

switch(userOption){

case 1:

console.log("Create a new contact")

break

}



