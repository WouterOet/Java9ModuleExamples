# Step 3

Now we are going to get rid of the automatic modules and use proper modules. We downloaded the latest versions of our dependencies and put them into the lib directory. If you checkout the content of the myLib jar (jar -tf libs/myLib-1.0.0.jar) then you'll see the added module-info.class file.

Compile with: javac -mp libs/myLib-1.0.0.jar -modulesourcepath src -d dist $(find src -name *.java)

Run with: java -mp libs/myLib-1.0.0.jar:dist -m nl.quintor.java9.migration/nl.quintor.java9.migration.Main