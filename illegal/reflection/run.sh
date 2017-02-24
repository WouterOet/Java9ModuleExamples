#!/bin/bash
set -x #echo on
javac -d dist --module-source-path . $(find . -name *.java)
java -mp dist -m nl.quintor.b/nl.quintor.b.Main