package br.com.fiap.bean;

import java.io.IOException;

/**
 * Interface que define operações de persistência para objetos da classe {@link DragonBallSuper}.
 *
 * Fornece métodos para leitura e gravação de personagens em arquivos de texto.
 */
public interface IDBSuper {
    public DragonBallSuper ler (String path) throws IOException;
    public String gravar (String path);
}
