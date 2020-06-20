public class B3_Main {
    public static void main(String[] args) {
        // We will have to first instantiate the dimensions class.
        B3_C_Dimensions dimensions = new B3_C_Dimensions(100, 135, 75);

        // Now we will instantiate the Body and the Engine class.
        B3_C_Body body = new B3_C_Body("Aluminium", dimensions, "Blue");
        B3_C_Engine engine = new B3_C_Engine(500,95,283);

        // Now we can instantiate our class Car.
        B3_C_Car p911 = new B3_C_Car("Porsche", "911", engine, body);

        // Now lets see how can we see the dimensions of the our car p911. Remember the class Car itself has no
        // getters to directly check the width or breadth of the car.
        System.out.println("The depth of the car is :- "+p911.getBody().getDimensions().getDepth());

        // What about the method accelerate of the class Engine. Here is how we access that method.
        p911.getEngine().accelerate();

        // Ok now lets apply the brakes.
        p911.getEngine().brake();

        // This is how we use composition. It can be a really useful tool as it makes our code modular and thus,
        // easier to debug, write and maintain.
    }
}
