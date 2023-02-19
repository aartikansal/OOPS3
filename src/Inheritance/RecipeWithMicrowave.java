package Inheritance;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");

    }

    @Override
    void cleanup() {
        System.out.println("cleanup  the utensils");
        System.out.println("Switch off the microwave");


    }
}
