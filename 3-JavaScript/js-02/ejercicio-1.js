/* Primera función que arroje nuestro nombre completo
Declarando 3 variables
Nombre, apellido paterno, materno

Segunda función
Crear función en donde hagan la operación de cociente o división
 */


// FUNCIÓN 1
function NombreCompleto(nombre, apellidoP, apellidoM)
{
    let nombreCom = (nombre + apellidoP + apellidoM);
    return nombreCom;
}

console.log("Mi nombre es: " + NombreCompleto("Diana Elizabeth ", "Minor ", "Espinosa"))


// FUNCIÓN 2
function miDivison (a, b)
{
    let resultado = (a / b)
    return resultado;
}
console.log("El resultado de la división es: " + miDivison(4,6));