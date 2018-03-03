package com.chase.tddspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TddSpringBootApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testReturnTypeForAmountlessThan100(){
		PaymentMethod paymentMethodType = PaymentMethodService.getPaymentMethod(47);
		assertThat(paymentMethodType.getClass().equals(Wallet));
	}

	@Test
	public void testThatForAmountBetween100And1000(){
		PaymentMethod paymentMethodType = PaymentMethodService.getPaymentMethod(555);
		assertThat(paymentMethodType.getClass().equals(CreditCard));
	}

	@Test
	public void testReturnTypeForAmountBetween1kAnd10k(){
		PaymentMethod paymentMethodType = PaymentMethodService.getPaymentMethod(4567);
		assertThat(paymentMethodType.getClass().equals(NetBanking));
	}

	@Test
    public void testReturnTypeForAmountBetween5kAnd500k(){
	    PaymentMethod paymentMethodType = PaymentMethodService.getPaymentMethod(5766);
	    assertThat(paymentMethodType.getClass().equals(UPI) || paymentMethodType.getClass().equals(NetBanking));
    }

    @Test
    public void testReturnTypeForAmountBetween10kAnd500k(){
        PaymentMethod paymentMethodType = PaymentMethodService.getPaymentMethod(104320);
        assertThat(paymentMethodType.getClass().equals(UPI));
    }

    @Test
    public void testReturnTypeForAmountAbove500k(){
        PaymentMethod paymentMethodType = PaymentMethodService.getPaymentMethod(576400);
        assertThat(paymentMethodType.getClass().equals(RTGS));
    }
}
