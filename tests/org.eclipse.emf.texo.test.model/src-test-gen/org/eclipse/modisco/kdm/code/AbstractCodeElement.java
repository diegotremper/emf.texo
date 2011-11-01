package org.eclipse.modisco.kdm.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.action.EntryFlow;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * A representation of the model object '<em><b>AbstractCodeElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "AbstractCodeElement")
public abstract class AbstractCodeElement extends KDMEntity {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SourceRef.class)
  @JoinColumns({ @JoinColumn() })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = CommentUnit.class)
  @JoinColumns({ @JoinColumn() })
  private Set<CommentUnit> comment = new HashSet<CommentUnit>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractCodeRelationship.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractCodeRelationship> codeRelation = new HashSet<AbstractCodeRelationship>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = EntryFlow.class)
  @OrderColumn()
  @JoinTable(name = "AbstractCodeElement_entryFlow")
  private List<EntryFlow> entryFlow = new ArrayList<EntryFlow>();

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public Set<SourceRef> getSource() {
    return source;
  }

  /**
   * Adds to the <em>source</em> feature.
   * @generated
   */
  public void addToSource(SourceRef sourceValue) {
    if (!source.contains(sourceValue)) {

      source.add(sourceValue);
    }

  }

  /**			
   * Removes from the <em>source</em> feature.
   * @generated
   */
  public void removeFromSource(SourceRef sourceValue) {
    if (source.contains(sourceValue)) {
      source.remove(sourceValue);
    }
  }

  /**			
   * Clears the <em>source</em> feature.
   * @generated
   */
  public void clearSource() {
    for (SourceRef sourceElement : source) {
      removeFromSource(sourceElement);
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getSource() <em>source</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractCodeElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public Set<CommentUnit> getComment() {
    return comment;
  }

  /**
   * Adds to the <em>comment</em> feature.
   * @generated
   */
  public void addToComment(CommentUnit commentValue) {
    if (!comment.contains(commentValue)) {

      comment.add(commentValue);
    }

  }

  /**			
   * Removes from the <em>comment</em> feature.
   * @generated
   */
  public void removeFromComment(CommentUnit commentValue) {
    if (comment.contains(commentValue)) {
      comment.remove(commentValue);
    }
  }

  /**			
   * Clears the <em>comment</em> feature.
   * @generated
   */
  public void clearComment() {
    for (CommentUnit commentElement : comment) {
      removeFromComment(commentElement);
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getComment() <em>comment</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractCodeElement#getComment() comment}' feature.
   * @generated
   */
  public void setComment(Set<CommentUnit> newComment) {
    comment = newComment;
  }

  /**
   * Returns the value of '<em><b>codeRelation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>codeRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeRelationship> getCodeRelation() {
    return codeRelation;
  }

  /**
   * Adds to the <em>codeRelation</em> feature.
   * @generated
   */
  public void addToCodeRelation(AbstractCodeRelationship codeRelationValue) {
    if (!codeRelation.contains(codeRelationValue)) {

      codeRelation.add(codeRelationValue);
    }

  }

  /**			
   * Removes from the <em>codeRelation</em> feature.
   * @generated
   */
  public void removeFromCodeRelation(AbstractCodeRelationship codeRelationValue) {
    if (codeRelation.contains(codeRelationValue)) {
      codeRelation.remove(codeRelationValue);
    }
  }

  /**			
   * Clears the <em>codeRelation</em> feature.
   * @generated
   */
  public void clearCodeRelation() {
    for (AbstractCodeRelationship codeRelationElement : codeRelation) {
      removeFromCodeRelation(codeRelationElement);
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getCodeRelation() <em>codeRelation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractCodeElement#getCodeRelation() codeRelation}' feature.
   * @generated
   */
  public void setCodeRelation(Set<AbstractCodeRelationship> newCodeRelation) {
    codeRelation = newCodeRelation;
  }

  /**
   * Returns the value of '<em><b>entryFlow</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>entryFlow</b></em>' feature
   * @generated
   */
  public List<EntryFlow> getEntryFlow() {
    return entryFlow;
  }

  /**
   * Adds to the <em>entryFlow</em> feature.
   * @generated
   */
  public void addToEntryFlow(EntryFlow entryFlowValue) {
    if (!entryFlow.contains(entryFlowValue)) {

      entryFlow.add(entryFlowValue);
    }

  }

  /**			
   * Removes from the <em>entryFlow</em> feature.
   * @generated
   */
  public void removeFromEntryFlow(EntryFlow entryFlowValue) {
    if (entryFlow.contains(entryFlowValue)) {
      entryFlow.remove(entryFlowValue);
    }
  }

  /**			
   * Clears the <em>entryFlow</em> feature.
   * @generated
   */
  public void clearEntryFlow() {
    for (EntryFlow entryFlowElement : entryFlow) {
      removeFromEntryFlow(entryFlowElement);
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getEntryFlow() <em>entryFlow</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractCodeElement#getEntryFlow() entryFlow}' feature.
   * @generated
   */
  public void setEntryFlow(List<EntryFlow> newEntryFlow) {
    entryFlow = newEntryFlow;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractCodeElement ";
  }
}