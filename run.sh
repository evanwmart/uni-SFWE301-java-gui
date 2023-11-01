#!/bin/bash

launch_location="src"

cd "$launch_location"

# Compile
echo "Running compile..."
javac --module-path ../lib/javafx-sdk-21.0.1/lib --add-modules javafx.controls,javafx.fxml simplegui/*.java

# Run
echo "Launching..."
java --module-path ../lib/javafx-sdk-21.0.1/lib --add-modules javafx.controls,javafx.fxml simplegui.Main
echo "Terminated."
