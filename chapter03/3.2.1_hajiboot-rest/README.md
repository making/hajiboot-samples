
```
curl start.spring.io/starter.tgz \
  -d packageName=com.example \
  -d artifactId=hajiboot-rest \
  -d name=hajiboot-rest \
  -d baseDir=3.2.1_hajiboot-rest \
  -d bootVersion=2.0.0.M4 \
  -d dependencies=web,data-jpa,h2 \
  -d applicationName=HajibootRestApplication | tar -xzvf -
```