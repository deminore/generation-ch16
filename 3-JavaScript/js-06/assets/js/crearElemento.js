/* ---------- CREAR ELEMENTO ---------- */
const imagen = document.createElement("img");

// Modificar los atributos html del elemento
imagen.src = 'https://placeimg.com/200/200/animals';
imagen.alt = 'Imágenes aleatorias de animales';

// Lo insertamos en un elemento padre
document.body.appendChild(imagen);
// document.body.insertAdjacentElement("afterbegin", imagen);
// document.body.insertAdjacentElement("afterend", imagen);
// document.body.insertAdjacentElement("beforebegin", imagen);
document.body.insertAdjacentElement("beforeend", imagen);



/* ---------- FORMA CORRECTA DE CREAR E INSERTAR UN ELEMENTO ---------- */
// PASO 1.- Se crea el elemento que contendrá la imagen (se crea en el html)
// PASO 2.- Seleccionar el elemento padre
const padreImg = document.getElementById("padreImg");
//console.log(padreImg);
// PASO 3.- Crear el elemento
const imagen2 = document.createElement('img');

// PASO 4.- Modificamos los atributos del elemento
imagen2.src = 'https://placeimg.com/200/200/nature';
imagen2.alt = 'Imágenes de naturaleza';

// PASO 5.- nsertar elemento
padreImg.appendChild(imagen2);



/* ---------- UTILIZAR FOREACH PARA PINTAR DATOS ---------- */
const frutas = ["Toronja", "Manzana", "Mandarina", "Limón", "Granada", "Melón", "Plátano", "Guayaba"];

const listaFrutas = document.getElementById('frutas');

// Forma 1
/* frutas.forEach((element) => {
    const li = document.createElement('li');
    li.textContent = element;
    listaFrutas.appendChild(li);
}); */

// Forma 2
frutas.forEach(el => {
    listaFrutas.innerHTML = `<li>${el}</li>`;
    
});