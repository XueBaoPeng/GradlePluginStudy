package com.xbp.myplugingradle

import org.gradle.api.Plugin
import org.gradle.api.Project


public class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
        System.out.println("========================");
        project.gradle.addListener(new com.xbp.buildsrc.TimeListener())
    }
}