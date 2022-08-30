import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do arquivo 1");
        String arquivo1 = scanner.next();
        System.out.println("Digite o nome da Substring");
        String subString = scanner.next();
        

        InputStream arq1 = new FileInputStream(arquivo1);
        Scanner ler_arq1 = new Scanner(arq1);
    

        while(ler_arq1.hasNextLine()){

            String texto = ler_arq1.nextLine();

            if(texto.contains(subString.toUpperCase()) || texto.contains(subString.toLowerCase())){
                System.out.println(texto);
            }
        }

        scanner.close();
        ler_arq1.close();
    }
}
