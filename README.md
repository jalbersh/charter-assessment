# Zip Code Assessment - James Albersheim

Create a file containing US zipcodes (at least a variety)
Create a program in Kotlin that does the following:
Read in the file of zip codes
Process the ones that begin with 8.
Multiple each by 1.5
For each of the results – print the sorted list.

****************

To install kotlin:
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk version
  sdk install kotlin
To Build Jar:
  kotlinc src/main/kotlin/ZipCodes.kt -include-runtime -d zips.jar
Run Unit Tests in IntelliJ
Usage: java -jar zips.jar zipcodes.txt
