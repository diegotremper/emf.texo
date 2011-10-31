/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableOneToOneImpl.java,v 1.6 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType;
import org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Variable One To One</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getDiscriminatorClass <em>Discriminator Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getPrivateOwned <em>Private Owned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#isOrphanRemoval <em>Orphan Removal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl#getTargetInterface <em>Target Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableOneToOneImpl extends BaseOrmAnnotationImpl implements VariableOneToOne {
  /**
   * The cached value of the '{@link #getCascade() <em>Cascade</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCascade()
   * @generated
   * @ordered
   */
  protected CascadeType cascade;

  /**
   * The cached value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDiscriminatorColumn()
   * @generated
   * @ordered
   */
  protected DiscriminatorColumn discriminatorColumn;

  /**
   * The cached value of the '{@link #getDiscriminatorClass() <em>Discriminator Class</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDiscriminatorClass()
   * @generated
   * @ordered
   */
  protected EList<DiscriminatorClass> discriminatorClass;

  /**
   * The cached value of the '{@link #getJoinColumn() <em>Join Column</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<JoinColumn> joinColumn;

  /**
   * The cached value of the '{@link #getPrivateOwned() <em>Private Owned</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPrivateOwned()
   * @generated
   * @ordered
   */
  protected EmptyType privateOwned;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
  protected AccessMethods accessMethods;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType ACCESS_EDEFAULT = AccessType.FIELD;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean accessESet;

  /**
   * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected static final FetchType FETCH_EDEFAULT = FetchType.LAZY;

  /**
   * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected FetchType fetch = FETCH_EDEFAULT;

  /**
   * This is true if the Fetch attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean fetchESet;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * This is true if the Optional attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean optionalESet;

  /**
   * The default value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOrphanRemoval()
   * @generated
   * @ordered
   */
  protected static final boolean ORPHAN_REMOVAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOrphanRemoval()
   * @generated
   * @ordered
   */
  protected boolean orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;

  /**
   * This is true if the Orphan Removal attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean orphanRemovalESet;

  /**
   * The default value of the '{@link #getTargetInterface() <em>Target Interface</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getTargetInterface()
   * @generated
   * @ordered
   */
  protected static final String TARGET_INTERFACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetInterface() <em>Target Interface</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getTargetInterface()
   * @generated
   * @ordered
   */
  protected String targetInterface = TARGET_INTERFACE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected VariableOneToOneImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getVariableOneToOne();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CascadeType getCascade() {
    return cascade;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCascade(CascadeType newCascade, NotificationChain msgs) {
    CascadeType oldCascade = cascade;
    cascade = newCascade;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE, oldCascade, newCascade);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCascade(CascadeType newCascade) {
    if (newCascade != cascade) {
      NotificationChain msgs = null;
      if (cascade != null)
        msgs = ((InternalEObject)cascade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE, null, msgs);
      if (newCascade != null)
        msgs = ((InternalEObject)newCascade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE, null, msgs);
      msgs = basicSetCascade(newCascade, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE, newCascade, newCascade));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorColumn getDiscriminatorColumn() {
    return discriminatorColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn,
      NotificationChain msgs) {
    DiscriminatorColumn oldDiscriminatorColumn = discriminatorColumn;
    discriminatorColumn = newDiscriminatorColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN, oldDiscriminatorColumn, newDiscriminatorColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn) {
    if (newDiscriminatorColumn != discriminatorColumn) {
      NotificationChain msgs = null;
      if (discriminatorColumn != null)
        msgs = ((InternalEObject)discriminatorColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN, null, msgs);
      if (newDiscriminatorColumn != null)
        msgs = ((InternalEObject)newDiscriminatorColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN, null, msgs);
      msgs = basicSetDiscriminatorColumn(newDiscriminatorColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN, newDiscriminatorColumn, newDiscriminatorColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<DiscriminatorClass> getDiscriminatorClass() {
    if (discriminatorClass == null) {
      discriminatorClass = new EObjectContainmentEList<DiscriminatorClass>(DiscriminatorClass.class, this, OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS);
    }
    return discriminatorClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinColumn> getJoinColumn() {
    if (joinColumn == null) {
      joinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmPackage.VARIABLE_ONE_TO_ONE__JOIN_COLUMN);
    }
    return joinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmptyType getPrivateOwned() {
    return privateOwned;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrivateOwned(EmptyType newPrivateOwned, NotificationChain msgs) {
    EmptyType oldPrivateOwned = privateOwned;
    privateOwned = newPrivateOwned;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED, oldPrivateOwned, newPrivateOwned);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPrivateOwned(EmptyType newPrivateOwned) {
    if (newPrivateOwned != privateOwned) {
      NotificationChain msgs = null;
      if (privateOwned != null)
        msgs = ((InternalEObject)privateOwned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED, null, msgs);
      if (newPrivateOwned != null)
        msgs = ((InternalEObject)newPrivateOwned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED, null, msgs);
      msgs = basicSetPrivateOwned(newPrivateOwned, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED, newPrivateOwned, newPrivateOwned));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.VARIABLE_ONE_TO_ONE__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessMethods getAccessMethods() {
    return accessMethods;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
    AccessMethods oldAccessMethods = accessMethods;
    accessMethods = newAccessMethods;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccessMethods(AccessMethods newAccessMethods) {
    if (newAccessMethods != accessMethods) {
      NotificationChain msgs = null;
      if (accessMethods != null)
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessType newAccess) {
    AccessType oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS, oldAccess, access, !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAccess() {
    AccessType oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchType getFetch() {
    return fetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFetch(FetchType newFetch) {
    FetchType oldFetch = fetch;
    fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
    boolean oldFetchESet = fetchESet;
    fetchESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__FETCH, oldFetch, fetch, !oldFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetFetch() {
    FetchType oldFetch = fetch;
    boolean oldFetchESet = fetchESet;
    fetch = FETCH_EDEFAULT;
    fetchESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.VARIABLE_ONE_TO_ONE__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFetch() {
    return fetchESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional() {
    return optional;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional) {
    boolean oldOptional = optional;
    optional = newOptional;
    boolean oldOptionalESet = optionalESet;
    optionalESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__OPTIONAL, oldOptional, optional, !oldOptionalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOptional() {
    boolean oldOptional = optional;
    boolean oldOptionalESet = optionalESet;
    optional = OPTIONAL_EDEFAULT;
    optionalESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.VARIABLE_ONE_TO_ONE__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOptional() {
    return optionalESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOrphanRemoval() {
    return orphanRemoval;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOrphanRemoval(boolean newOrphanRemoval) {
    boolean oldOrphanRemoval = orphanRemoval;
    orphanRemoval = newOrphanRemoval;
    boolean oldOrphanRemovalESet = orphanRemovalESet;
    orphanRemovalESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL, oldOrphanRemoval, orphanRemoval, !oldOrphanRemovalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOrphanRemoval() {
    boolean oldOrphanRemoval = orphanRemoval;
    boolean oldOrphanRemovalESet = orphanRemovalESet;
    orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;
    orphanRemovalESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL, oldOrphanRemoval, ORPHAN_REMOVAL_EDEFAULT, oldOrphanRemovalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOrphanRemoval() {
    return orphanRemovalESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getTargetInterface() {
    return targetInterface;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTargetInterface(String newTargetInterface) {
    String oldTargetInterface = targetInterface;
    targetInterface = newTargetInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VARIABLE_ONE_TO_ONE__TARGET_INTERFACE, oldTargetInterface, targetInterface));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE:
        return basicSetCascade(null, msgs);
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN:
        return basicSetDiscriminatorColumn(null, msgs);
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS:
        return ((InternalEList<?>)getDiscriminatorClass()).basicRemove(otherEnd, msgs);
      case OrmPackage.VARIABLE_ONE_TO_ONE__JOIN_COLUMN:
        return ((InternalEList<?>)getJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED:
        return basicSetPrivateOwned(null, msgs);
      case OrmPackage.VARIABLE_ONE_TO_ONE__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE:
        return getCascade();
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN:
        return getDiscriminatorColumn();
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS:
        return getDiscriminatorClass();
      case OrmPackage.VARIABLE_ONE_TO_ONE__JOIN_COLUMN:
        return getJoinColumn();
      case OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED:
        return getPrivateOwned();
      case OrmPackage.VARIABLE_ONE_TO_ONE__PROPERTY:
        return getProperty();
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS:
        return getAccess();
      case OrmPackage.VARIABLE_ONE_TO_ONE__FETCH:
        return getFetch();
      case OrmPackage.VARIABLE_ONE_TO_ONE__NAME:
        return getName();
      case OrmPackage.VARIABLE_ONE_TO_ONE__OPTIONAL:
        return isOptional();
      case OrmPackage.VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL:
        return isOrphanRemoval();
      case OrmPackage.VARIABLE_ONE_TO_ONE__TARGET_INTERFACE:
        return getTargetInterface();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE:
        setCascade((CascadeType)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN:
        setDiscriminatorColumn((DiscriminatorColumn)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS:
        getDiscriminatorClass().clear();
        getDiscriminatorClass().addAll((Collection<? extends DiscriminatorClass>)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__JOIN_COLUMN:
        getJoinColumn().clear();
        getJoinColumn().addAll((Collection<? extends JoinColumn>)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED:
        setPrivateOwned((EmptyType)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__FETCH:
        setFetch((FetchType)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL:
        setOrphanRemoval((Boolean)newValue);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__TARGET_INTERFACE:
        setTargetInterface((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE:
        setCascade((CascadeType)null);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN:
        setDiscriminatorColumn((DiscriminatorColumn)null);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS:
        getDiscriminatorClass().clear();
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__JOIN_COLUMN:
        getJoinColumn().clear();
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED:
        setPrivateOwned((EmptyType)null);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__FETCH:
        unsetFetch();
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__OPTIONAL:
        unsetOptional();
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL:
        unsetOrphanRemoval();
        return;
      case OrmPackage.VARIABLE_ONE_TO_ONE__TARGET_INTERFACE:
        setTargetInterface(TARGET_INTERFACE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE:
        return cascade != null;
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN:
        return discriminatorColumn != null;
      case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS:
        return discriminatorClass != null && !discriminatorClass.isEmpty();
      case OrmPackage.VARIABLE_ONE_TO_ONE__JOIN_COLUMN:
        return joinColumn != null && !joinColumn.isEmpty();
      case OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED:
        return privateOwned != null;
      case OrmPackage.VARIABLE_ONE_TO_ONE__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS:
        return isSetAccess();
      case OrmPackage.VARIABLE_ONE_TO_ONE__FETCH:
        return isSetFetch();
      case OrmPackage.VARIABLE_ONE_TO_ONE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.VARIABLE_ONE_TO_ONE__OPTIONAL:
        return isSetOptional();
      case OrmPackage.VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL:
        return isSetOrphanRemoval();
      case OrmPackage.VARIABLE_ONE_TO_ONE__TARGET_INTERFACE:
        return TARGET_INTERFACE_EDEFAULT == null ? targetInterface != null : !TARGET_INTERFACE_EDEFAULT.equals(targetInterface);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (access: ");
    if (accessESet) result.append(access); else result.append("<unset>");
    result.append(", fetch: ");
    if (fetchESet) result.append(fetch); else result.append("<unset>");
    result.append(", name: ");
    result.append(name);
    result.append(", optional: ");
    if (optionalESet) result.append(optional); else result.append("<unset>");
    result.append(", orphanRemoval: ");
    if (orphanRemovalESet) result.append(orphanRemoval); else result.append("<unset>");
    result.append(", targetInterface: ");
    result.append(targetInterface);
    result.append(')');
    return result.toString();
  }

} // VariableOneToOneImpl
