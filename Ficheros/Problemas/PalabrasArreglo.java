

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class PalabrasArreglo {

	public static void main(String[] args) throws Exception{
		
		
		String palabra;
		String ruta = "palabras.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String[] palabras = new String[1];
		
		
		
		try{
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);
			while((palabra = br.readLine()) != null){
				
				
				palabra = palabra.toLowerCase();
				palabras[palabras.length-1] = palabra;	
				palabras = Arrays.copyOf(palabras, palabras.length + 1);
				
			}
			palabras = Arrays.copyOf(palabras, palabras.length - 1);
			
		}
		catch(FileNotFoundException e){
			System.out.print("File Not Found Exception");
		}
		finally{
			br.close();
		
		}

		String query = "orsomarso";
		
		for(Comparable a : palabras){
			if(a.equals(query))
				System.out.println(a + " <-");
			else
			System.out.println(a);
		}
		
	}
	
}
	