/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package simplefileiotestdriven;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author thor
 */
public class FileInTest {
	String filename;
	String foundline;
	String expectedline;
	FileIn fin;
	
	@Before
	public void setUp() throws FileNotFoundException {
		filename = "Data/test.csv";
		fin = new FileIn();
	}
	
	/**
	 * Test of ReadCarFile method, of class FileIn.
	 */
	@Test
	public void testReadCarFile() throws FileNotFoundException, IOException {
		foundline = fin.ReadCarFile(filename);
		expectedline = "her bor kurt";
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(expectedline, foundline);
	}
	
}
