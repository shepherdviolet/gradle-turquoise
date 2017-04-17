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

import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

/**
 * print the cache paths of dependencies
 */
class PrintCachePathOfDependenciesTask extends AbsHelpTask {

    static void apply(Project project){
        project.allprojects {
            it.task('printCachePathOfDependencies', type: PrintCachePathOfDependenciesTask)
        }
    }

    @TaskAction
    void run() {
        println '====compile===='
        skipException {
            project.configurations.getByName('compile').each { dependency ->
                println dependency
            }
        }
        println '====testCompile===='
        skipException {
            project.configurations.getByName('testCompile').each { dependency ->
                println dependency
            }
        }
        println '====runtime===='
        skipException {
            project.configurations.getByName('runtime').each { dependency ->
                println dependency
            }
        }
        println '====testRuntime===='
        skipException {
            project.configurations.getByName('testRuntime').each { dependency ->
                println dependency
            }
        }
    }

    private void skipException(Closure c){
        try {
            c()
        } catch (Exception ignore){
        }
    }

}
