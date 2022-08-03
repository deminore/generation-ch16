/* ------------------  Funciones como Objetos  ------------------*/
function miFuncion (a = 6, b = 7)
{
    let res = 0; //Propiedad
    res = (a * b); //Acción o proceso
    
    return res;
}

console.log(typeof miFuncion);

/* Convierte la función en un string e imprime la función en consola */
var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto);

/* Imprime el resultado de la función en consola */
let unos = miFuncion();
console.log(unos);


