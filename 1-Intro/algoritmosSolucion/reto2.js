/* Reto 2: Para agilizar los procesos de una empresa se necesita 
desarrollar un algoritmo que permita calcular el seldo de un 
empleado por semana y por mes. Como dato tenemos su sueldo diario 
($600) y como salida se debe imprimir el nombre y el dinero que 
recibira por semana y por mes */

let nombre = prompt("Escribe tu nombre: ");
console.log(nombre);

const sueldo = 600;
const sueldoSemanal = sueldo * (30.5) / 4;
const sueldoMensual = sueldo * (30.5);

console.log("Sueldo semanal: " + sueldoSemanal);
console.log("Sueldo mensual: " + sueldoMensual);


// CÓDIGO DE JONATHAN 
/* let nombre = prompt("Escribe tu nombre")
console.log(nombre);

const sueldo = 600;
const diasSemana = 6;
const semanasMes = 4;

console.log("Sueldo semanal: " + (sueldo * diasSemana));
console.log("Sueldo semanal: " + (sueldo * diasSemana * semanasMes))
 */
