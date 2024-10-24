import javax.swing.JOptionPane;
public class TestGiftCards
// Dan Rodriguez
{
    public static void main(String[] args)
    {
        GiftCards gc = new GiftCards("", 0.0);

        // display opening message
        String message = "Welcome";
        JOptionPane.showMessageDialog(null, "Message: " + message,
                "Message", JOptionPane.PLAIN_MESSAGE);

        // set the gift card holder's name
        String str =
                JOptionPane.showInputDialog(null, "Gift card holder's name : ");
        gc.setHolder(str);

        // obtain the gift card number
        str = JOptionPane.showInputDialog(null, "Gift card number : ");
        gc.cardNum = Integer.parseInt(str);

        // set the gift card amount
        str = JOptionPane.showInputDialog(null, "Gift card amount : ");
        gc.setBalance(Double.parseDouble(str));

        // issue the gift card
        gc.IssueGiftCard();

        // use the gift card
        double useCard = 0;
        str =
                JOptionPane.showInputDialog(null, "deduct amount from card : ");
        useCard = Double.parseDouble(str);

        // verify that amount to deduct will not yield negative balance

        // print the current card balance
        gc.printCurrentGiftCardInfo(useCard);
    }
}
