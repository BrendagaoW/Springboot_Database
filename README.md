# Springboot_Database

##1. Create table
Use @Entity to note the entity which you want to save as a table.

Use @Id and @GeneratedValue to present the primary key.

Other column should be noted by @Column.

Every fields should have getter and setter methods.

##2. Configure the database
Configuration file can be application.properties or application.yml.
 In the test environment, this file under test/java can be searched firstly, 
 if there is null, the file under main/java can be used.

To connect to the database, you should install the related database, 
or just use the embedded database, such as h2.

In the configuration file, there should be:
spring.datasource.url/username/password at least, the url should be 
jdbc:postgresql://host:port/database.

There is also spring.datasource.drive-class-name, 
which is your database driver.

At least, spring.jpa.hibernate.ddl-auto can create, 
drop or update your tables.

##3. Create related repositories and services to manipulate data
Use @Repository to note the interface **Repository which extends the 
JpaRepository. The **Java Persistence API (JPA)** is a Java specification for 
accessing, persisting, and managing data between Java Object / Class and a 
relational database.

Use @Service to note the **Service, which manipulate the autowired **Repository. 

Moreover, should use @ComponentScan upper the DemoApplication, so the objects 
noted by @Component, @Service and @Repository can be regarded as beans.

##4. Use H2 embedded database to Junit test
When to test the functional methods handled the database without updating 
the real database, embedded databases can be choose, such as H2. 
Then noting the test classes with @DataJpaTest and 
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2).
Now we can test the methods easily!

In this way, application.properties about test environment is unnecessary.