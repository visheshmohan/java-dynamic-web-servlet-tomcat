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

After Project is running , give the first path after localhost:8080 as per your project root folder
<img width="567" alt="image" src="https://github.com/visheshmohan/java-dynamic-web-servlet-tomcat/assets/63037782/e4969fbc-1039-4197-8c24-97caa305aa0e">

Can verify same in Server's folder [on the same level as java root folder] in server.xml for path="/MyFirstJavaWebProject-Tomcat" for <Context> tag, must be placed just above </Engine> tag.
