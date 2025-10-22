
package com.mycompany.projetopoo;

import com.mycompany.projetopoo.CancelamentoProtesto;
import com.mycompany.projetopoo.Certidao;
import com.mycompany.projetopoo.Cliente;
import com.mycompany.projetopoo.Servico;
import com.mycompany.projetopoo.SistemaDePagamento;
import com.mycompany.projetopoo.Transacao;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.List;


public class RegistrarTransacao extends javax.swing.JFrame {

    private final List<Servico> listaServicos;

    public RegistrarTransacao() {
        initComponents();
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();


        this.listaServicos = sistema.getServicos(); // Dados do Banco

        for (Servico s : this.listaServicos) { //lista armazenada
            ServicoEscolher.addItem(s.getDescricao());
        }

        for (Cliente c : sistema.getClientes()) {
            ClienteEscolher.addItem(c.getNome());
        }
        ServicoEscolher.addActionListener(e -> {
            String descricaoSelecionada = (String) ServicoEscolher.getSelectedItem();
            
            if (descricaoSelecionada == null) {
                return;
            }


            Servico servicoSelecionado = null;
            for (Servico s : this.listaServicos) {
                if (s.getDescricao().equals(descricaoSelecionada)) {
                    servicoSelecionado = s;
                    break;
                }
            }
            
            if (servicoSelecionado == null) {
                CampoValor.setText(""); 
                CampoValor.setEditable(false);
                return;
            }
            

            double valor = servicoSelecionado.getValor();
            
            if (valor == 0.0) {

                CampoValor.setText("0.00");
                CampoValor.setEditable(true); //edição
                
                //editar a descrição
                if (descricaoSelecionada.equals("Outros (Especificar)")) {
                    CampoDescricao.setEditable(true);
                } else {
                    CampoDescricao.setEditable(false);
                }
                
            } else {
                //valor fixo do banco
                CampoValor.setText(String.format("%.2f", valor));
                CampoValor.setEditable(false); // Não permite edição
                CampoDescricao.setEditable(false);
            }
        });
    } // Fim do construtor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ClienteEscolher = new javax.swing.JComboBox<>();
        ServicoEscolher = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CampoObservacao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        BotaoRegistrarTransacao = new javax.swing.JButton();

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Serviço:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Valor:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        ClienteEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteEscolherActionPerformed(evt);
            }
        });

        ServicoEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicoEscolherActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Observação:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Data:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setText("Registro Transação");

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        BotaoRegistrarTransacao.setText("Registrar");
        BotaoRegistrarTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarTransacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(BotaoRegistrarTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ClienteEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ServicoEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServicoEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoRegistrarTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed

    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        this.dispose();
        tela.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoRegistrarTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarTransacaoActionPerformed
     SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
    
    // 1. Coleta e validação dos dados da interface
    String clienteNome = (String) ClienteEscolher.getSelectedItem();
    String servicoDescricao = (String) ServicoEscolher.getSelectedItem();
    String data = CampoData.getText();
    double valor;
    
    if (clienteNome == null || servicoDescricao == null || data.isEmpty() || CampoValor.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios (Cliente, Serviço, Data, Valor).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Tenta converter o valor (crucial para evitar erros de formato ou texto)
    try {
        // Assume que o usuário pode ter digitado vírgula ou ponto
        String valorTexto = CampoValor.getText().replace(',', '.'); 
        valor = Double.parseDouble(valorTexto);
        
        if (valor <= 0.0) {
            JOptionPane.showMessageDialog(this, "O valor da transação deve ser positivo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Valor inválido. Use apenas números no formato correto (ex: 55.51).", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // 2. Busca de IDs no Banco (via SistemaDePagamento, que chama os DAOs)
    int idCliente = sistema.getIdClientePorNome(clienteNome);
    int idServico = sistema.getIdServicoPorDescricao(servicoDescricao);

    if (idCliente == -1 || idServico == -1) {
        JOptionPane.showMessageDialog(this, "Erro de persistência: Cliente ou Serviço não encontrado no banco de dados. Verifique o console.", "Erro de Persistência", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // 3. Criação e Registro da Transação
    try {
        // Cria a Transação usando os IDs (o novo construtor)
        Transacao novaTransacao = new Transacao(idCliente, idServico, data, valor); 
        
        // Chama o método que delega a inserção ao TransacaoDAO
        sistema.registrarTransacao(novaTransacao); 

        JOptionPane.showMessageDialog(this, "Transação registrada com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        // Limpar os campos para o próximo registro
        CampoData.setText("");
        // Não limpamos CampoValor e CampoDescricao, pois o ActionListener do Serviço deve redefinir eles.
        
    } catch (Exception e) {
        // Captura qualquer erro inesperado (como falha de conexão)
        JOptionPane.showMessageDialog(this, "Ocorreu um erro ao tentar registrar a transação: " + e.getMessage(), "Erro no Registro", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_BotaoRegistrarTransacaoActionPerformed

    private void ServicoEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicoEscolherActionPerformed
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
    }//GEN-LAST:event_ServicoEscolherActionPerformed

    private void ClienteEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteEscolherActionPerformed

    }//GEN-LAST:event_ClienteEscolherActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(RegistrarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(RegistrarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(RegistrarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(RegistrarTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new RegistrarTransacao().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoRegistrarTransacao;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoData;
    private javax.swing.JTextField CampoDescricao;
    private javax.swing.JTextField CampoObservacao;
    private javax.swing.JTextField CampoValor;
    private javax.swing.JComboBox<String> ClienteEscolher;
    private javax.swing.JComboBox<String> ServicoEscolher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
