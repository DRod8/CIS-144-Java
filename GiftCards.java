import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Dan Rodriguez, Programmer

public class GiftCards
{
    static NumberFormat nf = NumberFormat.getCurrencyInstance();
    Date myDate = new Date();
    String myDateFormat = "MM/dd/yyyy";
    SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);

    // Expiration Date - YEAR
    Date myDate2 = new Date();
    String myDateFormat2 = "MM/yyyy";
    SimpleDateFormat dtYear = new SimpleDateFormat(myDateFormat2);

    // define the class data members
    public boolean expires;
    private double balance;
    public int cardNum;
    private char cardType;
    public String issueDate;
    private String holder;
    private Date expirationDate;

    // define the member methods
    // default constructor
    public GiftCards() { }
    // overloaded constructor
    public GiftCards(String n, double amt)
    {
        holder = n;
        balance = amt;
    }
    public void IssueGiftCard()
    {
        System.out.println("");
        System.out.println(" —Card Issued— ");
        System.out.println(" Today's Date is: " + dtToday.format(myDate));
        System.out.println(" Card Holder: " + holder);
        System.out.println(" Card Number: " + cardNum);
        System.out.println(" Card Amount: " + nf.format(balance));
        System.out.println(" Expires: " + dtYear.format(myDate2));
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double b)
    {
        balance = b;
    }
    public String getHolder()
    {
        return holder;
    }
    public void setHolder(String h)
    {
        holder = h;
    }
    public void printCurrentGiftCardInfo(double spend)
    {
        System.out.println("");
        System.out.println(" —Card Balance— " );
        System.out.println(" Today's Date is: " + dtToday.format(myDate));
        System.out.println(" Deducted: " + nf.format(spend));
        balance -= spend;
        System.out.println(" Card Balance: " + nf.format(balance));
    }
}
