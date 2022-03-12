# mini-oms
Segundo filtro evoluta

Para clonar el repositorio, abrimos la app GitBash y debemos ubicarnos en una carpeta "destino", ejemplo C:\Nestor

Ejecutamos el siguiente comando:

git clone https://github.com/NestOct/mini-oms.git

Esto nos permite descargar el proyecto.

Abrimos eclipse y seleccionamos el menu File y despues seleccionamos Open Projects from File System...

Damos clic sobre el boton Directory... y nos dirigimos a la ruta donde se descargo el proyecto, ejemplo C:\Nestor y damos clic en el boton Seleccionar Carpeta.

En automatico el Eclipse cargara el proyecto y damos clic en el boton Finish, con esto ya estaria cargado el proyecto al Eclipse.

Para poder ejecutar el proyecto, necesitamos crear un servidor de aplicaciones, como ejemplo se tomara Tomcat v9, mismo que descargamos de la siguiente ruta:

https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.59/bin/apache-tomcat-9.0.59-windows-x64.zip

Lo descargamos, lo descomprimimos y listo, regresamos al Eclipse, seleccionamos la pestaña Servers, damos clic derecho y seleccionamos New – Server, se despliega una ventana donde debemos seleccionar Apache Tomcat v9 y damos clic en el boton Next, damos clic en el boton Buscar, para seleccionar la ruta donde se descomprimio el Tomcat v9 y damos clic en Seleccionar Carpeta y por ultimo, damos clic en el boton Finish 

Seleccionamos nuestro server Tomcat v9, pulsamos clic derecho y despues en Start, esto inicializa nuestro server Tomcat.

El proyecto esta configurado para que al arrancar, se creen las tablas e inserten datos en la BD H2

URL: http://localhost:8181/
H2 Console: http://localhost:8181/h2-console
