package com.tsingtsai.minimath;

/**
 * Created by qcai on 1/12/2017.
 */
public class LiteralMinus implements Expression {
    @Override
    public boolean recognize(Context context) {

        Token t = context.getNext();

        if (t == null) return false;

        if (t.getString().equals("-")) {
            return true;
        }

        return false;
    }
}
