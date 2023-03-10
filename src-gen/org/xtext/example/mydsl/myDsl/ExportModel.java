/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExportModel#getExport <em>Export</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExportModel()
 * @model
 * @generated
 */
public interface ExportModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Export</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export</em>' containment reference.
   * @see #setExport(NetlistType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExportModel_Export()
   * @model containment="true"
   * @generated
   */
  NetlistType getExport();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExportModel#getExport <em>Export</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Export</em>' containment reference.
   * @see #getExport()
   * @generated
   */
  void setExport(NetlistType value);

} // ExportModel
