import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

  Random rand = new Random();
  Button start = new Button("START");
  Button rans = new Button("VS Random");

  Button btn1 = new Button();
  Button btn2 = new Button();
  Button btn3 = new Button();
  Button btn4 = new Button();
  Button btn5 = new Button();
  Button btn6 = new Button();
  Button btn7 = new Button();
  Button btn8 = new Button();
  Button btn9 = new Button();

  JLabel lbl = new JLabel();
  JPanel jpl = new JPanel();

  char plyX = 'X';
  char plyO = 'O';
  boolean turns = true;
  int win = 0;
  boolean ran = false;
  int p = rand.nextInt(9) + 1;

  boolean p1 = false;
  boolean p2 = false;
  boolean p3 = false;
  boolean p4 = false;
  boolean p5 = false;
  boolean p6 = false;
  boolean p7 = false;
  boolean p8 = false;
  boolean p9 = false;

  int w1,w2,w3,w4,w5,w6,w7,w8,w9;

  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500,500);
    this.setVisible(true);
    this.setTitle("TIC TAC TOE");

    this.add(start);
    this.add(rans);

    this.add(btn1);
    this.add(btn2);
    this.add(btn3);
    this.add(btn4);
    this.add(btn5);
    this.add(btn6);
    this.add(btn7);
    this.add(btn8);
    this.add(btn9);

    this.add(lbl);
    this.add(jpl);

    // buttons

    start.setBounds(170, 185, 150, 50);
    rans.setBounds(170, 250, 150, 50);
    btn1.setBounds(100, 100, 100, 100);
    btn2.setBounds(200, 100, 100, 100);
    btn3.setBounds(300, 100, 100, 100);
    btn4.setBounds(100, 200, 100, 100);
    btn5.setBounds(200, 200, 100, 100);
    btn6.setBounds(300, 200, 100, 100);
    btn7.setBounds(100, 300, 100, 100);
    btn8.setBounds(200, 300, 100, 100);
    btn9.setBounds(300, 300, 100, 100);

    start.setBackground(Color.green);
    rans.setBackground(Color.green);
    btn1.setBackground(Color.green);
    btn2.setBackground(Color.green);
    btn3.setBackground(Color.green);
    btn4.setBackground(Color.green);
    btn5.setBackground(Color.green);
    btn6.setBackground(Color.green);
    btn7.setBackground(Color.green);
    btn8.setBackground(Color.green);
    btn9.setBackground(Color.green);

    start.addActionListener(this);
    rans.addActionListener(this);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);

    rans.setVisible(true);
    btn1.setVisible(false);
    btn2.setVisible(false);
    btn3.setVisible(false);
    btn4.setVisible(false);
    btn5.setVisible(false);
    btn6.setVisible(false);
    btn7.setVisible(false);
    btn8.setVisible(false);
    btn9.setVisible(false);

    btn1.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn2.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn4.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn5.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn6.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn7.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn8.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
    btn9.setFont(new Font("Comic Sans MS", Font.BOLD, 50));

    //labeles
    lbl.setBounds(200, 30, 100, 100);
    lbl.setFont(new Font("Arial", Font.PLAIN, 15));
    lbl.setForeground(Color.darkGray);
    lbl.setText("TIC TAC TOE");

    //Panel
    jpl.setBounds(0,0,500,500);
    jpl.setBackground(Color.cyan);
    jpl.setLayout(null);
  }
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if(e.getSource() == start){
      start.setVisible(false);
      rans.setVisible(false);
      btn1.setVisible(true);
      btn2.setVisible(true);
      btn3.setVisible(true);
      btn4.setVisible(true);
      btn5.setVisible(true);
      btn6.setVisible(true);
      btn7.setVisible(true);
      btn8.setVisible(true);
      btn9.setVisible(true);
      ran = false;
      if(turns == true){
        lbl.setText("TURN : " + plyX);
      }
      else{
        lbl.setText("TURN : " + plyO);
      }
    }

    //backend

    if(e.getSource() == btn1 && ran == false){
      btn1.setEnabled(false);
      p1 = true;
      if(turns == true){
        btn1.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w1 = 1;
      }
      else{
        btn1.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w1 = 2;
      }
    }

    if(e.getSource() == btn2 && ran ==  false){
      btn2.setEnabled(false);
      p2 = true;
      if(turns == true){
        btn2.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w2 = 1;
      }
      else{
        btn2.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w2 = 2;
      }
    }

    if(e.getSource() == btn3 && ran == false){
      btn3.setEnabled(false);
      p3 = true;
      if(turns == true){
        btn3.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w3 = 1;
      }
      else{
        btn3.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w3 = 2;
      }
    }

    if(e.getSource() == btn4 && ran == false){
      btn4.setEnabled(false);
      p4 = true;
      if(turns == true){
        btn4.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w4 = 1;
      }
      else{
        btn4.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w4 = 2;
      }
    }

    if(e.getSource() == btn5 && ran == false){
      btn5.setEnabled(false);
      p5 = true;
      if(turns == true){
        btn5.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w5 =1;
      }
      else{
        btn5.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w5=2;
      }
    }

    if(e.getSource() == btn6 && ran == false){
      btn6.setEnabled(false);
      p6 = true;
      if(turns == true){
        btn6.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w6 = 1;
      }
      else{
        btn6.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w6 =2;
      }
    }

    if(e.getSource() == btn7 && ran == false){
      btn7.setEnabled(false);
      p7 = true;
      if(turns == true){
        btn7.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w7 =1;
      }
      else{
        btn7.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w7 =2;
      }
    }

    if(e.getSource() == btn8 && ran == false){
      btn8.setEnabled(false);
      p8 = true;
      if(turns == true){
        btn8.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w8 = 1;
      }
      else{
        btn8.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w8 =2;
      }
    }

    if(e.getSource() == btn9 && ran == false){
      btn9.setEnabled(false);
      p9 = true;
      if(turns == true){
        btn9.setLabel("X");
        turns = false;
        jpl.setBackground(Color.white);
        lbl.setText("TURN : " + plyO);
        w9 =1;
      }
      else{
        btn9.setLabel("O");
        turns = true;
        lbl.setText("TURN : " + plyX);
        jpl.setBackground(Color.cyan);
        w9 =2;
      }
    }
    // VS Random
    if(e.getSource() == rans){
      ran = true;
      start.setVisible(false);
      rans.setVisible(false);
      btn1.setVisible(true);
      btn2.setVisible(true);
      btn3.setVisible(true);
      btn4.setVisible(true);
      btn5.setVisible(true);
      btn6.setVisible(true);
      btn7.setVisible(true);
      btn8.setVisible(true);
      btn9.setVisible(true);
      System.out.println(p);
    }
    if(p == 1 && ran == true && p1 == false){
      btn1.setEnabled(false);
      p1 = true;
      btn1.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w1 = 1;
    }
    if(p == 2 && ran == true && p2 == false){
      btn2.setEnabled(false);
      p2 = true;
      btn2.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w2 = 1;
    }
    if(p == 3 && ran == true && p3 == false ){
      btn3.setEnabled(false);
      p3 = true;
      btn3.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w3 = 1;
    }
    if(p == 4 && ran == true && p4 == false ){
      btn4.setEnabled(false);
      p4 = true;
      btn4.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w4 = 1;
    }
    if(p == 5 && ran == true && p5 == false ){
      btn5.setEnabled(false);
      p5 = true;
      btn5.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w5 = 1;
    }
    if(p == 6 && ran == true && p6 == false ){
      btn6.setEnabled(false);
      p6 = true;
      btn6.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w6 = 1;
    }
    if(p == 7 && ran == true && p7 == false ){
      btn7.setEnabled(false);
      p7 = true;
      btn7.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w7 = 1;
    }
    if(p == 8 && ran == true && p8 == false ){
      btn8.setEnabled(false);
      p8 = true;
      btn8.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w8 = 1;
    }
    if(p == 9 && ran == true && p9 == false){
      btn9.setEnabled(false);
      p9 = true;
      btn9.setLabel("X");
      turns = false;
      jpl.setBackground(Color.white);
      lbl.setText("TURN : " + plyO);
      w9 = 1;
    }
    // VS Random player 
    if(e.getSource() == btn1 && ran == true && p1 == false ){
      btn1.setEnabled(false);
      p1 = true;
      btn1.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w1 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn2 && ran == true && p2 == false ){
      btn2.setEnabled(false);
      p2 = true;
      btn2.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w2 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn3 && ran == true && p3 == false){
      btn3.setEnabled(false);
      p3 = true;
      btn3.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w3 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn4 && ran == true && p4 == false ){
      btn4.setEnabled(false);
      p4 = true;
      btn4.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w4 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn5 && ran == true && p5 == false ){
      btn5.setEnabled(false);
      p5 = true;
      btn5.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w5 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn6 && ran == true && p6 == false ){
      btn6.setEnabled(false);
      p6 = true;
      btn6.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w6 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn7 && ran == true && p7 == false){
      btn7.setEnabled(false);
      p7 = true;
      btn7.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w7 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn8 && ran == true && p8 == false){
      btn8.setEnabled(false);
      p8 = true;
      btn8.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w8 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(e.getSource() == btn9 && ran == true && p9 == false){
      btn9.setEnabled(false);
      p9 = true;
      btn9.setLabel("O");
      turns = true;
      jpl.setBackground(Color.cyan);
      lbl.setText("TURN : " + plyX);
      w9 = 2;
      p = rand.nextInt(9) + 1;
      System.out.println(p);
    }
    if(p1 == true && p == 1 ||p2 == true && p == 2 ||p3 == true && p == 3 ||p4 == true && p == 4 ||p5 == true && p == 5 ||p6 == true && p == 6 ||p7 == true && p == 7 ||p8 == true && p == 8 ||p9 == true && p == 9){
      p = rand.nextInt(9) + 1;
    }
    // win check
    if(w1 == 1 && w2 == 1 && w3 == 1 || w1 == 1 && w4 == 1 && w7 == 1 || w2 == 1 && w5 == 1 && w8 == 1 || w3 == 1 && w6 == 1 && w9 == 1 || w4 == 1 && w5 == 1 && w6 == 1 || w7 == 1 && w8 == 1 && w9 == 1 || w1 == 1 && w5 == 1 && w9 == 1 || w3 == 1 && w5 == 1 && w7 == 1){
      lbl.setText("X WINS");
      jpl.setBackground(Color.cyan);
      btn1.setVisible(false);
      btn2.setVisible(false);
      btn3.setVisible(false);
      btn4.setVisible(false);
      btn5.setVisible(false);
      btn6.setVisible(false);
      btn7.setVisible(false);
      btn8.setVisible(false);
      btn9.setVisible(false);
      win++;
    }
    if(w1 == 2 && w2 == 2 && w3 == 2 || w1 == 2 && w4 == 2 && w7 == 2 || w2 == 2 && w5 == 2 && w8 == 2 || w3 == 2 && w6 == 2 && w9 == 2 || w4 == 2 && w5 == 2 && w6 == 2 || w7 == 2 && w8 == 2 && w9 == 2 || w1 == 2 && w5 == 2 && w9 == 2 || w3 == 2 && w5 == 2 && w7 == 2){
      lbl.setText("O WINS");
      btn1.setVisible(false);
      btn2.setVisible(false);
      btn3.setVisible(false);
      btn4.setVisible(false);
      btn5.setVisible(false);
      btn6.setVisible(false);
      btn7.setVisible(false);
      btn8.setVisible(false);
      btn9.setVisible(false);
      win++;
    }
    if(p1 == true && p2 == true && p3 == true && p4 == true && p5 == true && p6 == true && p7 == true && p8 == true && p9 == true){
      lbl.setText("DRAW");
      btn1.setVisible(false);
      btn2.setVisible(false);
      btn3.setVisible(false);
      btn4.setVisible(false);
      btn5.setVisible(false);
      btn6.setVisible(false);
      btn7.setVisible(false);
      btn8.setVisible(false);
      btn9.setVisible(false);
    }
  }
}
