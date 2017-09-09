import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FatigaOrdenadoAscendente {

	public static void main(String[] args) throws FileNotFoundException {
		int i;
		int j = 40000;
		File archivo = new File ("C:/Users/laboratorios/Desktop/TP1 - CAJA NEGRA/Ejecutables/h_clinicas.in");
		PrintWriter salida = new PrintWriter (archivo);
		char letra = 'a';
		salida.print(j);
		salida.println();
		for(i = 0; i<40000 ; i++) {
			salida.print(j);
			j--;
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
