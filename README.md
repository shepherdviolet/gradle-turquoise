# gradle-turquoise 6.0
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
            maven { url 'https://jitpack.io' }
            //Deprecated way, use jitpack.io instead, just for reference
            //maven { url 'https://github.com/shepherdviolet/alternate-maven-repository/raw/master/repository' }
        }
        dependencies {
            classpath 'com.github.shepherdviolet:gradle-turquoise:6.0'
        }
    }
    
    apply plugin: 'gradle-turquoise'
```

### Extension Configure
```gradle
    turquoise{
        //disable android lint tasks if true
        disableLint = true
        //printCachePathOfDependencies: select type of dependency
        printCachePathOfDependenciesFilter = ['compile', 'runtime', 'testCompile', 'testRuntime']
        //printCachePathOfBuildScriptDependencies: select type of dependency
        printCachePathOfBuildScriptDependenciesFilter = ['classpath']
    }
```

### How to build
https://github.com/shepherdviolet/gradle-turquoise/blob/master/docs/BuildManual.md

### Notes
https://github.com/shepherdviolet/gradle-turquoise/blob/master/docs/Notes.md
