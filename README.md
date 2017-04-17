# gradle-turquoise 1.0.170417
* Gradle plugin for Turquoise project
* https://github.com/shepherdviolet/gradle-turquoise

### Tasks
* printCachePathOfDependencies: print the cache paths of dependencies

### Build
* 1 Clone this project
* 2 Build (Type in gradle command in terminal)
```java

    gradle uploadArchives

```
* 3 You can get the archives in ./release/sviolet/gradle-turquoise
* 4 Apply in your project (build.gradle)
```java

    buildscript {
        repositories {
            //your local repository path (put gradle-turquoise archive in it)
            maven{url 'file:C:/m2repository/repository'}
            jcenter()
        }
        dependencies {
            //use correct version please
            classpath 'sviolet:gradle-turquoise:1.0.170417'
        }
    }
    
    //apply plugin in root build.gradle
    apply plugin: 'gradle-turquoise'

```