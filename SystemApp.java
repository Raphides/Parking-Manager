import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class SystemApp extends JFrame{
    private Screens page;

    public SystemApp() {
        // Essencial
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);     
        setVisible(true);
        setTitle("EstacionaDF");
        setSize(500, 500);
        // setIconImage(image);
        page = new HomeScreen(this);

    }
    public Screens getPage() {
        return page;
    } public void setPage(Screens page) {
        this.page = page;
    }

}
