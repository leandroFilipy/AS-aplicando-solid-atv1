import model.Pedido;
import repository.SalvarNoBancoDeDados;
import service.CalcularFrete;
import service.EnviarConfirmacaoPorEmail;
import service.ProcessadorDePedido;
import repository.SalvarNoBancoDeDados.*;

public class Main {
    public static void main(String[] args) {


                ProcessadorDePedido processador = new ProcessadorDePedido();
                Pedido pedido1 = new Pedido("PED-123", 600.00, 5, "cliente@email.com");

                try {
                    double total = processador.processar(pedido1);
                    System.out.println("Resultado final: Pedido processado com sucesso! Total:R$ " + total);

                } catch (Exception e) {
                    System.out.println("Erro ao processar pedido: " + e.getMessage());
                }

                CalcularFrete calcularFrete = new CalcularFrete();
                double valorFinal = calcularFrete.CalcularFrete(pedido1);

                SalvarNoBancoDeDados salvarNoBancoDeDados = new SalvarNoBancoDeDados();
                salvarNoBancoDeDados.salvarNoBancoDeDados(pedido1, valorFinal);

                EnviarConfirmacaoPorEmail enviarConfirmacaoPorEmail = new EnviarConfirmacaoPorEmail();
                enviarConfirmacaoPorEmail.enviarConfirmacaoPorEmail(pedido1.getEmailCliente(), pedido1.getId());
        }
}