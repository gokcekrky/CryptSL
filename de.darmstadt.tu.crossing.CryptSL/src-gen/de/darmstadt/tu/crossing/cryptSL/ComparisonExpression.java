/**
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.cryptSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ComparisonExpression#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getComparisonExpression()
 * @model
 * @generated
 */
public interface ComparisonExpression extends Constraint
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Constraint)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getComparisonExpression_Left()
   * @model containment="true"
   * @generated
   */
  Constraint getLeft();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.ComparisonExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Constraint value);

} // ComparisonExpression