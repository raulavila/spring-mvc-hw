FROM tomcat:7-jre7

MAINTAINER "Raul Avila"

ADD target/spring-mvc-hw.war /usr/local/tomcat/webapps/
