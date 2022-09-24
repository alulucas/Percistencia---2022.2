import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ListaDePerfis")
public class ArrayPerfil {
    private List<Perfil> perfil;

    public ArrayPerfil(){
    }

    public ArrayPerfil(List<Perfil> perfil) {
        this.perfil = perfil;
    }

    @JacksonXmlElementWrapper(localName = "Perfis")
    @JacksonXmlProperty(localName = "perfil")

    public List<Perfil> getPerfil() {
        return perfil;
    }

    public void setPerfil(List<Perfil> perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return this.perfil.toString();        
    }

}
