import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


public class Filmes {

    public Filmes(){}

    public Filmes(List<Filme> Filmes){
        this.Filmes = Filmes;
    }

    @JacksonXmlElementWrapper(localName = "filmes")
    @JacksonXmlProperty(localName = "filme")
    
    private List<Filme> Filmes;

    public List<Filme> getFilmes(){
        return Filmes;
    }

    public void setFilmes(List<Filme> Filmes){
        this.Filmes = Filmes;
    }

    @Override
    public String toString() {
        return this.Filmes.toString();
    }

}
