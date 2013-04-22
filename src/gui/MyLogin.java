package gui;

import javax.swing.JOptionPane;

public class MyLogin implements MyLoginInterface {

    public void enterShop() {
        JOptionPane.showMessageDialog(null,
                "Hi " + "! You have successfully logged in.",
                "Login",
                JOptionPane.INFORMATION_MESSAGE);
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        System.out.println("You are now entering the system");
    }
}
