/* Crea un archivo llamado ejercicio1.js
cada comando debe mostrarse en consola*/

const personas = ["Maria", "Dani", "Luis", "Juan", "Camila"];
console.log(personas);

//Escribe un comando para remover a "Dani" del arreglo
personas.splice(1, 1);
console.log(personas);

//Escribe un comando para remover a "Juan del arreglo"
personas.splice(2, 1);
console.log(personas);

//Escribe un comando para agregar a "Luis" al inicio del arreglo
personas.unshift("Luis");
console.log(personas);

//Escribe el comando para agregar tu nombre al final del arreglo
personas.push("Diana");
console.log(personas);

//Escribe el comando para mostrar la posición de "Maria"
let pos = personas.indexOf("Maria")
console.log("María esta en la posición: ", pos);

//Escribe el comando para mostrar la posición de tu nombre
let pos1 = personas.indexOf("Diana")
console.log("Diana esta en la posición: ", pos1);