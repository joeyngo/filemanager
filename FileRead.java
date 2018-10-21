import java.io.* ; 

public class FileRead { 

    public static void main (String [] args) { 
        
        // The name of the file to open 
        String fileName = "temp.txt" ; 
        
        // This will reference one line at a time  
        String line = null ; 

        try { 
            
            // FileReader reads text files in the default encoding
            FileReader fileReader = new FileReader(fileName) ; 
            
            // Always wrap FileReader in BufferedReader 
            BufferedReader bufferedReader = new BufferedReader(fileReader); 
            
            // Print all lines of file until null 
            while (( line = bufferedReader.readLine()) != null ) {
                System.out.println(line);  
            }
            
            bufferedReader.close() ; // Always close files
            }
            
            catch(FileNotFoundException ex) { 
                System.out.println("Unable to open file '" + fileName + "'"
                    + " File does not exist!" ); 
            } 
            catch(IOException ex) { 
                System.out.println( "Error reading file '" + fileName +
                    "'") ; 

            // Alternatively, 
            // ex.printStackTrace() ; 
            }
    }
}

