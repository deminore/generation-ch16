function miFuncion (a, b){
    return (a + b);
}

let resultado = miFuncion(3, 6);
console.log("El resultado es: " + resultado)


/* ------ Función Expresión o Anónima ------ */
let suma = function (a, b){ return (a + b) };
let res = suma(2, 3)
console.log("El resultado de la suma es: " + res)



/* ------------------ Self Invoking ------------------ */
(function (a, b) {
    console.log("El resultado de Self Invoking es: " + (a + b));
}) 
(3, 4);




