PROYECTO 1 ICC
*Integrantes: Cabrera Galindo Daniela Crisel

*Descripcion del proyecto:
  El proyecto consiste de tres archivos .java que conforman un programa encargado de representar recipientes capaces de almacenar liquidos.
  Cada uno de los archivos se encuentra dentro de una subcarpeta que corresponde a la funcion que desempeñan dentro del proyecto
    Clase: ServiciosRecipiente.java
      Se encuentra dentro de la subcarpeta "interfaz" y es la encarga de contener el codigo fuente de la implementacion de la interfaz de la clase Recipiente
    Clase: Recipiente.java
      Se ncuentra en la subcarpeta "recipiente.java", en ella se encuentra la ogica principal del programa, contiene los metodos necesarios para el funcionamiento
      del mismo
    Clase: Main.java
      Se encuentra en la subcarpeta "principal". Es la clase de prueba del programa. Es en esta clase donde se ejecuta el proyecto

*Inconvenientes:
  El principalinconveniente fue la implementacion de algunos metodos sin utilizar controladores de flujo

*Ejecucion
  1. Descargar la carpeta en la que se encuentra el proyecto
  2. Abrir la terminal y dirigirse a la carpte Proyecto1:
     $cd daniela-cabrera-icc20252/
     $cd Proyecto1/
  3. Compilar todos los archivos dentro de la carptea
     $javac principal/Main.java recipiente/Recipiente.java interfaz/ServiciosRecipiente.java
     Este comando nos generara lor archivos .class una vez hayan compilado
  4. Ejecutar el programa:
     $java principal.Main
  *En caso de que no funcione el comanod anterior ejecutar:
    $java -cp . principal.Main
    
