/* generated from model null*/
/* generated by template ast.AstClass*/

package javascriptsimple._ast;

/* generated by template ast.ListImports*/
import static com.google.common.collect.Lists.newArrayList;

import java.util.*;
import de.se_rwth.commons.SourcePosition;
import de.monticore.ast.*;
import de.se_rwth.commons.logging.Log;


 public  class ASTNumericLiteralList extends /* generated by template ast.AstSuperTypesList*/
de.monticore.ast.ASTCList implements java.lang.Iterable<ASTNumericLiteral>
, java.util.List<ASTNumericLiteral>
, ASTJavaScriptSimpleNode {
  /* generated by template ast.Attribute*/
   protected  ArrayList<ASTNumericLiteral> list = new java.util.ArrayList<>();

  
    /* generated by template ast.ClassMethod*/
  
   public  void accept(javascriptsimple._visitor.JavaScriptSimpleVisitor visitor)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(visitor, "0xA7006_283 Parameter 'visitor' must not be null.");
 
     /* generated by template ast.additionalmethods.Accept*/

      visitor.handle(this);

  } 

   
  /* generated by template ast.AstListMethods*/
 
  protected ASTNumericLiteralList () {
    list = newArrayList();
    set_Existent(false);
  }
  
  protected ASTNumericLiteralList (boolean strictlyOrdered) {
    this();
    this._strictlyOrdered = strictlyOrdered;
  }
  
  protected ArrayList<ASTNumericLiteral> getList() {
    return list;
  }
  
  protected void setList(ArrayList<ASTNumericLiteral> list) {
    this.list = list;
    set_Existent(false);
  }
  
  public void add(int index, ASTNumericLiteral o) {
    if (!is_Existent()) {
      set_Existent(true);
    }
    list.add(index, o);
  }
  
  public boolean add(ASTNumericLiteral o) {
    if (!is_Existent()) {
      set_Existent(true);
    }
    list.add(o);
    return true;
  }
  
  public void clear() {
    list.clear();
  }
  
  public boolean contains(ASTNumericLiteral o) {
    return list.contains(o);
  }
  
  public boolean equals(ASTNumericLiteralList o) {
    return list.equals(o.getList());
  }
  
  public ASTNumericLiteral get(int index) {
    return list.get(index);
  }
  
  public int hashCode() {
    return list.hashCode();
  }
  
  public int indexOf(ASTNumericLiteral o) {
    return list.indexOf(o);
  }
  
  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  public Iterator<ASTNumericLiteral> iterator() {
    return new TemplateListIterator((ASTNumericLiteralList) this, 0);
  }
  
  public int lastIndexOf(ASTNumericLiteral o) {
    return list.lastIndexOf(o);
  }
  
  public ASTNumericLiteral remove(int index) {
    return list.remove(index);
  }
  
  public boolean remove(ASTNumericLiteral o) {
    return list.remove(o);
  }
  
  public ASTNumericLiteral set(int index, ASTNumericLiteral o) {
    return list.set(index, o);
  }
  
  public int size() {
    return list.size();
  }
  
  public ASTNumericLiteral[] toArray() {
    ASTNumericLiteral[] result = new ASTNumericLiteral[list.size()];
    list.toArray(result);
    return result;
  }
  
  public SourcePosition getStart() {
    if (list.size() != 0) {
      return get(0).get_SourcePositionStart();
    }
    return null;
  }
  
  public SourcePosition getEnd() {
    if (list.size() != 0) {
      return get(list.size() - 1).get_SourcePositionEnd();
    }
    return null;
  }
  
  public ASTNumericLiteralList deepClone() {
    ASTNumericLiteralList result = new ASTNumericLiteralList();
    if (list.size() != 0) {
      Iterator< ASTNumericLiteral> iter = iterator();
      while (iter.hasNext()) {
        result.add((ASTNumericLiteral) iter.next().deepClone());
      }
    }
    for (de.monticore.ast.Comment x : get_PreComments()) {
      result.get_PreComments().add(new de.monticore.ast.Comment(x.getText()));
    }
    for (de.monticore.ast.Comment x : get_PostComments()) {
      result.get_PostComments().add(new de.monticore.ast.Comment(x.getText()));
    }
    return result;
  }
    
  public boolean addAll(Collection<? extends ASTNumericLiteral> c) {
    boolean r = false;
    for (ASTNumericLiteral n : c) {
      this.add(n);
      r = true;
     }
     return r;
  }
  
  public boolean addAll(int index, Collection<? extends ASTNumericLiteral> c) {
    boolean r = false;
    int idx = index;
    for (ASTNumericLiteral n : c) {
      this.add(idx++, n);
      r = true;
    }
    return r;
  }
  
  public boolean contains(Object o) {
    return list.contains(o);
  }
  
  public boolean containsAll(Collection<?> c) {
    return list.containsAll(c);
  }
  
  public int indexOf(Object o) {
    return list.indexOf(o);
  }
  
  public int lastIndexOf(Object o) {
    return list.lastIndexOf(o);
  }
  
  public ListIterator<ASTNumericLiteral> listIterator() {
    return new TemplateListIterator((ASTNumericLiteralList) this, 0);
  }
  
  public ListIterator<ASTNumericLiteral> listIterator(int index) {
    return new TemplateListIterator((ASTNumericLiteralList) this, 0);
  }
  
  public boolean remove(Object o) {
    return list.remove(o);
  }
  
  public void remove_Child(de.monticore.ast.ASTNode child) {
    remove(child);
  }
  
  public boolean removeAll(Collection<?> c) {
    boolean r = false;
    for (Object o : c) {
      r = r | this.remove(o);
    }
    return r;
  }
  
  public boolean retainAll(Collection<?> c) {
    boolean r = false;
    Iterator<?> i = this.iterator();
    while (i.hasNext()) {
      Object o = i.next();
      if (!c.contains(o)) {
        i.remove();
        r = true;
      }
    }
    return r;
  }
  
  public List<ASTNumericLiteral> subList(int fromIndex, int toIndex) {
    return list.subList(fromIndex, toIndex);
  }
  
  public <T> T[] toArray(T[] a) {
    return list.toArray(a);
  }
  
  @Override
  @SuppressWarnings("unchecked")    
  public ASTNumericLiteralList clone() {
    ASTNumericLiteralList ret = new ASTNumericLiteralList();
    ret.setList((ArrayList<ASTNumericLiteral>) list.clone());
    return ret;
  }
  
  public boolean equalAttributes(Object o) {
    ASTNumericLiteralList comp;
    if ((o instanceof ASTNumericLiteralList)) {
      comp = (ASTNumericLiteralList) o;
    }
    else {
      return false;
    }
    if (this.size() == comp.size()) {
      java.util.Iterator<ASTNumericLiteral> one = this.iterator();
      java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
      while (one.hasNext()) {
        if (!one.next().equalAttributes(two.next())) {
          return false;
        }
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  public boolean equalsWithComments(Object o) {
    ASTNumericLiteralList comp;
    if ((o instanceof ASTNumericLiteralList)) {
      comp = (ASTNumericLiteralList) o;
    }
    else {
      return false;
    }
    if (this.size() == comp.size()) {
      java.util.Iterator<ASTNumericLiteral> one = this.iterator();
      java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
      while (one.hasNext()) {
        if (!one.next().equalsWithComments(two.next())) {
          return false;
        }
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  public boolean deepEquals(Object o) {
    ASTNumericLiteralList comp;
    if ((o instanceof ASTNumericLiteralList)) {
      comp = (ASTNumericLiteralList) o;
    }
    else {
      return false;
    }
    if (this.size() == comp.size()) {
      if (isStrictlyOrdered()) {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
        while (one.hasNext()) {
          if (!one.next().deepEquals(two.next())) {
            return false;
          }
        }
      }
      else {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        while (one.hasNext()) {
          ASTNumericLiteral oneNext = one.next();
          boolean matchFound = false;
          java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
          while (two.hasNext()) {
            if (oneNext.deepEquals(two.next())) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  public boolean deepEqualsWithComments(Object o) {
    ASTNumericLiteralList comp;
    if ((o instanceof ASTNumericLiteralList)) {
      comp = (ASTNumericLiteralList) o;
    }
    else {
      return false;
    }
    if (this.size() == comp.size()) {
      if (isStrictlyOrdered()) {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
        while (one.hasNext()) {
          if (!one.next().deepEqualsWithComments(two.next())) {
            return false;
          }
        }
      }
      else {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        while (one.hasNext()) {
          ASTNumericLiteral oneNext = one.next();
          boolean matchFound = false;
          java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
          while (two.hasNext()) {
            if (oneNext.deepEqualsWithComments(two.next())) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  public boolean deepEquals(Object o, boolean forceSameOrder) {
    ASTNumericLiteralList comp;
    if ((o instanceof ASTNumericLiteralList)) {
      comp = (ASTNumericLiteralList) o;
    }
    else {
      return false;
    }
    if (this.size() == comp.size()) {
      if (forceSameOrder) {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
        while (one.hasNext()) {
          if (!one.next().deepEquals(two.next(), forceSameOrder)) {
            return false;
          }
        }
      }
      else {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        while (one.hasNext()) {
          ASTNumericLiteral oneNext = one.next();
          boolean matchFound = false;
          java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
          while (two.hasNext()) {
            if (oneNext.deepEquals(two.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  public boolean deepEqualsWithComments(Object o, boolean forceSameOrder) {
    ASTNumericLiteralList comp;
    if ((o instanceof ASTNumericLiteralList)) {
      comp = (ASTNumericLiteralList) o;
    }
    else {
      return false;
    }
    if (this.size() == comp.size()) {
      if (forceSameOrder) {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        while (one.hasNext()) {
          ASTNumericLiteral oneNext = one.next();
          boolean matchFound = false;
          java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
          while (two.hasNext()) {
            if (oneNext.deepEqualsWithComments(two.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
      else {
        java.util.Iterator<ASTNumericLiteral> one = this.iterator();
        java.util.Iterator<ASTNumericLiteral> two = comp.iterator();
        while (one.hasNext()) {
          if (!one.next().deepEqualsWithComments(two.next(), forceSameOrder)) {
            return false;
          }
        }
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  private class TemplateListIterator implements ListIterator<ASTNumericLiteral> {
    private ListIterator<ASTNumericLiteral> it;
    private ASTNumericLiteralList t;
    private ASTNumericLiteral lastRet = null;
    
    TemplateListIterator(ASTNumericLiteralList t, int index) {
      this.t = t;
      this.it = list.listIterator(index);
    }
    
    public boolean hasNext() {
      return it.hasNext();
    }
    
    public ASTNumericLiteral next() {
      lastRet = it.next();
      return lastRet;
    }
    
    public boolean hasPrevious() {
      return it.hasPrevious();
    }
    
    public ASTNumericLiteral previous() {
      lastRet = it.previous();
      return lastRet;
    }
    
    public int nextIndex() {
      return it.nextIndex();
    }
    
    public int previousIndex() {
      return it.previousIndex();
    }
    
    public void remove() {
      if (lastRet != null) {
        lastRet = null;
      }
      it.remove();
    }
    
    public void set(ASTNumericLiteral o) {
      if (lastRet != null) {
        lastRet = null;
      }
      it.set(o);
    }
    
    public void add(ASTNumericLiteral o) {
      it.add(o);
      if (!t.is_Existent())
        t.set_Existent(true);
      }        
    }


  
}