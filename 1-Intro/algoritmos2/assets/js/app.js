/*function imprimir () {
    console.log("Hola mundo");
}
//imprimir();

//// ARREGLOS
let num = [];
console.log(num);

let arr1 = new Array();
console.log(arr1);

//USAR UN ARREGLO
const arr = [1, 2, 3, 4, 5];
//console.log(arr);

//NOTACIÓN DE CORCHETES
console.log(arr[3]); //LOS CORCHETES DE ESTA FORMA MANDAN LLAMAR LO QUE CONTIENE UN ESPACIO EN ESPECÍFICO

arr[5] = 25;
arr[6] = 8;
arr[6] = 0;
arr[10] = 40;

console.log(arr);

// PROPIEDADES DE LOS ARREGLOS (no llevan parentesis)
// Descripción de nuestro arreglo
console.log(arr.length); //length muestra la dimensión del arreglo


// MÉTODOS (Sí llevan parentesis)
// Acciones que puedan realizar los arreglos
const frutas = ["Manzana", "Plátano"];
console.log(frutas);

//push(): Agrega un elemento al final del arreglo
frutas.push("Naranja");

let fruta = "Toronja";
frutas.push("Toronja");

console.log(frutas);

//pop(): Eliminar el último elemento del arreglo y lo regresa
let elementoBorrado = frutas.pop();
console.log(frutas);
console.log("Elemento Borrado: ", elementoBorrado);

//unshift (): Agrega un elemento al inicio del arreglo y regresa la nueva dimensión del arreglo
let devolver = frutas.unshift("Uva", "Pera");
console.log(frutas);
console.log(devolver);

//shift(): Elimina un elemento al inicio del arreglo y lo regresa
let inicioBorrado = frutas.shift();
console.log(frutas);
console.log("Elemento Borrado: ", inicioBorrado);

// Se realizó el ejercicio 1
*/


// ARREGLOS MULTIDIMENSIONALES 

const newArray = [1 ,45, "Hola", "Adiós", true, null, [30, 31, 32], ["Azul", "Amarillo", "Verde"]];
console.log(newArray);
console.log(newArray[6][1]); //Muestra el elemento 1 del arreglo que se encuentra en la posición 6 del arreglo original
console.log(newArray[7][1]);



