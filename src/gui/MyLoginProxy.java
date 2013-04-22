package gui;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import src.User;

public class MyLoginProxy implements MyLoginInterface {

    private MyLogin myLogin;
    private User user;
    private User userFromFile;
    private boolean succeeded;

    public MyLoginProxy(User user) {
        this.user = user;
        readCredentials();
    }

    private void readCredentials() {
        try {
            FileInputStream fstream = new FileInputStream("users.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String usernameFromFile = br.readLine().toString();
            String passwordFromFile = br.readLine().toString();
            userFromFile = new User(usernameFromFile, passwordFromFile);
            br.close();
            in.close();
            fstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isSucceeded() {
        if (this != null) {
            return succeeded;
        }else
            return false;
    }

    public void enterShop() {
        if (user.getUserName().equals(userFromFile.getUserName()) && user.getPassword().equals(userFromFile.getPassword())) {
            succeeded = true;
            myLogin = new MyLogin();
            myLogin.enterShop();
        } else {
            succeeded = false;
            JOptionPane.showMessageDialog(null,
                    "Invalid username or password",
                    "Login",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
