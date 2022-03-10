1. git clone
2. cd stackoverflow-71402889
3. mvn spring-boot:run
4. ```curl -XPOST -H "Content-type: application/json" -d '[{"name": "test"},{"name": ""}]' 'http://localhost:8080/test'```
