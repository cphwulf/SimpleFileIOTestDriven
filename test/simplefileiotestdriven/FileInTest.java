/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefileiotestdriven;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class FileInTest {
	
	public FileInTest() {
	}
	
	@Before
	public void setUp() {
	}

	/**
	 * Test of ReadCarFile method, of class FileIn.
	 */
	@Test
	public void testReadCarFile() {
		System.out.println("ReadCarFile");
		String filenameString = "";
		FileIn instance = new FileIn();
		instance.ReadCarFile(filenameString);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
