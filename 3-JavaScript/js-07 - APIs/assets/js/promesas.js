// Variable que simula los datos pedidos
const saludo = "Hola mundo"
const datos = [
    {
        nombre: "Diana",
        apellido: "Minor"
    },
    {
        nombre: "Diana",
        apellido: "Minor"
    },
    {
        nombre: "Diana",
        apellido: "Minor"
    }
]

// Función para simular una petición
function obtenerDatos() {
    return new Promise((resolve, reject) => {
        setTimeout( () => {
            if (true)
            {
                resolve(datos)
            } else {
                // reject("No se pudo resolver");
                reject("Nunca te quiso");
            }

        }, 2000)
    })
}

// Forma 1
obtenerDatos().then( (loQueSeResolvio) => {
    
    console.log(loQueSeResolvio);

}).catch ((error) => {
    
    console.log("Existe un error en la petición 1");
    console.log(error);

})


//Forma 2 - Funciones asíncronas - async await
async function funcionAsincrona() {
    try {
        
        const datos = await obtenerDatos()
        console.log(datos);
    
    } catch (error) {
        console.log(error);
    }
}

funcionAsincrona();