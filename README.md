
Can run as a docker image as well. Here is the docker file specifying all the steps for setting things up:

/docker/Dockerfile

If you rather have it run as a non-docker service, then see below.
Build:
    Its a maven project, please install maven and then:
    # cd hope
    # mvn package -DskipTests <-- will build the .jar file.
Run:
    The service is based on dropwizard and taken a config file on startup. This config file specifies the MYSQL end-points, 
    password and the port to run the service on.
    
    Setup mysql server as in: /docker/mysqlInit.sql
    
    # java -Djava.net.useSystemProxies=true -server -jar dataturks-1.0-SNAPSHOT.jar server onprem.yml