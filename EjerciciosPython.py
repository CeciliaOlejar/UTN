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

