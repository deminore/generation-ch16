// Control de Flujo

/* let nombre ="Jonathan Yair";
//let nombre = "Maria";
//let nombre ="Diana";
let edad = 20; */

let nombre = prompt("Escribe tu nombre: "); //prompt saca una ventana emergente en la página y devuelve un string
console.log(nombre);

/* let edad = prompt("Escribe tu edad: ")
console.log(edad); */

let edad = parseInt(prompt("Escribe tu edad: "));// parseInt convierte el tipo de dato, en este caso a entero
console.log(edad);

if (nombre === "Jonathan Yair" && edad === 23) {
    // Scope - Contexto
    console.log("Eres un");
    console.log("ADMIN 😎😉");

} else if (nombre === "Maria") {

    console.log("Eres una mentora 😉");

} else if (nombre === "Marina") {

    console.log("Eres la jefa 😜");

} else {

    console.log("Eres una alumna 😊");

}

console.log("Fin del programa");