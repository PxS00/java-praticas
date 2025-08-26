package br.com.fiap.bean;
import java.io.*;

/**
 * Classe que representa um personagem de Dragon Ball Super,
 * contendo atributos como nome, ki, técnicas, velocidade e transformações.
 *
 * Implementa a interface {@link IDBSuper} para permitir
 * operações de leitura e gravação em arquivos.
 */

public class DragonBallSuper implements IDBSuper {
    private String nome;
    private int ki, tecnicas, velocidade, transformacoes;

    public DragonBallSuper() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTransformacoes() {
        return transformacoes;
    }

    public void setTransformacoes(int transformacoes) {
        this.transformacoes = transformacoes;
    }

    /**
     * Lê os dados de um personagem a partir de um arquivo texto localizado no diretório informado.
     * O arquivo deve ter as linhas na seguinte ordem: nome, ki, técnicas, velocidade, transformações.
     *
     * @param path diretório onde o arquivo será buscado
     * @return objeto {@code DragonBallSuper} preenchido com os dados lidos
     * @throws IOException caso ocorra erro de leitura
     */
    @Override
    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(path + "/" + nome + ".txt"));
        nome = br.readLine();
        ki = Integer.parseInt(br.readLine());
        tecnicas = Integer.parseInt(br.readLine());
        velocidade = Integer.parseInt(br.readLine());
        transformacoes = Integer.parseInt(br.readLine());
        br.close();
        return this;
    }

    /**
     * Grava os dados do personagem em um arquivo texto no diretório informado.
     * Caso o diretório não exista, ele será criado. O arquivo terá o nome do personagem.
     *
     * @param path diretório onde o arquivo será salvo
     * @return mensagem indicando sucesso ou falha na gravação
     */
    @Override
    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
            pw.println(nome);
            pw.println(ki);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(transformacoes);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso";
        } catch (IOException e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}