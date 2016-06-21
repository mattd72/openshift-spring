FROM nimmis/java-centos
VOLUME /tmp
ADD openshift-spring-0.1.0.jar openshift-spring-0.1.0.jar
RUN bash -c 'touch /openshift-spring-0.1.0.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/openshift-spring-0.1.0.jar"]
expose 8080
