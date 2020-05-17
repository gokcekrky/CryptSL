package de.darmstadt.tu.crossing.statemachine.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.darmstadt.tu.crossing.crySL.Domainmodel;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.OrderEditPart;

/**
 * @generated
 */
public class StatemachineInitDiagramFileAction implements IObjectActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchPart targetPart;
	
	/*private Display display;
	private Shell shell = this.getShell(display);
	private GridLayout gridLayout = new GridLayout();
	Composite parent2;
	final ScrolledComposite sc = new ScrolledComposite(parent2, SWT.H_SCROLL);
	final Composite parent = new Composite(sc, SWT.NONE);


	/**
	 * @generated
	 */
	private URI domainModelURI;

	/**
	 * @generated
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		domainModelURI = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false || selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection).getFirstElement();
		domainModelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		action.setEnabled(true);
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	/**
	 * @generated
	 */
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject crySLRoot = null;
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			crySLRoot = (EObject) resource.getContents().get(0);
			final Domainmodel dm = (Domainmodel) crySLRoot;
			diagramRoot = dm.getOrder();
		} catch (WrappedException ex) {
			StatemachineDiagramEditorPlugin.getInstance().logError("Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(), Messages.InitDiagramFile_ResourceErrorDialogTitle,
					Messages.InitDiagramFile_ResourceErrorDialogMessage);
			//new
			//MessageDialog.openError(shell, Messages.InitDiagramFile_ResourceErrorDialogTitle,
				//	Messages.InitDiagramFile_ResourceErrorDialogMessage);

			return;
		}
		
		/*//try out init layout
		//this.getShell().setLayout(new Layout());
		shell.setFullScreen(true);
//		shell.setLayout(new FillLayout());
		parent.setLayout(gridLayout);
		parent.setLayoutData(new FreeformLayout());
		gridColumns = 1;
		System.out.println("run method in StatemachineInitDiagramFileAction");*/
		
		Wizard wizard = new StatemachineNewDiagramFileWizard(domainModelURI, diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle, OrderEditPart.MODEL_ID));
		StatemachineDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
		//new
		//StatemachineDiagramEditorUtil.runWizard(shell, wizard, "InitDiagramFile"); //$NON-NLS-1$
	}
}
