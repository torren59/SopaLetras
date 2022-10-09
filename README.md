# SopaLetras

Prerrequisitos
Contar con un IDE de java

¿Cómo ejecutar el algoritmo?
El archivo que permite ejecutar este proyecto se llama PSVM.java; puedes seleccionarlo y ejecutarlo desde tu IDE.

Este software es un solucionador de sopas de letras, se basa en consultar el ancho y alto de la sopa y posteriormente preguntar que valor asignar a cada casilla dentro 
de la misma. Finalmente consulta por la palabra que desea buscar y si esta se encuentra te devolverá por consola las coordenadas de cada una de las letras que conforman
la palabra.

El sistema mapea la sopa de letras como si esta se encontrara en un plano cartesiano cuyo origen está ubicado en la esquina superior derecha de la sopa de letras y cuyos
valores en Y aumentan a medida que desendemos por la sopa de letras o aumenta en X cuando nos movemos de izquierda a derecha sobre la sopa de letras. Como se demuestra
en el siguiente ejemplo

 +   - ---------> +
 + '-' 0 1 2 3 4 5 6
 +   1 A B C D E F
 +   2 G H I J K L 
 +   3 M N O P Q R
 +   4 S T U V W A
 + + 5 B C D E F G 

|+ Attempt | #1  | #2  |
| :---:   | :-: | :-: |
| Seconds | 301 | 283 |

| A + |
      :--------:
| Hola |
 
 Para el idóneo funcionamiento se recomienda ingresar las letras en mayúscula, sin importar si es para rellenar la sopa o para registrar la palabra a buscar.
 
 
