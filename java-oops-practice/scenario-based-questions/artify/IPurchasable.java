import java.util.Scanner;

/*
 * Interface representing purchasable items
 * Any class implementing this interface must define
 * purchase and license behavior
 */
interface IPurchasable {
    public void purchase(User user);
    public void license();
}
