public class Main {
    public static void main(String[] args) {

        double creditCard = 5_000;
        int interestOneMonth = creditCard * 0.17;
        int interestTwoMonth = interestOneMonth * 0.17;

        System.out.println("The calculated interest after one month is: " + interestOneMonth);

        System.out.println("The calculated interest after one month is: " + interestTwoMonth);
    }
}