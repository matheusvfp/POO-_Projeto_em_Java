
package Dao;

import model.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ColaboradorDAO {
    
    private final Connection connection;

    public ColaboradorDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inset(Colaborador colaborador) throws SQLException{
       
        String sql = "insert into colaborador(nome,email,celular,login,senha) values('"+ colaborador.getNome() +"','"+ colaborador.getEmail() +"','"+ colaborador.getCelular() +"','"+colaborador.getLogin()+"','"+ colaborador.getSenha() +"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();

     }
}
