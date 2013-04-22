package src;

import gui.Login;
import gui.MyLoginProxy;

public class PetStore2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            User user;
            Login login = new Login(null, true);
            login.setVisible(true);
            user = Login.getUser();
            //System.out.println(user.toString());
            MyLoginProxy loginProxy = new MyLoginProxy(user);
            loginProxy.enterShop();
            if (loginProxy.isSucceeded()){
                break;
            }
        }
    }
}
