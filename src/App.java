


public class App{

    public static void main(String[] args) {
        
       
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

}