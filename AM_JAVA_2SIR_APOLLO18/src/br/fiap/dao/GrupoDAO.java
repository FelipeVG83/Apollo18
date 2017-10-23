/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fiap.dao;

import br.fiap.conexao.Conexao;
import br.fiap.entity.Grupo;
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
public class GrupoDAO {
    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private Connection conexao;
    private PreparedStatement p;
    private ResultSet rs;
    private String sql;
    
    public int pesquisarUsuario(Grupo grupo){
        int tipoUsuario = 0;
        sql = "SELECT * FROM GRUPOS WHERE email = ? AND senha = ?";
        
        try {
            conexao = Conexao.getConnection();
            p = conexao.prepareStatement(sql);
//            p.setString(1, usuario.getEmail());
//            p.setString(2, usuario.getSenha());;
            rs = p.executeQuery();
            if(rs.next()) {
                tipoUsuario = rs.getInt("usuarios_tipo_id");
               
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Senha ou E-mail incorretos " + e);
        }
        
        return tipoUsuario;
    }
    
     public boolean inserirGrupo(Grupo grupo){
        boolean status = false;
        sql = "INSERT INTO GRUPOS VALUES(?, ?, ?, ?, ?)";
     
        try {
            conexao = Conexao.getConnection();
            p = conexao.prepareStatement(sql);
            p.setInt(1, grupo.getId_Grupo());
            p.setString(2, grupo.getNome());
            p.setString(3, grupo.getNome_Foguete());
            p.setDate(4, grupo.getDataCadastro());
            p.setString(5, grupo.getNome_Responsavel());
            p.execute();
            status = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo Grupo!\n" + e);
        }
        return status;
    }
}
