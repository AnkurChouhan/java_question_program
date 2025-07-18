public class Question3 {
    public static void main(String[] args) {
        int age = 20; // changing this to 16, 18, 25
        boolean hasID = false; // true or false

        if (age >= 18) {
            if (hasID) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are eligible by age, but you must have valid ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote. You must be at least 18 years old.");
        }
    }
}
