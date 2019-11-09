// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static generated.GeneratedTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACT_R_EXPR) {
      r = act_rExpr(b, 0);
    }
    else if (t == ARGS_R_EXPR) {
      r = args_rExpr(b, 0);
    }
    else if (t == ASSIGN_STMT) {
      r = assign_stmt(b, 0);
    }
    else if (t == CLASS_BODY) {
      r = classBody(b, 0);
    }
    else if (t == CLASS_SIG_BODY) {
      r = classSigBody(b, 0);
    }
    else if (t == CLASS_SIGNATURE) {
      r = classSignature(b, 0);
    }
    else if (t == FORMAL_ARGS) {
      r = formalArgs(b, 0);
    }
    else if (t == IF_STMT) {
      r = if_stmt(b, 0);
    }
    else if (t == L_EXPR) {
      r = lExpr(b, 0);
    }
    else if (t == METHOD) {
      r = method(b, 0);
    }
    else if (t == R_EXPR) {
      r = rExpr(b, 0, -1);
    }
    else if (t == RETURN_STMT) {
      r = return_stmt(b, 0);
    }
    else if (t == SIMPLE_STMT) {
      r = simple_stmt(b, 0);
    }
    else if (t == STMT) {
      r = stmt(b, 0);
    }
    else if (t == TYPE_CASE_STMT) {
      r = type_case_stmt(b, 0);
    }
    else if (t == WHILE_STMT) {
      r = while_stmt(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return prog(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ACTUAL_ARGS_R_EXPR, ACTUAL_R_EXPR, ACT_R_EXPR, AND_R_EXPR,
      ARGS_R_EXPR, AT_LEAST_R_EXPR, AT_MOST_R_EXPR, DIV_R_EXPR,
      EQUALS_R_EXPR, LEFT_R_EXPR, LESS_R_EXPR, LIT_R_EXPR,
      MINUS_R_EXPR, MORE_R_EXPR, NEG_R_EXPR, NOT_R_EXPR,
      OR_R_EXPR, PAREN_R_EXPR, PLUS_R_EXPR, R_EXPR,
      TIMES_R_EXPR),
  };

  /* ********************************************************** */
  // args_rExpr ?
  public static boolean act_rExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "act_rExpr")) return false;
    Marker m = enter_section_(b, l, _COLLAPSE_, ACT_R_EXPR, "<act r expr>");
    args_rExpr(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // rExpr (COMMA rExpr)*
  public static boolean args_rExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_rExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, ARGS_R_EXPR, "<args r expr>");
    r = rExpr(b, l + 1, -1);
    p = r; // pin = 1
    r = r && args_rExpr_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA rExpr)*
  private static boolean args_rExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_rExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!args_rExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "args_rExpr_1", c)) break;
    }
    return true;
  }

  // COMMA rExpr
  private static boolean args_rExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_rExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && rExpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lExpr (COLON id) ?  GETS rExpr SEMICOLON
  public static boolean assign_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_stmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_STMT, "<assign stmt>");
    r = lExpr(b, l + 1);
    r = r && assign_stmt_1(b, l + 1);
    r = r && consumeToken(b, GETS);
    p = r; // pin = GETS
    r = r && report_error_(b, rExpr(b, l + 1, -1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COLON id) ?
  private static boolean assign_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_stmt_1")) return false;
    assign_stmt_1_0(b, l + 1);
    return true;
  }

  // COLON id
  private static boolean assign_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE stmt * method * RBRACE
  public static boolean classBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && classBody_1(b, l + 1);
    r = r && classBody_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  // stmt *
  private static boolean classBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBody_1", c)) break;
    }
    return true;
  }

  // method *
  private static boolean classBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBody_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // classSignature classBody
  public static boolean classSigBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classSigBody")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classSignature(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, m, CLASS_SIG_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS id LPAREN formalArgs RPAREN ( EXTENDS id) ?
  public static boolean classSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classSignature")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, ID, LPAREN);
    r = r && formalArgs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && classSignature_5(b, l + 1);
    exit_section_(b, m, CLASS_SIGNATURE, r);
    return r;
  }

  // ( EXTENDS id) ?
  private static boolean classSignature_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classSignature_5")) return false;
    classSignature_5_0(b, l + 1);
    return true;
  }

  // EXTENDS id
  private static boolean classSignature_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classSignature_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXTENDS, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (id COLON id (COMMA id COLON id) * ) ?
  public static boolean formalArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalArgs")) return false;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_ARGS, "<formal args>");
    formalArgs_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // id COLON id (COMMA id COLON id) *
  private static boolean formalArgs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalArgs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON, ID);
    r = r && formalArgs_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA id COLON id) *
  private static boolean formalArgs_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalArgs_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formalArgs_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formalArgs_0_3", c)) break;
    }
    return true;
  }

  // COMMA id COLON id
  private static boolean formalArgs_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalArgs_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, ID, COLON, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IF rExpr LBRACE stmt *   RBRACE (ELIF rExpr LBRACE stmt *   RBRACE ) * (ELSE LBRACE stmt *   RBRACE) ?
  public static boolean if_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, null);
    r = consumeToken(b, IF);
    r = r && rExpr(b, l + 1, -1);
    r = r && consumeToken(b, LBRACE);
    p = r; // pin = LBRACE
    r = r && report_error_(b, if_stmt_3(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RBRACE)) && r;
    r = p && report_error_(b, if_stmt_5(b, l + 1)) && r;
    r = p && if_stmt_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // stmt *
  private static boolean if_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_stmt_3", c)) break;
    }
    return true;
  }

  // (ELIF rExpr LBRACE stmt *   RBRACE ) *
  private static boolean if_stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_stmt_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_stmt_5", c)) break;
    }
    return true;
  }

  // ELIF rExpr LBRACE stmt *   RBRACE
  private static boolean if_stmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELIF);
    r = r && rExpr(b, l + 1, -1);
    r = r && consumeToken(b, LBRACE);
    r = r && if_stmt_5_0_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // stmt *
  private static boolean if_stmt_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_5_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_stmt_5_0_3", c)) break;
    }
    return true;
  }

  // (ELSE LBRACE stmt *   RBRACE) ?
  private static boolean if_stmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_6")) return false;
    if_stmt_6_0(b, l + 1);
    return true;
  }

  // ELSE LBRACE stmt *   RBRACE
  private static boolean if_stmt_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, LBRACE);
    r = r && if_stmt_6_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // stmt *
  private static boolean if_stmt_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_6_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_stmt_6_0_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // left_rExpr | id
  public static boolean lExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, L_EXPR, "<l expr>");
    r = rExpr(b, l + 1, 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DEF id LPAREN formalArgs RPAREN ( COLON id ) ?  LBRACE stmt *   RBRACE
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF, ID, LPAREN);
    r = r && formalArgs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && method_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && method_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, METHOD, r);
    return r;
  }

  // ( COLON id ) ?
  private static boolean method_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_5")) return false;
    method_5_0(b, l + 1);
    return true;
  }

  // COLON id
  private static boolean method_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // stmt *
  private static boolean method_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // classSigBody * stmt * <<eof>>
  static boolean prog(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prog")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prog_0(b, l + 1);
    r = r && prog_1(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // classSigBody *
  private static boolean prog_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prog_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classSigBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prog_0", c)) break;
    }
    return true;
  }

  // stmt *
  private static boolean prog_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prog_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prog_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // RETURN rExpr ? SEMICOLON
  public static boolean return_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, null);
    r = consumeToken(b, RETURN);
    p = r; // pin = 1
    r = r && report_error_(b, return_stmt_1(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // rExpr ?
  private static boolean return_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt_1")) return false;
    rExpr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // rExpr SEMICOLON
  public static boolean simple_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STMT, "<simple stmt>");
    r = rExpr(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if_stmt
  //        | while_stmt
  //        | assign_stmt
  //        | simple_stmt
  //        | return_stmt
  //        | type_case_stmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = if_stmt(b, l + 1);
    if (!r) r = while_stmt(b, l + 1);
    if (!r) r = assign_stmt(b, l + 1);
    if (!r) r = simple_stmt(b, l + 1);
    if (!r) r = return_stmt(b, l + 1);
    if (!r) r = type_case_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TYPECASE rExpr LBRACE (id COLON id LBRACE stmt *   RBRACE ) * RBRACE
  public static boolean type_case_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_case_stmt")) return false;
    if (!nextTokenIs(b, TYPECASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CASE_STMT, null);
    r = consumeToken(b, TYPECASE);
    r = r && rExpr(b, l + 1, -1);
    r = r && consumeToken(b, LBRACE);
    p = r; // pin = 3
    r = r && report_error_(b, type_case_stmt_3(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (id COLON id LBRACE stmt *   RBRACE ) *
  private static boolean type_case_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_case_stmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_case_stmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_case_stmt_3", c)) break;
    }
    return true;
  }

  // id COLON id LBRACE stmt *   RBRACE
  private static boolean type_case_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_case_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON, ID, LBRACE);
    r = r && type_case_stmt_3_0_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // stmt *
  private static boolean type_case_stmt_3_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_case_stmt_3_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_case_stmt_3_0_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // WHILE rExpr LBRACE stmt *   RBRACE
  public static boolean while_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_stmt")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, null);
    r = consumeToken(b, WHILE);
    r = r && rExpr(b, l + 1, -1);
    r = r && consumeToken(b, LBRACE);
    p = r; // pin = 3
    r = r && report_error_(b, while_stmt_3(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // stmt *
  private static boolean while_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_stmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "while_stmt_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: rExpr
  // Operator priority table:
  // 0: BINARY(actual_args_rExpr)
  // 1: PREFIX(paren_rExpr)
  // 2: POSTFIX(left_rExpr)
  // 3: BINARY(plus_rExpr)
  // 4: BINARY(minus_rExpr)
  // 5: BINARY(times_rExpr)
  // 6: BINARY(div_rExpr)
  // 7: PREFIX(neg_rExpr)
  // 8: BINARY(equals_rExpr)
  // 9: BINARY(at_most_rExpr)
  // 10: BINARY(less_rExpr)
  // 11: BINARY(at_least_rExpr)
  // 12: BINARY(more_rExpr)
  // 13: BINARY(and_rExpr)
  // 14: BINARY(or_rExpr)
  // 15: PREFIX(not_rExpr)
  // 16: PREFIX(actual_rExpr)
  // 17: ATOM(lit_rExpr)
  public static boolean rExpr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "rExpr")) return false;
    addVariant(b, "<r expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<r expr>");
    r = paren_rExpr(b, l + 1);
    if (!r) r = neg_rExpr(b, l + 1);
    if (!r) r = not_rExpr(b, l + 1);
    if (!r) r = actual_rExpr(b, l + 1);
    if (!r) r = lit_rExpr(b, l + 1);
    p = r;
    r = r && rExpr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean rExpr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "rExpr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, DOT)) {
        r = rExpr(b, l, 15);
        exit_section_(b, l, m, ACTUAL_ARGS_R_EXPR, r, true, null);
      }
      else if (g < 2 && parseTokensSmart(b, 0, DOT, ID)) {
        r = true;
        exit_section_(b, l, m, LEFT_R_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, PLUS)) {
        r = rExpr(b, l, 3);
        exit_section_(b, l, m, PLUS_R_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, MINUS)) {
        r = rExpr(b, l, 4);
        exit_section_(b, l, m, MINUS_R_EXPR, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, TIMES)) {
        r = rExpr(b, l, 5);
        exit_section_(b, l, m, TIMES_R_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, DIVIDE)) {
        r = rExpr(b, l, 6);
        exit_section_(b, l, m, DIV_R_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, EQUALS)) {
        r = rExpr(b, l, 8);
        exit_section_(b, l, m, EQUALS_R_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, ATLEAST)) {
        r = rExpr(b, l, 9);
        exit_section_(b, l, m, AT_MOST_R_EXPR, r, true, null);
      }
      else if (g < 10 && consumeTokenSmart(b, LESS)) {
        r = rExpr(b, l, 10);
        exit_section_(b, l, m, LESS_R_EXPR, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, ATMOST)) {
        r = rExpr(b, l, 11);
        exit_section_(b, l, m, AT_LEAST_R_EXPR, r, true, null);
      }
      else if (g < 12 && consumeTokenSmart(b, MORE)) {
        r = rExpr(b, l, 12);
        exit_section_(b, l, m, MORE_R_EXPR, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, AND)) {
        r = rExpr(b, l, 13);
        exit_section_(b, l, m, AND_R_EXPR, r, true, null);
      }
      else if (g < 14 && consumeTokenSmart(b, OR)) {
        r = rExpr(b, l, 14);
        exit_section_(b, l, m, OR_R_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean paren_rExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_rExpr")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && rExpr(b, l, 1);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PAREN_R_EXPR, r, p, null);
    return r || p;
  }

  public static boolean neg_rExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "neg_rExpr")) return false;
    if (!nextTokenIsSmart(b, MINUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, MINUS);
    p = r;
    r = p && rExpr(b, l, 7);
    exit_section_(b, l, m, NEG_R_EXPR, r, p, null);
    return r || p;
  }

  public static boolean not_rExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_rExpr")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, NOT);
    p = r;
    r = p && rExpr(b, l, 15);
    exit_section_(b, l, m, NOT_R_EXPR, r, p, null);
    return r || p;
  }

  public static boolean actual_rExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_rExpr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = parseTokensSmart(b, 0, ID, LPAREN);
    p = r;
    r = p && rExpr(b, l, 16);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, ACTUAL_R_EXPR, r, p, null);
    return r || p;
  }

  // string | number | id
  public static boolean lit_rExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lit_rExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIT_R_EXPR, "<lit r expr>");
    r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, NUMBER);
    if (!r) r = consumeTokenSmart(b, ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
