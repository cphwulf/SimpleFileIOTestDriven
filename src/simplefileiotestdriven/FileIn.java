package simplefileiotestdriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author thor
 */
public class FileIn {
	public String ReadCarFile(String filename) throws FileNotFoundException, IOException {
		File fh = new File(filename);
		FileReader fr = new FileReader(fh);
		BufferedReader br = new BufferedReader(fr);
		String foundline = br.readLine();
		return foundline;
	}
}
