import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Lista de Fichas")
public class ArrayPerfil {
    private List<Perfil> perfis;

    public ArrayPerfil(){
    }

    public ArrayPerfil(List<Perfil> perfis) {
        this.perfis = perfis;
    }

    @JacksonXmlElementWrapper(localName = "Perfil")
    @JacksonXmlProperty(localName = "perfil")

    public List<Perfil> getPerfil() {
        return perfis;
    }

    public void setPerfil(List<Perfil> perfis) {
        this.perfis = perfis;
    }

    @Override
    public String toString() {
        return this.perfis.toString();        
    }

}
