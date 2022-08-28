import java.io.*;
import java.util.Scanner;

public class Bpp {
    public static void main(String[] args)throws FileNotFoundException, IOException  {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do arquivo de leitura: ");
        String arq1 = input.next();

        System.out.println("Insira o nome do arquivo de escrita: ");
        String arq2 = input.next();

        InputStream is = new FileInputStream(arq1);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        OutputStream os = new FileOutputStream(arq2);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        
        String str = "";

        while( str != null){
            bw.write(str + "\n");
            str = br.readLine();

        }

        bw.newLine();
        bw.close();
        br.close();
        input.close();
    }

    
}
