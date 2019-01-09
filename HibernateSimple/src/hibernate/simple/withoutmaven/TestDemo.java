package hibernate.simple.withoutmaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.scp.hibernate.hibernateDemo.Employee;

public class TestDemo {

	public static void main(String[] args) {
	
		EmpPojo e1 = new EmpPojo(1, "sheetal", 25147.25, "pune");
		EmpPojo e2 = new EmpPojo(2, "aarti", 78245.25, "solapur");
		SessionFactory sessionFactory = new Configuration().configure("hibernate/simple/withoutmaven/hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.flush();
		tr.commit();
		session.close();
	}

}
