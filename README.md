# microservices-guide 


<h3>Per eseguire il progetto con docker: </h3>


1) Aprire terminale su directory: _**spikeTaassProject**_
2) Lanciare il file _**build-images.sh**_ con il seguente comando <br>
    <code> sh build-images.sh </code> per creare le immagini docker
3) Per avviare i container lanciare il file _**run.sh**_ con il seguente comando: <br>
    * Se si vuole dare un nome al _main container_ eseguire il comando<br>
    <code> sh run.sh [nome_main_container]</code>
    <br> 
    * altrimenti (verrà usato il nome di default, ovvero quello del progetto) eseguire il comando <br>
    <code> sh run.sh</code>

    
**Per verificare il server eureka**:  http://localhost:8761/  <br><br>
**Per provare le API**: http://localhost:8080/api/ ....  

<h3>------------------------------------------------------------</h3>
<h3>NB:</h3>
Se si vuole eseguire il comando `docker compose down` fare attenzione se <br>
si è dato un nome al _main container._ <br>
Nel caso in cui il nome sia quello di default eseguire semplicemente <br> `docker compose down`. <br>
Nel caso in cui si sia dato un nome al _main container_ eseguire il comando <br>
`docker compose -p [nome_main_container] down`
