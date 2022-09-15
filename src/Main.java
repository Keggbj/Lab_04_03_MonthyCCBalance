public class Main {
    public static void main(String[] args) {

        double creditCard = 5_000;
        double interestOneMonth = creditCard * 0.17;
        double interestTwoMonth = (creditCard + interestOneMonth) * 0.17;

        System.out.println("The calculated interest after one month is: " + interestOneMonth);

        System.out.println("The calculated interest after two months is: " + interestTwoMonth);
    }
}