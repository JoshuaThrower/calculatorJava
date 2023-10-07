import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//imports all the GUI packages

public class Calculator implements ActionListener
{
    private JFrame frame0;
    
    //Initialising the font used by everybutton on the calculator.
    Font calcFont = new Font("SansSerif", Font.BOLD, 30);
    
    //Initialising the buttons & text field used in the calculator.
    private JTextField calcScreen;
    private JButton one,two,three,four,five,six,seven,eight,nine,zero;
    private JButton addition,minus,divide,multiply,equals,ac;
    
    //Variables for storing the calculations;
    private double firstNum = 0;
    private double secondNum = 0;
    private double result = 0;
    
    
    
    
    private String operator = "";
    private String answer = "";

    public Calculator(){

        makeFrame();
        
        
        
        

    }
    
    
    
    
    /**
     * Creation of the Frame, Buttons and textfield.
     */

    public void makeFrame(){
        
        

        frame0 = new JFrame("Calculator");
        frame0.setSize(500,700);
        
        one = new JButton("1");
        one.setBackground(Color.WHITE);
        one.addActionListener(this);
        one.setFont(calcFont);
        
        two = new JButton("2");
        two.setBackground(Color.WHITE);
        two.addActionListener(this);
        two.setFont(calcFont);
        
        three = new JButton("3");
        three.setBackground(Color.WHITE);
        three.addActionListener(this);
        three.setFont(calcFont);
        
        four = new JButton("4");
        four.setBackground(Color.WHITE);
        four.addActionListener(this);
        four.setFont(calcFont);
        
        five = new JButton("5");
        five.setBackground(Color.WHITE);
        five.addActionListener(this);
        five.setFont(calcFont);
        
        six = new JButton("6");
        six.setBackground(Color.WHITE);
        six.addActionListener(this);
        six.setFont(calcFont);
        
        seven = new JButton("7");
        seven.setBackground(Color.WHITE);
        seven.addActionListener(this);
        seven.setFont(calcFont);
        
        eight = new JButton("8");
        eight.setBackground(Color.WHITE);
        eight.addActionListener(this);
        eight.setFont(calcFont);
        
        nine = new JButton("9");
        nine.setBackground(Color.WHITE);
        nine.addActionListener(this);
        nine.setFont(calcFont);
        
        zero = new JButton("0");
        zero.setBackground(Color.WHITE);
        zero.addActionListener(this);
        zero.setFont(calcFont);
        
        
        
        addition = new JButton("+");
        addition.setBackground(Color.WHITE);
        addition.setForeground(Color.BLUE);
        addition.addActionListener(this);
        addition.setFont(calcFont);
        
        minus = new JButton("-");
        minus.setBackground(Color.WHITE);
        minus.setForeground(Color.BLUE);
        minus.addActionListener(this);
        minus.setFont(calcFont);
        
        divide = new JButton("÷");
        divide.setBackground(Color.WHITE);
        divide.setForeground(Color.BLUE);
        divide.addActionListener(this);
        divide.setFont(calcFont);
        
        multiply = new JButton("x");
        multiply.setBackground(Color.WHITE);
        multiply.setForeground(Color.BLUE);
        multiply.addActionListener(this);
        multiply.setFont(calcFont);
        
        equals = new JButton("=");
        equals.setBackground(Color.WHITE);
        equals.setForeground(Color.RED);
        equals.addActionListener(this);
        equals.setFont(calcFont);
        
        ac = new JButton("AC");
        ac.setBackground(Color.WHITE);
        ac.setForeground(Color.ORANGE);
        ac.addActionListener(this);
        ac.setFont(calcFont);
        
        
        
        calcScreen = new JTextField();
        calcScreen.setFont(calcFont);
        calcScreen.setHorizontalAlignment(SwingConstants.RIGHT);
        calcScreen.setEditable(false);
        
        
        
        Container contentpane = frame0.getContentPane();
        contentpane.setLayout(new BorderLayout());
        
        
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4,4));
        
        
        panel1.add(seven);
        panel1.add(eight);
        panel1.add(nine);
        panel1.add(divide);
        panel1.add(four);
        panel1.add(five);
        panel1.add(six);
        panel1.add(multiply);
        panel1.add(one);
        panel1.add(two);
        panel1.add(three);
        panel1.add(minus);
        panel1.add(ac);
        panel1.add(zero);
        panel1.add(equals);
        panel1.add(addition);
        
        
        
        contentpane.add(calcScreen, BorderLayout.NORTH);
        calcScreen.setPreferredSize(new Dimension(500, 120));
        contentpane.add(panel1, BorderLayout.CENTER);
        
        
        calcScreen.setText("0");
        //frame0.pack();
        frame0.setVisible(true);

    }
    
    
    
    
    /**
     * Method for all the buttons presses.
     */
    
    public void actionPerformed(ActionEvent e){
        
        
        //NUMBER BUTTON ACTIONS
        if(e.getSource() == one){
            String Enternumber = calcScreen.getText() + one.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == two){
            String Enternumber = calcScreen.getText() + two.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == three){
            String Enternumber = calcScreen.getText() + three.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == four){
            String Enternumber = calcScreen.getText() + four.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == five){
            String Enternumber = calcScreen.getText() + five.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == six){
            String Enternumber = calcScreen.getText() + six.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == seven){
            String Enternumber = calcScreen.getText() + seven.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == eight){
            String Enternumber = calcScreen.getText() + eight.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == nine){
            String Enternumber = calcScreen.getText() + nine.getText();
            calcScreen.setText(Enternumber);
        }
        else if(e.getSource() == zero){
            String Enternumber = calcScreen.getText() + zero.getText();
            calcScreen.setText(Enternumber);
        }
        
        //----------------------------------------------------------
        
        //OPERATOR BUTTON ACTIONS
        
        else if(e.getSource() == addition){
            firstNum = Double.parseDouble(calcScreen.getText());
            calcScreen.setText("");
            operator = "+";
        }
        else if(e.getSource() == minus){
            firstNum = Double.parseDouble(calcScreen.getText());
            calcScreen.setText("");
            operator = "-";
        }
        else if(e.getSource() == multiply){
            firstNum = Double.parseDouble(calcScreen.getText());
            calcScreen.setText("");
            operator = "*";
        }
        else if(e.getSource() == divide){
            firstNum = Double.parseDouble(calcScreen.getText());
            calcScreen.setText("");
            operator = "/";
        }
        else if(e.getSource() == ac){
            firstNum = 0;
            secondNum = 0;
            calcScreen.setText("0");
            operator = "";
        }
        
        //---------------------------------------------------------------
        
        //EQUALS BUTTON CALCULATIONS
        
        else if(e.getSource() == equals){
            secondNum = Double.parseDouble(calcScreen.getText());
            if(operator == "+"){
                result = firstNum + secondNum;
                answer = Double.toString(result);
                calcScreen.setText(answer);
            }
            
            else if(operator == "-"){
                result = firstNum - secondNum;
                answer = Double.toString(result);
                calcScreen.setText(answer);
            }
            else if(operator == "*"){
                result = firstNum * secondNum;
                answer = Double.toString(result);
                calcScreen.setText(answer);
            }
            else if(operator == "/"){
                result = firstNum / secondNum;
                answer = Double.toString(result);
                calcScreen.setText(answer);
            }
            
            
            
            
        }
        
        
        
        
        
        
    }





}
