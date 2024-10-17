
package br.com.DAO;

import br.com.DTO.agendaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class agendaDAO {
     Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void agendar(agendaDTO adto){
        String sql = "insert into agenda(cliente_id, descricao) values (?,?)";
        conexao = new conexaoDAO().conector();
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adto.getIDclienteAgenda());
            pst.setString(2, adto.getConteudo());
            
            int add = pst.executeUpdate();
            if(add > 0){
            pst.close();
            JOptionPane.showMessageDialog(null, "Agendado com sucesso!!!");
          
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "inserir agendamento" + e);
        }
        
    
    }
}
