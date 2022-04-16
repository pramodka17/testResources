Clone the repo\
Install IntelliJ and install the bazel plugin

## Maven
Open the testResources project with IntelliJ\
This will open the project as a Maven project by default\
Run the Main.java file from the IDE.

## Bazel
From the "File" option in the menu run "Import Bazel Project" and select this folder\
Go through the steps without any changes needed. This will open the project as a bazel project\
Once the project is reloaded, click "Bazel -> Sync -> Sync Project with Build Files" from the top menu to build the project\
Alternatively, trying "Bazel -> build -> compile project" for different results\
Run the Main.java file again. This time the option says "bazel run :testResources"

# Outputs
The first output works fine, but the second run either throws a null pointer exception or returns 0 instead of 11\
Maven seems to be packaging the resources folder correctly but not bazel.\
See the BUILD.bazel file to verify that the project has been setup correctly: https://bazel.build/migrate/maven
