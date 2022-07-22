/* RETO 3: Mario quiere averiguar si un número es divisible entre 7 y 8. 
Ayuda a Mario a escribir una función que tome un número. Si el número
es divisible entre 7 y 8, el programa debe retornar verdadero. Si el 
número es divisible entre 7 y 8, retornar falso */


function Divisible (x) {
    let num = x;
    if (num % 7 === 0 && num % 8 === 0) {
        return true;
    } else {
        return false;
    }
}

let numDiv = Divisible (56);
console.log("¿Es divisible?")
console.log(numDiv)

let numDiv2 = Divisible (6);
console.log("¿Es divisible?")
console.log(numDiv2)