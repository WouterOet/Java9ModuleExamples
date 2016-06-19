# Reflection

This examples shows that you can't reach classes which are not exported with reflection.

Compile with: javac -d dist -modulesourcepath . $(find . -name *.java)

Run with: java -mp dist -m nl.quintor.b/nl.quintor.b.Main