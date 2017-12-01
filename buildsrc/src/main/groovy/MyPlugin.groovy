package com.xbp.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project


public class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("========================");
        System.out.println("自定义插件开始执行");
        System.out.println("========================");
        project.gradle.addListener(new com.xbp.buildsrc.TimeListener())

    }
}