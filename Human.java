public class Human {
    private String name;
    private int age;
    private double weight; // Step 1: Add weight variable
    private double height; // Step 1: Add height variable

    // Step 1: Update constructors accordingly
    public Human(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Step 2: Eat method
    public void eat() {
        // Whenever a human eats 4000 calories, increase weight by 0.5 kilograms
        int caloriesConsumed = 4000;
        double weightGain = 0.5;
        if (caloriesConsumed > 0) {
            weight += weightGain;
        }
    }

    // Step 3: Exercise method
    public void exercise() {
        // Whenever a human burns 4000 calories, decrease weight by 0.2 kilograms
        int caloriesBurned = 4000;
        double weightLoss = 0.2;
        if (caloriesBurned > 0) {
            weight -= weightLoss;
        }
    }

    // Step 4: getCurrentAge
    public int getCurrentAge() {
        // Calculate current age and return it
        return age;
    }

    // Step 5: displayCurrentAge
    public void displayCurrentAge() {
        // Calculate current age and print it on screen
        System.out.println("Current age: " + age);
    }

    // Step 6: calculateBMI
    public void calculateBMI() {
        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }

    // Step 7: checkHealthStatus
    public void checkHealthStatus() {
        // Calculate BMI
        double bmi = weight / (height * height);

        // Check health status
        if (bmi < 25) {
            System.out.println("Healthy");
        } else {
            System.out.println("Unhealthy");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the Human class
        Human person = new Human("John Doe", 30, 70.0, 1.75);

        // Test the methods
        person.displayCurrentAge();
        person.eat();
        person.displayCurrentAge();
        person.calculateBMI();
        person.checkHealthStatus();
        person.exercise();
        person.displayCurrentAge();
        person.calculateBMI();
        person.checkHealthStatus();
    }
}
