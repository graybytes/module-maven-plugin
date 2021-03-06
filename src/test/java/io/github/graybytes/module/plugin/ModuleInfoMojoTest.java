package io.github.graybytes.module.plugin;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.junit.Test;

import java.io.File;

public class ModuleInfoMojoTest
    extends AbstractMojoTestCase {
    /**
     * {@inheritDoc}
     */
    protected void setUp()
        throws Exception {
        // required
        super.setUp();
    }

    /**
     * {@inheritDoc}
     */
    protected void tearDown()
        throws Exception {
        // required
        super.tearDown();
    }

    /**
     * @throws Exception if any
     */
    @Test
    public void testMojoInfoGoal()
        throws Exception {
        File testPom = new File("target/test-classes/unit/maven-module-plugin/plugin-config.xml");
        ModuleInfoMojo mojo = (ModuleInfoMojo) lookupEmptyMojo("info", testPom);
        assertNotNull(mojo);
    }
}
