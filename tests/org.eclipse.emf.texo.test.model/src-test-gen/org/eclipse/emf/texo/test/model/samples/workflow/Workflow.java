package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Workflow")
public class Workflow extends WorkflowElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = WorkflowNode.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<WorkflowNode> nodes = new ArrayList<WorkflowNode>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Edge.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Edge> edges = new ArrayList<Edge>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Comment.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Comment> comments = new ArrayList<Comment>();

  /**
   * Returns the value of '<em><b>nodes</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>nodes</b></em>' feature
   * @generated
   */
  public List<WorkflowNode> getNodes() {
    return nodes;
  }

  /**
   * Adds to the <em>nodes</em> feature.
   * @generated
   */
  public void addToNodes(WorkflowNode nodesValue) {
    if (!nodes.contains(nodesValue)) {

      nodes.add(nodesValue);
    }

  }

  /**			
   * Removes from the <em>nodes</em> feature.
   * @generated
   */
  public void removeFromNodes(WorkflowNode nodesValue) {
    if (nodes.contains(nodesValue)) {
      nodes.remove(nodesValue);
    }
  }

  /**			
   * Clears the <em>nodes</em> feature.
   * @generated
   */
  public void clearNodes() {
    for (WorkflowNode nodesElement : nodes) {
      removeFromNodes(nodesElement);
    }
  }

  /**
   * Sets the '{@link Workflow#getNodes() <em>nodes</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Workflow#getNodes() nodes}' feature.
   * @generated
   */
  public void setNodes(List<WorkflowNode> newNodes) {
    nodes = newNodes;
  }

  /**
   * Returns the value of '<em><b>edges</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>edges</b></em>' feature
   * @generated
   */
  public List<Edge> getEdges() {
    return edges;
  }

  /**
   * Adds to the <em>edges</em> feature.
   * @generated
   */
  public void addToEdges(Edge edgesValue) {
    if (!edges.contains(edgesValue)) {

      edges.add(edgesValue);
    }

  }

  /**			
   * Removes from the <em>edges</em> feature.
   * @generated
   */
  public void removeFromEdges(Edge edgesValue) {
    if (edges.contains(edgesValue)) {
      edges.remove(edgesValue);
    }
  }

  /**			
   * Clears the <em>edges</em> feature.
   * @generated
   */
  public void clearEdges() {
    for (Edge edgesElement : edges) {
      removeFromEdges(edgesElement);
    }
  }

  /**
   * Sets the '{@link Workflow#getEdges() <em>edges</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Workflow#getEdges() edges}' feature.
   * @generated
   */
  public void setEdges(List<Edge> newEdges) {
    edges = newEdges;
  }

  /**
   * Returns the value of '<em><b>comments</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>comments</b></em>' feature
   * @generated
   */
  public List<Comment> getComments() {
    return comments;
  }

  /**
   * Adds to the <em>comments</em> feature.
   * @generated
   */
  public void addToComments(Comment commentsValue) {
    if (!comments.contains(commentsValue)) {

      comments.add(commentsValue);
    }

  }

  /**			
   * Removes from the <em>comments</em> feature.
   * @generated
   */
  public void removeFromComments(Comment commentsValue) {
    if (comments.contains(commentsValue)) {
      comments.remove(commentsValue);
    }
  }

  /**			
   * Clears the <em>comments</em> feature.
   * @generated
   */
  public void clearComments() {
    for (Comment commentsElement : comments) {
      removeFromComments(commentsElement);
    }
  }

  /**
   * Sets the '{@link Workflow#getComments() <em>comments</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Workflow#getComments() comments}' feature.
   * @generated
   */
  public void setComments(List<Comment> newComments) {
    comments = newComments;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Workflow ";
  }
}