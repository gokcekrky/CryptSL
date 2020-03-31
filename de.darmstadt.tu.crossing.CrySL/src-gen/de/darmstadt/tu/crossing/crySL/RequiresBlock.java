/**
 * generated by Xtext 2.21.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.RequiresBlock#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getRequiresBlock()
 * @model
 * @generated
 */
public interface RequiresBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.crySL.ReqPred}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getRequiresBlock_Pred()
   * @model containment="true"
   * @generated
   */
  EList<ReqPred> getPred();

} // RequiresBlock
