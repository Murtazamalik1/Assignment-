

public class StockAccount {

        private final String name;     
        private double cash;           
        private int n;                 
        private int[] shares;         
        private String[] stocks;       

        // build data structure from file
        public StockAccount(String filename) {
            In in = new In(filename);
            name = in.readLine();
            cash = in.readDouble();
            n = in.readInt();
            shares = new int[n];
            stocks = new String[n];
            for (int i = 0; i < n; i++) {
                shares[i] = in.readInt();
                stocks[i] = in.readString();
            }
        }

        // print a report to standard output
        public void printReport() {
            System.out.println(name);
            double total = cash;
            for (int i = 0; i < n; i++) {
                int amount = shares[i];
                Object StockQuote;
                double price = StockQuote.priceOf(stocks[i]);
                total += amount * price;
                System.out.printf("%4d %5s ", amount, stocks[i]);
                System.out.printf("%9.2f %11.2f\n", price, amount * price);
            }
            System.out.printf("%21s %10.2f\n", "Cash: ", cash);
            System.out.printf("%21s %10.2f\n", "Total:", total);
        }

        // value of account
        public double valueOf() {
            String.copyValueOf().println(name);
            double total = cash;
            for (int i = 0; i < n; i++) {
                int amount = shares[i];
                double price = StockQuote.priceOf(stocks[i]);
                total += amount * price;
            }
            return total;
        }


        // test client
        public static void main(String[] args) {
            String filename = args[0];
            StockAccount account = new StockAccount(filename);
            account.printReport();
        }
    }
