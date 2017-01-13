/**
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ObjectDecl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ObjectDecl#getObjectName <em>Object Name</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getObjectDecl()
 * @model
 * @generated
 */
public interface ObjectDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' reference.
   * @see #setObjectType(JvmType)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getObjectDecl_ObjectType()
   * @model
   * @generated
   */
  JvmType getObjectType();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.ObjectDecl#getObjectType <em>Object Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' reference.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(JvmType value);

  /**
   * Returns the value of the '<em><b>Object Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Name</em>' containment reference.
   * @see #setObjectName(de.darmstadt.tu.crossing.cryptSL.Object)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getObjectDecl_ObjectName()
   * @model containment="true"
   * @generated
   */
  de.darmstadt.tu.crossing.cryptSL.Object getObjectName();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.ObjectDecl#getObjectName <em>Object Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Name</em>' containment reference.
   * @see #getObjectName()
   * @generated
   */
  void setObjectName(de.darmstadt.tu.crossing.cryptSL.Object value);

} // ObjectDecl
