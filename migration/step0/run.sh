#!/bin/bash
set -x #echo on
javac -d dist -cp libs/myLib.jar src/nl/quintor/java9/migration/Main.java
java -cp dist:libs/myLib.jar nl.quintor.java9.migration.Main