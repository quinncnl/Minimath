package com.tsingtsai.minimath;

/**
 * Created by qcai on 1/12/2017.
 */
public class Num implements Expression {
    @Override
    public boolean recognize(Context context) {

        Token t = context.getNext();

        if (t == null) return false;

        if (isNumeric((t.getString()))) {
            return true;
        }

        return false;
    }

    public boolean isNumeric(String str)
    {
        return str.matches("\\d+");  //match a number with optional '-' and decimal.

    }

}
