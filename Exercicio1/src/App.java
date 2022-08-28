import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int n1;
        int n2;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do arquivo de texto: ");
        String arquivo = input.next();

        System.out.println("Insira o primeiro número: ");
        n1 = input.nextInt();

        System.out.println("Insira o segundo número: ");
        n2 = input.nextInt();

        InputStream is = new FileInputStream(arquivo);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String str = "";

        if (n2 == 0) {
            for (int i = 0; str != null; i++) {
                if (i >= (n1))
                    System.out.println(str);
                str = br.readLine();
            }
        }

        else if (n1 > n2) System.out.println("Operação invalida!!! Atenção com os valores inseridos");

        else if (n1 < n2) {
            for (int i = 0; i <= (n2); i++) {
                if (i >= (n1))
                    System.out.println(str);
                str = br.readLine();
            }
        }

        br.close();
        input.close();
    }
}