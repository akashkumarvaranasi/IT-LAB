import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calApplet extends Applet implements ActionListener
{
Label l1,l2;
TextField t1,t2,t3;
Button addition,subtraction,multiplication,division;
public void init()
{
l1=new Label("enter first no");
add(l1);

t1=new TextField(10);
add(t1);

l2=new Label("enter second no");
add(l2);

t2=new TextField(10);
add(t2);

t3=new TextField(10);
add(t3);
addition=new Button("+");
add(addition);
addition.addActionListener(this);


subtraction=new Button("-");
add(subtraction);
subtraction.addActionListener(this);

multiplication=new Button("*");
add(multiplication);
multiplication.addActionListener(this);

division=new Button("/");
add(division);
division.addActionListener(this);


}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==addition)
{
	float sum=Float.parseFloat(t1.getText()) + Float.parseFloat(t2.getText());
t3.setText(String.valueOf(sum));
}

if(ae.getSource()==subtraction)
{
 float sub=Float.parseFloat(t1.getText()) - Float.parseFloat(t2.getText());
t3.setText(String.valueOf(sub));
}


if(ae.getSource()==multiplication)
{
float mul=Float.parseFloat(t1.getText()) * Float.parseFloat(t2.getText());
t3.setText(String.valueOf(mul));
}


if(ae.getSource()==division)
{
float div=Float.parseFloat(t1.getText()) / Float.parseFloat(t2.getText());
t3.setText(String.valueOf(div));
}

}

}