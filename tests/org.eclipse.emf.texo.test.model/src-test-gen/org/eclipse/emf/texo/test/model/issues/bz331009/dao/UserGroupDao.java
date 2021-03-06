package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.UserGroup;

/**
 * The Dao implementation for the model object '<em><b>UserGroup</b></em>'.
 * 
 * @generated
 */
public class UserGroupDao extends BaseDao<UserGroup> {

  /**
   * @generated
   */
  @Override
  public Class<UserGroup> getEntityClass() {
    return UserGroup.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getUserGroupEClass();
  }
}
