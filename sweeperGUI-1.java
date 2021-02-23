//must use sweeperGUI and sweepDriverT

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class sweeperGUI extends JPanel{
   public sweepDriverT game = new sweepDriverT("game");
   private JFrame window = new JFrame("Mine Sweeper");
   private JButton btn00 = new JButton();
   private JButton btn01 = new JButton();
   private JButton btn02 = new JButton();
   private JButton btn03 = new JButton();
   private JButton btn04 = new JButton();
   private JButton btn05 = new JButton();
   private JButton btn10 = new JButton();
   private JButton btn11 = new JButton();
   private JButton btn12 = new JButton();
   private JButton btn13 = new JButton();
   private JButton btn14 = new JButton();
   private JButton btn15 = new JButton();
   private JButton btn20 = new JButton();
   private JButton btn21 = new JButton();
   private JButton btn22 = new JButton();
   private JButton btn23 = new JButton();
   private JButton btn24 = new JButton();
   private JButton btn25 = new JButton();
   private JButton btn30 = new JButton();
   private JButton btn31 = new JButton();
   private JButton btn32 = new JButton();
   private JButton btn33 = new JButton();
   private JButton btn34 = new JButton();
   private JButton btn35 = new JButton();
   private JButton btn40 = new JButton();
   private JButton btn41 = new JButton();
   private JButton btn42 = new JButton();
   private JButton btn43 = new JButton();
   private JButton btn44 = new JButton();
   private JButton btn45 = new JButton();
   private JButton btn50 = new JButton();
   private JButton btn51 = new JButton();
   private JButton btn52 = new JButton();
   private JButton btn53 = new JButton();
   private JButton btn54 = new JButton();
   private JButton btn55 = new JButton();
  
   private JTextField Number00 = new JTextField("hi");
   private JTextField Number01 = new JTextField();
   private JTextField Number02 = new JTextField();
   private JTextField Number10 = new JTextField();
   private JTextField Number11 = new JTextField();
   private JTextField Number12 = new JTextField();
   private JTextField Number20 = new JTextField();
   private JTextField Number21 = new JTextField();
   private JTextField Number22 = new JTextField();
   private JButton btnBingo = new JButton("Enter");
   //private TicTac game = new TicTac("X");
  // private TicTac player = new TicTac("Y");
     
   public sweeperGUI(){
      setLayout(null);
      
       btn00.setBounds(10,10,50,50);
       btn01.setBounds(60,10,50,50);
       btn02.setBounds(110,10,50,50); 
       btn03.setBounds(160,10,50,50);
       btn04.setBounds(210,10,50,50); 
       btn05.setBounds(260,10,50,50);
       btn10.setBounds(10,60,50,50);
       btn11.setBounds(60,60,50,50);
       btn12.setBounds(110,60,50,50); 
       btn13.setBounds(160,60,50,50);
       btn14.setBounds(210,60,50,50); 
       btn15.setBounds(260,60,50,50);
       btn20.setBounds(10,110,50,50);
       btn21.setBounds(60,110,50,50);
       btn22.setBounds(110,110,50,50); 
       btn23.setBounds(160,110,50,50);
       btn24.setBounds(210,110,50,50); 
       btn25.setBounds(260,110,50,50);
       btn30.setBounds(10,160,50,50);
       btn31.setBounds(60,160,50,50);
       btn32.setBounds(110,160,50,50); 
       btn33.setBounds(160,160,50,50);
       btn34.setBounds(210,160,50,50); 
       btn35.setBounds(260,160,50,50);
       btn40.setBounds(10,210,50,50);
       btn41.setBounds(60,210, 50,50);
       btn42.setBounds(110,210,50,50); 
       btn43.setBounds(160,210,50,50);
       btn44.setBounds(210,210,50,50); 
       btn45.setBounds(260,210,50,50);
       btn50.setBounds(10,260,50,50);
       btn51.setBounds(60,260,50,50);
       btn52.setBounds(110,260,50,50); 
       btn53.setBounds(160,260,50,50);
       btn54.setBounds(210,260,50,50); 
       btn55.setBounds(260,260,50,50);      
      
     /*  Number00.setBounds(10,10,50,50);
       Number01.setBounds(60,60,50,50);
       Number02.setBounds(110,60,50,50); 
       Number10.setBounds(10,60,50,50);
       Number11.setBounds(60,60,50,50); 
       Number12.setBounds(110,60,50,50); 
       Number20.setBounds(10,110,50,50); 
       Number21.setBounds(60,110,50,50); 
       Number22.setBounds(110,110,50,50); 
       */
       
       add(btn00);
       add(btn01);
       add(btn02); 
       add(btn03);
       add(btn04);
       add(btn05); 
       add(btn10);
       add(btn11);
       add(btn12); 
       add(btn13);
       add(btn14);
       add(btn15);
       add(btn20);
       add(btn21);
       add(btn22); 
       add(btn23);
       add(btn24);
       add(btn25);
       add(btn30);
       add(btn31);
       add(btn32); 
       add(btn33);
       add(btn34);
       add(btn35);
       add(btn40);
       add(btn41);
       add(btn42); 
       add(btn43);
       add(btn44);
       add(btn45); 
       add(btn50);
       add(btn51);
       add(btn52); 
       add(btn53);
       add(btn54);
       add(btn55);

       


      //txtBingo.setBounds(10, 10, 450, 200);
      //lblEnter.setBounds(10, 210, 100, 30);
      //txtNumber.setBounds(120, 210, 100, 30);
      //btnBingo.setBounds(230, 210, 100, 30);
      //txtBingo.setEnabled(false);
      //add(lblEnter);
      //add(txtNumber);
      //add(btnBingo);
      //add(txtBingo);
      window.add(this);
      
      //txtBingo.setText(game.toString());
      
      window.setSize(400, 400);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
  
       
              
         
       MyEvent m = new MyEvent();
       
      btn00.addActionListener(m);
      btn01.addActionListener(m);
      btn02.addActionListener(m);
      btn03.addActionListener(m);
      btn04.addActionListener(m);
      btn05.addActionListener(m);
      btn10.addActionListener(m);
      btn11.addActionListener(m);
      btn12.addActionListener(m);
      btn13.addActionListener(m);
      btn14.addActionListener(m);
      btn15.addActionListener(m);
      btn20.addActionListener(m);
      btn21.addActionListener(m);
      btn22.addActionListener(m);
      btn23.addActionListener(m);
      btn24.addActionListener(m);
      btn25.addActionListener(m);
      btn30.addActionListener(m);
      btn31.addActionListener(m);
      btn32.addActionListener(m);
      btn33.addActionListener(m);
      btn34.addActionListener(m);
      btn35.addActionListener(m);
      btn40.addActionListener(m);
      btn41.addActionListener(m);
      btn42.addActionListener(m);
      btn43.addActionListener(m);
      btn44.addActionListener(m);
      btn45.addActionListener(m);
      btn50.addActionListener(m);
      btn51.addActionListener(m);
      btn52.addActionListener(m);
      btn53.addActionListener(m);
      btn54.addActionListener(m);
      btn55.addActionListener(m);
     
      
  
      
   

      
   }//end consturctor
   
   
   class MyEvent implements ActionListener{
      
      
      
           public void actionPerformed(ActionEvent e) { 
                 
          
                    if(e.getSource() == btn00){
                        btn00.setText(""+ game.getMap(00));
                           if(game.getMap(00) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                     }else if(e.getSource() == btn01){
                           btn01.setText(""+ game.getMap(01));
                           if(game.getMap(01) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }

                        }else if(e.getSource() == btn02){
                           btn02.setText(""+ game.getMap(02));
                              if(game.getMap(02) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn03){
                           btn03.setText(""+ game.getMap(03));
                              if(game.getMap(03) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn04){
                           btn04.setText(""+ game.getMap(04));
                              if(game.getMap(04)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn05){
                           btn05.setText(""+ game.getMap(05));
                              if(game.getMap(05)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                          

                     }else if(e.getSource() == btn10){
                           btn10.setText(""+ game.getMap(10));
                              if(game.getMap(10)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn11){
                           btn11.setText(""+ game.getMap(11));
                             if(game.getMap(11)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }

                        }else if(e.getSource() == btn12){
                           btn12.setText(""+ game.getMap(12));
                              if(game.getMap(12) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn13){
                           btn13.setText(""+ game.getMap(13));
                              if(game.getMap(13) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                           

                        }else if(e.getSource() == btn14){
                           btn14.setText(""+ game.getMap(14));
                              if(game.getMap(14)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn15){
                           btn15.setText(""+ game.getMap(15));
                              if(game.getMap(15) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                           }else if(e.getSource() == btn20){
                           btn20.setText(""+ game.getMap(20));
                              if(game.getMap(20)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn21){
                           btn21.setText(""+ game.getMap(21));
                              if(game.getMap(21) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn22){
                           btn22.setText(""+ game.getMap(22));
                              if(game.getMap(22)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn23){
                           btn23.setText(""+ game.getMap(23));
                              if(game.getMap(23) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }

                        }else if(e.getSource() == btn24){
                           btn24.setText(""+ game.getMap(24));
                              if(game.getMap(24) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn25){
                           btn25.setText(""+ game.getMap(25));
                               if(game.getMap(25)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }

                           }else if(e.getSource() == btn30){
                           btn30.setText(""+ game.getMap(30));
                              if(game.getMap(30)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn31){
                           btn31.setText(""+ game.getMap(31));
                              if(game.getMap(31) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }

                        }else if(e.getSource() == btn32){
                           btn32.setText(""+ game.getMap(32));
                              if(game.getMap(32) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn33){
                           btn33.setText(""+ game.getMap(33));
                              if(game.getMap(33) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                           
                        }else if(e.getSource() == btn34){
                           btn34.setText(""+ game.getMap(34));
                              if(game.getMap(34)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn35){
                           btn35.setText(""+ game.getMap(35));
                              if(game.getMap(35) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                           }else if(e.getSource() == btn40){
                           btn40.setText(""+ game.getMap(40));
                              if(game.getMap(40)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn41){
                           btn41.setText(""+ game.getMap(41));
                              if(game.getMap(41) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn42){
                           btn42.setText(""+ game.getMap(42));
                              if(game.getMap(42) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn43){
                           btn43.setText(""+ game.getMap(43));
                            if(game.getMap(43)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }

                        }else if(e.getSource() == btn44){
                           btn44.setText(""+ game.getMap(44));
                              if(game.getMap(44) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn45){
                           btn45.setText(""+ game.getMap(45));
                              if(game.getMap(45) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                           }else if(e.getSource() == btn50){
                           btn50.setText(""+ game.getMap(50));
                              if(game.getMap(50)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn51){
                           btn51.setText(""+ game.getMap(51));
                              if(game.getMap(51) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                     

                        }else if(e.getSource() == btn52){
                           btn52.setText(""+ game.getMap(52));
                              if(game.getMap(52)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn53){
                           btn53.setText(""+ game.getMap(53));
                              if(game.getMap(53) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }else if(e.getSource() == btn54){
                           btn54.setText(""+ game.getMap(54));
                           if(game.getMap(54)== -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }

                        }else if(e.getSource() == btn55){
                           btn55.setText(""+ game.getMap(55));
                              if(game.getMap(55) == -1){
                              JOptionPane.showMessageDialog(null, "Game Over");
                           }
                        }
          
      }//ends actionEvent
   }//ends class
   
   





   public static void main(String []args){
      new sweeperGUI();
     

   }
}