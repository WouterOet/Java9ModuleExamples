# Visible classes

Dependency tree:

Main -> A -> B

However B is not visible to Main as is is not a 'requires public' in A. Therefor this won't compile as
B is not visible from Main.

Compile with: javac -d dist --module-source-path . $(find . -name "*.java") from this directory.
