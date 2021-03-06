package de.darmstadt.tu.crossing.statemachine.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;

import de.darmstadt.tu.crossing.statemachine.diagram.edit.policies.StateItemSemanticEditPolicy;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineVisualIDRegistry;

/**
 * @generated
 */
public class StateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;
	public static int nodeIndex = 0;
	public static int siblingCount;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public StateEditPart(View view, int siblingCount) {
		super(view);
		this.siblingCount = siblingCount;
		System.out.println("huhs");
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StateItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let
		// children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new StateFigure();

	}

	/**
	 * @generated
	 */
	public StateFigure getPrimaryShape() {
		return (StateFigure) primaryShape;
	}

	/**
	 * @param index
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart, int index) {
		if (childEditPart instanceof StateNameEditPart) {
			/*
			 * issue with numerating state labels - Needs to be fixed
			 */
			int nodeLabel;
			if (this.siblingCount > 0) {
				nodeLabel = (this.nodeIndex - 1) % (siblingCount);
			} else {
				nodeLabel = this.nodeIndex;
			}
			this.nodeIndex = this.nodeIndex + 1;

			((StateNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureStateNameFigure(), nodeLabel);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StateNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {

		if (addFixedChild(childEditPart, index)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		//this works
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so you
	 * may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	// this method is called for each state node
	// probably not called directly, at least createFigure called by GEF in the process of building the view when it is needed
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		//figure.setLayoutManager(new ConstrainedToolbarLayout());//no difference
		System.out.println("How often is that called?");
		//figure.setLayoutManager(new FlowLayout());
		//figure.setLayoutManager(new FillLayout()); //Figure hat nur ne Methode setLayoutManager
		//figure.setLayoutManager(new FreeformLayout()); //states gone, transitions still overlapping
		//figure.setLayoutManager(new GridLayout(1, true));
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects layout
	 * one may have set for generated figure.
	 * 
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			//FreeformLayout layout = new FreeformLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
			//new, not called once, ah maybe because layoutmanager is not null!
			System.out.println("LayoutManager counter");
		}
		//new, yip, so why is that? so LayoutManager is StackLayout
		// which one is better Stack or ConstrainedToolbarLayout? not seeing a difference
		//the layout manager is flow layout
		System.out.println("LayoutManager counter 2 " + nodeShape.getLayoutManager());
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(StatemachineVisualIDRegistry.getType(StateNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class StateFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStateNameFigure;

		/**
		 * @generated
		 */
		public StateFigure() {

			FlowLayout layoutThis = new FlowLayout();//default centered alignment
			layoutThis.setStretchMinorAxis(false);
			//layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);
			//layoutThis.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);

			//layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			//layoutThis.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
			//both spacings modified no change nor set horizontal
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			//modifiable, but with 400 looks terrible, but positioning same, 2-2-1-1, why?
			//size gilt nur f�r individuellen Node, nicht �u�eres! 
			//this.setPreferredSize(new Dimension(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40)));
			//this.setPreferredSize(200, 200);
			createContents();
			
			//new, f�r jeden State gecalled
			System.out.println("StateFigure constructor called");
			//null, so icon in WrappingLabel is not the small rectangle
			//WrappingLable only refers to label, so rectangle separate from that
			System.out.println(this.getFigureStateNameFigure().getIcon());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureStateNameFigure = new WrappingLabel();

			fFigureStateNameFigure.setText("<...>");

			fFigureStateNameFigure.setFont(FFIGURESTATENAMEFIGURE_FONT);

			this.add(fFigureStateNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStateNameFigure() {
			return fFigureStateNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	//static final Color THIS_BACK = new Color(null, 240, 240, 240);
	static final Color THIS_BACK = new Color(null, 135, 206, 250);

	/**
	 * @generated
	 */
	static final Font FFIGURESTATENAMEFIGURE_FONT = new Font(Display.getCurrent(), "Arial", 12, SWT.NORMAL);

}
