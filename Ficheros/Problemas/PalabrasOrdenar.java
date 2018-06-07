import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class PalabrasOrdenar {

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
		
		sort(palabras);
		
		
		File f = new File(ruta);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			for(String a : palabras){
				bw.write(a);
				bw.newLine();
			}
		
			
		}
		catch(FileNotFoundException e){
			System.out.print("File Not Found Exception");
		}
		finally{
			bw.close();
			fw.close();
		}
		
		
		
		
		
	}

	
		public static void sort(Comparable[] original){
			
			int largo = original.length;
			int centro = largo/2;
			
			if(largo > 1){
																	//inicio		
	            Comparable[] izquierdo = Arrays.copyOfRange(original, 0, centro);
	            														  //fin
	            Comparable[] derecho = Arrays.copyOfRange(original,centro,largo);
				
	            sort(izquierdo);
	            sort(derecho);
	            
	            merge(original, izquierdo, derecho);
	            
	            
				
			}
			
		}
		
		public static void merge(Comparable[] original, Comparable[] a, Comparable[] b){
			
			int i = 0;
			int j = 0;
			int k = 0;
			while(i<a.length && j<b.length){
				if(a[i].compareTo(b[j]) < 0){
					original[k] = a[i];
					i++;
					k++;
				}
				else{
					original[k] = b[j];
					j++;
					k++;
				}
			}
			while(i<a.length){
				original[k] = a[i];
				i++;
				k++;
			}
			while(j<b.length){
				original[k] = b[j];
				j++;
				k++;
			}
			
			
		}
		
	
}