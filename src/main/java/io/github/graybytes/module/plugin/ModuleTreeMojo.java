package io.github.graybytes.module.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.project.MavenProject;

/**
 * Module prints the module info (name, groupId, artifactId..etc)
 */
@Mojo(name = "tree", defaultPhase = LifecyclePhase.INITIALIZE)
public class ModuleTreeMojo extends AbstractMojo {
    /**
     * @parameter default-value="${project}"
     * @required
     * @readonly
     */
    @Component
    MavenProject mavenProject;

    public void execute() throws MojoExecutionException {
        getLog().info("------------------------------------------------------------------------");
        getLog().info(" MODULE TREE");
        getLog().info("------------------------------------------------------------------------");

        getModuleInfo(mavenProject, 0);
    }

    private void getModuleInfo(MavenProject mavenProject, int level)
    {
        if(mavenProject == null)
            return;
        StringBuilder moduleBuilder = new StringBuilder();
        for( int i=0; i < level; i++) {
            moduleBuilder.append("\t");
        }
        moduleBuilder.append("|-");
        moduleBuilder.append("name: " + mavenProject.getGroupId());
        moduleBuilder.append(":" + mavenProject.getArtifactId());
        moduleBuilder.append("@" + mavenProject.getVersion());
        getLog().info(moduleBuilder.toString());
        if(mavenProject.hasParent()) {
            getModuleInfo(mavenProject.getParent(), level+1);
        }
    }
}
