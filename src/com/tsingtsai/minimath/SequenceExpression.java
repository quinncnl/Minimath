package com.tsingtsai.minimath;

/**
 * Created by qcai on 1/12/2017.
 */
public class SequenceExpression implements Expression {

    Expression expression1;
    Expression expression2;

    public SequenceExpression(Expression e1, Expression e2) {
        expression1 = e1;
        expression2 = e2;
    }

    @Override
    public boolean recognize(Context context) {
        int index = context.getIndex();

        if(expression1.recognize(context) && expression2.recognize(context))
            return true;

        context.setIndex(index);
        return false;
    }
}
