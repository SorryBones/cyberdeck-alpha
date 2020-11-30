#!/bin/bash

rm -rf bin/*
javac -Xlint -d bin src/cyberdeck/Cyberdeck.java
javac -Xlint -d bin -cp bin src/cyberdeck/kirama/Kirama.java
javac -Xlint -d bin -cp bin src/cyberdeck/kirama/KiramaDriver.java
