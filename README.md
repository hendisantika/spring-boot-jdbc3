# Spring Boot JDBC 3

Example Spring Boot application using MySQL JDBC Driver.

Run this project by this command :

`mvn clean spring-boot:run`

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2018-09-19 06:22:18.443  INFO 7912 --- [           main] c.h.s.SpringBootJdbc3Application         : Starting SpringBootJdbc3Application on Hendis-MacBook-Pro.local with PID 7912 (/Users/hendisantika/Documents/IdeaProjects/spring-boot-jdbc3/target/classes started by hendisantika in /Users/hendisantika/Documents/IdeaProjects/spring-boot-jdbc3)
2018-09-19 06:22:18.448  INFO 7912 --- [           main] c.h.s.SpringBootJdbc3Application         : No active profile set, falling back to default profiles: default
2018-09-19 06:22:18.502  INFO 7912 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@2850bdb2: startup date [Wed Sep 19 06:22:18 WIB 2018]; root of context hierarchy
2018-09-19 06:22:19.455  INFO 7912 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2018-09-19 06:22:19.748  INFO 7912 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2018-09-19 06:22:19.791  INFO 7912 --- [           main] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
2018-09-19 06:22:19.817  INFO 7912 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
2018-09-19 06:22:19.929  INFO 7912 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.2.17.Final}
2018-09-19 06:22:19.930  INFO 7912 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2018-09-19 06:22:19.980  INFO 7912 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
2018-09-19 06:22:20.131  INFO 7912 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
2018-09-19 06:22:20.777  INFO 7912 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2018-09-19 06:22:21.434  INFO 7912 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-09-19 06:22:21.435  INFO 7912 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'dataSource' has been autodetected for JMX exposure
2018-09-19 06:22:21.438  INFO 7912 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located MBean 'dataSource': registering with JMX server as MBean [com.zaxxer.hikari:name=dataSource,type=HikariDataSource]
2018-09-19 06:22:21.451  INFO 7912 --- [           main] c.h.s.SpringBootJdbc3Application         : Started SpringBootJdbc3Application in 3.382 seconds (JVM running for 7.407)
2018-09-19 06:22:21.558  INFO 7912 --- [           main] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
here are system count: [SystemExample(id=1, name=Windows Server 2012 R2, lastaudit=2017-08-11), SystemExample(id=2, name=RHEL 7, lastaudit=2017-07-21), SystemExample(id=3, name=Solaris 11, lastaudit=2017-08-13)]
Here is a system: SystemExample(id=1, name=Windows Server 2012 R2, lastaudit=2017-08-11)
Here is a system: SystemExample(id=2, name=RHEL 7, lastaudit=2017-07-21)
Here is a system: SystemExample(id=3, name=Solaris 11, lastaudit=2017-08-13)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.562 s
[INFO] Finished at: 2018-09-19T06:22:21+07:00
[INFO] Final Memory: 45M/498M
[INFO] ------------------------------------------------------------------------
2018-09-19 06:22:21.890  INFO 7912 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@2850bdb2: startup date [Wed Sep 19 06:22:18 WIB 2018]; root of context hierarchy
```
