/**
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.Event;
import de.darmstadt.tu.crossing.cryptSL.Label;
import de.darmstadt.tu.crossing.cryptSL.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.EventImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.EventImpl#getAgg <em>Agg</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.EventImpl#getLab <em>Lab</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<Method> method;

  /**
   * The cached value of the '{@link #getAgg() <em>Agg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgg()
   * @generated
   * @ordered
   */
  protected EList<Label> agg;

  /**
   * The cached value of the '{@link #getLab() <em>Lab</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLab()
   * @generated
   * @ordered
   */
  protected EList<Label> lab;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return CryptSLPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethod()
  {
    if (method == null)
    {
      method = new EObjectContainmentEList<Method>(Method.class, this, CryptSLPackage.EVENT__METHOD);
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Label> getAgg()
  {
    if (agg == null)
    {
      agg = new EObjectContainmentEList<Label>(Label.class, this, CryptSLPackage.EVENT__AGG);
    }
    return agg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Label> getLab()
  {
    if (lab == null)
    {
      lab = new EObjectResolvingEList<Label>(Label.class, this, CryptSLPackage.EVENT__LAB);
    }
    return lab;
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
      case CryptSLPackage.EVENT__METHOD:
        return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
      case CryptSLPackage.EVENT__AGG:
        return ((InternalEList<?>)getAgg()).basicRemove(otherEnd, msgs);
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
      case CryptSLPackage.EVENT__METHOD:
        return getMethod();
      case CryptSLPackage.EVENT__AGG:
        return getAgg();
      case CryptSLPackage.EVENT__LAB:
        return getLab();
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
      case CryptSLPackage.EVENT__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends Method>)newValue);
        return;
      case CryptSLPackage.EVENT__AGG:
        getAgg().clear();
        getAgg().addAll((Collection<? extends Label>)newValue);
        return;
      case CryptSLPackage.EVENT__LAB:
        getLab().clear();
        getLab().addAll((Collection<? extends Label>)newValue);
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
      case CryptSLPackage.EVENT__METHOD:
        getMethod().clear();
        return;
      case CryptSLPackage.EVENT__AGG:
        getAgg().clear();
        return;
      case CryptSLPackage.EVENT__LAB:
        getLab().clear();
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
      case CryptSLPackage.EVENT__METHOD:
        return method != null && !method.isEmpty();
      case CryptSLPackage.EVENT__AGG:
        return agg != null && !agg.isEmpty();
      case CryptSLPackage.EVENT__LAB:
        return lab != null && !lab.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EventImpl
