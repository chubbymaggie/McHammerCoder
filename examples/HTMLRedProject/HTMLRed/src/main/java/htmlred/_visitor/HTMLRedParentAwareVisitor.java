/* generated from model null*/
/* generated by template visitor.ParentAwareVisitor*/



package htmlred._visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

import htmlred._ast.ASTHTMLRedNode;
import de.monticore.ast.ASTNode;


/**
* The ParentAwareVisitor of the language keeps track of the parent nodes during a traversal.<br/>
* <br/>
* <b>Access current parent</b>: use {@code getParent()} to access the current parent.<br/>
* <br/>
* <b>Access the complete parents list:</b> use {@code getParents()} to access a list of all parents.<br/>
*/
public abstract class HTMLRedParentAwareVisitor  implements HTMLRedVisitor {

  final Stack<ASTHTMLRedNode> parents = new Stack<>();

  public Optional<ASTHTMLRedNode> getParent() {
    if (!parents.isEmpty()) {
      ASTHTMLRedNode topElement = (ASTHTMLRedNode) parents.peek();
      return Optional.of(topElement);
    }
    // no parent, return an absent value
    return Optional.empty();
  }

  public List<ASTHTMLRedNode> getParents() {
    return new ArrayList<>(parents);
  }

      @Override
      public void traverse(htmlred._ast.ASTP node) {
        parents.push(node);
        HTMLRedVisitor.super.traverse(node);
        parents.pop();
      }
      @Override
      public void traverse(htmlred._ast.ASTAlternatives node) {
        parents.push(node);
        HTMLRedVisitor.super.traverse(node);
        parents.pop();
      }
      @Override
      public void traverse(htmlred._ast.ASTB node) {
        parents.push(node);
        HTMLRedVisitor.super.traverse(node);
        parents.pop();
      }
      @Override
      public void traverse(htmlred._ast.ASTI node) {
        parents.push(node);
        HTMLRedVisitor.super.traverse(node);
        parents.pop();
      }
}
