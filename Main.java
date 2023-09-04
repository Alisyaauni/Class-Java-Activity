import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Registration");
            ImageIcon icon = new ImageIcon("C:\\\\Users\\\\Alisya\\\\Downloads\\\\click icon.png");
            frame.setIconImage(icon.getImage());
            frame.setSize(1000,1000);
            frame.setContentPane(new StudentRegister().StuRegister);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });


    }


}