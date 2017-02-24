#!/bin/bash
set -x #echo on
javac -mp libs/myLib-1.0.0.jar --module-source-path src -d dist $(find src -name *.java)
java -mp libs/myLib-1.0.0.jar:dist -m nl.quintor.java9.migration/nl.quintor.java9.migration.Main