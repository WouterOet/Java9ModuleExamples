# transitive example

Modules can't have a transitive dependency. If so then the compiler will complain. This example proves that.

Dependency 'tree':

A -> B -> C -> A

Compile with javac -d dist -modulesourcepath . $(find . -name "*.java") from this directory.