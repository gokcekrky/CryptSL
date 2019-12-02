/**
 * generated by Xtext 2.16.0
 */
package de.darmstadt.tu.crossing.crySL.impl;

import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.RequiredBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.impl.RequiredBlockImpl#getReq_event <em>Req event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredBlockImpl extends MinimalEObjectImpl.Container implements RequiredBlock
{
  /**
   * The cached value of the '{@link #getReq_event() <em>Req event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq_event()
   * @generated
   * @ordered
   */
  protected EList<Event> req_event;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiredBlockImpl()
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
    return CrySLPackage.Literals.REQUIRED_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getReq_event()
  {
    if (req_event == null)
    {
      req_event = new EObjectContainmentEList<Event>(Event.class, this, CrySLPackage.REQUIRED_BLOCK__REQ_EVENT);
    }
    return req_event;
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
      case CrySLPackage.REQUIRED_BLOCK__REQ_EVENT:
        return ((InternalEList<?>)getReq_event()).basicRemove(otherEnd, msgs);
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
      case CrySLPackage.REQUIRED_BLOCK__REQ_EVENT:
        return getReq_event();
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
      case CrySLPackage.REQUIRED_BLOCK__REQ_EVENT:
        getReq_event().clear();
        getReq_event().addAll((Collection<? extends Event>)newValue);
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
      case CrySLPackage.REQUIRED_BLOCK__REQ_EVENT:
        getReq_event().clear();
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
      case CrySLPackage.REQUIRED_BLOCK__REQ_EVENT:
        return req_event != null && !req_event.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RequiredBlockImpl