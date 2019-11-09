// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class IfStmtImpl extends ASTWrapperPsiElement implements IfStmt {

  public IfStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitIfStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RExpr> getRExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RExpr.class);
  }

  @Override
  @NotNull
  public List<Stmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Stmt.class);
  }

}
