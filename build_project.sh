sudo docker run -it --rm --name maven-container -v "$PWD":/usr/src/maven-project -w /usr/src/maven-project maven:3.2-jdk-7 mvn clean package
