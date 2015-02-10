# About this project

This project is a simple demo application using the
[Gson](http://code.google.com/p/google-gson/),
[Joda-Time](http://www.joda.org/joda-time/) and
[Apache HttpComponents](https://hc.apache.org) libraries. It runs on Java 1.6
or newer.

The application will print out information regarding the current date
applicable to Sweden, including namesday names, day of the week, etc. The data
is fetched from [Svenska Dagar](http://api.dryg.net/).

# How do I build this project?

You can easily build the code directly from within your IDE of choice (I'm
personally rather fond of [Eclipse](http://www.eclipse.org)), using its build
features (in Eclipse, right click the project and select *Run As* ->
*Maven build*, type *package* into the *Goals* field, then *Run*). If you
prefer doing stuff more old school, you can use the command line to build the
project as well. To do so, you need to have Maven installed on your machine.
Navigate to your project location. Then, simply type

    mvn package

in your terminal. Your generated JAR files can be found as
*./target/JavaApiConsumer-1.0.0.jar* and
*./target/JavaApiConsumer-1.0.0-with-dependencies.jar*.

# How do I run this project?

The easiest way of running the code is directly from within your IDE of choice,
simply by hitting the *Run* button (in Eclipse, that is). If you prefer running
your code from the command line, navigate to the project location and type

    java -jar target/JavaApiConsumer-1.0.0-with-dependencies.jar

Don't forget to kill the process when done (using the stop button in the
Eclipse console, or by hitting ctrl-c in the terminal).