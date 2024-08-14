import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.12.2017
  * @author 
  */

public class CharacterGUI extends JFrame {
  // Anfang Attribute
  private JLabel lCharacter = new JLabel();
  private JLabel lName = new JLabel();
  private JLabel lGeschlecht = new JLabel();
  private JLabel lHP = new JLabel();
  private JLabel lDamage = new JLabel();
  private JLabel lArmor = new JLabel();
  private JLabel ausgabehp = new JLabel();
  private JLabel ausgabedamage = new JLabel();
  private JLabel ausgabearmor = new JLabel();
  private JButton bCharacter1generieren = new JButton();
  private JTextField jTextField1 = new JTextField();
  
  private JRadioButton rbMannlich = new JRadioButton();
  private JRadioButton rbWeiblich = new JRadioButton();
  private JRadioButton rbAnders = new JRadioButton();
  private ButtonGroup buttonGroup1 = new ButtonGroup();
  
  private JLabel ausgabename = new JLabel();
  private JLabel lName1 = new JLabel();
  private JLabel lGeschlecht1 = new JLabel();
  private JLabel ausgabegeschlecht = new JLabel();
  
  private JLabel ausgabehp1 = new JLabel();
  private JLabel ausgabedamage1 = new JLabel();
  private JLabel ausgabearmor1 = new JLabel();
  private JLabel ausgabename1 = new JLabel();
  private JLabel ausgabegeschlecht1 = new JLabel();
  private JLabel lCharacter1 = new JLabel();
  private JLabel lCharacter2 = new JLabel();
  
  
  private JButton bCharacter2generieren = new JButton();
  private JLabel lHP1 = new JLabel();
  private JLabel lDamage1 = new JLabel();
  private JLabel lArmor1 = new JLabel();
  private JLabel lName2 = new JLabel();
  private JLabel lGeschlecht2 = new JLabel();
  
  public char geschlecht;
  public int b1 = 0;
  public int b2 = 0;
  
  private JCheckBox cbBereit2 = new JCheckBox();
  private JCheckBox cbBereit = new JCheckBox();
  private JButton bFight = new JButton();
  private JButton bFight1 = new JButton();
  // Ende Attribute
  
