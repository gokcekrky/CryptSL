/**
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.Label;
import de.darmstadt.tu.crossing.cryptSL.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MethodImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MethodImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EList<Label> label;

  /**
   * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftSide()
   * @generated
   * @ordered
   */
  protected de.darmstadt.tu.crossing.cryptSL.Object leftSide;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<de.darmstadt.tu.crossing.cryptSL.Object> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CryptSLPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Label> getLabel()
  {
    if (label == null)
    {
      label = new EObjectContainmentEList<Label>(Label.class, this, CryptSLPackage.METHOD__LABEL);
    }
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.darmstadt.tu.crossing.cryptSL.Object getLeftSide()
  {
    if (leftSide != null && leftSide.eIsProxy())
    {
      InternalEObject oldLeftSide = (InternalEObject)leftSide;
      leftSide = (de.darmstadt.tu.crossing.cryptSL.Object)eResolveProxy(oldLeftSide);
      if (leftSide != oldLeftSide)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptSLPackage.METHOD__LEFT_SIDE, oldLeftSide, leftSide));
      }
    }
    return leftSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.darmstadt.tu.crossing.cryptSL.Object basicGetLeftSide()
  {
    return leftSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftSide(de.darmstadt.tu.crossing.cryptSL.Object newLeftSide)
  {
    de.darmstadt.tu.crossing.cryptSL.Object oldLeftSide = leftSide;
    leftSide = newLeftSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.METHOD__LEFT_SIDE, oldLeftSide, leftSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<de.darmstadt.tu.crossing.cryptSL.Object> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectResolvingEList<de.darmstadt.tu.crossing.cryptSL.Object>(de.darmstadt.tu.crossing.cryptSL.Object.class, this, CryptSLPackage.METHOD__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CryptSLPackage.METHOD__LABEL:
        return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CryptSLPackage.METHOD__LABEL:
        return getLabel();
      case CryptSLPackage.METHOD__LEFT_SIDE:
        if (resolve) return getLeftSide();
        return basicGetLeftSide();
      case CryptSLPackage.METHOD__PARAMETERS:
        return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CryptSLPackage.METHOD__LABEL:
        getLabel().clear();
        getLabel().addAll((Collection<? extends Label>)newValue);
        return;
      case CryptSLPackage.METHOD__LEFT_SIDE:
        setLeftSide((de.darmstadt.tu.crossing.cryptSL.Object)newValue);
        return;
      case CryptSLPackage.METHOD__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends de.darmstadt.tu.crossing.cryptSL.Object>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CryptSLPackage.METHOD__LABEL:
        getLabel().clear();
        return;
      case CryptSLPackage.METHOD__LEFT_SIDE:
        setLeftSide((de.darmstadt.tu.crossing.cryptSL.Object)null);
        return;
      case CryptSLPackage.METHOD__PARAMETERS:
        getParameters().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CryptSLPackage.METHOD__LABEL:
        return label != null && !label.isEmpty();
      case CryptSLPackage.METHOD__LEFT_SIDE:
        return leftSide != null;
      case CryptSLPackage.METHOD__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodImpl
