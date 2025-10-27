
import javax.swing.JFrame;

public class UserApp extends JFrame{
    private JPanel panel;
    private Painting painting;
    private Vlogger vlogger;
    private Player user;
    public static void main(String[] args){
        new UserApp()
    }
    public UserApp(){
        panel = new JPanel();
        painting = new Painting();
        vlogger = new Vlogger();
        user = new Player();
    }
}