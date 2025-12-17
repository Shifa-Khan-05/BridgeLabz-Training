 public class ProfitLoss {

public static void profitloss()
{
   int costprice=129;
   int sellingprice=191;
   int profit=sellingprice-costprice;
   double Profitpercent =(profit*100)/costprice;
   System.out.println("The Cost Price is INR " + costprice + "and Selling Price is INR " + sellingprice  );
   System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + Profitpercent);

  
}
public static void main(String args[])
{
     profitloss();
}

}