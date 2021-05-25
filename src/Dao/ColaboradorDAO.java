
package Dao;

import model.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;

public class ColaboradorDAO {
    
    private final Connection connection;

    public ColaboradorDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inset(Colaborador colaborador) throws SQLException{
       
        String sql = "insert into colaborador(cpf,email,celular) values(?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, colaborador.getCpf());
        statement.setString(2, colaborador.getEmail());
        statement.setString(3, colaborador.getCelular());
        statement.execute();
    }
    
    
}

