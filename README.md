# Springboot_Database

##1. Create table
Use @Entity to note the entity which you want to save as a table.

Use @Id and @GeneratedValue to present the primary key.

Other column should be noted by @Column.

Every fields should have getter and setter methods.

##2. Configure the database
Configuration file can be application.properties or application.yml. In the test environment, this file under test/java can be searched firstly, if there is null, the file under main/java can be used.

To connect to the database, you should install the related database, or just use the embedded database, such as h2.

In the configuration file, there should be:
spring.datasource.url/username/password at least, the url should be jdbc:postgresql://host:port/database.

There is also spring.datasource.drive-class-name, which is your database driver.

At least, spring.jpa.hibernate.ddl-auto can create, drop or update your tables.


