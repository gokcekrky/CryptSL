/*
 * generated by Xtext 2.21.0
 */
package de.darmstadt.tu.crossing.ui.tests;

import com.google.inject.Injector;
import de.darmstadt.tu.crossing.CrySL.ui.internal.CrySLActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CrySLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CrySLActivator.getInstance().getInjector("de.darmstadt.tu.crossing.CrySL");
	}

}
