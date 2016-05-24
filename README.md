# Java 9 module examples

## nl.quintor.java9.exports-example
The most basic example. Exports a single class. Requires none.


## Compilation and running of the examples
You can compile each module separately with:

javac -d dist/<moduleName> -mp dist $(find <moduleName> -name *.java)

Or compile them all at onces with:

javac -d dist -modulesourcepath . $(find . -name "*.java")

