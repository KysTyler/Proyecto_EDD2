package proyecto_estructuras_ii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Josué Fernández
 */
public class RegisterFile {
    char delimiter;
    long head;
    int records;
    ArrayList<String> fields;

    public RegisterFile(File file) throws FileNotFoundException, IllegalArgumentException {
        Scanner scan = new Scanner(file);
        
        if(file.isDirectory() || !scan.hasNext()) {
            throw new IllegalArgumentException("El archivo provisto no es un archivo de registro válido.");
        }
        
        String a_delimiter = scan.nextLine();
        
        String a_head = scan.nextLine();
        
        String a_records = scan.nextLine();
        
        String a_fields = scan.nextLine();
        
        RandomAccesFile r;
        
        this.delimiter = delimiter;
        this.head = head;
        this.records = records;
    }
    
}
