package de.darmstadt.tu.crossing.statemachine.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineVisualIDRegistry;

/**
 * @generated
 */
public class OrderEditPartFactory implements EditPartFactory {
	/**
	 * @generated
	 */
	//this gets called, but by whom? recursively
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			//ist das ein Problem?
			View view = (View) model;
			switch (StatemachineVisualIDRegistry.getVisualID(view)) {

			//wenn hiervon eins nicht komiliert, dann keine Visualisierung möglich
			case OrderEditPart.VISUAL_ID:
				OrderEditPart orderEditPart = new OrderEditPart(view);
				return orderEditPart;

			case StateEditPart.VISUAL_ID:
				// heißt das, dass OrderEdtPart das Layout vorgibt als Parent?
				// also z.B. XY Layout in OrderEditPart probieren
				// da hier kein Layout, gilt das der Kinder nicht, sondern default?
				OrderEditPart parentEditPart = new OrderEditPart(view.getDiagram());
				return new StateEditPart(view, parentEditPart.childcount);

			case StateNameEditPart.VISUAL_ID:
				return new StateNameEditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case TransitionNameEditPart.VISUAL_ID:
				return new TransitionNameEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
