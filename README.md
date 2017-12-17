# Spring 5 Design Patterns
This is the code repository for [Spring 5 Design Patterns](https://www.packtpub.com/application-development/spring-5-design-patterns?utm_source=github&utm_medium=repository&utm_campaign=9781788299459), published by [Packt](https://www.packtpub.com/?utm_source=github). It contains all the supporting project files necessary to work through the book from start to finish.
## About the Book
This book will take you through design patterns and best practices required with the Spring Framework. You will learn to use these design patterns to solve common problems when designing an application or system using the Spring Framework. This book will take you through not only the essential GoF design patterns but also those patterns, considerations, and best practices required at different stages in Application Development. This book also demonstrates the Reactive design pattern approach to making application scalable.
## Instructions and Navigation
All of the code is organized into folders.



The code will look like the following:
```
public class JdbcTransferRepository implements TransferRepository{
  JdbcTemplate jdbcTemplate;
  public setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
  // ...
}
```

This book can be read without a computer or laptop at hand, in which case you need nothing more than the book itself. Although to follow the examples in the book, you need Java 8, which you can download from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html. You will also need your favorite IDE for the examples, but I have used the Software Spring Tool Suite; download the latest version of Spring Tool Suite (STS) from https://spring.io/tools/sts/all according to your system OS. The Java 8 and STS work on a variety of platforms--Windows, macOS, and Linux.

## Related Products
* [VMware Horizon View 5.3 Design Patterns and Best Practices](https://www.packtpub.com/virtualization-and-cloud/vmware-horizon-view-53-design-patterns-and-best-practices?utm_source=github&utm_medium=repository&utm_campaign=9781782171546)

* [Spring 5.0 Microservices - Second Edition](https://www.packtpub.com/application-development/spring-50-microservices-second-edition?utm_source=github&utm_medium=repository&utm_campaign=9781787127685)

* [Mastering Spring 5.0](https://www.packtpub.com/application-development/mastering-spring-50?utm_source=github&utm_medium=repository&utm_campaign=9781787123175)

