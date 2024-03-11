package americanSuperhero;

public class Foodmain {

    public static void main(String[] args) {
        Food f1 = new Homemade(100, 10, 20, 5, 8);
        Food f2 = new Fastfood(200, 15, 25, 12, 10);

        // Polymorphic invocation of Homemadereview() method
        if (f1 instanceof Homemade) {
            ((Homemade) f1).Homemadereview();
        }

        // Polymorphic invocation of Fastfoodreview() method
        if (f2 instanceof Fastfood) {
            ((Fastfood) f2).Fastfoodreview();
        }
    }
}
