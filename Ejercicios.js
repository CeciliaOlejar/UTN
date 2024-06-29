// ejercicio para encontrar numeros pares e impares
let parImpar = 10;
if (parImpar % 2 == 0) {
    console.log("El numero es par");
} else {
    console.log("El numero es impar");
}

// ejercicio: mayor de edad
let edad = 18, adulto = 18;
if (edad >= adulto) {
    console.log("Es mayor de edad");
} else {
    console.log("Es menor de edad");
}

// ejercicio dentro de un rango
let dentroRango = 10;
let valMin = 0, valMax = 10;

if (dentroRango >= valMin && dentroRango <= valMax) {
    console.log("El numero esta dentro del rango");
} else {
    console.log("El numero esta fuera del rango");
}

// ejercicio si el padre puede asistir al juego
let vacciones = false, diaDescanso = false;
if (vacciones || diaDescanso) {
    console.log("El padre puede asistir al juego");
} else {
    console.log("El padre no puede asistir al juego");
}
