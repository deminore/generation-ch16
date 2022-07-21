// Funciones

/* function sumar() {
    console.log("Voy a sumar");
    console.log("El resultado de la suma es: " + (10 + 2));
}
sumar();
 
function sumar(numero1, numero2) {
    console.log("Voy a sumar");
    console.log("El resultado de la suma es: " + (numero1 + numero2));
}

sumar(10, 5);
*/


// RETO 2 utilizando funciones

// Con constantes
/* function calculadoraSueldo () {
    let nombre = prompt("Escribe tu nombre")
    console.log(nombre);

    const sueldo = 600;
    const diasSemana = 6;
    const semanasMes = 4;

    console.log("Sueldo semanal: " + (sueldo * diasSemana));
    console.log("Sueldo semanal: " + (sueldo * diasSemana * semanasMes))

}

calculadoraSueldo();
calculadoraSueldo();
calculadoraSueldo(); */


/// Variando el sueldo
/* function calculadoraSueldo (sueldoIngresado, diasTrabajados) {
    let nombre = prompt("Escribe tu nombre")
    console.log(nombre); */

    /* const sueldo = sueldoIngresado;
    const diasSemana = diasTrabajdos;
    const semanasMes = 4;

    console.log("Sueldo semanal: " + (sueldo * diasSemana));
    console.log("Sueldo semanal: " + (sueldo * diasSemana * semanasMes)) */


    /* const sueldo = sueldoIngresado;
    const diasSemana = diasTrabajados;
    const semanasMes = 4;

    console.log("Sueldo semanal: " + (sueldoIngresado * diasTrabajados));
    console.log("Sueldo semanal: " + (sueldoIngresado * diasTrabajados * semanasMes))
}

calculadoraSueldo(100, 2); */



// EJEMPLO: Calculadora de porcentajes
function calcularPrcentajes (numero, porcentaje) {
    let resultado = numero * porcentaje;
    return resultado;
}

let resultadoFuncion = calcularPrcentajes (100, 0.40);
console.log(resultadoFuncion);
