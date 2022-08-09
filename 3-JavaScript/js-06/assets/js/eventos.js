function saludar() {
    alert("Hellous")
}

// addeventListener()

const boton = document.getElementById('boton');
//console.log(boton);

boton.addEventListener('click', (evento) => {
    // alert("Hellous 🙌");
    console.log(evento.target);
});


const formulario = document.getElementById('form');
formulario.addEventListener('submit', (e) => {
    e.preventDefault();
    console.log(formulario[0].value);
})