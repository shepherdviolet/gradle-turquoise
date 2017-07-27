package sviolet.gradle.turquoise

/**
 * config
 *
 * Created by S.Violet on 2017/4/21.
 */
class TurquoisePluginExtension {

    //printDependenciesPathFilter: select type of dependency
    public String[] printDependenciesPathFilter = ['compile', 'testCompile']

    //printBuildDependenciesPathFilter: select type of dependency
    public String[] printBuildDependenciesPathFilter = ['classpath']

    //disable lint tasks if true, false by default
    public boolean disableLint = false

}
