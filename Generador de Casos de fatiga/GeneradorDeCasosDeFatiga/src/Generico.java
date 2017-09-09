import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Generico {

	public static void main(String[] args) throws FileNotFoundException {
		int i;
		File archivo = new File ("../h_clinicasRandom.in");
		PrintWriter salida = new PrintWriter (archivo);
		Random rand = new Random();
		char letra = 'a';
		
		for(i = 0; i<50; i++) {
			salida.print(rand.nextInt(50));
			salida.print(" " + letra + " " + letra);
			salida.println();
			letra++;
			if(letra > 'z') {
				letra = 'a';
			}
		}
		
		salida.close();
	}

}
