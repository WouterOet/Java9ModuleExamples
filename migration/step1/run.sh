#!/bin/bash
set -x #echo on
javac -d dist -mp libs/myLib.jar -addmods myLib $(find src -name *.java)
java -cp dist/ -mp libs/myLib.jar -addmods myLib nl.quintor.java9.migration.Main