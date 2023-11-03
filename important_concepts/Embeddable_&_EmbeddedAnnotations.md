## @Embeddable Annotation

The `@Embeddable` annotation is used to mark a class as embeddable. This means that the class can be embedded into an entity class. When you mark a class as `@Embeddable`, it can be used as a field or property in an entity class.

Here is an example:

```java
@Embeddable
public class Address {
    private String street;
    private String city;
    private String zipCode;

    // getters and setters
}
```

In this example, the Address class is marked as `@Embeddable`, which means it can be embedded into an entity class.

## @Embedded Annotation

The `@Embedded` annotation is used to specify that a field or property should be treated as an embedded object. This allows you to store complex types as part of an entity.

Here is an example:

```java
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;

    @Embedded
    private Address address;

    // getters and setters
}
```

In this example, the Employee class has an Address field marked with @Embedded. This indicates that the Address object should be treated as an embedded object within the Employee entity.

By using these annotations, you can create more complex and structured data models in your database.
