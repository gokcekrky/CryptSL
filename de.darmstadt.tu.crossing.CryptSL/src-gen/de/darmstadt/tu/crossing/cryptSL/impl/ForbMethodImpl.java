/**
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.ForbMethod;
import de.darmstadt.tu.crossing.cryptSL.Label;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forb Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ForbMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ForbMethodImpl#getRep <em>Rep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForbMethodImpl extends MinimalEObjectImpl.Container implements ForbMethod
{
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
   * The cached value of the '{@link #getRep() <em>Rep</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRep()
   * @generated
   * @ordered
   */
  protected Label rep;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForbMethodImpl()
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
    return CryptSLPackage.Literals.FORB_METHOD;
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
      parameters = new EObjectResolvingEList<de.darmstadt.tu.crossing.cryptSL.Object>(de.darmstadt.tu.crossing.cryptSL.Object.class, this, CryptSLPackage.FORB_METHOD__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label getRep()
  {
    if (rep != null && rep.eIsProxy())
    {
      InternalEObject oldRep = (InternalEObject)rep;
      rep = (Label)eResolveProxy(oldRep);
      if (rep != oldRep)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptSLPackage.FORB_METHOD__REP, oldRep, rep));
      }
    }
    return rep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label basicGetRep()
  {
    return rep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRep(Label newRep)
  {
    Label oldRep = rep;
    rep = newRep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.FORB_METHOD__REP, oldRep, rep));
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
      case CryptSLPackage.FORB_METHOD__PARAMETERS:
        return getParameters();
      case CryptSLPackage.FORB_METHOD__REP:
        if (resolve) return getRep();
        return basicGetRep();
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
      case CryptSLPackage.FORB_METHOD__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends de.darmstadt.tu.crossing.cryptSL.Object>)newValue);
        return;
      case CryptSLPackage.FORB_METHOD__REP:
        setRep((Label)newValue);
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
      case CryptSLPackage.FORB_METHOD__PARAMETERS:
        getParameters().clear();
        return;
      case CryptSLPackage.FORB_METHOD__REP:
        setRep((Label)null);
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
      case CryptSLPackage.FORB_METHOD__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case CryptSLPackage.FORB_METHOD__REP:
        return rep != null;
    }
    return super.eIsSet(featureID);
  }

} //ForbMethodImpl
