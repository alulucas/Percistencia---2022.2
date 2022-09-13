import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class DeserializaXML {
    public static void main(String[] args) throws Exception {
        File file = new File("Filmes.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Filmes p = xmlMapper.readValue(file, Filmes.class);
        System.out.println(p);
    }

}
