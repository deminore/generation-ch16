/* ---------- ARREGLOS ---------- */
// Colección de elementos
// Cada elemento ocupa una posición
// Esa posiciónn se conoce como indice y comienza a partir de 0

let arr = [1,2,3,4];
console.log(arr);

// Propoedades - Describen
// Métodos . Acciones que se pueden realizar

console.log(arr[2]);
arr[4] = 190;
arr[4] = "Hola";
console.log(arr);


// MÉTODOS CON ARREGLOS
const arreglo = ["Adiós"]

// push - Agrega un elemento al final del arreglo
arreglo.push(2);
arreglo.push(false);
arreglo.push(500);
console.log(arreglo);


// unshift - Agrega elementos al inicio del arreglo
arreglo.unshift("A");
arreglo.unshift("B");
console.log(arreglo);
console.log(typeof(arreglo[4]));


// pop() - Quita un elemento al final del arreglo
let dato1 = arreglo.pop();
console.log(dato1);
console.log(arreglo);


// shift - Quita un elemento del inicio del arreglo
let dato2 = arreglo.shift();
console.log(dato2);
console.log(arreglo);


// splice - Quita un elemento de cualquier posición 
// splice(posición inicial, cantidad de elementos a borrar)
arreglo.splice(1, 1);
console.log(arreglo);

//    Agregar un elemento en una posición en específico
//    splice (posición inicial, cantidad de elementos a afectar, elementos que queremos insertar)
arreglo.splice(1, 0, "Parangaricutirimicuaro", 19585263);
console.log(arreglo);


// Métodos que hace una copia del arreglo y trabaja sobre ella 
// slice() - Corta el arreglo 
let dato3 = arreglo.slice(0, 2)
console.log(dato3);
console.log(arreglo);
