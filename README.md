# SFWE301 Java GUI

## Description

This project demonstrates a basic JavaFX application with a simple login interface. It was created as a hands-on example for students in a software requirements and analysis course (SFWE301). The program illustrates how to structure a Java GUI project, handle basic authentication using a CSV file, and apply simple styling via CSS.

## Table of Contents

- [Description](#description)
- [Contents](#contents)
- [Features](#features)
- [Technology](#technology)
- [Lessons](#lessons)
- [Overview / Retrospective](#overview--retrospective)

## Contents

- **src/simplegui/**  
  - **Main.java**: Entry point of the JavaFX application, sets up the `Scene` and handles navigation between the login and main pages.  
  - **Login.java**: Implements a simple login form, reading user credentials from `users.csv`.  
  - **Controller.java** (and optional *simplegui.fxml*): Example JavaFX controller and layout file (though the primary layout is coded in Java).  
- **src/assets/**  
  - **login-background.png**: A background image displayed on the login screen.  
- **src/data/**  
  - **users.csv**: Stores basic username-password pairs for authentication.  
- **src/res/**  
  - **styles.css**: Defines CSS styling rules for UI elements like buttons, text fields, and containers.  
- **bin/**  
  - Compiled output files, plus mirrored directories for assets/data/res if needed.  
- **SFWE301-SimpleJavaGUI.jar**  
  A runnable JAR file that packages the JavaFX application.  
- **run.sh**  
  A script to launch the JAR with the appropriate JavaFX module path.

## Features

- **JavaFX GUI**  
  Displays a full-screen login window with a custom background image.  
- **CSV-Based Authentication**  
  Reads user credentials from a CSV file (`users.csv`), verifying login attempts.  
- **Scene Switching**  
  Transitions from the login scene to a main page on successful login.  
- **Styling with CSS**  
  Manages layout and UI appearance using a separate CSS file.  
- **FXML Integration (Optional)**  
  Includes a sample FXML file (`simplegui.fxml`) and controller, demonstrating how JavaFX GUIs can be designed via XML instead of all-Java code.

## Technology

- **Programming Language:**  
  Java (with JavaFX)
- **Development Tools:**  
  - Visual Studio Code or any IDE supporting JavaFX  
  - JavaFX SDK (e.g., JavaFX 21)  
  - JDK 19 or above (as per your project settings)  
- **Concepts Demonstrated:**  
  - Building GUIs with JavaFX  
  - Reading and parsing CSV files  
  - Applying CSS to style JavaFX applications  
  - Basic login authentication logic

## Lessons

- **GUI Design:**  
  Learned how to set up scenes, use layouts, and switch views in JavaFX.  
- **File I/O & Security Basics:**  
  Practiced storing and retrieving user credentials from a CSV file (although a more secure method would be recommended in production).  
- **Modular Project Structure:**  
  Organized assets (images, data, CSS) alongside source code, mirroring them in `bin` for compiled output.  
- **Simple Styling:**  
  Used CSS to maintain consistent UI aesthetics, separate from application logic.  
- **Student Demonstration:**  
  Served as an instructional example to help classmates or mentees understand JavaFX and the fundamentals of building a desktop GUI app.

## Overview / Retrospective

- **What Went Well:**  
  - Quickly demonstrated how to build a JavaFX GUI project from scratch.  
  - Showed how to incorporate images, data files, and styling in a clean directory structure.  
  - Provided a straightforward login/authentication flow for students to learn from.
- **Areas for Improvement:**  
  - Enhance error handling around CSV loading and invalid credentials.  
  - Organize FXML and controller code more thoroughly if building a larger-scale app.  
  - Explore advanced layout techniques (e.g., using multiple FXMLs or different layout managers).
- **Future Enhancements:**  
  - Add a database connection for more robust authentication.  
  - Implement form validation and user feedback for failed logins.  
  - Expand UI to include more pages or features—e.g., user profile pages, or role-based navigation.

