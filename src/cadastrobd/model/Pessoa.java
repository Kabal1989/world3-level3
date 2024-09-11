/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

import java.io.Serializable;

/**
 *
 * @author kabal
 */
public class Pessoa implements Serializable {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String estado;

    public Pessoa() {}

    public Pessoa(String nome, String email, String telefone, String estado) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.estado = estado;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estado: " + estado + "\nTelefone: " + telefone + "\nE-mail: " + email;
    }
}