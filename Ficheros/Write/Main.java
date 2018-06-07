
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class Main {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String cadena;
		String ruta = "ficheritos.txt";
		File f = new File(ruta);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		cat(f);
		
		try{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write("nospi");

		
			
		}
		catch(FileNotFoundException e){
			System.out.print("File Not Found Exception");
		}
		finally{
			bw.close();
			fw.close();
		}

	}

	public static void cat(File file) throws Exception {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        String named="prueba";
			input = new RandomAccessFile(named, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    } finally {
	        if (input != null) {
	            input.close();
	        }
	    }
	}

}
