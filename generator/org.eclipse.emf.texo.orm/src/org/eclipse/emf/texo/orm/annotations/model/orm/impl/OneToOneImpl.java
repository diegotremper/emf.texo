/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToOneImpl.java,v 1.9 2011/10/25 22:27:57 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>One To One</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getPrimaryKeyJoinColumn <em>Primary Key
 * Join Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getJoinColumn <em>Join Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getJoinTable <em>Join Table</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getCascade <em>Cascade</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getPrivateOwned <em>Private Owned</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getJoinFetch <em>Join Fetch</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getProperty <em>Property</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getAccessMethods <em>Access Methods</em>}
 * </li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getAccess <em>Access</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getFetch <em>Fetch</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#isId <em>Id</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getMappedBy <em>Mapped By</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getMapsId <em>Maps Id</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#isOptional <em>Optional</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#isOrphanRemoval <em>Orphan Removal</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OneToOneImpl extends BaseOrmAnnotationImpl implements OneToOne {
  /**
   * The cached value of the '{@link #getPrimaryKeyJoinColumn() <em>Primary Key Join Column</em>}' containment reference
   * list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPrimaryKeyJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<PrimaryKeyJoinColumn> primaryKeyJoinColumn;

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
   * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getJoinTable()
   * @generated
   * @ordered
   */
  protected JoinTable joinTable;

  /**
   * The cached value of the '{@link #getCascade() <em>Cascade</em>}' containment reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getCascade()
   * @generated
   * @ordered
   */
  protected CascadeType cascade;

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
   * The default value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getJoinFetch()
   * @generated
   * @ordered
   */
  protected static final JoinFetchType JOIN_FETCH_EDEFAULT = JoinFetchType.INNER;

  /**
   * The cached value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getJoinFetch()
   * @generated
   * @ordered
   */
  protected JoinFetchType joinFetch = JOIN_FETCH_EDEFAULT;

  /**
   * This is true if the Join Fetch attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean joinFetchESet;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
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
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
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
   * This is true if the Access attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
   * This is true if the Fetch attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean fetchESet;

  /**
   * The default value of the '{@link #isId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isId()
   * @generated
   * @ordered
   */
  protected static final boolean ID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isId()
   * @generated
   * @ordered
   */
  protected boolean id = ID_EDEFAULT;

  /**
   * This is true if the Id attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean idESet;

  /**
   * The default value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected static final String MAPPED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected String mappedBy = MAPPED_BY_EDEFAULT;

  /**
   * The default value of the '{@link #getMapsId() <em>Maps Id</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getMapsId()
   * @generated
   * @ordered
   */
  protected static final String MAPS_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapsId() <em>Maps Id</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getMapsId()
   * @generated
   * @ordered
   */
  protected String mapsId = MAPS_ID_EDEFAULT;

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
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * This is true if the Optional attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean optionalESet;

  /**
   * The default value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #isOrphanRemoval()
   * @generated
   * @ordered
   */
  protected static final boolean ORPHAN_REMOVAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #isOrphanRemoval()
   * @generated
   * @ordered
   */
  protected boolean orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;

  /**
   * This is true if the Orphan Removal attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean orphanRemovalESet;

  /**
   * The default value of the '{@link #getTargetEntity() <em>Target Entity</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getTargetEntity()
   * @generated
   * @ordered
   */
  protected static final String TARGET_ENTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getTargetEntity()
   * @generated
   * @ordered
   */
  protected String targetEntity = TARGET_ENTITY_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected OneToOneImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getOneToOne();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn() {
    if (primaryKeyJoinColumn == null) {
      primaryKeyJoinColumn = new EObjectContainmentEList<PrimaryKeyJoinColumn>(PrimaryKeyJoinColumn.class, this,
          OrmPackage.ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN);
    }
    return primaryKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<JoinColumn> getJoinColumn() {
    if (joinColumn == null) {
      joinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmPackage.ONE_TO_ONE__JOIN_COLUMN);
    }
    return joinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public JoinTable getJoinTable() {
    return joinTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetJoinTable(JoinTable newJoinTable, NotificationChain msgs) {
    JoinTable oldJoinTable = joinTable;
    joinTable = newJoinTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__JOIN_TABLE,
          oldJoinTable, newJoinTable);
      if (msgs == null) {
        msgs = notification;
      } else {
        msgs.add(notification);
      }
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setJoinTable(JoinTable newJoinTable) {
    if (newJoinTable != joinTable) {
      NotificationChain msgs = null;
      if (joinTable != null) {
        msgs = ((InternalEObject) joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ONE_TO_ONE__JOIN_TABLE, null, msgs);
      }
      if (newJoinTable != null) {
        msgs = ((InternalEObject) newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ONE_TO_ONE__JOIN_TABLE, null, msgs);
      }
      msgs = basicSetJoinTable(newJoinTable, msgs);
      if (msgs != null) {
        msgs.dispatch();
      }
    } else if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__JOIN_TABLE, newJoinTable,
          newJoinTable));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CascadeType getCascade() {
    return cascade;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCascade(CascadeType newCascade, NotificationChain msgs) {
    CascadeType oldCascade = cascade;
    cascade = newCascade;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__CASCADE,
          oldCascade, newCascade);
      if (msgs == null) {
        msgs = notification;
      } else {
        msgs.add(notification);
      }
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCascade(CascadeType newCascade) {
    if (newCascade != cascade) {
      NotificationChain msgs = null;
      if (cascade != null) {
        msgs = ((InternalEObject) cascade).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_ONE__CASCADE, null, msgs);
      }
      if (newCascade != null) {
        msgs = ((InternalEObject) newCascade).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_ONE__CASCADE, null, msgs);
      }
      msgs = basicSetCascade(newCascade, msgs);
      if (msgs != null) {
        msgs.dispatch();
      }
    } else if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__CASCADE, newCascade, newCascade));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EmptyType getPrivateOwned() {
    return privateOwned;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPrivateOwned(EmptyType newPrivateOwned, NotificationChain msgs) {
    EmptyType oldPrivateOwned = privateOwned;
    privateOwned = newPrivateOwned;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ONE_TO_ONE__PRIVATE_OWNED, oldPrivateOwned, newPrivateOwned);
      if (msgs == null) {
        msgs = notification;
      } else {
        msgs.add(notification);
      }
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPrivateOwned(EmptyType newPrivateOwned) {
    if (newPrivateOwned != privateOwned) {
      NotificationChain msgs = null;
      if (privateOwned != null) {
        msgs = ((InternalEObject) privateOwned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ONE_TO_ONE__PRIVATE_OWNED, null, msgs);
      }
      if (newPrivateOwned != null) {
        msgs = ((InternalEObject) newPrivateOwned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ONE_TO_ONE__PRIVATE_OWNED, null, msgs);
      }
      msgs = basicSetPrivateOwned(newPrivateOwned, msgs);
      if (msgs != null) {
        msgs.dispatch();
      }
    } else if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__PRIVATE_OWNED, newPrivateOwned,
          newPrivateOwned));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public JoinFetchType getJoinFetch() {
    return joinFetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setJoinFetch(JoinFetchType newJoinFetch) {
    JoinFetchType oldJoinFetch = joinFetch;
    joinFetch = newJoinFetch == null ? JOIN_FETCH_EDEFAULT : newJoinFetch;
    boolean oldJoinFetchESet = joinFetchESet;
    joinFetchESet = true;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__JOIN_FETCH, oldJoinFetch, joinFetch,
          !oldJoinFetchESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetJoinFetch() {
    JoinFetchType oldJoinFetch = joinFetch;
    boolean oldJoinFetchESet = joinFetchESet;
    joinFetch = JOIN_FETCH_EDEFAULT;
    joinFetchESet = false;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_ONE__JOIN_FETCH, oldJoinFetch,
          JOIN_FETCH_EDEFAULT, oldJoinFetchESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetJoinFetch() {
    return joinFetchESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.ONE_TO_ONE__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public AccessMethods getAccessMethods() {
    return accessMethods;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
    AccessMethods oldAccessMethods = accessMethods;
    accessMethods = newAccessMethods;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ONE_TO_ONE__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
      if (msgs == null) {
        msgs = notification;
      } else {
        msgs.add(notification);
      }
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setAccessMethods(AccessMethods newAccessMethods) {
    if (newAccessMethods != accessMethods) {
      NotificationChain msgs = null;
      if (accessMethods != null) {
        msgs = ((InternalEObject) accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ONE_TO_ONE__ACCESS_METHODS, null, msgs);
      }
      if (newAccessMethods != null) {
        msgs = ((InternalEObject) newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ONE_TO_ONE__ACCESS_METHODS, null, msgs);
      }
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) {
        msgs.dispatch();
      }
    } else if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__ACCESS_METHODS, newAccessMethods,
          newAccessMethods));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public AccessType getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setAccess(AccessType newAccess) {
    AccessType oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__ACCESS, oldAccess, access,
          !oldAccessESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetAccess() {
    AccessType oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_ONE__ACCESS, oldAccess,
          ACCESS_EDEFAULT, oldAccessESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public FetchType getFetch() {
    return fetch;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setFetch(FetchType newFetch) {
    FetchType oldFetch = fetch;
    fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
    boolean oldFetchESet = fetchESet;
    fetchESet = true;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__FETCH, oldFetch, fetch,
          !oldFetchESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetFetch() {
    FetchType oldFetch = fetch;
    boolean oldFetchESet = fetchESet;
    fetch = FETCH_EDEFAULT;
    fetchESet = false;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_ONE__FETCH, oldFetch, FETCH_EDEFAULT,
          oldFetchESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetFetch() {
    return fetchESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isId() {
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setId(boolean newId) {
    boolean oldId = id;
    id = newId;
    boolean oldIdESet = idESet;
    idESet = true;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__ID, oldId, id, !oldIdESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetId() {
    boolean oldId = id;
    boolean oldIdESet = idESet;
    id = ID_EDEFAULT;
    idESet = false;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_ONE__ID, oldId, ID_EDEFAULT, oldIdESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetId() {
    return idESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getMappedBy() {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setMappedBy(String newMappedBy) {
    String oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__MAPPED_BY, oldMappedBy, mappedBy));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getMapsId() {
    return mapsId;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setMapsId(String newMapsId) {
    String oldMapsId = mapsId;
    mapsId = newMapsId;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__MAPS_ID, oldMapsId, mapsId));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__NAME, oldName, name));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isOptional() {
    return optional;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setOptional(boolean newOptional) {
    boolean oldOptional = optional;
    optional = newOptional;
    boolean oldOptionalESet = optionalESet;
    optionalESet = true;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__OPTIONAL, oldOptional, optional,
          !oldOptionalESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetOptional() {
    boolean oldOptional = optional;
    boolean oldOptionalESet = optionalESet;
    optional = OPTIONAL_EDEFAULT;
    optionalESet = false;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_ONE__OPTIONAL, oldOptional,
          OPTIONAL_EDEFAULT, oldOptionalESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetOptional() {
    return optionalESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isOrphanRemoval() {
    return orphanRemoval;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setOrphanRemoval(boolean newOrphanRemoval) {
    boolean oldOrphanRemoval = orphanRemoval;
    orphanRemoval = newOrphanRemoval;
    boolean oldOrphanRemovalESet = orphanRemovalESet;
    orphanRemovalESet = true;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__ORPHAN_REMOVAL, oldOrphanRemoval,
          orphanRemoval, !oldOrphanRemovalESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetOrphanRemoval() {
    boolean oldOrphanRemoval = orphanRemoval;
    boolean oldOrphanRemovalESet = orphanRemovalESet;
    orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;
    orphanRemovalESet = false;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_ONE__ORPHAN_REMOVAL, oldOrphanRemoval,
          ORPHAN_REMOVAL_EDEFAULT, oldOrphanRemovalESet));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetOrphanRemoval() {
    return orphanRemovalESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getTargetEntity() {
    return targetEntity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setTargetEntity(String newTargetEntity) {
    String oldTargetEntity = targetEntity;
    targetEntity = newTargetEntity;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_ONE__TARGET_ENTITY, oldTargetEntity,
          targetEntity));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case OrmPackage.ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN:
      return ((InternalEList<?>) getPrimaryKeyJoinColumn()).basicRemove(otherEnd, msgs);
    case OrmPackage.ONE_TO_ONE__JOIN_COLUMN:
      return ((InternalEList<?>) getJoinColumn()).basicRemove(otherEnd, msgs);
    case OrmPackage.ONE_TO_ONE__JOIN_TABLE:
      return basicSetJoinTable(null, msgs);
    case OrmPackage.ONE_TO_ONE__CASCADE:
      return basicSetCascade(null, msgs);
    case OrmPackage.ONE_TO_ONE__PRIVATE_OWNED:
      return basicSetPrivateOwned(null, msgs);
    case OrmPackage.ONE_TO_ONE__PROPERTY:
      return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
    case OrmPackage.ONE_TO_ONE__ACCESS_METHODS:
      return basicSetAccessMethods(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case OrmPackage.ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN:
      return getPrimaryKeyJoinColumn();
    case OrmPackage.ONE_TO_ONE__JOIN_COLUMN:
      return getJoinColumn();
    case OrmPackage.ONE_TO_ONE__JOIN_TABLE:
      return getJoinTable();
    case OrmPackage.ONE_TO_ONE__CASCADE:
      return getCascade();
    case OrmPackage.ONE_TO_ONE__PRIVATE_OWNED:
      return getPrivateOwned();
    case OrmPackage.ONE_TO_ONE__JOIN_FETCH:
      return getJoinFetch();
    case OrmPackage.ONE_TO_ONE__PROPERTY:
      return getProperty();
    case OrmPackage.ONE_TO_ONE__ACCESS_METHODS:
      return getAccessMethods();
    case OrmPackage.ONE_TO_ONE__ACCESS:
      return getAccess();
    case OrmPackage.ONE_TO_ONE__FETCH:
      return getFetch();
    case OrmPackage.ONE_TO_ONE__ID:
      return isId();
    case OrmPackage.ONE_TO_ONE__MAPPED_BY:
      return getMappedBy();
    case OrmPackage.ONE_TO_ONE__MAPS_ID:
      return getMapsId();
    case OrmPackage.ONE_TO_ONE__NAME:
      return getName();
    case OrmPackage.ONE_TO_ONE__OPTIONAL:
      return isOptional();
    case OrmPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
      return isOrphanRemoval();
    case OrmPackage.ONE_TO_ONE__TARGET_ENTITY:
      return getTargetEntity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case OrmPackage.ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN:
      getPrimaryKeyJoinColumn().clear();
      getPrimaryKeyJoinColumn().addAll((Collection<? extends PrimaryKeyJoinColumn>) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__JOIN_COLUMN:
      getJoinColumn().clear();
      getJoinColumn().addAll((Collection<? extends JoinColumn>) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__JOIN_TABLE:
      setJoinTable((JoinTable) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__CASCADE:
      setCascade((CascadeType) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__PRIVATE_OWNED:
      setPrivateOwned((EmptyType) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__JOIN_FETCH:
      setJoinFetch((JoinFetchType) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__PROPERTY:
      getProperty().clear();
      getProperty().addAll((Collection<? extends Property>) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__ACCESS_METHODS:
      setAccessMethods((AccessMethods) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__ACCESS:
      setAccess((AccessType) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__FETCH:
      setFetch((FetchType) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__ID:
      setId((Boolean) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__MAPPED_BY:
      setMappedBy((String) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__MAPS_ID:
      setMapsId((String) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__NAME:
      setName((String) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__OPTIONAL:
      setOptional((Boolean) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
      setOrphanRemoval((Boolean) newValue);
      return;
    case OrmPackage.ONE_TO_ONE__TARGET_ENTITY:
      setTargetEntity((String) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case OrmPackage.ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN:
      getPrimaryKeyJoinColumn().clear();
      return;
    case OrmPackage.ONE_TO_ONE__JOIN_COLUMN:
      getJoinColumn().clear();
      return;
    case OrmPackage.ONE_TO_ONE__JOIN_TABLE:
      setJoinTable((JoinTable) null);
      return;
    case OrmPackage.ONE_TO_ONE__CASCADE:
      setCascade((CascadeType) null);
      return;
    case OrmPackage.ONE_TO_ONE__PRIVATE_OWNED:
      setPrivateOwned((EmptyType) null);
      return;
    case OrmPackage.ONE_TO_ONE__JOIN_FETCH:
      unsetJoinFetch();
      return;
    case OrmPackage.ONE_TO_ONE__PROPERTY:
      getProperty().clear();
      return;
    case OrmPackage.ONE_TO_ONE__ACCESS_METHODS:
      setAccessMethods((AccessMethods) null);
      return;
    case OrmPackage.ONE_TO_ONE__ACCESS:
      unsetAccess();
      return;
    case OrmPackage.ONE_TO_ONE__FETCH:
      unsetFetch();
      return;
    case OrmPackage.ONE_TO_ONE__ID:
      unsetId();
      return;
    case OrmPackage.ONE_TO_ONE__MAPPED_BY:
      setMappedBy(MAPPED_BY_EDEFAULT);
      return;
    case OrmPackage.ONE_TO_ONE__MAPS_ID:
      setMapsId(MAPS_ID_EDEFAULT);
      return;
    case OrmPackage.ONE_TO_ONE__NAME:
      setName(NAME_EDEFAULT);
      return;
    case OrmPackage.ONE_TO_ONE__OPTIONAL:
      unsetOptional();
      return;
    case OrmPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
      unsetOrphanRemoval();
      return;
    case OrmPackage.ONE_TO_ONE__TARGET_ENTITY:
      setTargetEntity(TARGET_ENTITY_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case OrmPackage.ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN:
      return primaryKeyJoinColumn != null && !primaryKeyJoinColumn.isEmpty();
    case OrmPackage.ONE_TO_ONE__JOIN_COLUMN:
      return joinColumn != null && !joinColumn.isEmpty();
    case OrmPackage.ONE_TO_ONE__JOIN_TABLE:
      return joinTable != null;
    case OrmPackage.ONE_TO_ONE__CASCADE:
      return cascade != null;
    case OrmPackage.ONE_TO_ONE__PRIVATE_OWNED:
      return privateOwned != null;
    case OrmPackage.ONE_TO_ONE__JOIN_FETCH:
      return isSetJoinFetch();
    case OrmPackage.ONE_TO_ONE__PROPERTY:
      return property != null && !property.isEmpty();
    case OrmPackage.ONE_TO_ONE__ACCESS_METHODS:
      return accessMethods != null;
    case OrmPackage.ONE_TO_ONE__ACCESS:
      return isSetAccess();
    case OrmPackage.ONE_TO_ONE__FETCH:
      return isSetFetch();
    case OrmPackage.ONE_TO_ONE__ID:
      return isSetId();
    case OrmPackage.ONE_TO_ONE__MAPPED_BY:
      return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
    case OrmPackage.ONE_TO_ONE__MAPS_ID:
      return MAPS_ID_EDEFAULT == null ? mapsId != null : !MAPS_ID_EDEFAULT.equals(mapsId);
    case OrmPackage.ONE_TO_ONE__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case OrmPackage.ONE_TO_ONE__OPTIONAL:
      return isSetOptional();
    case OrmPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
      return isSetOrphanRemoval();
    case OrmPackage.ONE_TO_ONE__TARGET_ENTITY:
      return TARGET_ENTITY_EDEFAULT == null ? targetEntity != null : !TARGET_ENTITY_EDEFAULT.equals(targetEntity);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (joinFetch: ");
    if (joinFetchESet) {
      result.append(joinFetch);
    } else {
      result.append("<unset>");
    }
    result.append(", access: ");
    if (accessESet) {
      result.append(access);
    } else {
      result.append("<unset>");
    }
    result.append(", fetch: ");
    if (fetchESet) {
      result.append(fetch);
    } else {
      result.append("<unset>");
    }
    result.append(", id: ");
    if (idESet) {
      result.append(id);
    } else {
      result.append("<unset>");
    }
    result.append(", mappedBy: ");
    result.append(mappedBy);
    result.append(", mapsId: ");
    result.append(mapsId);
    result.append(", name: ");
    result.append(name);
    result.append(", optional: ");
    if (optionalESet) {
      result.append(optional);
    } else {
      result.append("<unset>");
    }
    result.append(", orphanRemoval: ");
    if (orphanRemovalESet) {
      result.append(orphanRemoval);
    } else {
      result.append("<unset>");
    }
    result.append(", targetEntity: ");
    result.append(targetEntity);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation() {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getOneToOne_Cascade());
    features.add(OrmPackage.eINSTANCE.getOneToOne_Fetch());
    features.add(OrmPackage.eINSTANCE.getOneToOne_Optional());
    features.add(OrmPackage.eINSTANCE.getOneToOne_TargetEntity());
    features.add(OrmPackage.eINSTANCE.getOneToOne_OrphanRemoval());
    features.add(OrmPackage.eINSTANCE.getOneToOne_MappedBy());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true);
  }
} // OneToOneImpl
