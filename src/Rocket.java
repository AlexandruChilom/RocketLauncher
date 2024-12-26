public class Rocket {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            if (i == 5){
                System.out.println("Thrusters started!");
                continue;
            }
            if (i == 0){
                System.out.println("The rocket has been launched!");
                continue;
            }
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
