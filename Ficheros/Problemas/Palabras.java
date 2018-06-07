
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Palabras {

	public static void main(String[] args) throws Exception{
		
		String query = "silla";
		String palabra;
		String ruta = "palabras.txt";
		FileReader fr = null;
		BufferedReader br = null;
			
		try{
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);
			while((palabra = br.readLine()) != null){
				
				query = query.toLowerCase();
				palabra = palabra.toLowerCase();
				
				if(palabra.equals(query)){
					System.out.println("Sí está");
				}
				
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
