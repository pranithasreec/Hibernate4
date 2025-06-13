package hibernate.BankMap;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sessionFactory = new Configuration()
                 .configure("hiber.config.xml")
                 .addAnnotatedClass(Customer.class)
                 .addAnnotatedClass(Account.class)
                 .buildSessionFactory();
         Session session = sessionFactory.openSession();
         Transaction tx = session.beginTransaction();
         Account acc1 = new Account(201, "Savings", 15000.00);
         Account acc2 = new Account(202, "Current", 25000.00);
         List<Account> accounts = new ArrayList<>();
         accounts.add(acc1);
         accounts.add(acc2);
         Customer customer = new Customer(501, "Pranitha Sree", accounts);
         session.save(customer);
         tx.commit();
         session.close();
         sessionFactory.close();
        System.out.println( "Hello World!" );
    }
}
