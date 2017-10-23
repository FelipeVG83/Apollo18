/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fiap.entity;

import java.sql.Date;

/**
 *
 * @author Felipe Gonzalez
 */
public class Grupo {
    
    private int Id_Grupo;
    private String Nome;
    private String Nome_Foguete;
    private String Nome_Responsavel;
    private Date dataCadastro;

    public int getId_Grupo() {
        return Id_Grupo;
    }

    public void setId_Grupo(int Id_Grupo) {
        this.Id_Grupo = Id_Grupo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome_Foguete() {
        return Nome_Foguete;
    }

    public void setNome_Foguete(String Nome_Foguete) {
        this.Nome_Foguete = Nome_Foguete;
    }

    public String getNome_Responsavel() {
        return Nome_Responsavel;
    }

    public void setNome_Responsavel(String Nome_Responsavel) {
        this.Nome_Responsavel = Nome_Responsavel;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Grupo(int Id_Grupo, String Nome, String Nome_Foguete, String Nome_Responsavel, Date dataCadastro) {
        this.Id_Grupo = Id_Grupo;
        this.Nome = Nome;
        this.Nome_Foguete = Nome_Foguete;
        this.Nome_Responsavel = Nome_Responsavel;
        this.dataCadastro = dataCadastro;
    }
            
}
