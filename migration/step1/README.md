# Step 1

Now we are going to use automatic modules to get rid of the library on the classpath. This is the time to switch to the java 9 jdk. Make sure it is on your path.

Because the application is now in partly migrated state, we have to take some action to keep it working. The entrypoint of the application is not in a module. Thus Java can't build the module graph which it needs to determine which classes are accessible. Thus we basically need to inform it which modules the application uses. The way we can do this is via the -addmods parameter. This is a list of "root modules to resolve in addition to the initial module".

Compile with: javac -d dist -p libs/myLib.jar --add-modules myLib $(find src -name '*.java')

Run with: java -cp dist/ -p libs/myLib.jar --add-modules myLib nl.quintor.java9.migration.Main
