#!/bin/bash
set -x #echo on
javac -mp libs/myLib.jar -d dist --module-source-path src $(find src -name *.java)
java -mp libs/myLib.jar:dist -m nl.quintor.java9.migration/nl.quintor.java9.migration.Main