package com.graybytes.module.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.project.MavenProject;

/**
 * Module prints the module info (name, groupId, artifactId..etc)
 */
@Mojo(name = "info", defaultPhase = LifecyclePhase.INITIALIZE)
public class ModuleMojo extends AbstractMojo {
    /**
     * @parameter default-value="${project}"
     * @required
     * @readonly
     */
    @Component
    MavenProject mavenProject;

    public void execute() throws MojoExecutionException {

        getLog().info("------------------------------------------------------------------------");
        getLog().info(" MODULE INFO");
        getLog().info("------------------------------------------------------------------------");
        getLog().info("[ROOT]\n" + getModuleInfo(mavenProject.getParent()));
        getLog().info("[MODULE]\n"+ getModuleInfo(mavenProject));
    }

    private String getModuleInfo(MavenProject mavenProject)
    {
        StringBuilder moduleBuilder = new StringBuilder();
        moduleBuilder.append("name: " + mavenProject.getName() +"\n");
        moduleBuilder.append("artifactId: " + mavenProject.getArtifactId() + "\n");
        moduleBuilder.append("groupId: " + mavenProject.getGroupId() + "\n");
        moduleBuilder.append("version: " + mavenProject.getVersion() + "\n");
        moduleBuilder.append(("dependency count: " + mavenProject.getDependencies().size()) + "\n");
        moduleBuilder.append(("modules count: " + mavenProject.getModules().size()) + "\n");
        moduleBuilder.append(("plugins count: " + mavenProject.getPluginArtifacts().size()) + "\n");
        return moduleBuilder.toString();
    }
}
