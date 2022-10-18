import java.sql.Connection;
import java.util.List;

public interface DAO {

    public void insert(Aluno aluno);

    public List<Aluno> list();

    public void delete(Connection connection, int id);

    public void update(Connection connection, Aluno aluno);

}
