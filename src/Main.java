public class Main {

    public static void main(String[] args) {

        User sasha = new User("Sasha", 5500, 4);
        String sashaName = sasha.getName();
        int sashaZarp = sasha.getZarp();
        int sashaYaer = sasha.getYaer();

        System.out.println("Name User: " + sashaName);
        System.out.println("Zp User: " + sashaZarp);
        System.out.println("Exp User: " + sashaYaer);
    }
}