package com.language.lox;

class Token{
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line){
        this.type = type;
        this.line = line;
        this.lexeme = lexeme;
        this.literal = literal;
    }

    public String toString(){
        return type + " " + lexeme + " " + literal;
    }

}