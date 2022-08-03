
/* ---------- CONTROL DE FLUJO ---------- */

/* ----- Condicionales ----- */

// ----- if ----- 

let condicion = "A";

if (condicion === "A") {

    /* Código que se ejecuta si 
    se cumple la condicion A */

    console.log("Entro en la condición A");
} else if (condicion === "B") {

    /* Código que se ejecuta si 
    se cumple la condicion B */

    console.log("Entro en la condición B");
} else if (condicion === "C") {

    /* Código que se ejecuta si 
    se cumple la condicion C */

    console.log("Entro en la condición C");
} else {

    /* Código que se ejecuta si no se cumple
     ninguna de las condiciones anteriores */
    console.log("No cumple ninguna condición");
}



// ----- Switch  ----- 

let elegir = "sumar";

switch (elegir) {

    case "sumar":
        console.log("Vamos a sumar");
        break

    case "restar":
        console.log("Vamos a restar");
        break

    case "dividir":
        console.log("Vamos a dividir");
        break

    case "multiplicar":
        console.log("Vamos a multiplicar");
        break

    default:
        console.log("No entiendo");
}


if (elegir === "sumar") {

    console.log("Vamos a sumar");

} else if (elegir == "restar") {

    console.log("Vamos a restar");

} else if (elegir == "dividir") {

    console.log("Vamos a dividir");

} else if (elegir == "multiplicar") {

    console.log("Vamos a multiplicar");

} else {

    console.log("No entiendo");

}
