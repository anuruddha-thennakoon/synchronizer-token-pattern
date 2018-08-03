# Synchronizer Token Pattern

[![maven](https://img.shields.io/maven-metadata/v/http/central.maven.org/maven2/com/google/code/gson/gson/maven-metadata.xml.svg?style=flat-square)](https://maven.apache.org/)

Synchronizer token pattern (STP) is a method of preventing Cross-site request forgery (CSRF).It uses s technique where a token, secret and unique value for each request, is embedded by the web application in all HTML forms and verified on the server side.

## Getting Started

Build project with maven
```
mvn clean install
```
or
```
mvn package
```
Deploy the .war file in ./target in a tomcat.
Run application in browser.
```
http://localhost:8080/synchronizer-token-pattern/
```
Login the system using "admin" as the username and password. Form will submit by validationg the CSRRF token. Open form.html, It does not work as the CSRF validating failed.
