# Build
* 1 Clone this project
* 2 Build (Type in gradle command in terminal)
```gradle

    gradle uploadArchives

```
* 3 You can get the archives in ./release/sviolet/gradle-turquoise
* 4 Apply in your project (build.gradle)
```gradle

    buildscript {
        repositories {
            //your local repository path (put gradle-turquoise archive in it)
            maven{url 'file:C:/m2repository/repository'}
            jcenter()
        }
        dependencies {
            //use correct version please
            classpath 'com.github.shepherdviolet:gradle-turquoise:1.1'
        }
    }
    
    //apply plugin in root build.gradle
    apply plugin: 'gradle-turquoise'

```