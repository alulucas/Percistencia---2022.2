import java.io.*;
import java.util.Scanner;

public class Bpp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do arquivo 1");
        String arquivo1 = scanner.next();
        System.out.println("Digite o nome do arquivo 2");
        String arquivo2 = scanner.next();
        System.out.println("Digite o nome do arquivo 3");
        String arquivo3 = scanner.next();

        InputStream arq1 = new FileInputStream(arquivo1);
        InputStream arq2 = new FileInputStream(arquivo2);

        Scanner ler_arq1 = new Scanner(arq1);
        Scanner ler_arq2 = new Scanner(arq2);

        PrintStream imprimir = new PrintStream(arquivo3);

        while(ler_arq1.hasNextLine() || ler_arq2.hasNextLine()){
            if(ler_arq1.hasNextLine()){
                imprimir.println(ler_arq1.nextLine());
            }else{
                imprimir.println(ler_arq2.nextLine());
            }
        }

        scanner.close();
        ler_arq1.close();
        ler_arq2.close();
        imprimir.close();
    }
}
