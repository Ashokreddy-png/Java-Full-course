import javax.swing.JOptionPane;

public class panel {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null, "Your name is "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        JOptionPane.showMessageDialog(null, "Your age is "+age);
        
        float height = Float.parseFloat(JOptionPane.showInputDialog("What is your height"));
        JOptionPane.showMessageDialog(null,"Your height is "+height);
    }    

       
}
