package de.darmstadt.tu.crossing.statemachine.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.darmstadt.tu.crossing.crySL.util.CrySLAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support
 * Viewers. The adapters generated by this factory convert EMF adapter
 * notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The
 * adapters also support Eclipse property sheets. Note that most of the adapters
 * are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class StatemachineItemProviderAdapterFactory extends CrySLAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter
	 * factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement
	 * {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by
	 * {@link #isFactoryForType isFactoryForType}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatemachineItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	@Override
	public boolean isFactoryForType(Object type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object adapt(Object object, Object type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adapter adapt(Notifier target, Object type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaptAllNew(Notifier notifier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fireNotifyChanged(Notification notification) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		// TODO Auto-generated method stub

	}

}