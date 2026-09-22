import java.util.List;

/**
 * PARTE 5 (Polimorfismo): a Loja trabalha apenas com o contrato IConsole,
 * sem nenhum if/else ou instanceof. Qualquer novo tipo de console que
 * implemente IConsole passa a funcionar aqui automaticamente.
 */
public class Loja {

    public void venderConsole(IConsole console) {
        console.ligar();
        double precoFinal = console.calcularPreco();
        System.out.println(console.getNome() + " -> Preço final: R$ " + precoFinal);
    }

    public void venderVarios(List<IConsole> consoles) {
        for (IConsole console : consoles) {
            venderConsole(console);
        }
    }

    public double calcularFaturamentoTotal(List<IConsole> consoles) {
        double total = 0;
        for (IConsole console : consoles) {
            total += console.calcularPreco();
        }
        return total;
    }
}
