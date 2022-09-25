/*4. Crie uma classe Java que recebe como entrada de teclado o nome de um file qualquer e o compacta para o formato ZIP ou outro formato de compressão à sua escolha. */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ConverterZip { /*Referencias: https://www.devmedia.com.br/compactando-arquivos-em-zip-java/18798 */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int buff = 4096;
        int cont;
        byte[] qtd = new byte[buff];

        System.out.println("Digite o nome do Arquivo: ");
        String nome = scanner.nextLine();
        File file = new File(nome);
        String Arquivo = file.getName().concat(".zip");

        BufferedInputStream bufferedInputStream = null;
        FileInputStream InputStream = null;
        FileOutputStream outputStream = null;
        ZipOutputStream zipOutputStream = null;
        ZipEntry zipEntry = null;

        outputStream = new FileOutputStream(Arquivo);
        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(outputStream));
        InputStream = new FileInputStream(Arquivo);
        bufferedInputStream = new BufferedInputStream(InputStream, buff);
        zipEntry = new ZipEntry(file.getName());
        zipOutputStream.putNextEntry(zipEntry);

        while((cont = bufferedInputStream.read(qtd, 0, buff)) != -1) {
            zipOutputStream.write(qtd, 0, cont);
        }
        
        bufferedInputStream.close();
        zipOutputStream.close();
        scanner.close();
    }
}
