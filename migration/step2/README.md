# Step 2

Now we introduce our own module. See the changed directory structure and the addition of the module-info.java file. This now contains the reference to the automatic module we introduced in the previous step.

Compile with:  javac -p libs/myLib.jar -d dist -modulesourcepath src $(find src -name '*.java')

Run with: java -p libs/myLib.jar:dist -m nl.quintor.java9.migration/nl.quintor.java9.migration.Main
