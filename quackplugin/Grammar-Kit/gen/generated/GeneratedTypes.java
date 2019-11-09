// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface GeneratedTypes {

  IElementType ACTUAL_ARGS_R_EXPR = new IElementType("ACTUAL_ARGS_R_EXPR", null);
  IElementType ACTUAL_R_EXPR = new IElementType("ACTUAL_R_EXPR", null);
  IElementType ACT_R_EXPR = new IElementType("ACT_R_EXPR", null);
  IElementType AND_R_EXPR = new IElementType("AND_R_EXPR", null);
  IElementType ARGS_R_EXPR = new IElementType("ARGS_R_EXPR", null);
  IElementType ASSIGN_STMT = new IElementType("ASSIGN_STMT", null);
  IElementType AT_LEAST_R_EXPR = new IElementType("AT_LEAST_R_EXPR", null);
  IElementType AT_MOST_R_EXPR = new IElementType("AT_MOST_R_EXPR", null);
  IElementType CLASS_BODY = new IElementType("CLASS_BODY", null);
  IElementType CLASS_SIGNATURE = new IElementType("CLASS_SIGNATURE", null);
  IElementType CLASS_SIG_BODY = new IElementType("CLASS_SIG_BODY", null);
  IElementType DIV_R_EXPR = new IElementType("DIV_R_EXPR", null);
  IElementType EQUALS_R_EXPR = new IElementType("EQUALS_R_EXPR", null);
  IElementType FORMAL_ARGS = new IElementType("FORMAL_ARGS", null);
  IElementType IF_STMT = new IElementType("IF_STMT", null);
  IElementType LEFT_R_EXPR = new IElementType("LEFT_R_EXPR", null);
  IElementType LESS_R_EXPR = new IElementType("LESS_R_EXPR", null);
  IElementType LIT_R_EXPR = new IElementType("LIT_R_EXPR", null);
  IElementType L_EXPR = new IElementType("L_EXPR", null);
  IElementType METHOD = new IElementType("METHOD", null);
  IElementType MINUS_R_EXPR = new IElementType("MINUS_R_EXPR", null);
  IElementType MORE_R_EXPR = new IElementType("MORE_R_EXPR", null);
  IElementType NEG_R_EXPR = new IElementType("NEG_R_EXPR", null);
  IElementType NOT_R_EXPR = new IElementType("NOT_R_EXPR", null);
  IElementType OR_R_EXPR = new IElementType("OR_R_EXPR", null);
  IElementType PAREN_R_EXPR = new IElementType("PAREN_R_EXPR", null);
  IElementType PLUS_R_EXPR = new IElementType("PLUS_R_EXPR", null);
  IElementType RETURN_STMT = new IElementType("RETURN_STMT", null);
  IElementType R_EXPR = new IElementType("R_EXPR", null);
  IElementType SIMPLE_STMT = new IElementType("SIMPLE_STMT", null);
  IElementType STMT = new IElementType("STMT", null);
  IElementType TIMES_R_EXPR = new IElementType("TIMES_R_EXPR", null);
  IElementType TYPE_CASE_STMT = new IElementType("TYPE_CASE_STMT", null);
  IElementType WHILE_STMT = new IElementType("WHILE_STMT", null);

  IElementType AND = new IElementType("and", null);
  IElementType ATLEAST = new IElementType("<=", null);
  IElementType ATMOST = new IElementType(">=", null);
  IElementType BLOCK_COMMENT = new IElementType("block_comment", null);
  IElementType CLASS = new IElementType("class", null);
  IElementType COLON = new IElementType(":", null);
  IElementType COMMA = new IElementType(",", null);
  IElementType DEF = new IElementType("def", null);
  IElementType DIVIDE = new IElementType("/", null);
  IElementType DOT = new IElementType(".", null);
  IElementType ELIF = new IElementType("elif", null);
  IElementType ELSE = new IElementType("else", null);
  IElementType EQUALS = new IElementType("==", null);
  IElementType EXTENDS = new IElementType("extends", null);
  IElementType GETS = new IElementType("=", null);
  IElementType ID = new IElementType("id", null);
  IElementType IF = new IElementType("if", null);
  IElementType LBRACE = new IElementType("{", null);
  IElementType LESS = new IElementType("<", null);
  IElementType LINE_COMMENT = new IElementType("line_comment", null);
  IElementType LPAREN = new IElementType("(", null);
  IElementType MINUS = new IElementType("-", null);
  IElementType MORE = new IElementType(">", null);
  IElementType NOT = new IElementType("not", null);
  IElementType NUMBER = new IElementType("number", null);
  IElementType OR = new IElementType("or", null);
  IElementType PLUS = new IElementType("+", null);
  IElementType RBRACE = new IElementType("}", null);
  IElementType RETURN = new IElementType("return", null);
  IElementType RPAREN = new IElementType(")", null);
  IElementType SEMICOLON = new IElementType(";", null);
  IElementType STRING = new IElementType("string", null);
  IElementType TIMES = new IElementType("*", null);
  IElementType TYPECASE = new IElementType("typecase", null);
  IElementType WHILE = new IElementType("while", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTUAL_ARGS_R_EXPR) {
        return new ActualArgsRExprImpl(node);
      }
      else if (type == ACTUAL_R_EXPR) {
        return new ActualRExprImpl(node);
      }
      else if (type == AND_R_EXPR) {
        return new AndRExprImpl(node);
      }
      else if (type == ARGS_R_EXPR) {
        return new ArgsRExprImpl(node);
      }
      else if (type == ASSIGN_STMT) {
        return new AssignStmtImpl(node);
      }
      else if (type == AT_LEAST_R_EXPR) {
        return new AtLeastRExprImpl(node);
      }
      else if (type == AT_MOST_R_EXPR) {
        return new AtMostRExprImpl(node);
      }
      else if (type == CLASS_BODY) {
        return new ClassBodyImpl(node);
      }
      else if (type == CLASS_SIGNATURE) {
        return new ClassSignatureImpl(node);
      }
      else if (type == CLASS_SIG_BODY) {
        return new ClassSigBodyImpl(node);
      }
      else if (type == DIV_R_EXPR) {
        return new DivRExprImpl(node);
      }
      else if (type == EQUALS_R_EXPR) {
        return new EqualsRExprImpl(node);
      }
      else if (type == FORMAL_ARGS) {
        return new FormalArgsImpl(node);
      }
      else if (type == IF_STMT) {
        return new IfStmtImpl(node);
      }
      else if (type == LEFT_R_EXPR) {
        return new LeftRExprImpl(node);
      }
      else if (type == LESS_R_EXPR) {
        return new LessRExprImpl(node);
      }
      else if (type == LIT_R_EXPR) {
        return new LitRExprImpl(node);
      }
      else if (type == L_EXPR) {
        return new LExprImpl(node);
      }
      else if (type == METHOD) {
        return new MethodImpl(node);
      }
      else if (type == MINUS_R_EXPR) {
        return new MinusRExprImpl(node);
      }
      else if (type == MORE_R_EXPR) {
        return new MoreRExprImpl(node);
      }
      else if (type == NEG_R_EXPR) {
        return new NegRExprImpl(node);
      }
      else if (type == NOT_R_EXPR) {
        return new NotRExprImpl(node);
      }
      else if (type == OR_R_EXPR) {
        return new OrRExprImpl(node);
      }
      else if (type == PAREN_R_EXPR) {
        return new ParenRExprImpl(node);
      }
      else if (type == PLUS_R_EXPR) {
        return new PlusRExprImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new ReturnStmtImpl(node);
      }
      else if (type == SIMPLE_STMT) {
        return new SimpleStmtImpl(node);
      }
      else if (type == STMT) {
        return new StmtImpl(node);
      }
      else if (type == TIMES_R_EXPR) {
        return new TimesRExprImpl(node);
      }
      else if (type == TYPE_CASE_STMT) {
        return new TypeCaseStmtImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new WhileStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
