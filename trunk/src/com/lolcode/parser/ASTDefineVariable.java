/* Generated By:JJTree: Do not edit this line. ASTDefineVariable.java */

package com.lolcode.parser;

import com.lolcode.LolRuntimeException;

public class ASTDefineVariable extends SimpleNode {

    String name;

    public ASTDefineVariable(int id) {
        super(id);
    }

    public ASTDefineVariable(LolCode p, int id) {
        super(p, id);
    }

    public void interpret(com.lolcode.Runtime runtime) {

        if (runtime.variables.containsKey(name)) {
            throw new LolRuntimeException("ALREADY HAS " + name);
        }
        runtime.variables.put(name, 0);
    }
}