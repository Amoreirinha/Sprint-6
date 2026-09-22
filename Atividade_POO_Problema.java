import java.util.ArrayList;
import java.util.List;

/**
 * Atividade de revisão — Conceitos fundamentais de Orientação a Objetos
 *
 * Ponto de entrada do programa. Monta os consoles, vende a lista inicial,
 * depois adiciona um Xbox e repete a venda — sem alterar nenhuma linha de
 * Loja — demonstrando o Princípio Aberto/Fechado (OCP).
 */
public class Atividade_POO_Problema {

    public static void main(String[] args) {

        Nintendo nintendo = new Nintendo("Nintendo Switch", 2000);
        Playstation playstation = new Playstation("Playstation 5", 3000);
        PlaystationPortatil portatil = new PlaystationPortatil("Playstation Portátil", 2500);

        Loja loja = new Loja();

        List<IConsole> consoles = new ArrayList<>();
        consoles.add(nintendo);
        consoles.add(playstation);
        consoles.add(portatil);

        System.out.println("=== Venda inicial ===");
        loja.venderVarios(consoles);
        System.out.println("Faturamento total: R$ " + loja.calcularFaturamentoTotal(consoles));

        // PARTE 5.4/5.5 — adicionando um novo tipo de console (Xbox) à
        // lista, sem alterar nenhuma linha da classe Loja.
        Xbox xbox = new Xbox("Xbox Series X", 2800);
        consoles.add(xbox);

        System.out.println();
        System.out.println("=== Venda com Xbox adicionado ===");
        loja.venderVarios(consoles);
        System.out.println("Faturamento total: R$ " + loja.calcularFaturamentoTotal(consoles));
    }
}
