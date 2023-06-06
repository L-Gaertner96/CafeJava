public class CafeJava{
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your order total is $";

        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 5.5;
        double cappuccinoPrice = 4.75;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + ". " + displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        double samOrder = lattePrice*2;
        System.out.println(displayTotalMessage + samOrder);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + ". " + displayTotalMessage + samOrder);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(customer3 + ", your difference is " + (lattePrice-dripCoffeePrice));

    }
}