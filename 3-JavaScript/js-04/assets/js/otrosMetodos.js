// sort() - Ordena elementos de un arreglo
const arr = ["X", "A", "H", "a", "W", "b"];
console.log(arr);
arr.sort(); //Ordena en orden alfabético, primero mayúsculas y luego minúsculas
console.log(arr);

const arr2 = ["Hola", "adiós", "bienvenido", "Calle"];
console.log(arr2);
arr2.sort();
console.log(arr2);

const arr3 = [ 5, 1231, 567, 1, 80]
arr3.sort((a, b) => a - b) // Ordena números de menor a mayor
console.log(arr3);

arr3.sort((a, b) => b - a) // Ordena números de mayor a menor
console.log(arr3);

// -----------------------------------------------------

// Funcion declarada
// Hoisting - Proceso de reacomodo automático del código
function sumar(a, b) {
    return a + b;
}
console.log(sumar(5, 7));

let a = 2;
console.log(a);


// Función expresada
const multiplicar = function (a, b) {
    return a * b;
}
console.log(multiplicar(3, 5));


// Funciones flecha
const dividir = (a, b) => {
    return a / b;
} // se pueden omitir las llaves y el return si sólo se regresa un solo valor
console.log(dividir(10, 2))

// forEach () - Ciclo que recorre en automático todo el arreglo
const arrNumeros = [1, 4, 6, 8, 10, 20, 30];
console.log(arrNumeros);

for (let i = 0; i < arrNumeros.length; i++) {
    arrNumeros[i] = arrNumeros [i] * 2;
}
console.log(arrNumeros);
