/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd;

import cadastrobd.model.PessoaFisicaDAO;
import cadastrobd.model.PessoaJuridicaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kabal
 */
public class CadastroBDTeste {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=CadastroBD;user=sa;password=your_password")) {
            PessoaFisicaDAO pfDAO = new PessoaFisicaDAO(conn);
            PessoaFisica pf = new PessoaFisica("João", "joao@riacho.com", "1111-1111", "PA", "11111111111");
            pfDAO.incluir(pf);
            System.out.println(pf);

            PessoaJuridicaDAO pjDAO = new PessoaJuridicaDAO(conn);
            PessoaJuridica pj = new PessoaJuridica("JJC", "jjc@riacho.com", "1212-1212", "PA", "11111111111111", "Rua 11, Centro", "Riacho do Sul");
            pjDAO.incluir(pj);
            System.out.println(pj);
        } catch (SQLException e) {
        }
    }
}