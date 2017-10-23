/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fiap.dao;

import br.fiap.conexao.Conexao;
import br.fiap.entity.Competicao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Gonzalez
 */
public class CompeticaoDAO {
    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private Connection conexao;
    private PreparedStatement p;
    private ResultSet rs;
    private String sql;
    
//    public int pesquisarCompeticao(Competicao competicao){
//        int tipoUsuario = 0;
//        sql = "SELECT * FROM GRUPOS WHERE email = ? AND senha = ?";
//        
//        try {
//            conexao = Conexao.getConnection();
//            p = conexao.prepareStatement(sql);
////            p.setString(1, competicao.getEmail());
////            p.setString(2, competicao.getSenha());;
//            rs = p.executeQuery();
//            if(rs.next()) {
//                tipoUsuario = rs.getInt("competicaos_tipo_id");
//               
//            }
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Senha ou E-mail incorretos " + e);
//        }
//        
//        return tipoUsuario;;
//    }
      
    public boolean inserirCompeticao(Competicao competicao){
        boolean status = false;
        sql = "INSERT INTO COMPETICOES VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
     
        try {
            conexao = Conexao.getConnection();
            p = conexao.prepareStatement(sql);
            p.setInt(1, competicao.getId_Competicao());
            p.setString(2, competicao.getNome());
            p.setDate(3, competicao.getData());
            p.setString(4, competicao.getResponsavel());
            p.setString(5, competicao.getPremio());
            p.setInt(6, competicao.getQtd_Lancamentos());
            p.setString(7, competicao.getEndereco());
            p.setInt(8, competicao.getNumero());
            p.setString(9, competicao.getBairro());
            p.setString(10, competicao.getCidade());
            p.setString(11, competicao.getEstado());
            p.setString(12, competicao.getPais());
            p.setString(13, competicao.getComplemento());
            p.setString(14, competicao.getObservacao());
            p.setString(15, competicao.getCEP());
            
            p.execute();
            status = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar nova Competição!\n" + e);
        }
        return status;
    }
}
