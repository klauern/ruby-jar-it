What is it?
===========
An example program to bundle JRuby up in a Maven project using [mkristian][1]'s
[jruby-maven-plugins][2].  To use simply

    mvn install

and then go to your `target` folder and run it:

    java -jar ruby-jar-it-with-dependencies-and-gems.jar


Why?
====
This is simply a reference point for trying to create your own.  There are
obvious use-cases for this kind of thing, such as a hybrid Java/Ruby project,
and if you're comfortable using Maven as your build system, you might want to
go with this approach to create a runnable .jar.

[1]: http://blog.mkristian.tk/
[2]: 
