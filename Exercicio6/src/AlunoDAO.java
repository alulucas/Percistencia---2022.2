import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {

    public void insert(Aluno aluno, Connection connection) {
        try {
            Class.forName("org.postgresql.Driver");

            String insert = "insert into aluno (id, matricula ,cpf ,nome ,email ,telefone ) values (?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            
            preparedStatement.setString(1, aluno.getId());
            preparedStatement.setString(2, aluno.getMatricula());
            preparedStatement.setString(3, aluno.getCpf());
            preparedStatement.setString(4, aluno.getNome());
            preparedStatement.setString(5, aluno.getEmail());
            preparedStatement.setString(6, aluno.getTelefone());

            preparedStatement.execute();
            preparedStatement.close(); 

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Aluno> list(Connection connection){
        try {
            List<Aluno> alunos = new ArrayList<Aluno>();
            String select = "select * from aluno";
            PreparedStatement preparedStatement = connection.prepareStatement(select);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()){
                Aluno aluno = new Aluno();
                aluno.setId(result.getString("id"));
                aluno.setMatricula(result.getString("matricula"));
                aluno.setCpf(result.getString("cpf"));
                aluno.setNome(result.getString("nome"));
                aluno.setEmail(result.getString("email"));
                aluno.setTelefone(result.getString("telefone"));

                alunos.add(aluno);
            }

            result.close();
            preparedStatement.close();
            return alunos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }





}