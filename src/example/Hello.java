
package example;

import org.apache.commons.lang.WordUtils;
import com.opencsv.*;
import java.util.List;
import java.io.*;



public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() + " : " + WordUtils.capitalizeFully(message));

	int monmax=0;
	try {
		CSVReader reader = new CSVReader(new FileReader("data.csv"));
		List<String[]>myEntries=reader.readAll();
		for (String[] ligne : myEntries){
			for (String Caractere : ligne){
				int nombre = Integer.parseInt(Caractere);
				if (nombre > monmax) {
					monmax = nombre;
				}
			}	
		}
	}
	catch (FileNotFoundException e) {
		System.out.println("Fichier non trouvé");
	}
	catch (IOException e) {
		System.out.println("Impossible de lire le fichier");
	}
	System.out.println("Le maximum est : " + monmax);
	
    }
}
        
