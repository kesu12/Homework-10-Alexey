public class Main {
    public static void main(String[] args) {
    User alexey = new User("Alexey", "1234");
    User alexey1 = new User("Alexey", "1234");
    User alexey2 = new User("Alexey", "1234");
    User alexey3 = new User("Alexey", "1234");

        System.out.println(alexey.equals(alexey1));
        System.out.println(alexey.equals(alexey2));
        System.out.println(alexey.equals(alexey3));
    }
}