/**
 * PARTE 3 (Composição): representa os dados que todo console tem em comum
 * (nome e preço base). Em vez de repetir esses dois campos dentro de cada
 * classe de console, cada uma passa a "ter um" DadosConsole.
 */
public class DadosConsole {
    private String nome;
    private double precoBase;

    public DadosConsole(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}
