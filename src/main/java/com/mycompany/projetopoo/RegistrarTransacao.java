package com.mycompany.projetopoo;

import com.mycompany.projetopoo.CancelamentoProtesto;
import com.mycompany.projetopoo.Certidao;
import com.mycompany.projetopoo.Cliente;
import com.mycompany.projetopoo.Servico;
import com.mycompany.projetopoo.SistemaDePagamento;
import com.mycompany.projetopoo.Transacao;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ClienteEscolher = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ServicoEscolher = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CampoData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoValor = new javax.swing.JTextField();
        CampoObservacao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        BotaoRegistrarTransacao = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Data:");

        ClienteEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteEscolherActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Serviço:");

        ServicoEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicoEscolherActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Observação:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Valor:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cliente:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CampoObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClienteEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ServicoEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoRegistrarTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServicoEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRegistrarTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Registro Transação");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel8)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed

    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void ClienteEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteEscolherActionPerformed

    }//GEN-LAST:event_ClienteEscolherActionPerformed

    private void ServicoEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicoEscolherActionPerformed
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
    }//GEN-LAST:event_ServicoEscolherActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        this.dispose();
        tela.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoRegistrarTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarTransacaoActionPerformed
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();

        String dataTexto = CampoData.getText();
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);

        if (dataTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Data é obrigatório.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            formatadorData.parse(dataTexto);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this,
                    "Formato de data inválido. Use o formato dd/MM/yyyy (ex: 29/10/2025).",
                    "Erro de Data",
                    JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se o formato for inválido
        }

        String valorTexto = CampoValor.getText().replace(',', '.'); // Troca vírgula por ponto para o parse
        double valor;
        try {
            valor = Double.parseDouble(valorTexto);
            if (valor < 0) {
                JOptionPane.showMessageDialog(this, "O valor não pode ser negativo.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O valor deve ser um número válido (ex: 10.50).", "Erro de Valor", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String clienteNome = (String) ClienteEscolher.getSelectedItem();
        String servicoDescricao = (String) ServicoEscolher.getSelectedItem();
        String data = CampoData.getText();

        if (clienteNome == null || servicoDescricao == null || data.isEmpty() || CampoValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios (Cliente, Serviço, Data, Valor).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Busca de IDs no Banco 
        int idCliente = sistema.getIdClientePorNome(clienteNome);
        int idServico = sistema.getIdServicoPorDescricao(servicoDescricao);

        if (idCliente == -1 || idServico == -1) {
            JOptionPane.showMessageDialog(this, "Erro de persistência: Cliente ou Serviço não encontrado no banco de dados. Verifique o console.", "Erro de Persistência", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Criação e Registro da Transação
        try {

            Transacao novaTransacao = new Transacao(idCliente, idServico, data, valor);

            sistema.registrarTransacao(novaTransacao);

            JOptionPane.showMessageDialog(this, "Transação registrada com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            CampoData.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao tentar registrar a transação: " + e.getMessage(), "Erro no Registro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoRegistrarTransacaoActionPerformed

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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
