/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokedex;
import com.formdev.flatlaf.themes.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author edoar
 */
public class Pokedex extends javax.swing.JFrame {
    int indexPesquisa;
    String pesquisa;
    private Audio audioPlayer = new Audio();
    
    /**
     * Creates new form Pokedex
     */
    public Pokedex() {
        initComponents();
        try {
        // Carregando o ícone da pasta resource
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/icon.png"));
        setIconImage(icon.getImage());
    } catch (Exception e) {
        e.printStackTrace();
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        pesquisaLabel = new javax.swing.JTextField();
        tiposPesquisa = new javax.swing.JComboBox<>();
        botaoPesquisa = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();
        labelNomePokemon = new javax.swing.JLabel();
        labelMovimentos = new javax.swing.JLabel();
        labelTipoPokemon = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        audiosPokemon = new javax.swing.JComboBox<>();
        sliderAudio = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        botaoSobre = new javax.swing.JMenuItem();
        menuSalvar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        botaoTemaBranco = new javax.swing.JMenuItem();
        botaoTemaEscuro = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pesquisaLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaLabelActionPerformed(evt);
            }
        });

        tiposPesquisa.setBackground(new java.awt.Color(255, 25, 50));
        tiposPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pokemon", "Movimento" }));
        tiposPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tiposPesquisaItemStateChanged(evt);
            }
        });

        botaoPesquisa.setBackground(new java.awt.Color(255, 25, 50));
        botaoPesquisa.setText("Procurar");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        labelImagem.setBackground(new java.awt.Color(40, 40, 40));
        labelImagem.setOpaque(true);

        labelNomePokemon.setBackground(new java.awt.Color(40, 40, 40));
        labelNomePokemon.setOpaque(true);

        labelMovimentos.setBackground(new java.awt.Color(40, 40, 40));
        labelMovimentos.setOpaque(true);

        labelTipoPokemon.setBackground(new java.awt.Color(40, 40, 40));
        labelTipoPokemon.setOpaque(true);

        labelPeso.setBackground(new java.awt.Color(40, 40, 40));
        labelPeso.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("Áudios do Pokemon");
        jLabel1.setEnabled(false);

        audiosPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audiosPokemonActionPerformed(evt);
            }
        });

        sliderAudio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAudioStateChanged(evt);
            }
        });

        jLabel2.setText("Volume");
        jLabel2.setEnabled(false);

        jProgressBar1.setMaximum(200);

        jLabel4.setText("Altura:");
        jLabel4.setEnabled(false);

        jMenu1.setText("File");

        botaoSobre.setText("Sobre");
        botaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreActionPerformed(evt);
            }
        });
        jMenu1.add(botaoSobre);

        menuSalvar.setText("Salvar em Texto");
        menuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalvar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Temas");

        botaoTemaBranco.setText("Tema Branco");
        botaoTemaBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTemaBrancoActionPerformed(evt);
            }
        });
        jMenu3.add(botaoTemaBranco);

        botaoTemaEscuro.setText("Tema Escuro");
        botaoTemaEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTemaEscuroActionPerformed(evt);
            }
        });
        jMenu3.add(botaoTemaEscuro);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addComponent(labelNomePokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTipoPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMovimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sliderAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(audiosPokemon, javax.swing.GroupLayout.Alignment.LEADING, 0, 110, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesquisaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tiposPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoPesquisa))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesquisaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiposPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botaoPesquisa))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(audiosPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelTipoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(labelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(labelMovimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String getTipoPesquisa(){
        indexPesquisa = tiposPesquisa.getSelectedIndex();
        switch (indexPesquisa){
            case 0 :
                return "pokemon";
            case 1:
                return "move";
        }   
        return "";
    }
    public String getPesquisa(){
        pesquisa = pesquisaLabel.getText();
        return pesquisa;
    }
    private void botaoTemaBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTemaBrancoActionPerformed
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_botaoTemaBrancoActionPerformed

    private void botaoTemaEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTemaEscuroActionPerformed
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_botaoTemaEscuroActionPerformed

    private void tiposPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tiposPesquisaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tiposPesquisaItemStateChanged
    private void atualizarInterface(ConsumirAPI pokemonData) {
       if (audiosPokemon.getItemCount() >= 1){
           audiosPokemon.removeAllItems();
       }
       if (labelTipoPokemon.getText() != null){
           labelTipoPokemon.setText("");
       }
       if (labelMovimentos.getText() != null){
           labelMovimentos.setText("");
       }
       BufferedImage image = pokemonData.getImage();
       String geracao = pokemonData.getGeracao();
       ImageIcon imageIcon = new ImageIcon(image);
       List<String> movimentos = pokemonData.getMoves();
       labelNomePokemon.setText("Nome: " + Utilidades.capitalizeFirstLetter(pokemonData.getName()));
       List<String> tipos = pokemonData.getTypes();
       List<String> soundUrls = pokemonData.getSoundUrls();
       int altura = pokemonData.getAltura();
       int i = 1;
       jProgressBar1.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Configurando o tooltip para mostrar o valor atual
                jProgressBar1.setToolTipText("Valor atual: " + jProgressBar1.getValue() + "m");
            }
        });
       for (String movimento : movimentos){
           while (i <= 2){
           if (labelMovimentos.getText().equals("")){
               labelMovimentos.setText("\nMovimentos: " + Utilidades.capitalizeFirstLetter(movimento));
               i++;
           } else{
               String movimentoAnterior = labelMovimentos.getText();
               labelMovimentos.setText(movimentoAnterior + "\n" + Utilidades.capitalizeFirstLetter(movimento));
               i++;
           }
           }
       }
       for (String tipo : tipos) {
           if (labelTipoPokemon.getText() == ""){
               labelTipoPokemon.setText("Tipos: \n" + Utilidades.capitalizeFirstLetter(tipo));
           } else{
               String textoAnterior = labelTipoPokemon.getText();
               labelTipoPokemon.setText("\n" + Utilidades.capitalizeFirstLetter(textoAnterior) + Utilidades.capitalizeFirstLetter(tipo));
           }
       }
       labelImagem.setIcon(imageIcon);
       labelPeso.setText("Peso: " + String.valueOf(pokemonData.getWeight()) + "kg");
       jProgressBar1.setValue(altura);
       System.out.println(geracao);
       for (String audio : soundUrls){
           audiosPokemon.addItem(audio);
       }
    }
    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        String tipoPesquisa = getTipoPesquisa();
        String pesquisa = getPesquisa();
        ConsumirAPI pokemonData = new ConsumirAPI(tipoPesquisa, pesquisa);
        atualizarInterface(pokemonData);
        System.out.println(pokemonData);
    }//GEN-LAST:event_botaoPesquisaActionPerformed
    
    private void pesquisaLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaLabelActionPerformed
        pesquisa = pesquisaLabel.getText();
    }//GEN-LAST:event_pesquisaLabelActionPerformed

    private void botaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Aplicação Criada por Edoardo Tombolesi\nBibliotecas Usadas: Okhttp3, OkIO, org.Json, flatlaf\nRepositório git: https://github.com/PyEdoardo/pokedex-swing");
    }//GEN-LAST:event_botaoSobreActionPerformed

    private void audiosPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audiosPokemonActionPerformed
        String selectedSoundUrl = (String) audiosPokemon.getSelectedItem();
        audioPlayer.playOgg(selectedSoundUrl);
    }//GEN-LAST:event_audiosPokemonActionPerformed

    private void sliderAudioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAudioStateChanged
         int volume = sliderAudio.getValue();
         audioPlayer.setVolume(volume);
    }//GEN-LAST:event_sliderAudioStateChanged

    private void menuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalvarActionPerformed
        ExportarTxt exportarTxt = new ExportarTxt("pokemon", pesquisaLabel.getText());
        exportarTxt.salvarTxt();
    }//GEN-LAST:event_menuSalvarActionPerformed
    private class retornoPesquisaTipo{
        String pesquisa = pesquisaLabel.getText();
        String tipoPesquisa = "pokemon";
        public String retornoPesquisa(){
            return pesquisa;
        }
        public String retornoTipoPesquisa(){
            return tipoPesquisa;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        Pokedex pokedex = new Pokedex();

        // Supondo que os valores sejam obtidos após alguma ação do usuário, como um botão
        String tipoPesquisa = pokedex.getTipoPesquisa(); // Obtém o valor do JComboBox
        String pesquisa = pokedex.getPesquisa(); // Obtém o valor do JTextField


        
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatMacDarkLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokedex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> audiosPokemon;
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JMenuItem botaoSobre;
    private javax.swing.JMenuItem botaoTemaBranco;
    private javax.swing.JMenuItem botaoTemaEscuro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelMovimentos;
    private javax.swing.JLabel labelNomePokemon;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelTipoPokemon;
    private javax.swing.JMenuItem menuSalvar;
    private javax.swing.JTextField pesquisaLabel;
    private javax.swing.JSlider sliderAudio;
    private javax.swing.JComboBox<String> tiposPesquisa;
    // End of variables declaration//GEN-END:variables
}
