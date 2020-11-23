/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import sistemaintegrado.Parametros;
import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author MC System Work's
 */
public class ConectaBanco {
   // Parametros oParam = new Parametros();
    File arquivo = new File("System.ini");
    String sServidor=Arquivo.LeIni(arquivo,"BancoDeDados","Servidor");
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+sServidor+":3306/Sistema Integrado";
    public String usuario = Parametros.getsNmUsuas();
    public String senha = Parametros.getsSenhaUsuas();
    
    
            
    Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
        boolean result = true;
        try
        {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, "root", "123456");
            //JOptionPane.showMessageDialog(null, "Conectou");
            //InOut.MsgDeSimNao(usuario, driver);
        } 
        catch (ClassNotFoundException ex) 
        {
            //JOptionPane.showMessageDialog(null, "Drive não localizado");
            InOut.MsgDeErro(null, "Drive não localizado");
            result=false;
        }
        catch (SQLException sqlex)
        {
            JOptionPane.showMessageDialog(null,"Erro na conexão" );
          // InOut.MsgDeErro("AppAdm", "Erro na Conexão");
            result=false;
        }
        return result;
    }
   public void executaSelect (String query){
        try{
            statement = conexao.createStatement();
            resultset = statement.executeQuery(query);

        }
        catch (SQLException ex){
            
        }
    }
    public void desconecta(){
        try {   
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void executa(String query){
        try{
           statement = conexao.createStatement();
           statement.executeUpdate(query);
           InOut.MsgDeInformacao(null,"INFORMAÇÕES SALVAS COM SUCESSO COM SUCESSO!!!" );
        }catch(SQLException ex){
         // JOptionPane.showMessageDialog(null, ex.getMessage());
          InOut.MsgDeErro("ERRO ", "USUÁRIO SEM PERMISSÃO");
        }
    }
    public String mostraIP(){
        return sServidor;      
    }
}

