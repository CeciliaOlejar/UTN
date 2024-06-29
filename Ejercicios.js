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

// ejercicio ternario
let resultado = 3 > 2 ? "verdadero" : "falso";
console.log(resultado);
let numero = 9
resultado = numero % 2 == 0 ? "par" : "impar";
console.log(resultado);


// convertir String a number
let elnumero = "10";
console.log(typeof numero);
let edad2 = Number(elnumero);
console.log(typeof edad2);

if (edad2 >= 18) {
    console.log("Es mayor de edad, puede votar");
} else {
    console.log("Es menor de edad, no puede votar");
}

let resultado3 = edad2 >= 18 ? "Es mayor de edad, puede votar" : "Es menor de edad, no puede votar
console.log(resultado3);



// funtion NAN
let elnumero2 = "10";
console.log(typeof numero);
let edad3 = Number(elnumero);
console.log(typeof edad2);

if (isNaN(edad3)) {
    console.log("esta variable no contiene solo numero");
} else {
    if (edad2 >= 18) {
        console.log("Es mayor de edad, puede votar");
    } else {
        console.log("Es menor de edad, no puede votar");
    }
}
// Calcular estacion del año
let mes = 3;
let estacion;
if (mes == 1 || mes == 2 || mes == 12) {
    estacion = "verano";
} else if (mes == 3 || mes == 4 || mes == 5) {
    estacion = "otonio";
} else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = "invierno";
} else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = "primavera";
} else {
    estacion = "no existe";
}
console.log(estacion);


// hora del dia 
let hora = 10;
let mensaje;
if (hora >= 6 && hora <= 12) {
    mensaje = "buenos dias";
} else if (hora >= 13 && hora <= 19) {
    mensaje = "buenas tardes";
} else if (hora >= 20 && hora <= 23) {
    mensaje = "buenas noches";
} else {
    mensaje = "no existe";
}
console.log(mensaje);


// estructura switch

// mes del anio
let mess = 3;
let estacionn;

switch (mes) {
    case 1: case 2: case 12:
        estacionn = "verano";
        break;
    case 3: case 4: case 5:
        estacionn = "otonio";
        break;
    case 6: case 7: case 8:
        estacionn = "invierno";
        break;
    case 9: case 10: case 11:
        estacionn = "primavera";
        break;
    default:
        estacionn = "no existe";
}
console.log(estacionn);

// hora dia
let horaa = 10;
let mensajea;
switch (hora) {
    case 6: case 7: case 8: case 9: case 10:
        mensajea = "buenos dias";
        break;
    case 11: case 12: case 13: case 14: case 15:
        mensajea = "buenas tardes";
        break;
    case 16: case 17: case 18: case 19: case 20:
        mensajea = "buenas noches";
        break;
    default:
        mensajea = "no existe";
}
console.log(mensajea);

// ejercicio codigo mejorado
let days = ['lunes', 'Martes', 'miercoles', 'jueves', 'viernes', 'sabado', 'domingo'];
function getDay(n) {
    if (n < 0 || n > 6) {
        return 'error';
    } return days[n];
}
console.log(getDay(5));


// mes del anio mejor

let months = ['enero', 'febrero', 'marzo', 'abril', 'mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre', 'diciembre'];
function getMonth(n) {
    if (n < 0 || n > 11) {
        return 'error';
    } return months[n];
}
console.log(getMonth(9));
