import javax.swing.*;

import java.awt.event.*;

public class Calc implements ActionListener{

  //Intendation!

 private JFrame f;

 private JTextField t;

 private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,division,multiply,subtract,addition,decimal,equal,delete,clear;

 private static double a=0,b=0,result=0;

 private static int operator=0;
 

  public Calc()

{

    f=new JFrame("Calculator");

    t=new JTextField();

    b1=new JButton("1");

    b2=new JButton("2");

    b3=new JButton("3");

    b4=new JButton("4");

    b5=new JButton("5");

    b6=new JButton("6");

    b7=new JButton("7");

    b8=new JButton("8");

    b9=new JButton("9");

    b0=new JButton("0");

    division=new JButton("/");

   multiply=new JButton("*");

   subtract=new JButton("-");

   addition=new JButton("+");

   decimal=new JButton(".");

   equal=new JButton("=");

   delete=new JButton("Delete");

   clear=new JButton("Clear");

   t.setBounds(30,40,280,30);

   b1.setBounds(40,100,50,40);

   b2.setBounds(110,100,50,40);

   b3.setBounds(180,100,50,40);

   division.setBounds(250,100,50,40);

   b4.setBounds(40,170,50,40);

   b5.setBounds(110,170,50,40);
  
  b6.setBounds(180,170,50,40);

  multiply.setBounds(250,170,50,40);

   b7.setBounds(40,240,50,40);

   b8.setBounds(110,240,50,40);

   b9.setBounds(180,240,50,40);

   subtract.setBounds(250,240,50,40);

   decimal.setBounds(40,310,50,40);

   b0.setBounds(110,310,50,40);

   equal.setBounds(180,310,50,40);

   addition.setBounds(250,310,50,40);

   delete.setBounds(60,380,100,40);

   clear.setBounds(180,380,100,40);

   f.add(t);
   
   f.add(b0);

   f.add(b1);

   f.add(b2);
   
   f.add(b3);
   
   f.add(b4);
   
   f.add(b5);
   
   f.add(b6);
   
   f.add(b7);

   f.add(b8);

   f.add(b9);

   f.add(division);

   f.add(multiply);

   f.add(subtract);

   f.add(decimal);

   f.add(equal);

   f.add(addition);

   f.add(delete);

   f.add(clear);
   
   f.setLayout(null);
 
   f.setVisible(true);

   f.setSize(350,500);

   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   f.setResizable(false);
   
   f.setLocationRelativeTo(null);

b1.addActionListener(this);

b2.addActionListener(this);

b3.addActionListener(this);

b4.addActionListener(this);

b5.addActionListener(this);

b6.addActionListener(this);

b7.addActionListener(this);

b8.addActionListener(this);

b9.addActionListener(this);

b0.addActionListener(this);

addition.addActionListener(this);

division.addActionListener(this);

multiply.addActionListener(this);

subtract.addActionListener(this);

decimal.addActionListener(this);

equal.addActionListener(this);

delete.addActionListener(this);

clear.addActionListener(this);

}

//Events through switch cases

public void actionPerformed(ActionEvent event)

{

if(event.getSource()==b1)

t.setText(t.getText().concat("1"));

if(event.getSource()==b2)

t.setText(t.getText().concat("2"));

if(event.getSource()==b3)

t.setText(t.getText().concat("3"));

if(event.getSource()==b4)

t.setText(t.getText().concat("4"));

if(event.getSource()==b5)

t.setText(t.getText().concat("5"));

if(event.getSource()==b6)

t.setText(t.getText().concat("6"));

if(event.getSource()==b7)

t.setText(t.getText().concat("7"));

if(event.getSource()==b8)

t.setText(t.getText().concat("8"));

if(event.getSource()==b9)

t.setText(t.getText().concat("9"));

if(event.getSource()==b0)

t.setText(t.getText().concat("0"));

if(event.getSource()==decimal)

t.setText(t.getText().concat("."));


      //Addition
if(event.getSource()==addition) {

   a=Double.parseDouble(t.getText());

   operator=1;

   t.setText("");

 }
      //Subtraction

if(event.getSource()==subtract){

   a=Double.parseDouble(t.getText());

   operator=2;

   t.setText("");

 }

     //Multiplication

if(event.getSource()==multiply){

   a=Double.parseDouble(t.getText());

   operator=3;

   t.setText("");

 }

      //Division
if(event.getSource()==division){

   a=Double.parseDouble(t.getText());

   operator=4;

   t.setText("");

}


if(event.getSource()==equal){

   b=Double.parseDouble(t.getText());

   switch(operator)

{

case 1: result=a+b;

break;

case 2: result=a-b;

break;

case 3: result=a*b;

break;

case 4: result=a/b;

break;

default: result=0;

}

t.setText(""+result);

}

if(event.getSource()==clear)

t.setText("");

if(event.getSource()==delete)

{

String s=t.getText();

t.setText("");

for(int i=0;i<s.length()-1;i++)

t.setText(t.getText()+s.charAt(i));

}

}

public static void main(String[] args){
  //Look back at the example file on how to display your window
new Calc();

     }
   }