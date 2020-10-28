package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double 		 balance;
		GiftCard 	 card;
		int 		 issuingStore;
		
		issuingStore = 1337;
		balance 	 = 100.00;
		card 		 = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()",
					 issuingStore, card.getIssuingStore());
	}
	
	@Test
	public void getBalance()
	{
        double 		 balance;        
        GiftCard 	 card;
        int			 issuingStore;
        
        issuingStore = 1337;
        balance 	 = 100.00;
        card 		 = new GiftCard(issuingStore, balance);

        assertEquals("getBalance()",
        			 balance, card.getBalance(), 0.001);
	}
	
	@Test
	public void deduct()
	{
        double 		 balance;        
        GiftCard 	 card;
        int			 issuingStore;
        
        issuingStore = 1337;
        balance 	 = 100.00;
        card 		 = new GiftCard(issuingStore, balance);

        assertEquals("deduct()",
   			 		 "Invalid Transaction", card.deduct(-25.00));
        
        assertEquals("deduct()",
        			 "Remaining Balance:  75.00", card.deduct(25.00));	
        
        assertEquals("deduct()",
   			 		 "Amount Due:  50.00", card.deduct(125.00));	
	}
}