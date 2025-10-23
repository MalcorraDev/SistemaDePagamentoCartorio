
package com.mycompany.projetopoo;

import com.mycompany.projetopoo.RegistrarTransacao;
import com.mycompany.projetopoo.SistemaDePagamento;
import com.mycompany.projetopoo.TelaCadastroCliente;
import java.awt.event.ActionEvent;
import java.util.List;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        setTitle("Sistema de Pagamento");
        initComponents();
        System.out.println("Tela aberta!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CadastroCliente = new javax.swing.JButton();
        RegistrarTransacao = new javax.swing.JButton();
        HistoricoTransacao = new javax.swing.JButton();
        SaldoAtual = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Sair = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema De Pagamento - Cartório");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sistema de Pagamento");

        CadastroCliente.setText("Cadastrar Cliente");
        CadastroCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClienteActionPerformed(evt);
            }
        });

        RegistrarTransacao.setText("Registrar Transação");
        RegistrarTransacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        RegistrarTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarTransacaoActionPerformed(evt);
            }
        });

        HistoricoTransacao.setText("Histórico de Transações");
        HistoricoTransacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        HistoricoTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoTransacaoActionPerformed(evt);
            }
        });

        SaldoAtual.setText("Saldo Atual");
        SaldoAtual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SaldoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoAtualActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("© 2025 Cartório Sant'Ana do Livramento - Todos os direitos reservados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HistoricoTransacao)
                            .addComponent(RegistrarTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(SaldoAtual)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addComponent(CadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegistrarTransacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoricoTransacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaldoAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensTelas/images.png"))); // NOI18N

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(Sair)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void CadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClienteActionPerformed
        TelaCadastroCliente tela = new TelaCadastroCliente();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_CadastroClienteActionPerformed

    private void RegistrarTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarTransacaoActionPerformed
        RegistrarTransacao tela = new RegistrarTransacao();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegistrarTransacaoActionPerformed

    private void HistoricoTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoTransacaoActionPerformed
        TelaHistoricoTransacao tela = new TelaHistoricoTransacao();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistoricoTransacaoActionPerformed

    private void SaldoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoAtualActionPerformed
        SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
        double saldo = sistema.calcularSaldoTotal();
        javax.swing.JOptionPane.showMessageDialog(this,
            "Saldo total de transações: R$ " + String.format("%.2f", saldo));
    }//GEN-LAST:event_SaldoAtualActionPerformed

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
    SistemaDePagamento sistema = SistemaDePagamento.getInstancia();
    List<Servico> listaServicos = sistema.getServicos(); // Chama o novo método

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
    private javax.swing.JButton CadastroCliente;
    private javax.swing.JButton HistoricoTransacao;
    private javax.swing.JButton RegistrarTransacao;
    private javax.swing.JToggleButton Sair;
    private javax.swing.JButton SaldoAtual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
