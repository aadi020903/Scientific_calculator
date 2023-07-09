import java.awt.*;
import java.awt.event.*;


class calculator implements ActionListener
{
Frame f;
Label l2;
static TextField t1;
static Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bc,bs,bm,bd,be,b33,b22,bu2,bu3,bx10,bl,bob,bcb,bon,bof,bregon,bregoff;
double a,b,c;
String opt;


calculator()
{
f=new Frame("Calculator");
l2=new Label("Scientific Panel");
t1=new TextField();
b0=new Button("0");
bc=new Button("A/C");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
ba=new Button("+");
bs=new Button("-");
bm=new Button("*");
bd=new Button("/");
be=new Button("=");
b33=new Button("x^3");
b22=new Button("X^2");
bu2=new Button("x^1/2");
bu3=new Button("x^1/3");
bx10=new Button("x*10");
bob=new Button("sin");
bcb=new Button("cos");
bl=new Button("log");
bof=new Button("S-OFF");
bregoff=new Button("OFF");
bon=new Button("S-ONN");
bregon=new Button("ONN");

f.setLayout(null);

//firdt row

t1.setBounds(60,50,190,40);

//2 regulating button

bc.setBounds(80,100, 50, 30);
bregon.setBounds(180 ,100,50,30);
bregoff.setBounds(180 ,100,50,30);

//3rd row

b1.setBounds(60,140,40,40);
b2.setBounds(110,140,40,40);
b3.setBounds(160,140,40,40);
ba.setBounds(210,140,40,40);

//4rd row

b4.setBounds(60,190,40,40);
b5.setBounds(110,190,40,40);
b6.setBounds(160,190,40,40);
bs.setBounds(210,190,40,40);

//5rd row

b7.setBounds(60,240,40,40);
b8.setBounds(110,240,40,40);
b9.setBounds(160,240,40,40);
bm.setBounds(210,240,40,40);

//6rd row

bd.setBounds(60,290,40,40);
b0.setBounds(110,290,40,40);
be.setBounds(160,290,90,40);

// 7 scientific row

l2.setBounds(80, 350, 90, 40);
bon.setBounds(180, 350, 50, 30);
bof.setBounds(180, 350, 50, 30);

//8 row

b33.setBounds(60,400,40,40);
b22.setBounds(110,400,40,40);
bu2.setBounds(160,400,40,40);
bu3.setBounds(210,400,40,40);

//9 row

bx10.setBounds(60,450,40,40);
bl.setBounds(110,450,40,40);
bob.setBounds(160,450,40,40);
bcb.setBounds(210,450,40,40);



f.add(l2);
f.add(t1);
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
f.add(ba);
f.add(bs);
f.add(bd);
f.add(bm);
f.add(be);
f.add(bc);

// we will add these button with s-onn click

// f.add(bx10);
// f.add(bob);
// f.add(bcb);
// f.add(b33);
// f.add(b22);
// f.add(bu3);
// f.add(bu2);


f.add(bon);
f.add(bregon);
f.add(bof);
f.add(bregoff);

bon.addActionListener(this);
bregon.addActionListener(this);
bof.addActionListener(this);
bregoff.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
bc.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bx10.addActionListener(this);
ba.addActionListener(this);
bd.addActionListener(this);
bm.addActionListener(this);
bs.addActionListener(this);
be.addActionListener(this);
b22.addActionListener(this);
b33.addActionListener(this);
bu2.addActionListener(this);
bu3.addActionListener(this);
bob.addActionListener(this);
bcb.addActionListener(this);


f.setSize(310,550);
f.setVisible(true);
t1.setEnabled(false);
b0.setEnabled(false);
bc.setEnabled(false);
b1.setEnabled(false);
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
ba.setEnabled(false);
bm.setEnabled(false);
bd.setEnabled(false);
bs.setEnabled(false);
be.setEnabled(false);
bon.setEnabled(false);
bof.setEnabled(false);
}

public void actionPerformed(ActionEvent e)
{
  String S = e.getActionCommand();

        if(S.equals("+"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="+";
        }
        else if(S.equals("-"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="-";
        }
        else if(S.equals("*"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="*";
        }
        else if(S.equals("/"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="/";
        }
        else if(S.equals("x^2"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="^2";
        }
        else if(S.equals("x^3"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="^3";
        }
        else if(S.equals("x^1/2"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="^1/2";
        }
        else if(S.equals("x^1/3"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="^1/3";
        }
        else if(S.equals("x*10"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="*10";
        }
        else if(S.equals("sin"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="sin";
        }
        else if(S.equals("cos"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="cos";
        }
        else if(S.equals("log"))
        {
            a = Double.parseDouble
            
            
            (t1.getText());
            t1.setText("");
            opt ="log";
        }
        else if(S.equals("="))
        {
            b = Double.parseDouble
            
            
            (t1.getText());
            if(opt.equals("+"))
            c=a+b;
            else if(opt.equals("-"))
            c=a-b;
            else if(opt.equals("*"))
            c=a*b;
            else if(opt.equals("/"))
            c=a/b;
            else if(opt.equals("^2"))
            c=a*a;
            else if(opt.equals("^1/2"))
            c= Math.sqrt(a) ;
            else if(opt.equals("^3"))
            c=a*a*a;
            else if(opt.equals("^1/3"))
            c=Math.cbrt(a);
            else if(opt.equals("sin"))
            c= Math.sin(a) ;
            else if(opt.equals("cos"))
            c=Math.cos(a);
            else if(opt.equals("log"))
            c=Math.log(a);
            t1.setText(Double.toString(c));
        }
         else if(S.equals("S-OFF"))
        {
          
            bx10.setVisible(false);
            bl.setVisible(false);
            bob.setVisible(false);
            bcb.setVisible(false);
            b33.setVisible(false);
            b22.setVisible(false);
            bu3.setVisible(false);
            bu2.setVisible(false);
              bon.setVisible(true);
            bof.setVisible(false);
           
        }    
        else if(S.equals("S-ONN"))
        {
            f.add(bl);
            f.add(bx10);
            f.add(bob);
            f.add(bcb);
            f.add(b33);
            f.add(b22);
            f.add(bu3);
            f.add(bu2);
             bon.setVisible(false);
            bof.setVisible(true);
            bx10.setVisible(true);
            bl.setVisible(true);
            bob.setVisible(true);
            bcb.setVisible(true);
            b33.setVisible(true);
            b22.setVisible(true);

            bu3.setVisible(true);
            bu2.setVisible(true);
           
           
        } 
        else if(S.equals("ONN"))
        {
             b0.setEnabled(true);
             b1.setEnabled(true);
             b2.setEnabled(true);
             b3.setEnabled(true);
             b4.setEnabled(true);
             b5.setEnabled(true);
             b6.setEnabled(true);
             b7.setEnabled(true);
             b8.setEnabled(true);
             b9.setEnabled(true);
             ba.setEnabled(true);
             bm.setEnabled(true);
             bd.setEnabled(true);
             bs.setEnabled(true);
             be.setEnabled(true);
             bc.setEnabled(true);
             bon.setEnabled(true);
             bof.setEnabled(true);
             bregon.setVisible(false);
             bregoff.setVisible(true);
             t1.setText("");
        
           
        }   
        
        else if(S.equals("OFF"))
        {
             b0.setEnabled(false);
             b1.setEnabled(false);
             b2.setEnabled(false);
             b3.setEnabled(false);
             b4.setEnabled(false);
             b5.setEnabled(false);
             b6.setEnabled(false);
             b7.setEnabled(false);
             b8.setEnabled(false);
             b9.setEnabled(false);
             ba.setEnabled(false);
             bm.setEnabled(false);
             bd.setEnabled(false);
             bs.setEnabled(false);
             be.setEnabled(false);
             bc.setEnabled(false);
             bon.setEnabled(false);
             bof.setEnabled(false);
             bregoff.setVisible(false);
             bregon.setVisible(true);
              bx10.setVisible(false);
            bl.setVisible(false);
            bob.setVisible(false);
            bcb.setVisible(false);
            b33.setVisible(false);
            b22.setVisible(false);
            bu3.setVisible(false);
            bu2.setVisible(false);
             bon.setVisible(true);
            bof.setVisible(false);
             t1.setText("");
             
        }
        else if(S.equals("A/C"))
        {
            t1.setText("");
        }

        else
        {
            t1.setText(t1.getText()+S);
        }
       
}
public static void main(String ar[])
{
calculator a1=new calculator();
}
}
