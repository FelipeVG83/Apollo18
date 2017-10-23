/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fiap.dao;

import br.fiap.conexao.Conexao;
import br.fiap.entity.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Celso
 */
public class UsuarioDAO {
    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    private Connection conexao;
    private PreparedStatement p;
    private ResultSet rs;
    private String sql;
    
    public int pesquisarUsuario(Usuario usuario){
        int tipoUsuario = 0;
        sql = "SELECT * FROM USUARIOS WHERE email = ? AND senha = ?";
        
        try {
            conexao = Conexao.getConnection();
            p = conexao.prepareStatement(sql);
            p.setString(1, usuario.getEmail());
            p.setString(2, usuario.getSenha());
            rs = p.executeQuery();
            if(rs.next()) {
                tipoUsuario = rs.getInt("usuarios_tipo_id");
               
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Senha ou E-mail incorretos " + e);
        }
        
        return tipoUsuario;
    }
    
     public boolean inserirUsuario(Usuario usuario){
        boolean status = false;
        sql = "INSERT INTO USUARIOS VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
     
        try {
            conexao = Conexao.getConnection();
            p = conexao.prepareStatement(sql);
            p.setInt(1, usuario.getId_usuario());
            p.setString(2, usuario.getNome());
            p.setString(3, usuario.getCpf());
            p.setString(4, usuario.getSenha());
            p.setString(5, usuario.getFoto());
            p.setString(6, usuario.getEmail());
            p.setString(7, usuario.getTelefone());
            p.setString(8, usuario.getCelular());
            p.setString(9, usuario.getCep());
            p.setString(10, usuario.getEndereco());
            p.setInt(11, usuario.getNumero());
            p.setString(12, usuario.getBairro());
            p.setString(13, usuario.getCidade());
            p.setString(14, usuario.getEstado());
            p.setString(15, usuario.getPais());
            p.setInt(16, 0);           
            p.setDate(17, usuario.getDataCadastro());
            p.setInt(18, usuario.getTipoUsuario());
            p.execute(); //p.executeUpdate();
            status = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo usuário!" + e);
        }
        return status;
    }
}

        
        
    