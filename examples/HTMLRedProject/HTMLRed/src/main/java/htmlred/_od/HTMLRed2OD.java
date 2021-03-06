/* generated from model null*/
/* generated by template od.DiagramVisitor*/



package htmlred._od;

import htmlred._visitor.HTMLRedVisitor;
import htmlred._ast.ASTHTMLRedNode;
import de.monticore.prettyprint.IndentPrinter;
import de.se_rwth.commons.Names;
import de.se_rwth.commons.StringTransformations;
import de.monticore.generating.templateengine.reporting.commons.ReportingRepository;
import java.util.Iterator;

public class HTMLRed2OD implements HTMLRedVisitor {
      
  private HTMLRedVisitor realThis = this;
  
  private IndentPrinter pp;
  
  private ReportingRepository reporting;
    
  public HTMLRed2OD(IndentPrinter printer, ReportingRepository reporting) {
    this.reporting = reporting;
    this.pp = printer;
  }
    
  
      @Override
      public void visit(htmlred._ast.ASTP node) {
        String name = StringTransformations.uncapitalize(reporting.getASTNodeNameFormatted(node));
        printObject(name, "htmlred._ast.ASTP");
        pp.indent();
      }
      
      @Override
      public void endVisit(htmlred._ast.ASTP node) {
        pp.unindent();
        pp.println("}");
      }
  
      @Override
      public void visit(htmlred._ast.ASTAlternatives node) {
        String name = StringTransformations.uncapitalize(reporting.getASTNodeNameFormatted(node));
        printObject(name, "htmlred._ast.ASTAlternatives");
        pp.indent();
              if (node.getTEXTB().isPresent()) {
               printAttribute("tEXTB", String.valueOf(node.getTEXTB().get()));
              }
      }
      
      @Override
      public void endVisit(htmlred._ast.ASTAlternatives node) {
        pp.unindent();
        pp.println("}");
      }
  
      @Override
      public void visit(htmlred._ast.ASTB node) {
        String name = StringTransformations.uncapitalize(reporting.getASTNodeNameFormatted(node));
        printObject(name, "htmlred._ast.ASTB");
        pp.indent();
                printAttribute("text", "\"" + String.valueOf(node.getText()) + "\"");
      }
      
      @Override
      public void endVisit(htmlred._ast.ASTB node) {
        pp.unindent();
        pp.println("}");
      }
  
      @Override
      public void visit(htmlred._ast.ASTI node) {
        String name = StringTransformations.uncapitalize(reporting.getASTNodeNameFormatted(node));
        printObject(name, "htmlred._ast.ASTI");
        pp.indent();
                printAttribute("text", "\"" + String.valueOf(node.getText()) + "\"");
      }
      
      @Override
      public void endVisit(htmlred._ast.ASTI node) {
        pp.unindent();
        pp.println("}");
      }
  
  private void printAttribute(String name, String value) {
    pp.print(name);
    pp.print(" = ");
    pp.print(value);
    pp.println(";");
  }
  
  private void printObject(String objName, String objType) {
    pp.print(objName);
    pp.print(": ");
    pp.print(Names.getSimpleName(objType));
    pp.println(" {");
  }
  
  public String printObjectDiagram(String modelName, ASTHTMLRedNode node) {
    pp.clearBuffer();
    pp.setIndentLength(2);
    pp.print("astobjectdiagram ");
    pp.print(modelName);
    pp.println(" {");
    pp.indent();
    node.accept(getRealThis());
    pp.unindent();
    pp.println("}");
    return pp.getContent();
  }
  
  @Override
  public void setRealThis(HTMLRedVisitor realThis) {
    this.realThis = realThis;
  }

  @Override
  public HTMLRedVisitor getRealThis() {
    return realThis;
  }
  
  
}
  

