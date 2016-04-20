/**
 * Created by yasha on 18.03.2016.
 */
import javax.swing.*;
public class MainFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 600;
    private static final int DFAULT_HEIGHT = 400;
    private String title = "Helper - Рассчет сигналов с преобразователя";
    public MainFrame()
    {
        setSize(DEFAULT_WIDTH, DFAULT_HEIGHT);
        setTitle(title);
    }
}
