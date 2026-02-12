package com.transactionmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.crudoperations.DatabaseConnection;

public class TransactionExample {

	public static void transferMoney(int fromAccount,int toAccount,double amount) {
	 
		Connection connection=null;
		try {
			//Deduct amount from sender
			 connection=DatabaseConnection.getConnection();
			connection.setAutoCommit(false);
			String deductSql= "Update accounts SET balance = balance -? WHERE account_id= ?";
		    PreparedStatement deductStmt=connection.prepareStatement(deductSql);
		    deductStmt.setDouble(1, amount);
		    deductStmt.setInt(2, fromAccount);
		    int rows1=deductStmt.executeUpdate();
		    
		    //Add amount to receiver
		    String addSql="Update accounts SET balance = balance + ? WHERE account_id=?";
		    PreparedStatement addStmt=connection.prepareStatement(addSql);

		    addStmt.setDouble(1, amount);  
		    addStmt.setInt(2, toAccount);  

		    int row2=addStmt.executeUpdate();
		    if(rows1>0 && row2>0 )
		    {
		    	connection.commit();
		    	System.out.println("Transaction successfull.......");
		    }
		    else {
				connection.rollback();
				System.out.println("Transactin failed - rolled back!!!!!!!!");
			}
		
		
		} catch (SQLException e) {

		try {
			if(connection!=null)
			{
				connection.rollback();
				System.out.println("Transaction rolled back due to some error");
			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		e.printStackTrace();
		
		}
		
		finally {
			try {
				if(connection!=null)
				{
					connection.setAutoCommit(true);
                    connection.close();
				}
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		 transferMoney(101, 102, 500.00); 

	}
}
