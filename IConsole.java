/**
 * PARTE 3 (Interface): contrato comum que todo tipo de console precisa
 * cumprir, permitindo que a Loja trate qualquer console de forma uniforme
 * (polimorfismo, ver PARTE 5).
 */
public interface IConsole {
    void ligar();
    double calcularPreco();
    String getNome();
}
