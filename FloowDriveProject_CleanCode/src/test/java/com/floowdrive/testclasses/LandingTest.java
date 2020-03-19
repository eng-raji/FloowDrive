package com.floowdrive.testclasses;

import org.testng.annotations.Test;

import com.floowdrive.base.BaseTest;
import com.floowdrive.constants.Cons;


public class LandingTest extends BaseTest{
/**
 * this the landing page test call landing page registration method with data 
 * 
 * we have to add more method to test for get confident in our app
 *  
 */
	
	@Test
    public void valid_id_registration() throws InterruptedException {
    	 land.do_registration(Cons.E_MAIL,Cons.PASS_WORD,Cons.PASS_WORD);
        
    }
    
  //  @Test
    public void fack_id_registration() {
    	
        
    }  
}
