A sample project that shows how to package a scala / sbt application, and set application parameters.

To run the example, run 'sbt stage' or 'sbt dist'

'stage' will create a folder in target/universal/stage. To run the application, go into bin and run either './sbtdistribute' or 'sbtdistribute.bat', depending on if you are on unix/mac or windows.

'dist' will create a zip file in target/universal/stage with the same structure.

To change the application parameters, you can modify 'SBTDISTRIBUTE_config' if you are on windows, or 'application.ini' if you are on unix/mac, located in the 'src/universal' directory.