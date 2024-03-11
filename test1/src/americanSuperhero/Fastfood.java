package americanSuperhero;

public class Fastfood extends Food{

    double protein;
    double sodium;

    Fastfood(double calories, double fat, double carb, double protein, double sodium) {
        super(calories * 2, fat * 2, carb * 2);
        this.protein = protein;
        this.sodium = sodium;
    }

    void Fastfoodreview(){
        System.out.println("Inside the review method of Fastfood class.");
    }
}

