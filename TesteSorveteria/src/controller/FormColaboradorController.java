
package controller;

import Dao.ColaboradorDAO;
import View.CadastrarColaborador;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Colaborador;

public class FormColaboradorController {
        private CadastrarColaborador view;

    public FormColaboradorController(CadastrarColaborador view) {
        this.view = view;
    }
        
    public void salvaColaborador(){
        
        
        
        String nome = view.getjTextFieldNome().getText();
        String email = view.getjTextFieldEmail().getText();
        String celular = view.getjTextFieldCelular().getText();
        String login = view.getjTextFieldLogin().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Colaborador colaborador =  new Colaborador(nome, email, celular, login, senha);
        
        try {
            Connection conexao = new Conexao().getConnection();
            ColaboradorDAO colaboradorDao = new ColaboradorDAO(conexao);
            colaboradorDao.inset(colaborador);
            
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }  
}
