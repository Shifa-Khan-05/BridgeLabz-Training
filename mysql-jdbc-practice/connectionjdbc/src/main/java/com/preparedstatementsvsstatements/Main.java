package com.preparedstatementsvsstatements;

public class Main {

	public static void main(String[] args) {

        StatemetsUse obj = new StatemetsUse();

        // Using Statement
        obj.insertUsingStatement("Shifa", 20);

        // Using PreparedStatement
        obj.insertUsingPreparedStatement("Ali", 22);
    }
}
