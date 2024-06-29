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

#leer 10 numeros y imprimir cuales son positivos, negativos y cuantos neutros

positivos = 0
negativos = 0
neutros = 0
for i in range(10):
    n = int(input("ingrese un numero"))
    if n == 0:
        neutros += 1
    elif n>0:
        positivos += 1
    else:
        negativos = 1
print(f"la cantidad de nros positivos es: {positivos} ")
print(f"la cantidad de nros negativos es: {negativos}")
print(f"la cantidad de nros neutros es: {neutros}")


#conjunto de calificaciones de un grupo de 10 alumnos, calcular la calif
#promedio y la mas baja del grupo

calificacionBaja = 10
suma = 0

for i in range(10):
    n = int(input("ingrese una calificacion del 1 al 10"))
    suma += n
    if calificacionBaja > n:
        calificacionBaja = n

promedio = suma / 10
print(f"el promedio es: {promedio} ")
print(f"la calificacion mas baja es:  {calificacionBaja} ")


#calcular el factorial de un numero mayor o igual a 0

def factorial (n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n-1)

while True:
    numero = int(input("ingrese un numero mayor o igual a 0"))
    if n >= 0:
        break
    else:
        print("ingrese un numero mayor o igual a 0")

resultado = factorial(numero)
print(f"el resultado es:  {resultado}")



#ingresar n enteros, y visualizar la suma de los numeros pares, cuantos numeros
#pares habia y cual es el promedio de los impares

# Pedimos al usuario que ingrese la cantidad de números que quiere
n = int(input("¿Cuántos números quieres ingresar? "))

sumaPares = 0
cantPares = 0
sumaImpares = 0
cantImpares = 0

for i in range(n):
    numero = int(input(f"Ingrese el número {i + 1}: "))
    if numero % 2 == 0:  # Si el número es par
        sumaPares += numero
        cantPares += 1
    else:  # Si el número es impar
        sumaImpares += numero
        cantImpares += 1

if cantImpares > 0:
    promedioImpar = sumaImpares / cantImpares
else:
    promedioImpar = 0

print(f"La suma de los números pares es: {sumaPares}")
print(f"Cantidad de números pares: {cantPares}")
print(f"Promedio de los números impares: {promedioImpar}")

