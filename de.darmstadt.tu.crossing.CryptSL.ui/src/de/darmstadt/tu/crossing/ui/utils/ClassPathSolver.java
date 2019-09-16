package de.darmstadt.tu.crossing.ui.utils;

import java.util.Collection;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import com.google.common.collect.Sets;
public class ClassPathSolver {
	public static Collection<String> getClasspath(final IJavaProject javaProject) {
		Collection<String> libraryClassPath = libraryClassPath(javaProject);
		return libraryClassPath;
	}
	private static Collection<String> libraryClassPath(IJavaProject project) {
		Collection<String> libraryClassPath = Sets.newHashSet();
		IClasspathEntry[] rentries;
		try {
			rentries = project.getRawClasspath();
			for (IClasspathEntry entry : rentries) {
				resolveClassPathEntry(entry, libraryClassPath, project);
			}

		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		return libraryClassPath;
	}

	private static void resolveClassPathEntry(IClasspathEntry entry, Collection<String> libraryClassPath, IJavaProject project) {
		IClasspathEntry[] rentries;
		switch (entry.getEntryKind()) {
		case IClasspathEntry.CPE_SOURCE:
			//libraryClassPath.addAll(applicationClassPath(project));
			break;
		case IClasspathEntry.CPE_PROJECT:
            IJavaProject requiredProject = JavaCore.create((IProject) ResourcesPlugin.getWorkspace().getRoot().findMember(entry.getPath()));
			try {
				rentries = project.getRawClasspath();
				for (IClasspathEntry e : rentries) {
					resolveClassPathEntry(e, libraryClassPath, requiredProject);
				}
			} catch (JavaModelException e1) {
				e1.printStackTrace();
			}
			break;
		case IClasspathEntry.CPE_LIBRARY:
			IPath path = entry.getPath();
			if(path.toString().contains(".m2/repository")) {
				libraryClassPath.add(path.toString());
			}
			break;
		case IClasspathEntry.CPE_VARIABLE:
			// JRE entry
			break;
		case IClasspathEntry.CPE_CONTAINER:
			try {
				IClasspathContainer container = JavaCore.getClasspathContainer(
				          entry.getPath(), project);
				IClasspathEntry[] subEntries = container.getClasspathEntries();
				for(IClasspathEntry subEntry : subEntries) {
					resolveClassPathEntry(subEntry, libraryClassPath, project);
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
			break;
		}
	}
}