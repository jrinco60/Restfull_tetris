# Restfull_tetris
Tetris en consola utilizando Restfull

Codigo del tableo.

**************************************************

Para probar el tablero:<br><br>
Crea un nuevo proyecto.<br>
Crear las 5 clases con los mismos nombres.<br>
Copiar y pegar el codigo correspondiente a cada una de ellas.<br>
Importar al proyectos la libreria JAX-RS 2.0 y la libreria Jersey 2.5.1<br><br>

Descomprimir el archivo SimpleRESTweb.7z<br>
Este proyecto SimpleRESTweb.7z es un ejemplo de ficha ya implementada con Restfull, en el esta el formato en el cual se debe enviar el String hacia el tablero<br><br>

Deben hacer Deploy al proyecto restfull antes de ejecutar el tablero.<br>

Las ordenes que deben ser recibidas serán las siguientes.<br>
traer =  para que se envié la ficha inicializada. <br>
izquierda <br>
derecha<br>
girar<br>

Se espera un String con el siguiente formato<br>
"X-0,5-X-X/X-1,5-X-X/2,4-2,5-X-X/X-X-X-X"<br>
X = las posiciones que no contienen información.
0,5 = las coordenadas y,x en donde se debe posicionar la ficha, posición inicial de 0 en y y de 5 en x (mitad del tablero), así sucesivamente con cada uno de los 4 puntos de cada ficha. 
Las ordenes que deben ser recibidas serán las siguientes.<br>
traer =  para que se envié la ficha inicializada. <br>
izquierda <br>
derecha<br>
girar<br>


