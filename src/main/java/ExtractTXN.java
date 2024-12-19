
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractTXN {
    public static void main(String[] args) {
        String html = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Transactions</title>
            </head>
            <body>
                <div>
                    <div class="button">
                        <p>Transaction Id: TXN1234</p>
                    </div>
                </div>
            </body>
            </html>
        """;

        String regex = "Transaction Id: (TXN\\d+)";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(html);


        if (matcher.find()) {
            String transactionId = matcher.group(1); // Extract the group
            System.out.println("Transaction ID: " + transactionId);
        } else {
            System.out.println("Transaction ID not found.");
        }
    }
}
