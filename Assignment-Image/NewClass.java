
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;


public class NewClass implements ActionListener{
    
    TextField tx1;
    Button b1,b2;
    String val = new String();
    Stack<String> s = new Stack<String>();
    public NewClass() {
        Frame f = new Frame("App");
        
        tx1 = new TextField();
        tx1.setBounds(100,100,150,25);
        f.add(tx1);
        
        b1 = new Button("Clear");
        b1.setBounds(100,150,50,50);
        f.add(b1);
        b1.addActionListener(this);
        
        b2 = new Button("Undo");
        b2.setBounds(170,150,50,50);
        f.add(b2);
        b2.addActionListener(this);
        
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource().equals(b1)){
            val = tx1.getText();
            if(val != ""){
                s.push(val);
            }
            tx1.setText("");
        }
        else if(e.getSource().equals(b2)){
            String sss = new String("");
            if(!s.isEmpty()){
                sss = s.peek();
                s.pop();
            }
            tx1.setText(sss);
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); 
    }  
    
    public static void main(String[] args) {
        NewClass newClass = new NewClass();
    }
}
