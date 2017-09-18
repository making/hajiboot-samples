
```
curl start.spring.io/starter.tgz \
  -d packageName=com.example \
  -d artifactId=hajiboot-thymeleaf \
  -d name=hajiboot-thymeleaf \
  -d baseDir=3.3.5.1_hajiboot-thymeleaf \
  -d bootVersion=2.0.0.M4 \
  -d dependencies=web,thymeleaf,data-jpa,h2,devtools \
  -d applicationName=HajibootThymeleafApplication | tar -xzvf -
```