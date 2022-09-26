/*3 Crie uma classe Java que recebe via linha de comando o nome de um arquivo qualquer em formato JSON e o converte para os formatos CSV e XML. */
import java.io.File;
import java.io.Writer;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class ConverterCSvXMl {/* Referencias do CSV: https://dicasdejava.com.br/como-escrever-arquivos-csv-em-java/#:~:text=Outra%20forma%20interessante%20de%20criar,os%20atributos%20contidos%20no%20CSV.&text=Agora%20vamos%20escrever%20o%20CSV,ou%20seja%20List%20 */
    public static void main(String[] args) throws Exception, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException  {
        
        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe o Nome do arquivo.json para converter em Xml e Csv\n");

        File file = new File(scan.next());
        ObjectMapper Objectmapper = new ObjectMapper();
        Perfis perfil = Objectmapper.readValue(file,Perfis.class);

        File f = new File("Perfil.xml");
        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(f, perfil);
        
        Writer writer = Files.newBufferedWriter(Paths.get("Perfil.csv"));
        StatefulBeanToCsv<Perfis> stateful = new StatefulBeanToCsvBuilder<Perfis>(writer).build();
        stateful.write(perfil);

        writer.flush();
        writer.close();
        scan.close();
    }
}
