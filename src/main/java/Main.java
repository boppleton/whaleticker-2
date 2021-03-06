import gui.LaunchWindow;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteGoldLookAndFeel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        startLaunchWindow();

    }

    private static void startLaunchWindow() {

        SwingUtilities.invokeLater(() -> {
            try {
                JFrame.setDefaultLookAndFeelDecorated(true);
                UIManager.setLookAndFeel(new SubstanceGraphiteGoldLookAndFeel());

            } catch (Exception e) {
                System.out.println("Substance look&feel load error!");
            }

            LaunchWindow launchWindow = null;
            try {
                launchWindow = new LaunchWindow("whaleticker");
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (launchWindow != null) {
                launchWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                launchWindow.setSize(220, 300);
                launchWindow.setLocationRelativeTo(null);
                launchWindow.setVisible(true);
            }
        });
    }
}