# Dropwizard + Gradle + Groovy = &hearts;

[![Build Status](https://travis-ci.org/hardisty/dropwizard-gradle.svg?branch=master)](https://travis-ci.org/hardisty/dropwizard-gradle)

Minimal example of getting Dropwizard going with Gradle and Groovy.

# Dropwizard version
1.2.0

# Build

Run `./gradlew clean shadowJar`. The resulting JAR will be saved as `./build/libs/dropwizard-gradle-<<version>>-standalone.jar`.

# Run

`./gradlew runShadow`