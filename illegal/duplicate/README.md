# Duplicate packages

Java will not allow 2 modules to export the same package. The compiler will not allow you to compile.
This example demonstrates that.

Both module A \& B export the same package 'nl.quintor.java9.duplicate'. This is fine. However when the module
'main' tries to use them both, that is a problem.

Compile with: javac -d dist --module-source-path . $(find . -name "*.java") from this directory.
