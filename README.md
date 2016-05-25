# Java 9 module examples

## nl.quintor.java9.exports
The most basic example. Exports a single class. Requires none.

## nl.quintor.java9.requires
A very basic example. Exports nothing and requires one module.


## Compilation and running of the examples
You can compile each module separately with:

javac -d dist/<moduleName> -mp dist $(find <moduleName> -name *.java)

Or compile them all at onces with:

javac -d dist -modulesourcepath . $(find . -name "*.java")

