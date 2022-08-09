//console.log(document.URL);

/* ----- getElementById () ----- */
console.log(document.getElementById('parrafo1').textContent);

const parrafo1 = document.getElementById('parrafo1');
console.log(parrafo1.textContent);

parrafo1.textContent = "Hola desde el parrafo 1";

console.log(parrafo1.textContent);

console.log(parrafo1.style);

parrafo1.style.color ='red';
parrafo1.style.backgroundColor ='yellow';



/* ----- querySelector() ----- */
// etiqueta = p
// clase = .parrafo
// id = #parrafo
const parrafo2 = document.querySelector('.parrafo');
console.log(parrafo2.textContent);

parrafo2.textContent += "\n Modificando el contenido desde JavaScript";



/* ----- querySelectorAll() ----- */
// lista de nodos - nodeList
const parrafos = document.querySelectorAll('p');
console.log(parrafos[2]);

parrafos[2].style.fontSize = "1.5rem";



/* ---------- MODIFICAR ATRIBUTOS DE HTML ---------- */
const enlace = document.getElementById('enlace');
console.log(enlace);

enlace.href = 'https://www.youtube.com/';
enlace.target = '_blank'
enlace.textContent = 'Enlace de YouTube';



/* ---------- REEMPLAZAR CONTENIDO ---------- */
const parrafo4 = document.getElementById('parrafo4')
console.log(parrafo4.nodeName);

