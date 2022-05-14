
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class Menus extends Frame {

    MenuBar mb;
    Menu m1, m2;
    MenuItem mt1, mt2;

    Menus() {

        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Help");
        MenuItem mt1 = new MenuItem("Open as");
        MenuItem mt2 = new MenuItem("SAve as");

        mb.add(m1);
        mb.add(m2);

        m1.add(mt1);
        m1.add(mt2);

        setMenuBar(mb);
        setLayout(null);
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        Menus test = new Menus();
    }

}
