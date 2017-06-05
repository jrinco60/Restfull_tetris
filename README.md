# Restfull_tetris
Tetris en consola utilizando Restfull

Codigo del tableo.

*******************************************************************************************************************

PARA PROBAR EL TABLERO

DESCOMPRIMIR EL ARCHIVO TABLER.7z
ABRIR LA CARPETA CON NETBEANS
ANTES DE CORRER EL TABLERO DEBE TENER CORRIENDO UN SERVICIO WEB CON LA FICHA
LA FICHA DEBE ESTAR ENTREGANDO EL STRING CON EL FORMATO SOLICITADO
EL ARCHIVO SimpleRESTweb.7z ES UN EJEMPLO CON UN SERVICIO WEB YA ENTREGANDO LA FICHA CON EL FORMATO REQUERIDO
HAGAN DEPLOY AL PROYECTO SimpleRESTweb Y LUEGO PUEDEN CORRER EL TABLERO PARA QUE SE GUIEN.

*******************************************************************************************************************



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
X = las posiciones que no contienen información.<br>
0,5 = las coordenadas y,x en donde se debe posicionar la ficha, posición inicial de 0 en y y de 5 en x (mitad del tablero), así sucesivamente con cada uno de los 4 puntos de cada ficha. 



