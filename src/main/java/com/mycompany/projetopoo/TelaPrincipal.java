package com.mycompany.projetopoo;

import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.projetopoo.RegistrarTransacao;
import com.mycompany.projetopoo.SistemaDePagamento;
import com.mycompany.projetopoo.TelaCadastroCliente;
import java.awt.event.ActionEvent;
import java.util.List;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setTitle("Sistema de Pagamento");
        System.out.println("Tela aberta!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBrasao = new javax.swing.JPanel();
        jPanelBotoes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CadastroCliente1 = new javax.swing.JButton();
        RegistrarTransacao1 = new javax.swing.JButton();
        HistoricoTransacao1 = new javax.swing.JButton();
        SaldoAtual1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Sair = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema De Pagamento - Cartório");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jLabelBrasao.setBackground(new java.awt.Color(204, 204, 204));

        jPanelBotoes.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sistema de Pagamento");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("© 2025 Cartório Sant'Ana do Livramento - Todos os direitos reservados");

        CadastroCliente1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CadastroCliente1.setText("Cadastrar Cliente");
        CadastroCliente1.setBorderPainted(false);
        CadastroCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroCliente1.setFocusPainted(false);
        CadastroCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroCliente1ActionPerformed(evt);
            }
        });

        RegistrarTransacao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegistrarTransacao1.setText("Registrar Transação");
        RegistrarTransacao1.setBorderPainted(false);
        RegistrarTransacao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarTransacao1.setFocusPainted(false);
        RegistrarTransacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarTransacao1ActionPerformed(evt);
            }
        });

        HistoricoTransacao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HistoricoTransacao1.setText("Histórico de Transações");
        HistoricoTransacao1.setBorderPainted(false);
        HistoricoTransacao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HistoricoTransacao1.setFocusPainted(false);
        HistoricoTransacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoTransacao1ActionPerformed(evt);
            }
        });

        SaldoAtual1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SaldoAtual1.setText("Saldo Atual");
        SaldoAtual1.setBorderPainted(false);
        SaldoAtual1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaldoAtual1.setFocusPainted(false);
        SaldoAtual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoAtual1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(RegistrarTransacao1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(HistoricoTransacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(SaldoAtual1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastroCliente1)
                .addGap(97, 97, 97))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(CadastroCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HistoricoTransacao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegistrarTransacao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaldoAtual1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensTelas/images.png"))); // NOI18N

        Sair.setText("Sair");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLabelBrasaoLayout = new javax.swing.GroupLayout(jLabelBrasao);
        jLabelBrasao.setLayout(jLabelBrasaoLayout);
        jLabelBrasaoLayout.setHorizontalGroup(
            jLabelBrasaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelBrasaoLayout.createSequentialGroup()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLabelBrasaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLabelBrasaoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLabelBrasaoLayout.setVerticalGroup(
            jLabelBrasaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLabelBrasaoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Sair)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBrasao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBrasao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void CadastroCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroCliente1ActionPerformed
        TelaCadastroCliente tela = new TelaCadastroCliente();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_CadastroCliente1ActionPerformed

    private void RegistrarTransacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarTransacao1ActionPerformed
        RegistrarTransacao tela = new RegistrarTransacao();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegistrarTransacao1ActionPerformed

    private void HistoricoTransacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoTransacao1ActionPerformed
        TelaHistoricoTransacao tela = new TelaHistoricoTransacao();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistoricoTransacao1ActionPerformed

    private void SaldoAtual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoAtual1ActionPerformed
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
        double saldo = sistema.calcularSaldoTotal();
        javax.swing.JOptionPane.showMessageDialog(this,
                "Saldo total de transações: R$ " + String.format("%.2f", saldo));
    }//GEN-LAST:event_SaldoAtual1ActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
        List<Servico> listaServicos = sistema.getServicos(); // Chama o novo método
        try {
            // Tenta aplicar o FlatLaf
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLaf");
        }
        System.out.println("--- TESTE SERVIÇO DAO ---");
        if (listaServicos.isEmpty()) {
            System.out.println("ERRO: Nenhum serviço encontrado. A tabela 'servico' está vazia ou o SELECT falhou.");
        } else {
            System.out.println("Serviços encontrados: " + listaServicos.size());
            for (Servico s : listaServicos) {
                System.out.println("ID: " + s.getId() + " | Descrição: " + s.getDescricao() + " | Valor: R$" + s.getValor());
            }
        }

        // 🔹 Corrigido: execução da tela na EventQueue
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroCliente1;
    private javax.swing.JButton HistoricoTransacao1;
    private javax.swing.JButton RegistrarTransacao1;
    private javax.swing.JToggleButton Sair;
    private javax.swing.JButton SaldoAtual1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jLabelBrasao;
    private javax.swing.JPanel jPanelBotoes;
    // End of variables declaration//GEN-END:variables
}
