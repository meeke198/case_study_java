package customers;

public class CustomerMenu {
    private static void showMenuPersonnel() {
        System.out.println("*************************************************");
        System.out.println("*           ENTER YOUR REQUEST BY NUMBER        *");
        System.out.println("*       1. Add new customer.                    *");
        System.out.println("*       2. Search information customer.         *");
        System.out.println("*       3. Change customer.                     *");
        System.out.println("*       4. Display history.                     *");
        System.out.println("*       5. Display all customer.                *");
        System.out.println("*       6. Return main Menu.                    *");
        System.out.println("*************************************************");
    }

    public static void main(String[] args) {
        showMenuPersonnel();
    }
}
