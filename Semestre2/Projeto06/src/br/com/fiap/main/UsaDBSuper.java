package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

/**
 * Método principal que executa o fluxo de cadastro e consulta de personagens
 * da classe {@link DragonBallSuper}.
 * O usuário pode escolher entre:
 * <ul>
 *   <li><b>1. Cadastrar:</b> insere os dados do personagem e grava em arquivo texto.</li>
 *   <li><b>2. Consultar:</b> lê os dados de um personagem a partir de um arquivo texto.</li>
 * </ul>
 */
public class UsaDBSuper {
    public static void main(String[] args) {
    String nome, path;
    int opcao, ki, tecnicas, velocidade, transformacoes;;
    DragonBallSuper db;
		do {
        try {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha:\n1.Cadastrar\n2.Consultar"));
            path = JOptionPane.showInputDialog("Digite caminho da pasta");
            db = new DragonBallSuper();
            switch (opcao) {
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o nome do personagem");
                    ki = Integer.parseInt(JOptionPane.showInputDialog("Digite o ki do personagem"));
                    tecnicas = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor das tecnicas do personagem"));
                    velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da velocidade do personagem"));
                    transformacoes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de transformações do personagem"));

                    db.setNome(nome);
                    db.setKi(ki);
                    db.setTecnicas(tecnicas);
                    db.setVelocidade(velocidade);
                    db.setTransformacoes(transformacoes);
                    JOptionPane.showMessageDialog(null,db.gravar(path));
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Digite o nome do personagem");
                    db.setNome(nome);
                    db = db.ler(path);
                    if (db == null) {
                        JOptionPane.showMessageDialog(null,
                                "Caminho e/ou nome informado inexistente");
                    } else {
                        JOptionPane.showMessageDialog(null,"Exibindo dados:"
                                + "\nCaminho: " + path
                                + "\nArquivo: " + path + "/" + db.getNome() + ".txt"
                                + "\nNome: " + db.getNome()
                                + "\nKi: " + db.getKi()
                                + "\nTécnicas: " + db.getTecnicas()
                                + "\nVelocidade: " + db.getVelocidade()
                                + "\nTransformações: " + db.getTransformacoes());
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha incorreta");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de Conversão!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Acessar Arquivo!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
