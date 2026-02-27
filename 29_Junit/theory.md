# Junit in java

## Wha is JAR file?

A JAR file is a Java ARchive file that contains Java classes and other resources. It is used to package Java applications and libraries. JAR files can be executed as standalone applications or used as libraries in other Java projects.

## how to use external library in java

just use dependencies in maven or gradle, and then you can use the library in your code.Maven will automatically download the library and add it to your project.

## What is plugin in maven?

A plugin is used to perform specific tasks during the build process. For example, the Surefire plugin is used to run tests, and the Compiler plugin is used to compile Java code. Plugins can be configured in the `pom.xml` file of a Maven project.

## important notes

1. All the business logic should be src file.
   - `src/main/java`: This directory contains the main source code of the application, including all the business logic and core functionality.

2. All the test logic should be test file.
3. JRE means internal library, which is the Java Runtime Environment that provides the necessary libraries and tools to run Java applications.
4. Mavven dependencies are external libraries.
5. Target is the output directory where the compiled classes and resources are placed after the build process. It is typically used for storing the compiled bytecode and other generated files.
6. pom.xml means "Project Object Model" file,core heart of a maven project. It contains information about the project, such as its dependencies, build configuration, and plugins. The `pom.xml` file is used by Maven to manage the project's build lifecycle and dependencies.
