package com.mycompany.projetopoo;

import com.mycompany.projetopoo.dao.ClienteDAO;
import com.mycompany.projetopoo.Cliente;
import com.mycompany.projetopoo.Cliente;
import com.mycompany.projetopoo.Transacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SistemaDePagamento {

    private static SistemaDePagamento instancia;
    private List<Cliente> clientes;
    private List<Transacao> transacao;
    private final ClienteDAO clienteDAO;

    public SistemaDePagamento() {
        this.clientes = new ArrayList<>();
        this.transacao = new ArrayList<>();
        Cliente padrao = new Cliente("Padrão (PIX/Balcão)", "00000000000", "00000000000", "padrao@sistema.com");
        this.clientes.add(padrao);
        this.clienteDAO = new ClienteDAO();

    }

    public static SistemaDePagamento getInstancia() {
        if (instancia == null) {
            instancia = new SistemaDePagamento();
        }
        return instancia;
    }

    public void cadastrarCliente(Cliente cliente) {
        // A linha chave: em vez de adicionar na lista (this.clientes.add(cliente);),
        // chame o método do DAO, que fará o INSERT no banco.
        clienteDAO.cadastrar(cliente);

        // O restante do código pode ser mantido
        System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso!");
    }

    public void registrarTransacao(Cliente cliente, Servico servico, String data) {
        Transacao novaTransacao = new Transacao(cliente, servico, data);
        this.transacao.add(novaTransacao);
        System.out.println("Transação registrada para " + cliente.getNome() + ". Valor: R$" + servico.getValor());
    }

    public void exibirHistoricoTransacoes() {
        for (Transacao transacao : this.transacao) {
            JOptionPane.showMessageDialog(null, "Data: " + transacao.getdata() + " | Cliente: " + transacao.getCliente().getNome() + " | Serviço: " + transacao.getservico().getDescricao() + " | Valor: R$" + transacao.getvalor());
        }
    }


    public void limparClientes() {
        clienteDAO.limparTodos();
    }

    public double calcularSaldoTotal() {
        double saldo = 0.0;
        for (int i = 0; i < this.transacao.size(); i++) {
            Transacao transacao = this.transacao.get(i);
            saldo += transacao.getvalor();
        }
        return saldo;
    }

    public List<Cliente> getClientes() {
        return clienteDAO.buscarTodos();
    }

    public List<Transacao> getTransacoes() {
        return transacao;
    }

}
