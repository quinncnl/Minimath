package com.tsingtsai.minimath;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Context ctx = new Context();
        ctx.addToken(new Token("1"));
        ctx.addToken(new Token("2"));
        ctx.addToken(new Token("3"));

        SequenceExpression start = new SequenceExpression(new Num(), new RepetitionExpression(new SequenceExpression(new LiteralMinus(), new Num())));
        System.out.println(start.recognize(ctx));
    }
}
