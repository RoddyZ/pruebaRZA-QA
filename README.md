# Prueba Serenity Roddy Zamora
Pasos para la ejecuccion del escenario de prueba (El detalle lo encuentras en el pdf adjunto Roddy-Zamora-PruebaSerenity)


1. Prerequisitos

   
   Descargar, instalar y configurar variable de entorno de Java 11 y Maven


   Descargar e instalar IntellJ Idea con los plugins de Cucumber for fava y Gherkin


   Descargar e instalar Git

   
  
2. Instalacion de dependencia


   Abrir una consola de Git a la altura del proyecto de Serenity y ejecutar los siguientes comandos:

   
   mvn clean package -U

   
   mvn clean install -DskipTests

   

3. Ejeuccion del escenario de prueba

   
   En la misma consola que ejecutamos los comandos anteriores procedemos a correr la prueba mediante el siguiente comando:

   
   mvn clean verify -Dcucumber.filter.tags="@FlujoCompras"

   

4. Evidencia de la ejecuccion

   
   El reporte con las capturas de pantalla se podra encontrar en \serenity-cucumber-starter-master\target\site\serenity\index.html

   
