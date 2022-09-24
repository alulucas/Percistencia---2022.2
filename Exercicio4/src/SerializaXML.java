import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class SerializaXML {
    public static void main(String[] args) throws Exception {

        Filme filme = new Filme(001, "Como Treinar seu Dragão", "Soluço é um adolescente viking da ilha de Berk, onde lutar contra dragões é um meio de vida. Suas opiniões avançadas e um senso de humor estranho o tornam um desajustado, apesar de seu pai ser o chefe do clã.", "Chris Sanders, Dean DeBlois");
        Filme filme2 = new Filme(002, "Como Treinar seu Dragão", "Soluço é um adolescente viking da ilha de Berk, onde lutar contra dragões é um meio de vida. Suas opiniões avançadas e um senso de humor estranho o tornam um desajustado, apesar de seu pai ser o chefe do clã.", "Chris Sanders, Dean DeBlois");
        Filme filme3 = new Filme(003, "Como Treinar seu Dragão", "Soluço é um adolescente viking da ilha de Berk, onde lutar contra dragões é um meio de vida. Suas opiniões avançadas e um senso de humor estranho o tornam um desajustado, apesar de seu pai ser o chefe do clã.", "Chris Sanders, Dean DeBlois");
        
        List<Filme> lista = new ArrayList<>();
        
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);

        Filmes filmes = new Filmes(lista);

        File f = new File("Filme.xml");

        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(f, filmes);
    }
}
