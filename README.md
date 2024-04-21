# EMT-SYSTEM

## Descripción
Este README proporcionará instrucciones sobre los requisitos para correr el programa asi como unas lineas de codigo que se deberán usar

## Caracteristicas
- El proyecto implementa views (UI Elements)
- El proyecto implementa una base de datos
- El proyecto puede añadir/mostrar aspirantes
- El proyecto puede añadir/mostrar empleados

## Pre-requisitos
Antes de comenzar, asegurate de tener los siguientes requisitos:
- **Java**: Necesitarás tener Java instalado en tu maquina. El proyecto has sido testeado con Java 17.
- **Docker**: Asegurate de que Docker Desktop esta instalado si es que usas Windows o en su defecto Docker Engine para Linux.
- **Docker Compose**: Viene incluido con Docker Desktop en Windows y macOS, pero talvez se necesite instalar aparte en Linux.

## Instalación
### Clonar el repositorio
Para clonar el proyecto asegurate de copiar el siguiente link y configurar tu ruta para el proyecto.

```bash
git clone https://github.com/AngelVillalobosS/EMT-SYSTEM.git
cd EMT-SYSTEM
```
## Configuración del Entorno (Enviroment Setup)
Crea un archivo '.env' en la raiz del proyecto con el siguiente contenido, ajustando lo valores como sea necesario:
```bash
DATABASE_USER = myuser
DATABASE_PASSWORD = mypassword
DATABASE_NAME = mydatabase
```
## Build (Construir) Proyecto
Compile el codigo de Java y empacalo en un JAR file. Si tu estas usando Maven, puedes correr
```bash
mvn clean package;
```
## Correr el Proyecto
### Inicializar el Contenedor del Docker
Navega al directorio que contiene el archivo 'docker-compose.yml' y corre:
```bash
docker-compose up -d
```
Este comando iniciará todos los servicios requeridos, incluyendo la base de datos MySQL y los otros servicios deifnidos en 'docker-compose.yml'

## Ejecutar el proyecto
El proyecto se puede ejecutar desde IntelliJ Idea, con el botón "run"

## Uso
El proyecto funciona con Interfaces graficas, con las cuales puedes interactuar, el proyecto fue desarrollado para proveer la mayor intuición posible al usarlo.

Siendo asi que el proyecto cuenta con las siguientes ventanas (Se te dará una pequeña descripción de lo que puede realizar en cada ventana)
- Logueo
- Menu
    - Aqui encontraras diferentes botones con los cuales serás dirigido a las ventanas las cuales comparte el nombre del botón.
- Aspirantes
    - En aspirantes podrás registrar aspirantes, asi como consultar sus datos.
- Datos Empresariales
    - En Datos Empresariales podrás registar los empleados que desees.
- Empleados
    - En empleados podrás consultar los datos de los empleado registrados previamente.
- Contratos
    - En contratos podrás usar el ID de un empleado para asignarle un contrato en especifico, asi como ver los datos de los contratos realizados.

## Contribuciones

EMT-SYSTEM fue desarrollado como un proyecto final para la materia de Fundamentos de POO, siendo asi que este proyecto esta restringuido a pocas personas para contribución.

## License
Este proyecto no cuenta con una licencia como tal, solo es con fines escolares.

## Contacto

Si tienes cualquier duda, por favor contactame:

- GitHub @AngelVillalobosS