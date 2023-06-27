# java-dynamic-web-servlet-tomcat
This is a Simple Java Dynamic Web app meant to be hosted on Apache Tomcat 9 server

This Sample project was created with the help of:
1. https://medium.com/@toimrank/hello-world-servlet-apache-tomcat-and-eclipse-setup-complete-guide-b76c3a5043cf

And Some help was also taken from this youtube video to set up Apache Tomcat on a Mac machine:

2. https://www.youtube.com/watch?v=wDS4QgehTSI

While following the first reference in case your configuration does not run, make sure in web.xml you use Double inverted commas from your keyboard and not the one copied from the medium.com since it has a different encoding any not readable by IDE.

Make sure to follow the steps if setting up for the first time:
1. Setup Jdk first
2. Setup Apache Tomcat
3. Generate a new Java web project from IDE keeping the "Default Configuration for Apache tomcat {version}" option selected.

After Project is running, give the first path after localhost:8080 as per your project root folder
<img width="567" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/e4969fbc-1039-4197-8c24-97caa305aa0e">

Can verify same in Server's folder [on the same level as java root folder] in server.xml for path="/MyFirstJavaWebProject-Tomcat" for <Context> tag, must be placed just above </Engine> tag.

Once the project is cloned. Check Project Settings and make sure it matches the below configuration.
<img width="967" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/5d2fe0b9-cc88-4130-8f67-8858deffd71f">

Project state now:
<img width="1059" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/c677ee7b-64d7-4cfa-9d1f-f4d1e611d95a">


Then move to Build Path and Add Apache Tomcat
<img width="999" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/dd642718-a64b-4342-ac26-5493cea9609d">

Select Server Runtime > Apache Tomcat version
<img width="420" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/aea66966-ef54-4c55-8a10-836bdb04e9a2">

The project should be something like this this:
<img width="1035" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/cfaa6a50-a532-4e9e-8e38-b63458378b10">

Check Server.xml of your server
<img width="1654" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/07f94d4d-2812-4184-bd4b-b872757b53fb">

And we are good to see "Hello World" at http://localhost:8080/java-dynamic-web-servlet-tomcat/student
<img width="584" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/e29019fe-df4f-4bfa-bd52-a120e9feac59">
