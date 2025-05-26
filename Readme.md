
- https://start.spring.io/
- dependencies:
    - Spring Web
    - Spring for GraphQL
    - Lombok
    - Flyway Migration
    - PostgreSQL Driver

![](Images/20250525213811.png)

Update ```gradle-wrapper.properties``` to 8.15

![](Images/20250525214233.png)

invoke ```.\gradlew.bat wrapper```

Invoke ```.\gradlew.bat build```

Do as in the [tutorial](https://github.com/ProductivityTools-Learning/ProductivityTools.Learning.Java.Flyway)

```
.\gradlew.bat bootrun
```

Open [page](http://localhost:8080/graphiql?path=/graphql)

invoke
```
query getPersonQuery{
  getPerson {
    firstName,
    lastName
  }
}
```
![](Images/20250525221624.png)