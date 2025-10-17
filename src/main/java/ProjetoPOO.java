
import com.mycompany.projetopoo.CancelamentoProtesto;
import com.mycompany.projetopoo.Certidao;
import com.mycompany.projetopoo.Cliente;
import com.mycompany.projetopoo.Servico;
import com.mycompany.projetopoo.SistemaDePagamento;

public class ProjetoPOO {
    public static void main(String[] args) {
        // instanciar sistema
        SistemaDePagamento sistema = new SistemaDePagamento();

        // criar cliente
        Cliente c1 = new Cliente("Joao da Silva","12345678900","99999999","joao@email.com");
        sistema.cadastrarCliente(c1);
        
        Servico certidao = new Certidao(1, "Certidão de Nascimento", "A");
        Servico cancelamento = new CancelamentoProtesto(2, "Cancelamento Protesto Banco do Brasil", 150.0, "");
        
        sistema.registrarTransacao(c1, certidao, "15/09/2025");
        sistema.registrarTransacao(c1, cancelamento, "15/09/2025");
        
        sistema.exibirHistoricoTransacoes();
        System.out.println("Saldo total: R$" + sistema.calcularSaldoTotal());
    }
}
