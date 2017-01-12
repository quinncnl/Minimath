package com.tsingtsai.minimath;

import java.util.ArrayList;

/**
 * Created by qcai on 1/12/2017.
 */
public class Context {

    private ArrayList<Token> tokens = new ArrayList<Token>();
    private int index = 0;

    public Token getNext() {

        System.out.println(index);

        if (index == tokens.size()) {
            return null;
        }
        else {
            Token token = tokens.get(index);
            //System.out.println(token.getString());
            index ++;
            return token;

        }
    }

    public void addToken(Token t) {
        tokens.add(t);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int _index) {
        index = _index;
    }

    public boolean reachLast() {
        return (getIndex() == tokens.size());
    }

}
