package br.com.fiap.view;

import br.com.fiap.controller.FilmeController;
import br.com.fiap.model.dto.Filme;

import javax.swing.*;
import java.util.ArrayList;

public class FilmeView {
    public static void main(String[] args) {
        String codigo, titulo, genero, produtora;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        int opcao;
        FilmeController filmeController = new FilmeController();

        do {
            try {
                opcao = JOptionPane.showOptionDialog(null,
                    "Escolha uma das opções abaixo para manipular um Filme",
                    "Escolha",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    escolha,
                    escolha[0]);

                switch (opcao) {
                    case 0:
                        titulo = JOptionPane.showInputDialog("Digite o título do filme");
                        genero = JOptionPane.showInputDialog("Digite o gênero do filme");
                        produtora = JOptionPane.showInputDialog("Digite a produtora do filme");
                        System.out.println(filmeController.inserirFilme(titulo, genero, produtora));
                        break;

                    case 1:
                        codigo = JOptionPane.showInputDialog("Digite o código do filme");
                        titulo = JOptionPane.showInputDialog("Digite o NOVO título do filme");
                        genero = JOptionPane.showInputDialog("Digite o NOVO gênero do filme");
                        produtora = JOptionPane.showInputDialog("Digite a NOVA produtora do filme");
                        System.out.println(filmeController.alterarFilme(Integer.parseInt(codigo), titulo, genero, produtora));
                        break;

                    case 2:
                        codigo = JOptionPane.showInputDialog("Digite o código do filme");
                        System.out.println(filmeController.excluirFilme(Integer.parseInt(codigo)));
                        break;

                    case 3:
                        ArrayList<Filme> filmes = filmeController.listarTodosFilmes();

                        if (filmes.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum filme encontrado no banco de dados.");
                        } else {
                            StringBuilder lista = new StringBuilder();
                            lista.append("=== LISTA DE FILMES ===\n\n");

                            for (Filme filme : filmes) {
                                lista.append("Código: ").append(filme.getCodigo()).append("\n");
                                lista.append("Título: ").append(filme.getTitulo()).append("\n");
                                lista.append("Gênero: ").append(filme.getGenero()).append("\n");
                                lista.append("Produtora: ").append(filme.getProdutora()).append("\n");
                                lista.append("------------------------\n");
                            }

                            JOptionPane.showMessageDialog(null, lista.toString());
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
