FROM centos:centos7
ENV tomcat:8.0
COPY ./math/target/*.jar  /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
