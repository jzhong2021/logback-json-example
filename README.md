# Logback JSON example

This project shows how to configure Logback to log in JSON.

Relevant code:

- [`logback.xml`](src/main/resources/logback.xml)
- [`pom.xml`](pom.xml)


Output example:

```java
logger.debug("Hello world.");
```

```json
{
  "timestamp" : "2018-05-26T14:51:07.505Z",
  "level" : "DEBUG",
  "thread" : "main",
  "logger" : "com.mathieularose.Main",
  "message" : "Hello world.",
  "context" : "default"
}
```
// JZ
set java_home=C:\JDK\jdk1.7.0_79
mvn exec:java -Dexec.mainClass="com.mathieularose.Main"
