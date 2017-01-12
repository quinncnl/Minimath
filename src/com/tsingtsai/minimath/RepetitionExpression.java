package com.tsingtsai.minimath;

/**
 * Created by qcai on 1/12/2017.
 */
public class RepetitionExpression implements Expression {

    private Expression repetition;

    public RepetitionExpression(Expression exp) {
        repetition = exp;
    }

    @Override
    public boolean recognize(Context context) {

        while (repetition.recognize(context)) {}

        if (context.reachLast()) {
            return true;
        }
        return false;
    }
}
