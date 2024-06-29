# UTN
Primer semestre UTN
Ejercicios Python

Ultima Clase

1. Abrir la terminal de Git Bash o terminal en Linux, debe ser como administrador en Window

2. Creamos una carpeta o directorio: 

mkdir python-final

3. Entramos en ella: 

cd python-final

4. Iniciamos el repositorio:

git init

5. Creamos un archivo:

touch finales.py

6. Abrimos VSC:

code .

7. En terminal ingresamos el comando para saber la versión de Python que tenemos instalada:

python -V

python3 -V

8. Creamos el entorno virtual en Python:

python3 -m venv venv #Creamos el entorno virtual

9. Activamos el entorno virtual:

source venv/bin/activate #Activamos el entorno virtual en Linux

venv/scripts/activate #En windows

10. Hacemos actualización del pip de Python

python3 -m pip install --upgrade pip #Actualizamos el pip


11. Investigar ¿Qué es el pip y porque lo actualizamos?

El pip es el sistema de gestión de paquetes que se usa para instalar y administrar paquetes de software escritos en Python.
Estos paquetes son modulos o bibliotecas que se pueden reutilizar en distintos proyectos. 
El gestor de paquetes PIP nos permite actualizar o instalar estos modulos o paquetes de forma rapida y sencilla. Y ademas tiene un sistema de desarrollo colaborativo, lo que permite a los desarrolladores compartir con la comunidad sus paquetes y por supuesto tambien usar los paquetes de otro desarrollador. 

Entonces resumiendo, PIP facilita la instalación y actualizacion de paquetes de software a la ultima version que se encuentre disponible. Si existe dependencias, automáticamente se resuelven y se instalan las dependencias necesarias. Tambien se pueden realizar instalacion y desinstalacion de paquetes o listarlos para saber cuales tiene uno instalado en la pc. 

Algunos ejemplos de como usar usar pip:

Instalar un paquete: pip install nombre_del_paquete
Actualizar un paquete: pip install –upgrade nombre_del_paquete
Desinstalar un paquete: pip uninstall nombre_del_paquete
Listar paquetes instalados: pip list 
