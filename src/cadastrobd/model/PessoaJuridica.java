/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

/**
 *
 * @author kabal
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String logradouro;
    private String cidade;

    public PessoaJuridica() {}

    public PessoaJuridica(String nome, String email, String telefone, String estado, String cnpj, String logradouro, String cidade) {
        super(nome, email, telefone, estado);
        this.cnpj = cnpj;
        this.logradouro = logradouro;
        this.cidade = cidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nLogradouro: " + logradouro + "\nCidade: " + cidade + "\n" + super.toString() + "\nCNPJ: " + cnpj;
    }
}
