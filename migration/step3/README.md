# Step 3

Now we are going to get rid of the automatic modules and use proper modules. We downloaded the latest versions of our dependencies and put them into the lib directory. If you checkout the content of the myLib jar (jar -tf libs/myLib-1.0.0.jar) then you'll see the added module-info.class file.

Compile with: javac -mp libs/myLib-1.0.0.jar -modulesourcepath src -d dist $(find src -name *.java)

Run with: java -mp libs/myLib-1.0.0.jar:dist -m nl.quintor.java9.migration/nl.quintor.java9.migration.Main


You're now completely migrated. However this was are really easy application to migrate. In reality you'll run into the following problems:

* Cyclic dependencies
    Prove that architecture and implementation are two different things.
* Split packages
    I.e. the same package in different modules. 
* Multiple versions of the same module within your application
    Upgrade all your dependencies :P
* Using classes which you shouldn't use
    You've been warned for years. The classes in the sun.* packages are not to be used and you probably didn't listen. Most of the will have alternatives available. But have fun migrating to those.
    
Remember: "In essence, the module system is a seat-belt, it's not a jetpack." - Mark Reinhold