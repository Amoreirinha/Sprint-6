/**
 * Representa um console genérico.
 *
 * PARTE 1 (Encapsulamento): atributos privados, acessados apenas por getters.
 * PARTE 2 (Construtores): o objeto só pode nascer em um estado completo e
 * válido, pois nome, tipo e preco são obrigatórios no construtor.
 */
public class Console {
    private String nome;
    private String tipo;
    private double preco;

    public Console(String nome, String tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    // Não há setters de propósito: alterar nome/tipo/preco depois de criado
    // reabriria a porta para estados inválidos (ex.: preco negativo), que
    // era exatamente o problema do código original.
}
