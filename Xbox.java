/**
 * PARTE 5 (Extensibilidade / OCP): novo tipo de console, adicionado ao
 * sistema sem alterar nenhuma linha da classe Loja.
 */
public class Xbox implements IConsole {
    private DadosConsole dados;

    public Xbox(String nome, double precoBase) {
        this.dados = new DadosConsole(nome, precoBase);
    }

    @Override
    public void ligar() {
        System.out.println("Xbox ligado.");
    }

    @Override
    public double calcularPreco() {
        return dados.getPrecoBase() * 1.18; // 18%
    }

    @Override
    public String getNome() {
        return dados.getNome();
    }
}
