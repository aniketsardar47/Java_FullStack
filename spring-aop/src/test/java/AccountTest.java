
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.BalanceException;
import com.aop.Accounts;
public class AccountTest {
	@Test
	public void testAspects() {
		ApplicationContext context = new ClassPathXmlApplicationContext("appctx.xml");
		
		Accounts a1 = context.getBean(Accounts.class);
		a1.deposit(1000);
		a1.summary();
		a1.getBalance();
		try {
			a1.withdraw(1000);
		}catch(BalanceException ex) {
			
		}
		
		a1.transfer(1,2,100);
	}
}
