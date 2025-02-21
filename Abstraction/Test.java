public class Test {

    public static void main(String[] args) {
        MobileUser mu;

        mu = new Nokia();
        mu.SendMessage();
        ;

        mu = new Xiaomi();
        mu.SendMessage();

    }

}
