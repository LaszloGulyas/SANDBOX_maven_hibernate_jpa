import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpasandbox");

    public static void main(String[] args) {
        System.out.println("hello world");




        entityManagerFactory.close();
    }
}
