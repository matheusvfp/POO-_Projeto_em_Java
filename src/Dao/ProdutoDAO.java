package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Produto;

public class ProdutoDAO {
    
    private final Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Produto produto) throws SQLException, ParseException{
       
        String sql = "insert into produto(nome,ml,validade,quantidade,preco,estoque,categoria,marca) values(?,?,?,?,?,?,?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, produto.getNome());
        statement.setDouble(2, produto.getMl());
        statement.setString(3, produto.getValidade());
        statement.setDouble(4, produto.getQuant());
        statement.setDouble(5, produto.getPreco());
        statement.setDouble(6, produto.getEstoque());
        statement.setString(7, produto.getCategoria());
        statement.setString(8, produto.getMarca());
        statement.execute();
        
    }

    public void update (Produto produto) throws SQLException, ParseException{
        String sql = "update produto set nome = ?, ml = ?,validade = ?, quantidade = ?,preco = ?,estoque = ?,categoria = ?,marca = ? where codigo = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, produto.getNome());
        statement.setDouble(2, produto.getMl());
        statement.setString(3, produto.getValidade());
        statement.setDouble(4, produto.getQuant());
        statement.setDouble(5, produto.getPreco());
        statement.setDouble(6, produto.getEstoque());
        statement.setString(7, produto.getCategoria());
        statement.setString(8, produto.getMarca());
        statement.setInt(9, produto.getCodigo());
        statement.execute();
    }
    
    public void insertOrUpdate(Produto produto) throws ParseException, SQLException{
        if(produto.getId() > 0){
            update(produto);
        }else{
            insert(produto);
        }
    }
    
    public void delete(Produto produto) throws SQLException{
        String sql = "delete from produto where codigo = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
       
        statement.setInt(1, produto.getId());
        statement.execute();
    }
    
    public ArrayList<Produto> selectAll() throws SQLException{
        String sql = "select * from produto";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
    }

    private ArrayList<Produto> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            int codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");
            double ml = resultSet.getDouble("ml");
            String validade = resultSet.getString("validade");
            double quant = resultSet.getDouble("quantidade");
            double preco = resultSet.getDouble("preco");
            double estoque = resultSet.getDouble("estoque");
            String categoria = resultSet.getString("categoria");
            String marca = resultSet.getString("marca");
            
            Produto produtoComDadosDoBanco = new Produto(categoria, nome, preco, codigo, ml, quant, validade, marca);
            produtos.add(produtoComDadosDoBanco);
        }
        
        return produtos;
    }
    
    public Produto selectPorId(Produto produto) throws SQLException{
        String sql = "select * from produto whiere codigo = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, produto.getCodigo());
 
        return pesquisa(statement).get(0);
    }
    
    public boolean existeProdutoPorCodigo(Produto produto) throws SQLException {
        String sql = "select * from produto where codigo = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, produto.getCodigo());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }
   
}
