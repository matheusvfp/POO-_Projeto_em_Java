
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
       
        String sql = "insert into colaborador(cpf,email,celular) values('"+ colaborador.getCpf() +"','"+ colaborador.getEmail() +"','"+ colaborador.getCelular() +"');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
    
}

