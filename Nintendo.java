/**
 * PARTE 3: console Nintendo, com 10% de acréscimo sobre o preço base.
 */
public class Nintendo implements IConsole {
    private DadosConsole dados;

    public Nintendo(String nome, double precoBase) {
        this.dados = new DadosConsole(nome, precoBase);
    }

    @Override
    public void ligar() {
        System.out.println("Nintendo ligado.");
    }

    @Override
    public double calcularPreco() {
        return dados.getPrecoBase() * 1.10; // 10%
    }

    @Override
    public String getNome() {
        return dados.getNome();
    }
}
