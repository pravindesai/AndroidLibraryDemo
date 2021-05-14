# How to add into Android Studio Gradle

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle  at the end of repositories:

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }
Step 2. Add the dependency

	dependencies {
	def SnackLibrary_VERSION = "2.0.0"
    implementation "com.github.pravindesai:AndroidLibraryDemo:$SnackLibrary_VERSION"
	}
	
****
****
 # Useful Methods
    
    SnackLog.print(pattern:String, data:String)

    SnackLog.printCount(pattern:String, data:String)
    
    SnackLog.printError(tag:String, data:String)
    
    SnackLog.printCountError(tag:String, data:String)
