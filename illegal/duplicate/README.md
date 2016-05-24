# Duplicate packages

Java will not allow 2 modules to export the same package. The compiler will not allow you to compile.
This example demonstrates that.

Compile with: javac -d dist -modulesourcepath . $(find . -name "*.java") from this directory.
