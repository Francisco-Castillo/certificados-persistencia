# Módulo de persistencia

## Construido con:
* AdoptOpenJDK 8
* Jakarta EE 8.0.0
* Maven 3.6.8
* MariaDB 10.6.22
* Apache NetBeans IDE 15

## Requisitos

Es necesario contar con el siguiente software instalado en la pc.
 * AdoptOpenJDK 8 - https://adoptopenjdk.net/
 * MariaDB 10.6.x - https://mariadb.org/download/
 * Maven 3.x - https://maven.apache.org/
 * Payara Server 5.x - https://www.payara.fish/downloads/#community
 * Connector J 2.3.0 - https://downloads.mariadb.org/connector-java/

**NOTA:** El conector J (es un archivo con la extensión .jar) se debe copiar y pegar dentro del directorio ```payara/glassfish/domains/domain1/lib/```

## Crear base de datos

Para comenzar, debemos crear la base de datos llamada extensiondb
```
mysql -u usuario -p
CREATE DATABASE extensiondb;
```
Clonar el proyecto
```
git clone https://github.com/Francisco-Castillo/countries
```
Una vez clonado el proyecto, se debe generar la estructura de la base de datos e insertar unos cuantos registros.
Para facilitar esta tarea, el proyecto incluye el plugin de flyway (herramienta para la migración de bases de datos).
Es necesario que editemos los valores del archivo flyway.properties con algun editor de texto (nano, gedit o el bloc de notas).
Para ello nos dirijimos a la ubicacion en donde el proyecto fue clonado usando el comando cd.
Abrimos una terminal ya sea en windows o en linux (funciona igual)
```
cd /countries/src/main/resources
nano flyway.properties
```
El contenido del archivo es el siguiente:
```
jdbc.url=jdbc:mariadb://localhost:3306/countriesdb
jdbc.user=
jdbc.password=
```
Debe colocar su nombre de usuario de MariaDB en la propiedad 'jdbc.user', y su contraseña en la propiedad 'jdbc.password' y luego guarde los cambios. Para migrar la base de datos, nos ubicaremos
en la raiz del proyecto, y ejecutaremos los siguientes comandos:
```
mvn initialize flyway:info
mvn initialize flyway:migrate
```
Si la migración fue exitosa, usted deberia ver este mensaje en su consola
```
...
Successfully applied 2 migrations to schema `countriesdb` (execution time 00:03.570s)
..
```
Comprobamos haciendo algunas consultas sobre la bd, ejecutando los siguientes comandos:
```
USE countriesdb;
SHOW TABLES;
SELECT * FROM pais;
```
## Compilar e instalar dependencias :wrench:

Abrir una terminal y ubicarse en la raiz del proyecto. Alli ingresar el siguiente comando.

```
mvn clean install
```
Se creará un directorio /target con el archivo *countries.war*
  
## Levantar Payara Server :rocket:

```
cd directorio/instalacion/payaraServer/bin/
```
En linux

```
./asadmin start-domain
```
## Crear pool de conexiones y recurso JDBC
Para que la aplicación pueda funcionar es necesario crear un datasource, más conocido como pool de conexiones. Para ello colocar en el navegador web la siguiente direccion: (http://localhost:4848) que mostrara el panel de admin de Payara.

* **Pool de conexiones**
  * 1 - Nuevo...
  * 2 - Nombre de Pool: *extensionPool*
  * 3 - Tipo de recurso : *java.sql.Driver*
  * 4 - Click en siguiente
  * 5 - Driver Classname:  *org.mariadb.jdbc.Driver*
  * 6 - Agregar las siguientes propiedades adicionales: 
    * 6.1 - serverName : *localhost*
    * 6.2 - databaseName : *extensiondb*
    * 6.3 - URL : *jdbc:mariadb://localhost:3306/extensiondb*
    * 6.4 - user: *nombreDeUsuario*
    * 6.5 - password: *password*
    
Una vez finalizada la creación del pool de conexiones, se debe realizar un "ping" para comprobar que el proceso se haya realizado de manera exitosa.

Para ello haga clic en el botón con la leyenda "Ping" que se encuentra dentro de la pestaña general 
    
* **Recurso JDBC**
  * 1 - Nuevo...
  * 2 - Nombre JNDI : *jdbc/extensiondb*
  * 3 - Nombre Pool : *extensionPool*
  * 4 - Click en aceptar
  
## Desplegar *.war* con la utilidad *asadmin* de Payara
Abrimos una terminal y nos ubicamos en el directorio /bin de payara.
```
cd directorio/payara/bin/
```
Allí, ejecutaremos el comando deploy para desplegar nuestra aplicación
```
./asadmin deploy /directorio/nombreDeProyecto/target/nombreDeProyecto.war
```

## Autor :black_nib:
- Francisco Castillo - cefrancastillo@gmail.com
