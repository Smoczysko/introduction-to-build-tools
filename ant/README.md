# Introduction to build tools #

## Ant and Ivy ##

This module covers very basic usage of Apache Ant build tool with Apache Ivy dependency management tool.

## Examples ##

* 01-minimalistic - simplest possible Ant project that works as compiler and assembly tool for Java application.
* 02-executable-jar - example of creation executable jar. Example uses [01-minimalistic example](01-minimalistic) code.
* 03-properties - example of how to introduce properties for cleaner and easier to maintain project configuration. Example uses [02-executable-jar example](02-executable-jar) code.
* 04-depends - shows chaining targets in single task execution. Example uses [03-properties example](03-properties) code.
* 05-junit - introduces Apache Ivy to manage jUnit dependency and shows how to run unit tests. Example uses [04-depends example](04-depends) code.
* 06-war - shows how to resolve Java EE API dependencies and build war package.
* 07-jetty - example of running web application in Jetty server (in-memory mode). Example uses [06-war example](06-war) code.
* 08-macrodef - shows how to introduce custom tasks for easier re-usage of build configuration code.
* 09-include - shows how to move custom tasks (macros) to separate build file for easier re-usage in different projects. Example uses [08-macrodef example](08-macrodef) code.
* 10-contrib - introduces Ant-Contrib Tasks library. Example uses [08-include example](09-include) code.