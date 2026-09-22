/**
 * PARTE 4 (Herança apropriada): PlaystationPortatil especializa Playstation
 * sem quebrar nenhuma promessa da superclasse — ela apenas muda O CÁLCULO
 * de ligar()/calcularPreco(), nunca se recusa a executá-los. Por isso não
 * viola o Princípio de Substituição de Liskov (LSP), diferente de um
 * método que lançasse UnsupportedOperationException.
 */
public class PlaystationPortatil extends Playstation {

    public PlaystationPortatil(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public void ligar() {
        System.out.println("Playstation Portátil ligado.");
    }

    @Override
    public double calcularPreco() {
        return dados.getPrecoBase() * 1.15; // percentual próprio: 15%
    }

    // getNome() é herdado de Playstation sem sobrescrita — continua
    // válido e coerente, então não há motivo para reescrevê-lo.
}
