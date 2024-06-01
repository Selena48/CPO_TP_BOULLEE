
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NB-X02
 */
public class FenetreDebut extends javax.swing.JFrame {

    /**
     * Creates new form FenetreDebut
     */
    public FenetreDebut() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_debut_jeu = new javax.swing.JPanel();
        intro = new javax.swing.JLabel();
        input_colonne = new javax.swing.JSpinner();
        input_ligne = new javax.swing.JSpinner();
        label_colonne = new javax.swing.JLabel();
        label_ligne = new javax.swing.JLabel();
        input_mix = new javax.swing.JSpinner();
        label_mix = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panneau_debut_jeu.setBackground(new java.awt.Color(0, 153, 153));

        intro.setBackground(new java.awt.Color(255, 255, 255));
        intro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        intro.setForeground(new java.awt.Color(255, 255, 255));
        intro.setText("Choisissez les paramètres de votre partie de LightOff");

        input_colonne.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        input_ligne.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        label_colonne.setBackground(new java.awt.Color(255, 255, 255));
        label_colonne.setForeground(new java.awt.Color(255, 255, 255));
        label_colonne.setText("Nombre de colonnes :");

        label_ligne.setBackground(new java.awt.Color(255, 255, 255));
        label_ligne.setForeground(new java.awt.Color(255, 255, 255));
        label_ligne.setText("Nombre de lignes :");

        input_mix.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        label_mix.setBackground(new java.awt.Color(255, 255, 255));
        label_mix.setForeground(new java.awt.Color(255, 255, 255));
        label_mix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_mix.setText("Mélange  / Difficulté");

        btn_start.setText("Valider");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneau_debut_jeuLayout = new javax.swing.GroupLayout(panneau_debut_jeu);
        panneau_debut_jeu.setLayout(panneau_debut_jeuLayout);
        panneau_debut_jeuLayout.setHorizontalGroup(
            panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_debut_jeuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(intro)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(panneau_debut_jeuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_colonne, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(input_colonne))
                    .addGroup(panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(input_mix)
                        .addComponent(label_mix, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_ligne)
                    .addComponent(label_ligne, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        panneau_debut_jeuLayout.setVerticalGroup(
            panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_debut_jeuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(intro)
                .addGap(43, 43, 43)
                .addGroup(panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_colonne)
                    .addComponent(label_ligne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_colonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_ligne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(label_mix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panneau_debut_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_mix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_start))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panneau_debut_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panneau_debut_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        int nbColonnes = (int) input_colonne.getValue();
        int nbLignes = (int) input_ligne.getValue();
        int nbMix = (int) input_mix.getValue();

        FenetrePrincipale f = new FenetrePrincipale();
        f.setNbColonnes(nbColonnes);
        f.setNbLignes(nbLignes);
        f.setNbT(nbMix);
        f.initializeComponents();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_startActionPerformed



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
            java.util.logging.Logger.getLogger(FenetreDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDebut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDebut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JSpinner input_colonne;
    private javax.swing.JSpinner input_ligne;
    private javax.swing.JSpinner input_mix;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel label_colonne;
    private javax.swing.JLabel label_ligne;
    private javax.swing.JLabel label_mix;
    private javax.swing.JPanel panneau_debut_jeu;
    // End of variables declaration//GEN-END:variables
}
