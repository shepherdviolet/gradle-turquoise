package sviolet.gradle.turquoise

/**
 * config
 *
 * Created by S.Violet on 2017/4/21.
 */
class TurquoisePluginExtension {

    //printCachePathOfDependencies: select type of dependency
    String[] printCachePathOfDependenciesFilter = ['compile', 'testCompile']

    //printCachePathOfBuildScriptDependencies: select type of dependency
    String[] printCachePathOfBuildScriptDependenciesFilter = ['classpath']

}
