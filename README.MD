<H3>Home task #18</H3>
<br>1. Git repo
<br>2. README.MD file with the task and description. gitignore
<br>3. create new maven project with 3 modules
  <br>  3.1 entity module
  <br> 3.2 persistence module
  <br> 3.3 (optinal) integration test module
  <br> 3.4 naming: {project-name}-persistence. examples: school-journal-persistence, car-service-entity, etc
<br>4. Create POJO classes
<br>5. Use at least 4 class level annotations (for example embedded, immutable, and so on)
<br>6. Use at least 5 field level annotations (for example, transient)
<br>7. Use at least 2 diff id generation strategy
<br>8. create your custom id generation strategy and use it
<br>9. create your custom name strategy and use it

<H2>In developing :</H2>
<li>mongodb/postgresql data base and docker images</li>
<li>mongodb users and postgres users role parameters</li>
<li>random id generate in mongodb</li>
<H6>In this lecture-18 provides an almost complete example of columns in databases without sql and bson(binary json)</H6>
<H3>Notes</H3>
Mongock (mongodb database migration) only works with Spring Boot therefore not used 
<H2>What is done:</H2>
<h3>entity:</h3>
In module - e-book-entity<br>
On mongodb /main/.../entity/mongodb<br>
On postgresql /main/.../entity/postgresql<br>
On lecture /main/.../entity/lecture
<h3>persistence:</h3>
In module - e-book-persistence<br>
 persistence.xml - /main/...resources/META-INF/persistence.xml
<H2>Get start:</H2>
<li>mvn clean package<br>
<li>docker-compose up -d<br>
<li>mvn flyway:migrate
<br>
<br>
<h6>If mongo-jdbc not working use hibernate-ogm-mongodb </h6>
