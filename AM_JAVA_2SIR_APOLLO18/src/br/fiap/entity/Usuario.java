package br.fiap.entity;
import java.sql.Date;

public class Usuario {
    private int id_usuario;
    private String Nome;
    private String cpf;
    private String senha;
    private String foto;
    private String email;
    private String telefone;
    private String celular;
    private String endereco;
    private int numero;
    private String cep;
    private String bairro;
    private String estado;
    private String cidade;
    private String pais;
    private int tentativas;
    private int tipoUsuario;
    private Date dataCadastro;
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
       public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date Data) {
        this.dataCadastro = Data;
    }

    
    
    public Usuario(int id_usuario, String Nome, String cpf, String senha, String foto, String email, String telefone, String celular, String endereco, int numero, String cep, String bairro, String estado, String cidade, String pais, int tentativas, int tipoUsuario, Date dataCadastro) {
        this.id_usuario = id_usuario;
        this.Nome = Nome;
        this.cpf = cpf;
        this.senha = senha;
        this.foto = foto;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.pais = pais;
        this.tentativas = tentativas;
        this.tipoUsuario = tipoUsuario;
        this.dataCadastro = dataCadastro;
    }
    
    public Usuario(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    
    
    
   
}