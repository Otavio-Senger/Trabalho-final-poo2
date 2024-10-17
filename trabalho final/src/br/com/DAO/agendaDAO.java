package br.com.DAO;

import br.com.DTO.agendaDTO;
import br.com.View.telaAgenda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class agendaDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void agendar(agendaDTO adto) {
        String sql = "insert into agendas(idAgendamento, nomeCliente, conteudo, datas, hora) values (?, ?, ?, ?, ?)";
        conexao = new conexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adto.getIDclienteAgenda());
            pst.setString(2, adto.getCliente());
            pst.setString(3, adto.getConteudo());
//            pst.setDate(4, (Date) adto.getData());
            java.sql.Date sqlDate = new java.sql.Date(adto.getData().getTime());
            pst.setDate(4, sqlDate);

            pst.setString(5, adto.getHora());

            int add = pst.executeUpdate();
            if (add > 0) {
                pst.close();
                JOptionPane.showMessageDialog(null, "Agendado com sucesso!!!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "inserir agendamento" + e);
        }

    }

    public void pesquisar(agendaDTO adto) {
        String sql = "select*from agendas where idAgendamento = ?";
        conexao = conexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adto.getIDclienteAgenda());
            rs = pst.executeQuery();

            if (rs.next()) {
                telaAgenda.txtNomeCliente.setText(rs.getString(2));
                telaAgenda.txtAreaConteudo.setText(rs.getString(3));
                telaAgenda.txtData.setText(rs.getString(4));
                telaAgenda.txtHora.setText(rs.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Este agendamento não existe!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "método pesquisar" + e);

        }

    }
    
    public void excluir(agendaDTO adto){
    
        String sql = "delete from agendas where idAgendamento = ?";
        conexao = new conexaoDAO().conector();
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adto.getIDclienteAgenda());
            
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método deletar agendamento" + e);
        }
        
    }

}
