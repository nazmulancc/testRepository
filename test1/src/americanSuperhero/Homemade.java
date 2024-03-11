package americanSuperhero;

public class Homemade extends Food{

    double fiber;
    double sugar;

    Homemade(double calories, double fat, double carb, double fiber, double sugar) {
        super(calories * 2, fat * 2, carb * 2);
        this.fiber = fiber;
        this.sugar = sugar;
    }

    void Homemadereview()
    {
        System.out.println("Inside the review method of Homemade class.");
    }

    @Override
    void description() {
        System.out.println("Inside Homemade class");
    }
}
