package com.panacademy.grupox.bluebankx.model;

import com.panacademy.grupox.bluebankx.helpers.UF;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")
public class ClienteModel extends AbstractEntity<Long>{
    @Column(name = "id_cliente", nullable = false, unique = true, columnDefinition = "INT")
    private Integer id;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false, columnDefinition = "DATE")
    private LocalDate dataNasc;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone", nullable = false, unique = true)
    private String telefone;

    @Column(name = "profissao", nullable = false)
    private String profissao;

    @Column(name = "renda", nullable = false, columnDefinition = "DECIMAL(8, 2) DEFAULT 0.00")
    private BigDecimal renda;

    @Column(name = "patrimonio", nullable = false, columnDefinition = "DECIMAL(11, 2) DEFAULT 0.00")
    private BigDecimal patrimonio;

    //Endereço
    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "complemento", nullable = true)
    private String complemento;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Column(name = "uf", nullable = false)
    private UF uf;

    // CONTA
    @OneToOne
    @JoinColumn(name = "conta_model_id_fk")
    private ContaModel contaModel;

    public ContaModel getContaModel() {
        return contaModel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }

    public BigDecimal getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(BigDecimal patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public void setContaModel(ContaModel contaModel) {
        this.contaModel = contaModel;
    }
}
