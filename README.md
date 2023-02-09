# Módulo de persistencia

## Construido con:
* AdoptOpenJDK 8
* Jakarta EE 8.0.0
* Maven 3.6.8
* MariaDB 10.6.22
* Apache NetBeans IDE 15

## Requisitos para el entorno de desarrollo

Es necesario contar con las siguientes herramientas instaladas en el equipo:
 * AdoptOpenJDK 8 - https://adoptopenjdk.net/
 * MariaDB 10.6.x - https://mariadb.org/download/
 * Maven 3.x - https://maven.apache.org/
 * Payara Server 5.x - https://www.payara.fish/downloads/#community
 * Connector J 2.3.0 - https://downloads.mariadb.org/connector-java/

**NOTA:** El conector J (es un archivo con la extensión .jar) se debe copiar y pegar dentro del directorio
```
payara/glassfish/domains/domain1/lib/
```

Es importante **reiniciar** el servidor para que pueda reconocer el nuevo conector, de lo contrario no funcionará

## Crear base de datos

Para comenzar, debemos crear la base de datos llamada extensiondb
```
mysql -u usuario -p
CREATE DATABASE extensiondb;
```

## Crear pool de conexiones y recurso JDBC
Para que la aplicación pueda funcionar es necesario crear un datasource, más conocido como pool de conexiones. Para ello primero se debe iniciar el servidor payara mediante el siguiente comando:

```
./asadmin start-domain
```
Posteriormente, abrimos en el navegador web la siguiente dirección: (http://localhost:4848) que mostrará el panel de administración del servidor.

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
    
Una vez finalizada la creación del pool de conexiones, se debe realizar un "ping" para comprobar que el proceso se haya realizado de manera exitosa, para ello haga clic en el botón con la leyenda "Ping" que se encuentra dentro de la pestaña general.
    
* **Recurso JDBC**
  * 1 - Nuevo...
  * 2 - Nombre JNDI : *jdbc/extensiondb*
  * 3 - Nombre Pool : *extensionPool*
  * 4 - Click en aceptar
 
## Clonar el proyecto
```
git clone https://github.com/Francisco-Castillo/certificados-persistencia.git
```
Una vez clonado el proyecto, se debe generar la estructura de la base de datos extensiondb.
Para facilitar esta tarea, el proyecto incluye un archivo ```persistence.xml``` el cual contiene varias propiedades entre las que se destacan las siguientes:

```XML
<property name="javax.persistence.jdbc.user" value=""/>
<property name="javax.persistence.jdbc.password" value=""/>
```
se deben completar ambos atributos value con el nombre de usuario y clave del motor de base de datos.

## Compilar e instalar dependencias

Para ello nos situamos en la raiz del proyecto y ejecutamos el siguiente comando maven:

```
mvn clean install
```
Finalizado el proceso de compilacion, se habran instalado todas las dependencias y se habrá creado automaticamente el esquema de base de datos con todas las tablas.


## Equipo de desarrollo
- Martín Foritano
- Luciano Ponce
- Francisco Castillo
