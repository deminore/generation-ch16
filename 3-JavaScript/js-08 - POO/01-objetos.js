/* 
let Persona = {
    nombre: "Diana",
    apellido: "Minor",
    edad: 24,
    correo:"deminore@hotmail.com",

    nombreCompleto: function(){
        // return nombre + " " + apellido; NO DETECTA EN DONDE SE ENCUENTRAN ESTOS ATRIBUTOS
        return this.nombre + " " + this.apellido; /* THIS HACE QUE DETECTE QUE ESTAMOS REFIRIÉNDONOS 
                                                    A LOS ATRIBUTOS DENTRO DE LA CLASE */
    //}
//}

/* Persona.tel = "5511223344";
Persona.tel = "5566778899"

console.log(Persona);
console.log(Persona.nombre);
console.log(Persona.nombreCompleto());


// For in - Para recorrer y poder visualizar los elementos del objeto
for (varPropiedad in Persona) {
    console.log(Persona[varPropiedad]);
}


let personaString = JSON.stringify(Persona)
console.log(personaString);
 */



/* ----- Método get -----*/
let Persona = {
    nombre: "Diana",
    apellido: "Minor",
    edad: 24,
    correo:"deminore@hotmail.com", 
    idioma: 'es',
    
    get leng() {
        return this.idioma.toUpperCase();
    },

    set leng(lang){
        this.idioma = lang.toLowerCase();
    } 
}
console.log(Persona.leng);
Persona.lang = 'ES';

console.log(Persona.leng);
console.log(Persona.idioma);