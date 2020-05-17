package de.darmstadt.tu.crossing.statemachine.diagram.edit.parts;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.TreeSearch;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.GridLayer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemsAwareFreeFormLayer;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.PageBreaksFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.pagesetup.PageInfoHelper;
import org.eclipse.gmf.runtime.diagram.ui.layout.FreeFormLayoutEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import de.darmstadt.tu.crossing.statemachine.diagram.edit.policies.StatemachineCanonicalEditPolicy;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.policies.StatemachineItemSemanticEditPolicy;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineVisualIDRegistry;

/**
 * @generated
 */
public class OrderEditPart extends DiagramEditPart {
	
	View view;
	public static int childcount;
	protected IFigure f;
	
	//new
	//protected IFigure contentPane; // muss noch gesetzt werden, vllt da centern?
	private boolean shouldUpdatePageBreakLocation = false;

	

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Order"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;
	
	public OrderEditPart(View view) {
		super(view);
		this.view = view;
		childcount = this.getModelChildren().size();
		if(view.isVisible())
			System.out.println("huho");
		super.activate(); // nothing
		//call a layouting method?
		//view.setMutable(true); // macht es kaputt
		//view.getDiagram().createStyle(arg0);
		//create methods createFigure and refreshVisuals also here as it is done in StateEditPart?
	}
	
	//protected void 
	
	// maybe override methods createFigure, refreshVisuals, getContentPane, getModelChildren

	/**
	 * @generated
	 */
	//never called inside this project, maybe in the background, keine direkt sichtbare Auswirkung
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies(); //maybe this call handles the current layout, able to override below?
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StatemachineItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new StatemachineCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						StatemachineVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
		
		// add install for Layout edit policy
		//installEditPolicy(EditPolicy.LAYOUT_ROLE,
			//	new XYLayoutEditPolicy()); //was ich damit jetzt noch machen?? //from GMF
		//oder aus GMF Tutorial:
		//installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}
	

	protected IFigure createFigure1() {
		//super.createFigure();
		//return contentPane;
		return null;
	}
	
	//@Override // also works without
	protected IFigure createFigure() {

		// Override the containsPoint and findFigureAt methods
		// to treat this layer (Primary Layer) as if it were opaque.

		// This is for the grid layer so that it can be seen beneath the
		// figures.
		/*IFigure f = new BorderItemsAwareFreeFormLayer() {	
			/* (non-Javadoc)
			 * @see org.eclipse.draw2d.Layer#containsPoint(int, int)
			 */
			/*public boolean containsPoint(int x, int y) {
				return getBounds().contains(x, y);
			}*/

			/* (non-Javadoc)
			 * @see org.eclipse.draw2d.Layer#findFigureAt(int, int, org.eclipse.draw2d.TreeSearch)
			 */
			/*public IFigure findFigureAt(int x, int y, TreeSearch search) {
				if (!isEnabled())
					return null;
				if (!containsPoint(x, y))
					return null;
				if (search.prune(this))
					return null;
				IFigure child = findDescendantAtExcluding(x, y, search);
				if (child != null)
					return child;
				if (search.accept(this))
					return this;
				return null;
			}*/

			/* (non-Javadoc)
			 * @see org.eclipse.draw2d.Figure#validate()
			 */
			/*public void validate() {				
				super.validate();
				if (shouldUpdatePageBreakLocation){
					shouldUpdatePageBreakLocation = false;
					updatePageBreaksLocation();
				}
			}*/
		/*};*/
		IFigure f = new FreeformLayer(); // give it a layer which is able to set a Layoutmanager
		//IFigure f = new GridLayer();
		//Figure f = new Figure();//Figure does not work, no states drawn
		//FreeFormLayoutEx fl = new FreeFormLayoutEx();
		FreeformLayout fl = new FreeformLayout(); // a layer that can extend in all 4 directions
		GridLayout gl = new GridLayout(); //fails at drawing, cannot be set
		XYLayout xl = new XYLayout();
		//gl.numColumns =1;
		//gl.marginWidth =8;
		f.setLayoutManager(fl);
		
		//f.setLayoutManager(new FreeFormLayoutEx());
		//f.setLayoutManager(gl);
		System.out.println("---" + fl.getOrigin(f));
		fl.getOrigin(f).setLocation(100, 100);
		fl.getOrigin(f).setX(110);
		fl.getOrigin(f).setY(110);
		System.out.println("---" + fl.getOrigin(f));
		System.out.println("yiiyiy"); //wird einmal zu Beginn gecallt
		if(!fl.isPositiveCoordinates())
			fl.setPositiveCoordinates(true);
	
		//f.addLayoutListener(LayoutAnimator.getDefault()); //works without at first sight
		//f.addLayoutListener(arg0);
		//f.addLayoutListener(new PageBreaksLayoutListener()); // for updating the page, private class in DiagramEditPart; works without at first sight
		
		//f.add((IFigure) new Rectangle(10, 10, 200, 10));//leads to failing drawing
		
		return f;
	}
	
	
	//new
/*	@Override
	public IFigure getContentPane() {
		//this if I need to configure layout using a contentPane
		/*if (contentPane != null) {
			System.out.println("contentPane");
			return contentPane;
		}
		System.out.println("contentPane null");
		return super.getContentPane();*/
	/*	System.out.println("getFigure as contentPane");
		return getFigure();
	}
	
	//new
	public IFigure getFigure() {
		if (figure == null) { //woher Wissen, was figure ist? Keine globale Variable
			System.out.println("figure will be created now");
			setFigure(createFigure()); //in abstrakter Klasse definiert, was genau macht sie?
		}
		//System.out.println("figure is already existent, so upper class default figure will be the contentPane");
		return figure; //which figure is returned?
	}*/

	// maybe this can be used to avoid overlaps
	/**
	 * Returns the bounds of the <code>PRINTABLE_LAYERS</code>
	 * @return rectangle bounds of the diagram's children
	 */
	/*public Rectangle getChildrenBounds() {
		return PageInfoHelper.getChildrenBounds(this, PageBreaksFigure.class);
	}*/

}
