
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		String cadena;
		String ruta = "ficherito.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);
			while((cadena = br.readLine())!=null) {
		          System.out.println(cadena);
		      }
		}
		catch(FileNotFoundException e){
			System.out.print("File Not Found Exception");
		}
		finally{
			br.close();
		}

	}
	
}
