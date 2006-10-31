package org.objectstyle.woproject.maven2.resources;

//org.apache.maven.plugins:maven-compiler-plugin:compile
import java.io.File;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

/**
 * resources goal for WebObjects projects.
 * 
 * @goal define-woframework-resources
 * @author uli
 * @since 2.0
 */
public class DefineWOFrameworkResourcesMojo extends DefineResourcesMojo {

	/**
	 * The maven project.
	 * 
	 * @parameter expression="${project}"
	 * @required
	 * @readonly
	 */
	private MavenProject project;

	public DefineWOFrameworkResourcesMojo() throws MojoExecutionException {
		super();
	}

	public void execute() throws MojoExecutionException, MojoFailureException {
		super.execute();
	}

	public MavenProject getProject() {
		return project;
	}
	
	public String getProductExtension() {
		return "framework";
	}
}