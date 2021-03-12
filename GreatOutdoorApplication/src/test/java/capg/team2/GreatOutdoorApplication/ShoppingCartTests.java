package capg.team2.GreatOutdoorApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.capg.team2.goa.entity.Customer;
import com.capg.team2.goa.entity.ProductEntity;
import com.capg.team2.goa.repository.CartRepository;

@DataJpaTest	
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ShoppingCartTests {
	
	@Autowired
	private CartRepository cartrep;
	
	@Autowired 
	private TestEntityManager entityManager;
	
	@Test
	public void addOneCartItem()
	{
		ProductEntity product = entityManager.find(ProductEntity.class, 1);
		Customer customer = entityManager.find(Customer.class, product);
	}
	

}
