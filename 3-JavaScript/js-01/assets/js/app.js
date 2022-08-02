//JavaScript se ejecuta de manera estricta
"use strict";

/* Tipos de datos */
 
// Tios de variable
let a = 1; //local
const b = 1; //constante y local
var c = 1; //global

// String.- Cadena de caracteres
let cadena = "Hola Mundo";

//Number
let numero = 5;
let numero1 = 5.89;
let numero2 = 5.89;

//Booleano
let booleano = true;
let booleano2 = false;

//Undefined - Indefinido
let variable

//null
let vacio = null;

//NaN - Not a Number - No es un número
//Se obtiene al tratar de ralizar alguna operación aritmética con algún dato que no es un número

//Plantilas Literales - template strings - literal strings - (``)
//Interpolación

let nombre ="Diana";

console.log("Mi nombre es " + nombre);
console.log(`Yo me llamo ${nombre}`);



/* Arreglos - Matrices - Arrays */
let arreglo = [1, "A", null, undefined, [true,false]];
let arreglo2 = new Array("B", 2);

console.log(arreglo2);
console.log(arreglo[4][0]);



/* Objetos */
// Clave / valor

const obj = {

    nombre: "Diana",
    edad: 24,
    hobbies: ["Rugby", "Ver películas", "Comer"],

    auto:
    {
        marca: "VW",
        modelo: "Pointer",
        year: 2000,

    },

    saludar:function(){
        console.log("¿Qué honguito?");
    }
};

obj.nombre = "Elizabeth";

console.log(`Mi nombre es ${obj.nombre}`);

console.log(`Mi hobbie favorito es ${obj.hobbies[0]}`);

console.log(`La marca de mi auto es ${obj.auto.marca}`);

obj.saludar();


// Arreglo de objetos 
/* [{}, {}, {}] */