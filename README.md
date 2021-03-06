# gradle-turquoise 11.0
* Gradle plugin for Turquoise project
* https://github.com/shepherdviolet/gradle-turquoise

### Tasks
* printCachePathOfDependencies: print the cache paths of dependencies
* printCachePathOfBuildScriptDependencies: print the cache paths of build script dependencies
* disableLint option: disable android lint tasks if true

### Import dependencies from maven repository

```gradle
    buildscript {
        repositories {
            //In jitpack.io
            maven { url 'https://jitpack.io' }
        }
        dependencies {
            classpath 'com.github.shepherdviolet:gradle-turquoise:11.0'
        }
    }
    
    apply plugin: 'gradle-turquoise'
```

### Extension Configure
```gradle
    turquoise{
        //disable android lint tasks if true
        disableLint = true
        //printCachePathOfDependencies: select type of dependency (it doesn't work in Gradle 4.1)
        printCachePathOfDependenciesFilter = ['compile', 'runtime', 'testCompile', 'testRuntime']
        //printCachePathOfBuildScriptDependencies: select type of dependency (it doesn't work in Gradle 4.1)
        printCachePathOfBuildScriptDependenciesFilter = ['classpath']
    }
```

### How to build
https://github.com/shepherdviolet/gradle-turquoise/blob/master/docs/BuildManual.md

### Notes
https://github.com/shepherdviolet/gradle-turquoise/blob/master/docs/Notes.md
