/* generated from model null*/
/* generated by template ast.AstClass*/

package javascriptsimple._ast;

/* generated by template ast.AstImports*/
import java.util.Optional;
import de.monticore.symboltable.Symbol;
import de.monticore.symboltable.Scope;
import de.se_rwth.commons.logging.Log;


 public  class ASTVariableDeclaration extends /* generated by template ast.AstSuperTypes*/
de.monticore.ast.ASTCNode implements  ASTJavaScriptSimpleNode {
  /* generated by template ast.Attribute*/
   protected  String identifier;

  /* generated by template ast.Attribute*/
   protected  Optional<javascriptsimple._ast.ASTInitialiser> initialiser = Optional.empty();

  /* generated by template ast.Attribute*/
   public  Optional<? extends Symbol> symbol = Optional.empty();

  /* generated by template ast.Attribute*/
   public  Optional<? extends Scope> enclosingScope = Optional.empty();

    /* generated by template ast.Constructor*/
  
   protected  ASTVariableDeclaration (/* generated by template ast.ParametersDeclaration*/
    // Parameters declaration 
    )  
  /* generated by template ast.EmptyMethodBody*/

  { // empty body 
  }

    /* generated by template ast.Constructor*/
  
   protected  ASTVariableDeclaration (/* generated by template ast.ConstructorParametersDeclaration*/
     String identifier 
    ,
     javascriptsimple._ast.ASTInitialiser initialiser 
 
    )  
  /* generated by template ast.ConstructorAttributesSetter*/
  {
    setIdentifier(identifier);
    setInitialiser(initialiser);
  }


  
    /* generated by template ast.ClassMethod*/
  
   public  void accept(javascriptsimple._visitor.JavaScriptSimpleVisitor visitor)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(visitor, "0xA7006_645 Parameter 'visitor' must not be null.");
 
     /* generated by template ast.additionalmethods.Accept*/

      visitor.handle(this);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_375 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.DeepEquals*/

      ASTVariableDeclaration comp;
    if ((o instanceof ASTVariableDeclaration)) {
      comp = (ASTVariableDeclaration) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing initialiser   
    if ( this.initialiser.isPresent() != comp.initialiser.isPresent() ||
      (this.initialiser.isPresent() && !this.initialiser.get().deepEquals(comp.initialiser.get())) ) {
      return false;
    }
    return true;     


  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_880 Parameter 'o' must not be null.");
 
     return deepEquals(o);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_008 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.DeepEqualsWithComments*/

      ASTVariableDeclaration comp;
    if ((o instanceof ASTVariableDeclaration)) {
      comp = (ASTVariableDeclaration) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing initialiser
    if ( this.initialiser.isPresent() != comp.initialiser.isPresent() ||
      (this.initialiser.isPresent() && !this.initialiser.get().deepEqualsWithComments(comp.initialiser.get())) ) {
      return false;
    }
    return true;     

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_106 Parameter 'o' must not be null.");
 
     return deepEqualsWithComments(o);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean equalAttributes(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_841 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.EqualAttributes*/

      ASTVariableDeclaration comp;
    if ((o instanceof ASTVariableDeclaration)) {
      comp = (ASTVariableDeclaration) o;
    } else {
      return false;
    }
	// comparing identifier 
    if ( (this.identifier == null && comp.identifier != null) 
      || (this.identifier != null && !this.identifier.equals(comp.identifier)) ) {
      return false;
    }
	// comparing symbol 
    if ( this.symbol.isPresent() != comp.symbol.isPresent() ||
       (this.symbol.isPresent() && !this.symbol.get().equals(comp.symbol.get())) ) {
      return false;
    }
	// comparing enclosingScope 
    if ( this.enclosingScope.isPresent() != comp.enclosingScope.isPresent() ||
       (this.enclosingScope.isPresent() && !this.enclosingScope.get().equals(comp.enclosingScope.get())) ) {
      return false;
    }
    return true;     


  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean equalsWithComments(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_427 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.EqualsWithComments*/

      ASTVariableDeclaration comp;
    if ((o instanceof ASTVariableDeclaration)) {
      comp = (ASTVariableDeclaration) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreComments().size() == comp.get_PreComments().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreComments().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreComments().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostComments().size() == comp.get_PostComments().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostComments().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostComments().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  java.util.Collection<de.monticore.ast.ASTNode> get_Children()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
    if ( getInitialiser().isPresent()) {
      result.add ( getInitialiser().get());
    }
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void remove_Child(de.monticore.ast.ASTNode child)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(child, "0xA7006_742 Parameter 'child' must not be null.");
 
     /* generated by template ast.additionalmethods.RemoveChild*/

    if (getInitialiser().isPresent() && getInitialiser().get() == child) {
      setInitialiser(null);
    }

  } 

    /* generated by template ast.ClassMethod*/
  
   public  static  Builder getBuilder()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     return new Builder();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTVariableDeclaration deepClone()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     return deepClone(_construct());

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTVariableDeclaration deepClone(ASTVariableDeclaration result)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(result, "0xA7006_066 Parameter 'result' must not be null.");
 
     /* generated by template ast.additionalmethods.DeepCloneWithParameters*/
  
    super.deepClone(result);
    
    if (this.identifier != null) {
      result.identifier = this.identifier;
    }
    result.initialiser = this.initialiser.isPresent()? Optional.ofNullable((javascriptsimple._ast.ASTInitialiser)this.initialiser.get().deepClone()) : Optional.empty();
    result.symbol = this.symbol.isPresent()? Optional.ofNullable((Symbol)this.symbol.get()) : Optional.empty();
    result.enclosingScope = this.enclosingScope.isPresent()? Optional.ofNullable((Scope)this.enclosingScope.get()) : Optional.empty();
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   protected  ASTVariableDeclaration _construct()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     return new ASTVariableDeclaration();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  String getIdentifier()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.Get*/

    return  this.identifier;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  Optional<javascriptsimple._ast.ASTInitialiser> getInitialiser()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.Get*/

    return  this.initialiser;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  Optional<? extends Symbol> getSymbol()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.Get*/

    return  this.symbol;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  Optional<? extends Scope> getEnclosingScope()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.Get*/

    return  this.enclosingScope;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setIdentifier(String identifier)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(identifier, "0xA7006_326 Parameter 'identifier' must not be null.");
 
     /* generated by template ast.additionalmethods.Set*/

    this.identifier = identifier;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setInitialiser(javascriptsimple._ast.ASTInitialiser initialiser)
   
    { 
     
     /* generated by template ast.additionalmethods.Set*/

    this.initialiser = Optional.ofNullable(initialiser);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean initialiserIsPresent()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
       return initialiser.isPresent(); 

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setSymbol(Symbol symbol)
   
    { 
     
     /* generated by template ast.additionalmethods.Set*/

    this.symbol = Optional.ofNullable(symbol);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean symbolIsPresent()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
       return symbol.isPresent(); 

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setEnclosingScope(Scope enclosingScope)
   
    { 
     
     /* generated by template ast.additionalmethods.Set*/

    this.enclosingScope = Optional.ofNullable(enclosingScope);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean enclosingScopeIsPresent()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
       return enclosingScope.isPresent(); 

  } 

   
  /* generated by template ast.ClassContent*/
  // Class content
    /* generated by template ast.AstBuilder*/

 /**
   * Builder for {@link ASTVariableDeclaration}.
   */
  public static class Builder  {
    /* generated by template ast.BuilderAttribute*/
     protected  String identifier;

    /* generated by template ast.BuilderAttribute*/
     protected  javascriptsimple._ast.ASTInitialiser initialiser;

    public ASTVariableDeclaration build() {
      return new ASTVariableDeclaration (/* generated by template ast.BuilderConstructorParametersDeclaration*/
  
        this.identifier 
           ,
       this.initialiser 
     
      );
    }
    /* generated by template ast.AstBuilderAttributeSetter*/
    public Builder identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }
/* generated by template ast.AstBuilderAttributeSetter*/
    public Builder initialiser(javascriptsimple._ast.ASTInitialiser initialiser) {
      this.initialiser = initialiser;
      return this;
    }

  }    
  
}