/* Generated By:JJTree: Do not edit this line. ASTCompilationUnit.java */

package com.lolcode.parser;

public class ASTCompilationUnit extends SimpleNode {
    public ASTCompilationUnit(int id) {
        super(id);
    }

    public ASTCompilationUnit(LolCode p, int id) {
        super(p, id);
    }


    public void interpret(com.lolcode.Runtime runtime) {
        int i, k = jjtGetNumChildren();

        for (i = 0; i < k; i++)
            jjtGetChild(i).interpret(runtime);

    }

}