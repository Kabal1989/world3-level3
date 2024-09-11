/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd;

/**
 *
 * @author kabal
 */
public class CadastroBDMain {
    public static void main(String[] args) {
        System.out.println("Sistema de Cadastro Iniciado!");

        
        Menu menu = new Menu();
        menu.exibirMenu();
    }

    private static class Menu {

        public Menu() {
        }

        private void exibirMenu() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}