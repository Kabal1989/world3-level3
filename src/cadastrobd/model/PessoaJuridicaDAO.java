/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

import cadastrobd.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kabal
 */
public class PessoaJuridicaDAO {
    private final Connection conn;

    public PessoaJuridicaDAO(Connection conn) {
        this.conn = conn;
    }

    public void incluir(PessoaJuridica pessoa) throws SQLException {
        String sql = "INSERT INTO PessoaJuridica (nome, email, telefone, estado, cnpj, logradouro, cidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getEstado());
            stmt.setString(5, pessoa.getCnpj());
            stmt.setString(6, pessoa.getLogradouro());
            stmt.setString(7, pessoa.getCidade());
            stmt.executeUpdate();
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    pessoa.setId(generatedKeys.getInt(1));
                }
            }
        }
    }

    public PessoaJuridica getPessoa(int id) throws SQLException {
        String sql = "SELECT * FROM PessoaJuridica WHERE id = ?";
        PessoaJuridica pessoa = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                pessoa = new PessoaJuridica();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setEstado(rs.getString("estado"));
                pessoa.setCnpj(rs.getString("cnpj"));
                pessoa.setLogradouro(rs.getString("logradouro"));
                pessoa.setCidade(rs.getString("cidade"));
            }
        }
        return pessoa;
    }
}