
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import lightoff_boullee_version_console.GrilleDeCellules;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NB-X02
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeCellules grille;
    int nbCoups; 
    
    private int nbColonnes;
    private int nbLignes;
    private int nbT;

    
    public void setNbLignes(int lignes) {
        this.nbLignes = lignes;
    }
    
    public void setNbColonnes(int colonnes) {
        this.nbColonnes = colonnes;
    }

    public void setNbT(int tours) {
        this.nbT = tours;
    }
    
    public void printValues() {
        System.out.println("Colonnes: " + nbColonnes);
        System.out.println("Lignes: " + nbLignes);
        System.out.println("Mix: " + nbT);
    }
    

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(this.nbT);
    }
    public void desactiverBoutons() {
        // Désactivation des boutons du panneau vertical
        Component[] boutonsVerticaux = PanneauBoutonsVerticaux.getComponents();
        for (Component bouton : boutonsVerticaux) {
            bouton.setEnabled(false);
        }

        // Désactivation des boutons du panneau horizontal
        Component[] boutonsHorizontaux = PanneauBoutonsHorizontaux.getComponents();
        for (Component bouton : boutonsHorizontaux) {
            bouton.setEnabled(false);
        }
        bouton_diagonale_montante.setEnabled(false);
        bouton_diagonale_descendante.setEnabled(false);
    }
    
    public void endTheParty(){
        System.out.println("Félicitations ! Vous avez éteint toutes les lumières. Nombre de coups: "+nbCoups+" coups");
        desactiverBoutons();
        FenetreVictoire f = new FenetreVictoire() ;
        f.setNbShotText(String.valueOf(nbCoups));
        f.setVisible(true) ; 
        this.dispose();
    }

    
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
    }

    public void initializeComponents(){
        
        if (nbLignes > 0 && nbColonnes > 0) {
       
        this.grille = new GrilleDeCellules(this.nbLignes, this.nbColonnes);
        
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, this.nbColonnes * 40, this.nbLignes * 40));
        this.pack();
        this.revalidate();

        
        PanneauGrille.setLayout(new GridLayout(this.nbLignes, this.nbColonnes));
        
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule);
            }
        }
        
        PanneauBoutonsVerticaux.setLayout(new GridLayout(this.nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1 * 40, this.nbLignes * 40));
        this.pack();
        this.revalidate();
        
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, this.nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, this.nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        
        for (int i = 0; i < this.nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            final int j = i; 
            ActionListener ecouteurClick = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    nbCoups++;
                    if (grille.cellulesToutesEteintes()) {
                        endTheParty();
                    }
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        
        for (int i = 0; i < this.nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            final int j = i;
            ActionListener ecouteurClick = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    nbCoups++;
                    if (grille.cellulesToutesEteintes()) {
                        endTheParty();      
                    }
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);
        }



        initialiserPartie();
        }else {
            throw new IllegalArgumentException("rows and cols cannot both be zero");
        }
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        bouton_diagonale_montante = new javax.swing.JButton();
        bouton_diagonale_descendante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(62, 53, 58));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 400, 400));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(57, 38, 51));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, 400));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(57, 38, 51));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 400, -1));

        bouton_diagonale_montante.setText("↗");
        bouton_diagonale_montante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_diagonale_montanteActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_diagonale_montante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        bouton_diagonale_descendante.setText("↘");
        bouton_diagonale_descendante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_diagonale_descendanteActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_diagonale_descendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_diagonale_montanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_diagonale_montanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
        nbCoups++;
        if (grille.cellulesToutesEteintes()) {
            endTheParty();
        }
    }//GEN-LAST:event_bouton_diagonale_montanteActionPerformed

    private void bouton_diagonale_descendanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_diagonale_descendanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        repaint();
        nbCoups++;
        if (grille.cellulesToutesEteintes()) {
            endTheParty();
        }        
    }//GEN-LAST:event_bouton_diagonale_descendanteActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton bouton_diagonale_descendante;
    private javax.swing.JButton bouton_diagonale_montante;
    // End of variables declaration//GEN-END:variables
}
