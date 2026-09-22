/**
 * PARTE 3: console Playstation, com 20% de acréscimo sobre o preço base.
 *
 * PARTE 4: o atributo "dados" é protected (em vez de private) para que a
 * subclasse PlaystationPortatil consiga acessá-lo diretamente na herança.
 */
public class Playstation implements IConsole {
    protected DadosConsole dados;

    public Playstation(String nome, double precoBase) {
        this.dados = new DadosConsole(nome, precoBase);
    }

    @Override
    public void ligar() {
        System.out.println("Playstation ligado.");
    }

    @Override
    public double calcularPreco() {
        return dados.getPrecoBase() * 1.20; // 20%
    }

    @Override
    public String getNome() {
        return dados.getNome();
    }
}
