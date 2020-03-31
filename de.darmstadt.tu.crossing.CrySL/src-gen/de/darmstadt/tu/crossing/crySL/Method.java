/**
 * generated by Xtext 2.21.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmExecutable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Method#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Method#getMethName <em>Meth Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Method#getParList <em>Par List</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Side</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Side</em>' reference.
   * @see #setLeftSide(de.darmstadt.tu.crossing.crySL.Object)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getMethod_LeftSide()
   * @model
   * @generated
   */
  de.darmstadt.tu.crossing.crySL.Object getLeftSide();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Method#getLeftSide <em>Left Side</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Side</em>' reference.
   * @see #getLeftSide()
   * @generated
   */
  void setLeftSide(de.darmstadt.tu.crossing.crySL.Object value);

  /**
   * Returns the value of the '<em><b>Meth Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meth Name</em>' reference.
   * @see #setMethName(JvmExecutable)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getMethod_MethName()
   * @model
   * @generated
   */
  JvmExecutable getMethName();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Method#getMethName <em>Meth Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meth Name</em>' reference.
   * @see #getMethName()
   * @generated
   */
  void setMethName(JvmExecutable value);

  /**
   * Returns the value of the '<em><b>Par List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par List</em>' containment reference.
   * @see #setParList(ParList)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getMethod_ParList()
   * @model containment="true"
   * @generated
   */
  ParList getParList();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Method#getParList <em>Par List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par List</em>' containment reference.
   * @see #getParList()
   * @generated
   */
  void setParList(ParList value);

} // Method
