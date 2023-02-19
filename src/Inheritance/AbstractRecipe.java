package Inheritance;

public abstract class AbstractRecipe {
    public void execute() {
        //prep work
        //recipe
        //clean up
        getReady();
        doTheDish();
        cleanup();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();



}
