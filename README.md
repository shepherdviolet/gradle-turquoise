# gradle-turquoise 1.1.170601
* Gradle plugin for Turquoise project
* https://github.com/shepherdviolet/gradle-turquoise

### Tasks
* printCachePathOfDependencies: print the cache paths of dependencies
* printCachePathOfBuildScriptDependencies: print the cache paths of build script dependencies

### Releases (aar/source)
https://github.com/shepherdviolet/alternate-maven-repository/raw/master/repository <br/>
https://git.oschina.net/shepherdviolet/alternate-maven-repository/raw/master/repository <br/>

### Import dependencies from maven repository

```gradle
    buildscript {
        repositories {
            maven { url 'https://github.com/shepherdviolet/alternate-maven-repository/raw/master/repository' }
        }
        dependencies {
            classpath 'sviolet:gradle-turquoise:1.1'
        }
    }
    
    apply plugin: 'gradle-turquoise'
```

### Extension Configure
```gradle
    turquoise{
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
