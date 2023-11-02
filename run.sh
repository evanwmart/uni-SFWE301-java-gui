#!/bin/bash

# Run
echo "Launching..."
java --module-path "lib/javafx-sdk-21.0.1/lib" --add-modules javafx.controls,javafx.fxml -jar SFWE301-SimpleJavaGUI.jar
echo "Terminated."
