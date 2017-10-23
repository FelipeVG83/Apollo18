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
public class Competicao {
    private int Id_Competicao;
    private String Nome;
    private Date Data;
    private String Responsavel;
    private String Premio;
    private int Qtd_Lancamentos;
    private String Endereco;
    private int Numero;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Pais;
    private String Complemento;
    private String Observacao;
    private String CEP;   

    public int getId_Competicao() {
        return Id_Competicao;
    }

    public void setId_Competicao(int Id_Competicao) {
        this.Id_Competicao = Id_Competicao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    public String getPremio() {
        return Premio;
    }

    public void setPremio(String Premio) {
        this.Premio = Premio;
    }

    public int getQtd_Lancamentos() {
        return Qtd_Lancamentos;
    }

    public void setQtd_Lancamentos(int Qtd_Lancamentos) {
        this.Qtd_Lancamentos = Qtd_Lancamentos;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Competicao(int Id_Competicao, String Nome, Date Data, String Responsavel, String Premio, int Qtd_Lancamentos, String Endereco, int Numero, String Bairro, String Cidade, String Estado, String Pais, String Complemento, String Observacao, String CEP) {
        this.Id_Competicao = Id_Competicao;
        this.Nome = Nome;
        this.Data = Data;
        this.Responsavel = Responsavel;
        this.Premio = Premio;
        this.Qtd_Lancamentos = Qtd_Lancamentos;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
        this.Complemento = Complemento;
        this.Observacao = Observacao;
        this.CEP = CEP;
    }
    
    
}
