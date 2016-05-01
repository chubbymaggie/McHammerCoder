/* generated from model null*/
/* generated by template parser.ParserFactory*/



package javascriptsimple._parser;

public class JavaScriptSimpleParserFactory {
  
  private static JavaScriptSimpleParserFactory getFactory() {
    return new JavaScriptSimpleParserFactory();
  }
  
  protected static JavaScriptSimpleParserFactory factory = null;

  protected JavaScriptSimpleParserFactory () {}

    /* generated by template parser.FactoryMethods*/


  public static JavaScriptProgramMCParser createJavaScriptProgramMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateJavaScriptProgramMCParser();
  }
   
  protected JavaScriptProgramMCParser doCreateJavaScriptProgramMCParser () {
    return new JavaScriptProgramMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static SourceElementsMCParser createSourceElementsMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateSourceElementsMCParser();
  }
   
  protected SourceElementsMCParser doCreateSourceElementsMCParser () {
    return new SourceElementsMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static SourceElementMCParser createSourceElementMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateSourceElementMCParser();
  }
   
  protected SourceElementMCParser doCreateSourceElementMCParser () {
    return new SourceElementMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static StatementMCParser createStatementMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateStatementMCParser();
  }
   
  protected StatementMCParser doCreateStatementMCParser () {
    return new StatementMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static StatementsMCParser createStatementsMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateStatementsMCParser();
  }
   
  protected StatementsMCParser doCreateStatementsMCParser () {
    return new StatementsMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static VariableStatementMCParser createVariableStatementMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateVariableStatementMCParser();
  }
   
  protected VariableStatementMCParser doCreateVariableStatementMCParser () {
    return new VariableStatementMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static VariableDeclarationsMCParser createVariableDeclarationsMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateVariableDeclarationsMCParser();
  }
   
  protected VariableDeclarationsMCParser doCreateVariableDeclarationsMCParser () {
    return new VariableDeclarationsMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static VariableDeclarationMCParser createVariableDeclarationMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateVariableDeclarationMCParser();
  }
   
  protected VariableDeclarationMCParser doCreateVariableDeclarationMCParser () {
    return new VariableDeclarationMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static InitialiserMCParser createInitialiserMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateInitialiserMCParser();
  }
   
  protected InitialiserMCParser doCreateInitialiserMCParser () {
    return new InitialiserMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static ExpressionSequenceMCParser createExpressionSequenceMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateExpressionSequenceMCParser();
  }
   
  protected ExpressionSequenceMCParser doCreateExpressionSequenceMCParser () {
    return new ExpressionSequenceMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static SingleExpressionMCParser createSingleExpressionMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateSingleExpressionMCParser();
  }
   
  protected SingleExpressionMCParser doCreateSingleExpressionMCParser () {
    return new SingleExpressionMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static LiteralMCParser createLiteralMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateLiteralMCParser();
  }
   
  protected LiteralMCParser doCreateLiteralMCParser () {
    return new LiteralMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static NumericLiteralMCParser createNumericLiteralMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateNumericLiteralMCParser();
  }
   
  protected NumericLiteralMCParser doCreateNumericLiteralMCParser () {
    return new NumericLiteralMCParser();
  } 

    /* generated by template parser.FactoryMethods*/


  public static EOSMCParser createEOSMCParser () { 
    if (factory == null) {
      factory = getFactory();
    }
    return factory.doCreateEOSMCParser();
  }
   
  protected EOSMCParser doCreateEOSMCParser () {
    return new EOSMCParser();
  } 


}