  public CharacterGUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 929; 
    int frameHeight = 455;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("CharacterGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lCharacter.setBounds(296, 8, 323, 49);
    lCharacter.setText("Character");
    lCharacter.setHorizontalTextPosition(SwingConstants.CENTER);
    lCharacter.setHorizontalAlignment(SwingConstants.CENTER);
    lCharacter.setFont(new Font("Arial Black", Font.BOLD, 28));
    cp.add(lCharacter);
    lName.setBounds(296, 64, 67, 41);
    lName.setText("Name");
    cp.add(lName);
    lGeschlecht.setBounds(296, 112, 75, 41);
    lGeschlecht.setText("Geschlecht");
    cp.add(lGeschlecht);
    lHP.setBounds(8, 208, 83, 41);
    lHP.setText("HP");
    cp.add(lHP);
    lDamage.setBounds(8, 256, 83, 41);
    lDamage.setText("Damage");
    cp.add(lDamage);
    lArmor.setBounds(8, 304, 83, 41);
    lArmor.setText("Armor");
    cp.add(lArmor);
    ausgabehp.setBounds(96, 208, 155, 41);
    ausgabehp.setText("");
    cp.add(ausgabehp);
    ausgabedamage.setBounds(96, 256, 155, 41);
    ausgabedamage.setText("");
    cp.add(ausgabedamage);
    ausgabearmor.setBounds(96, 304, 155, 41);
    ausgabearmor.setText("");
    cp.add(ausgabearmor);
    bCharacter1generieren.setBounds(295, 160, 153, 49);
    bCharacter1generieren.setText("Character 1 generieren");
    bCharacter1generieren.setMargin(new Insets(2, 2, 2, 2));
    bCharacter1generieren.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    bCharacter1generieren_ActionPerformed(evt);
    }
    });
    cp.add(bCharacter1generieren);
    jTextField1.setBounds(368, 64, 201, 41);
    cp.add(jTextField1);
    rbMannlich.setBounds(376, 112, 81, 41);
    rbMannlich.setOpaque(false);
    rbMannlich.setText("Männlich");
    cp.add(rbMannlich);
    rbWeiblich.setBounds(456, 112, 89, 41);
    rbWeiblich.setOpaque(false);
    rbWeiblich.setText("Weiblich");
    cp.add(rbWeiblich);
    rbAnders.setBounds(544, 112, 73, 41);
    rbAnders.setOpaque(false);
    rbAnders.setText("anders");
    cp.add(rbAnders); 
    buttonGroup1.add(rbMannlich);
    buttonGroup1.add(rbWeiblich);
    buttonGroup1.add(rbAnders);
    ausgabename.setBounds(96, 112, 155, 41);
    ausgabename.setText("");
    cp.add(ausgabename);
    lName1.setBounds(8, 112, 83, 41);
    lName1.setText("Name");
    cp.add(lName1);
    lGeschlecht1.setBounds(8, 160, 83, 41);
    lGeschlecht1.setText("Geschlecht");
    cp.add(lGeschlecht1);
    ausgabegeschlecht.setBounds(96, 160, 155, 41);
    ausgabegeschlecht.setText("");
    cp.add(ausgabegeschlecht);
    ausgabehp1.setBounds(752, 208, 155, 41);
    ausgabedamage1.setBounds(752, 256, 155, 41);
    ausgabearmor1.setBounds(752, 304, 155, 41);
    ausgabename1.setBounds(752, 112, 155, 41);
    ausgabegeschlecht1.setBounds(752, 160, 155, 41);
    ausgabehp1.setText("");
    cp.add(ausgabehp1);
    ausgabedamage1.setText("");
    cp.add(ausgabedamage1);
    ausgabearmor1.setText("");
    cp.add(ausgabearmor1);
    ausgabename1.setText("");
    cp.add(ausgabename1);
    ausgabegeschlecht1.setText("");
    cp.add(ausgabegeschlecht1);
    lCharacter1.setBounds(0, 64, 251, 41);
    lCharacter1.setText("Character 1");
    lCharacter1.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lCharacter1);
    lCharacter2.setBounds(664, 64, 243, 41);
    lCharacter2.setText("Character 2");
    lCharacter2.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lCharacter2);
    
    bCharacter2generieren.setBounds(464, 160, 153, 49);
    bCharacter2generieren.setText("Character 2 generieren");
    bCharacter2generieren.setMargin(new Insets(2, 2, 2, 2));
    bCharacter2generieren.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    bCharacter2generieren_ActionPerformed(evt);
    }
    });
    cp.add(bCharacter2generieren);
    lHP1.setBounds(664, 208, 83, 41);
    lDamage1.setBounds(664, 256, 83, 41);
    lArmor1.setBounds(664, 304, 83, 41);
    lName2.setBounds(664, 112, 83, 41);
    lGeschlecht2.setBounds(664, 160, 83, 41);
    lHP1.setText("HP");
    cp.add(lHP1);
    lDamage1.setText("Damage");
    cp.add(lDamage1);
    lArmor1.setText("Armor");
    cp.add(lArmor1);
    lName2.setText("Name");
    cp.add(lName2);
    lGeschlecht2.setText("Geschlecht");
    cp.add(lGeschlecht2);
    cbBereit2.setBounds(8, 360, 65, 41);
    cbBereit2.setOpaque(false);
    cbBereit2.setText("Bereit");
    cbBereit2.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    cbBereit2_ActionPerformed(evt);
    }
    });
    cbBereit2.setEnabled(false);
    cp.add(cbBereit2);
    cbBereit.setBounds(664, 360, 65, 49);
    cbBereit.setOpaque(false);
    cbBereit.setText("Bereit");
    cbBereit.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    cbBereit_ActionPerformed(evt);
    }
    });
    cbBereit.setEnabled(false);
    cp.add(cbBereit);
    bFight.setBounds(112, 360, 129, 41);
    bFight.setText("Fight");
    bFight.setMargin(new Insets(2, 2, 2, 2));
    bFight.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    bFight_ActionPerformed(evt);
    }
    });
    bFight.setEnabled(false);
    cp.add(bFight);
    bFight1.setBounds(760, 360, 129, 41);
    bFight1.setText("Fight");
    bFight1.setMargin(new Insets(2, 2, 2, 2));
    bFight1.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    bFight1_ActionPerformed(evt);
    }
    });
    bFight1.setEnabled(false);
    cp.add(bFight1);
    // Ende Komponenten
    
    setVisible(true);
    
  } // end of public CharacterGUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new CharacterGUI();
    
    
  } // end of main
  
  public void bCharacter1generieren_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if (b1 < 3) {
      String Name1= jTextField1.getText();
      ausgabename.setText(Name1);
      
      Random rnd = new Random();
      
      int hp = rnd.nextInt(301)+100;
      ausgabehp.setText(Integer.toString(hp));
      
      int damage = rnd.nextInt(101)+50;
      ausgabedamage.setText(Integer.toString(damage));
      
      int armor = rnd.nextInt(51)+50;
      ausgabearmor.setText(Integer.toString(armor));
      
      
      if (rbMannlich.isSelected()) {
        ausgabegeschlecht.setText("Männlich");
        geschlecht = 'm';
      }
      if (rbWeiblich.isSelected()) {
        ausgabegeschlecht.setText("Weiblich");
        geschlecht = 'w';
      } 
      if (rbAnders.isSelected()) {
        ausgabegeschlecht.setText("Anders");
        geschlecht = 'a';
      }
      
      Character c1 = new Character(Name1, geschlecht, hp, damage, armor);
      cbBereit2.setEnabled(true);
      b1++;
      if (b1 == 3) {
        bCharacter1generieren.setEnabled(false);
        cbBereit2.setSelected(true);
      }
    }
  } // end of bCharacter1generieren_ActionPerformed

  public String buttonGroup1_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = buttonGroup1.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }

  public void bCharacter2generieren_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if (b2 < 3) {
      String Name2 = jTextField1.getText();
      ausgabename1.setText(Name2);
      
      Random rnd = new Random();
      
      int hp = rnd.nextInt(301)+100;
      ausgabehp1.setText(Integer.toString(hp));
      
      int damage = rnd.nextInt(101)+50;
      ausgabedamage1.setText(Integer.toString(damage));
      
      int armor = rnd.nextInt(51)+50;
      ausgabearmor1.setText(Integer.toString(armor));
      
      
      
      if (rbMannlich.isSelected()) {
        ausgabegeschlecht1.setText("Männlich");
        geschlecht = 'm';
      }
      if (rbWeiblich.isSelected()) {
        ausgabegeschlecht1.setText("Weiblich");
        geschlecht = 'w';
      } 
      if (rbAnders.isSelected()) {
        ausgabegeschlecht1.setText("Anders");
        geschlecht = 'a';
      }
      
      Character c2 = new Character(Name2, geschlecht, hp, damage, armor);
      cbBereit.setEnabled(true);
      b2++;
      if (b2 == 3) {
        bCharacter2generieren.setEnabled(false);
        cbBereit.setSelected(true);
      }
    }
  } // end of bCharacter2generieren_ActionPerformed
  
  public void prepareGUIForFight() {
    
    if (cbBereit2.isSelected() && cbBereit.isSelected()) {
      bCharacter1generieren.setEnabled(false);
      bCharacter2generieren.setEnabled(false);
      cbBereit2.setEnabled(false);
      cbBereit.setEnabled(false);
      bFight.setEnabled(true);
      bFight1.setEnabled(true);
      jTextField1.setEnabled(false);
      rbMannlich.setEnabled(false);
      rbWeiblich.setEnabled(false);
      rbAnders.setEnabled(false);
      
    } 
    
  }
  

  public void cbBereit2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    prepareGUIForFight();
  } // end of cbBereit2_ActionPerformed

  public void cbBereit_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    prepareGUIForFight();
  } // end of cbBereit_ActionPerformed

  public void bFight_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bFight_ActionPerformed

  public void bFight1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bFight1_ActionPerformed

  // Ende Methoden
} // end of class CharacterGUI

