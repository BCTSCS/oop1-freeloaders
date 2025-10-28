
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

        user = new Player();
        vlogger = new Vlogger();
        painting = new Painting();

        panel.add(new JLabel("Player Name:" + user.getName()));
        panel.add(new JLabel("Level:" + user.getLevel()));
        
        panel.add(new JLabel("Vlogger Name:" + vlogger.getName()));
        panel.add(new JLabel("Year Joined:" + vlogger.getYearJoined()));
        
        panel.add(new JLabel("Painting Title:" + painting.getTitle()));
        panel.add(new JLabel("Year Created:" + painting.getYear()));

        add(panel());
    }
}