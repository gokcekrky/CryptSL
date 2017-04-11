/**
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.LabelMethodCall;
import de.darmstadt.tu.crossing.cryptSL.Method;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LabelMethodCallImpl#getMeth <em>Meth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelMethodCallImpl extends EventImpl implements LabelMethodCall
{
  /**
   * The cached value of the '{@link #getMeth() <em>Meth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeth()
   * @generated
   * @ordered
   */
  protected Method meth;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabelMethodCallImpl()
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
    return CryptSLPackage.Literals.LABEL_METHOD_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getMeth()
  {
    return meth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeth(Method newMeth, NotificationChain msgs)
  {
    Method oldMeth = meth;
    meth = newMeth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LABEL_METHOD_CALL__METH, oldMeth, newMeth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeth(Method newMeth)
  {
    if (newMeth != meth)
    {
      NotificationChain msgs = null;
      if (meth != null)
        msgs = ((InternalEObject)meth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LABEL_METHOD_CALL__METH, null, msgs);
      if (newMeth != null)
        msgs = ((InternalEObject)newMeth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LABEL_METHOD_CALL__METH, null, msgs);
      msgs = basicSetMeth(newMeth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LABEL_METHOD_CALL__METH, newMeth, newMeth));
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
      case CryptSLPackage.LABEL_METHOD_CALL__METH:
        return basicSetMeth(null, msgs);
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
      case CryptSLPackage.LABEL_METHOD_CALL__METH:
        return getMeth();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CryptSLPackage.LABEL_METHOD_CALL__METH:
        setMeth((Method)newValue);
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
      case CryptSLPackage.LABEL_METHOD_CALL__METH:
        setMeth((Method)null);
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
      case CryptSLPackage.LABEL_METHOD_CALL__METH:
        return meth != null;
    }
    return super.eIsSet(featureID);
  }

} //LabelMethodCallImpl