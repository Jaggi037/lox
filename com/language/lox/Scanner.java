package com.language.lox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.language.lox.TokenType.*;


class Scanner {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();
    private int start = 0;
    private int current = 0;
    private int line = 1;

    private boolean isAtEnd(){
        return current >= source.length();
    }

    Scanner(String source){
        this.source = source;
    }

    List<Token> scanTokens(){
        while(!isAtEnd()){
            start = current;
            scanTokens();
        }
        tokens.add(new Token(EOF, "", null, line));
        return tokens;
    }
}
