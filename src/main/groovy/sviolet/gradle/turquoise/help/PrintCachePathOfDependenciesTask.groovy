/*
 * Copyright (C) 2015-2017 S.Violet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project GitHub: https://github.com/shepherdviolet/turquoise
 * Email: shepherdviolet@163.com
 */

package sviolet.gradle.turquoise.help

import org.gradle.api.GradleException
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

/**
 * print the cache paths of dependencies
 *
 * <pre>{@code
 *  allprojects {
 *      task printCachePathOfDependencies{
 *          configurations.getByName('compile').each { dependency ->
 *              println dependency
 *          }
 *      }
 *  }
 * }</pre>
 *
 */
class PrintCachePathOfDependenciesTask extends AbsHelpTask {

    static void apply(Project project){
        project.allprojects {
            it.task('printCachePathOfDependencies', type: PrintCachePathOfDependenciesTask)
        }
    }

    @TaskAction
    void run() {
        project.turquoise.printCachePathOfDependenciesFilter.each { filter ->
            println '====' + (String)filter + '===='
            try {
                project.configurations.getByName((String)filter).each { dependency ->
                    println dependency
                }
            } catch (Exception e){
                throw new GradleException(e)
            }
        }
    }

    //method with closure
//    private static void skipException(Closure c){
//        try {
//            c()
//        } catch (Exception ignore){
//        }
//    }

}
