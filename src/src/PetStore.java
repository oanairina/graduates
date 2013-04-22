package src;

import gui.Login;
import gui.MyLoginProxy;

public class PetStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            while (true) {
                User user;
                Login login = new Login(null, true);
                login.setVisible(true);
                user = Login.getUser();
                //System.out.println(user.toString());
                MyLoginProxy loginProxy = new MyLoginProxy(user);
                loginProxy.enterShop();
                if (loginProxy.isSucceeded()) {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
