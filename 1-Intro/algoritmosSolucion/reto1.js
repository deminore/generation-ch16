/* Escribiendo unprograma que pida la edad al usuario. Si es 
mayor de edad imprime en consola el mensaje Es mayor de edad", 
en caso contrario imprimir el mensaje "Es menor de edad" */

let edad = prompt("Escribe tu edad (escribe tu edad con número): ");
edad = parseInt(edad);
console.log(edad);

if (edad >= 18) {
    console.log("Es mayor de edad");
} else {
    console.log("Es menor de edad");
}
