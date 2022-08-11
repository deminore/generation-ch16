/*  Abstracción: La abstracción consiste en ocultar los detalles de implementación y resaltar 
                 las características esenciales de un objeto para los usuarios. Así es como la 
                 incorporación de la abstracción en un programa de JavaScript puede mejorar la 
                 legibilidad del código y evitar la duplicación. Al proporcionar sólo los detalles 
                 importantes a los usuarios, también mejora la seguridad de una aplicación. */

/*---------- TIPO PREDEFINIDO ----------*/
let tiempo = new Date();
console.log(tiempo);
console.log(Math);

let obj_Literal = {
    nombre: "Juan",
    edad: 35
}

let obj_Constructor = new Object();
obj_Constructor.nombre = "Diana";
obj_Constructor.edad = 24;
console.log(obj_Literal);
console.log(obj_Constructor);

obj_Literal['nombr'];
let llave = 'nombr';
console.log("Esto es con llave " + obj_Literal[llave]);


/* ---------- TIPO CADENA ----------*/
let cadena = '\nEsto es una cadena';
let cadena_Obj = new String('Esto es una cadena');
console.log(cadena);
console.log(cadena_Obj);

/* ---------- TIPO NUMÉRICO ----------*/
console.log("\n")
let numero = 13;
let numero_Obj = new Number(13.13);
console.log(numero);
console.log(numero_Obj);


let lista = ['2', '3', '5', '7'];
let lista_Obj = new Array('1', '4', '6', '8', '9', '10');
console.log(lista);
console.log(lista_Obj);
