/*4. Crie uma classe Java que recebe como entrada de teclado o nome de um arquivo qualquer e o compacta para o formato ZIP ou outro formato de compressão à sua escolha. */
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ConverterZip {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o nome do arquivo: ");
        String nome = scanner.nextLine();
        File arquivo = new File(nome);
        String nomeArquivo = arquivo.getName().concat(".zip");

        FileOutputStream fileOut = new FileOutputStream(nomeArquivo);
        ZipOutputStream zipOut = new ZipOutputStream(fileOut);

        zipOut.putNextEntry(new ZipEntry(arquivo.getName()));

        byte[] bytes = Files.readAllBytes(Paths.get(nome));
        zipOut.write(bytes, 0, bytes.length);
        zipOut.closeEntry();
        zipOut.close();
        scanner.close();
    }
}
