
```
curl start.spring.io/starter.tgz \
  -d packageName=com.example \
  -d artifactId=hajiboot-security \
  -d name=hajiboot-security \
  -d baseDir=3.5_hajiboot-security \
  -d bootVersion=2.0.0.M4 \
  -d dependencies=web,thymeleaf,data-jpa,security,flyway,h2,devtools \
  -d applicationName=HajibootSecurityApplication | tar -xzvf -
```