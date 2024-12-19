import java.util.ArrayList;
import java.util.Arrays;

public class ExtractDigitsFromParagraph {
    public static void main(String[] args) {
        String str="A core i 7 laptop price is 85000 tk " +
                "and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, " +
                "what will be my total cost after giving 15% discount?";

        str=str.replaceAll("[^\\d]"," ");
        str=str.trim();
        str=str.replaceAll(" +"," ");
        String[] arrDigit=str.split(" ");

        ArrayList<Integer> amountDigit= new ArrayList<>();
        for (String digit : arrDigit) {
            int num = Integer.parseInt(digit);
            if (num > 9) {
                amountDigit.add(num);
            }
        }
        int laptopPrice =amountDigit.get(0);
        int mousePrice = amountDigit.get(1);
        int discountPercent=amountDigit.get(2);

        int totalPrice=laptopPrice+mousePrice;
        int discountPrice=totalPrice*discountPercent/100;
        int ActualPrice=totalPrice-discountPrice;

        System.out.println("Total cost: "+ActualPrice);

        }

    }

