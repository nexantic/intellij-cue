// This is a generated file. Not intended for manual editing.
package dev.monogon.cue.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CueImportDecl extends CueCompositeElement {

  @NotNull
  List<CueImportSpec> getImportSpecList();

  @Nullable
  PsiElement getLeftParen();

  @Nullable
  PsiElement getRightParen();

}
