#Diseñar un programa que ingresado un año nos
# devuelva por consola si es un año bisiesto o no

def es_bisiesto(año):
    if (año % 4 == 0 and año % 100 != 0) or (año % 400 == 0):
        return True
    else:
        return False

# Pedimos al usuario que ingrese un año
año = int(input("Ingresa un año: "))

# Verificamos si el año es bisiesto
if es_bisiesto(año):
    print(f"El año {año} es bisiesto.")
else:
    print(f"El año {año} no es bisiesto.")


#calcular la suma de n primeros numeros
# Pedimos al usuario que ingrese la cantidad de números que quiere sumar
n = int(input("¿Cuántos números quieres sumar? "))

# Inicializamos la variable que contendrá la suma total
suma_total = 0

# Recorremos desde 1 hasta n para pedir cada número y sumarlo a la suma total
for i in range(n):
    numero = float(input(f"Ingrese el número {i+1}: "))
    suma_total += numero

# Mostramos la suma total
print(f"La suma total de los {n} números es: {suma_total}")