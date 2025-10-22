package com.mycompany.projetopoo;

import com.mycompany.projetopoo.dao.ClienteDAO;
import com.mycompany.projetopoo.dao.ServicoDAO;
import com.mycompany.projetopoo.dao.TransacaoDAO;
import java.util.List;

public class SistemaDePagamento {

    private static SistemaDePagamento instancia;
    private final ClienteDAO clienteDAO;
    private final ServicoDAO servicoDAO;
    private final TransacaoDAO transacaoDAO;

    public SistemaDePagamento() {
        // A criação do cliente padrão é mantida, mas a persistência deve ser feita
        // em um método de inicialização se a tabela estiver vazia.
        Cliente padrao = new Cliente("Padrão (PIX/Balcão)", "00000000000", "00000000000", "padrao@sistema.com");

        this.clienteDAO = new ClienteDAO();
        this.servicoDAO = new ServicoDAO();
        this.transacaoDAO = new TransacaoDAO();
    }

    public static SistemaDePagamento getInstancia() {
        if (instancia == null) {
            instancia = new SistemaDePagamento();
        }
        return instancia;
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.cadastrar(cliente);
        System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso!");
    }

    public void limparClientes() {
        clienteDAO.limparTodos();
    }

    public void registrarTransacao(Transacao transacao) {
        transacaoDAO.registrarTransacao(transacao);
    }

    public int getIdClientePorNome(String nome) {
        return clienteDAO.buscarIdPorNome(nome);
    }

    public int getIdServicoPorDescricao(String descricao) {
        return servicoDAO.buscarIdPorDescricao(descricao);
    }

    public List<Cliente> getClientes() {
        return clienteDAO.buscarTodos();
    }

    public List<Servico> getServicos() {
        return servicoDAO.buscarTodos();
    }

    public List<Transacao> getTransacoes() {
        return transacaoDAO.buscarTodas();
    }

    public double calcularSaldoTotal() {
        double saldo = 0.0;

        for (Transacao transacao : getTransacoes()) {
            saldo += transacao.getvalor();
        }
        return saldo;
    }

    public String getClienteNomePorId(int id) {
        Cliente c = clienteDAO.buscarPorId(id);
        return (c != null) ? c.getNome() : "Cliente Não Encontrado";
    }

    public String getServicoDescricaoPorId(int id) {
        return servicoDAO.buscarDescricaoPorId(id);
    }
}
