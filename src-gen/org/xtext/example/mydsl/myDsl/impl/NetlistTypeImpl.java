/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Layer;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NetlistType;
import org.xtext.example.mydsl.myDsl.Nodes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Netlist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetlistTypeImpl#getDocname <em>Docname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetlistTypeImpl#getDoctype <em>Doctype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetlistTypeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetlistTypeImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetlistTypeImpl extends MinimalEObjectImpl.Container implements NetlistType
{
  /**
   * The default value of the '{@link #getDocname() <em>Docname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocname()
   * @generated
   * @ordered
   */
  protected static final String DOCNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocname() <em>Docname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocname()
   * @generated
   * @ordered
   */
  protected String docname = DOCNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDoctype() <em>Doctype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoctype()
   * @generated
   * @ordered
   */
  protected static final String DOCTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoctype() <em>Doctype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoctype()
   * @generated
   * @ordered
   */
  protected String doctype = DOCTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayer()
   * @generated
   * @ordered
   */
  protected EList<Layer> layer;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected Nodes nodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetlistTypeImpl()
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
    return MyDslPackage.Literals.NETLIST_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDocname()
  {
    return docname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDocname(String newDocname)
  {
    String oldDocname = docname;
    docname = newDocname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETLIST_TYPE__DOCNAME, oldDocname, docname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDoctype()
  {
    return doctype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDoctype(String newDoctype)
  {
    String oldDoctype = doctype;
    doctype = newDoctype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETLIST_TYPE__DOCTYPE, oldDoctype, doctype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Layer> getLayer()
  {
    if (layer == null)
    {
      layer = new EObjectContainmentEList<Layer>(Layer.class, this, MyDslPackage.NETLIST_TYPE__LAYER);
    }
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nodes getNodes()
  {
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodes(Nodes newNodes, NotificationChain msgs)
  {
    Nodes oldNodes = nodes;
    nodes = newNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.NETLIST_TYPE__NODES, oldNodes, newNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNodes(Nodes newNodes)
  {
    if (newNodes != nodes)
    {
      NotificationChain msgs = null;
      if (nodes != null)
        msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NETLIST_TYPE__NODES, null, msgs);
      if (newNodes != null)
        msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NETLIST_TYPE__NODES, null, msgs);
      msgs = basicSetNodes(newNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETLIST_TYPE__NODES, newNodes, newNodes));
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
      case MyDslPackage.NETLIST_TYPE__LAYER:
        return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
      case MyDslPackage.NETLIST_TYPE__NODES:
        return basicSetNodes(null, msgs);
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
      case MyDslPackage.NETLIST_TYPE__DOCNAME:
        return getDocname();
      case MyDslPackage.NETLIST_TYPE__DOCTYPE:
        return getDoctype();
      case MyDslPackage.NETLIST_TYPE__LAYER:
        return getLayer();
      case MyDslPackage.NETLIST_TYPE__NODES:
        return getNodes();
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
      case MyDslPackage.NETLIST_TYPE__DOCNAME:
        setDocname((String)newValue);
        return;
      case MyDslPackage.NETLIST_TYPE__DOCTYPE:
        setDoctype((String)newValue);
        return;
      case MyDslPackage.NETLIST_TYPE__LAYER:
        getLayer().clear();
        getLayer().addAll((Collection<? extends Layer>)newValue);
        return;
      case MyDslPackage.NETLIST_TYPE__NODES:
        setNodes((Nodes)newValue);
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
      case MyDslPackage.NETLIST_TYPE__DOCNAME:
        setDocname(DOCNAME_EDEFAULT);
        return;
      case MyDslPackage.NETLIST_TYPE__DOCTYPE:
        setDoctype(DOCTYPE_EDEFAULT);
        return;
      case MyDslPackage.NETLIST_TYPE__LAYER:
        getLayer().clear();
        return;
      case MyDslPackage.NETLIST_TYPE__NODES:
        setNodes((Nodes)null);
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
      case MyDslPackage.NETLIST_TYPE__DOCNAME:
        return DOCNAME_EDEFAULT == null ? docname != null : !DOCNAME_EDEFAULT.equals(docname);
      case MyDslPackage.NETLIST_TYPE__DOCTYPE:
        return DOCTYPE_EDEFAULT == null ? doctype != null : !DOCTYPE_EDEFAULT.equals(doctype);
      case MyDslPackage.NETLIST_TYPE__LAYER:
        return layer != null && !layer.isEmpty();
      case MyDslPackage.NETLIST_TYPE__NODES:
        return nodes != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (docname: ");
    result.append(docname);
    result.append(", doctype: ");
    result.append(doctype);
    result.append(')');
    return result.toString();
  }

} //NetlistTypeImpl