package sviolet.gradle.turquoise

/**
 * config
 *
 * Created by S.Violet on 2017/4/21.
 */
class TurquoisePluginExtension {

    //printCachePathOfDependencies: select type of dependency
    public String[] printCachePathOfDependenciesFilter = ['compile', 'testCompile']

    //printCachePathOfBuildScriptDependencies: select type of dependency
    public String[] printCachePathOfBuildScriptDependenciesFilter = ['classpath']

    //disable lint tasks if true, false by default
    public boolean disableLint = false

}
