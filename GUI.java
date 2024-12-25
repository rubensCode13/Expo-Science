import javax.swing.*;

class App {
    JMenu mission, animals, information;
    JMenuItem vulnerable, threatened;
    JFrame frame = new JFrame("Application");
    JMenuBar menuBar = new JMenuBar(); 
    mission = new JMenu("Notre mission");
    animals = new JMenu("Animaux");
    information = new JMenu("Information général");
    vulnerable = new JMenuItem("Animaux vulnérables");
    threatened = new JMenuItem("Animaux menacés");
    animals.add(vulnerable); animals.add(threatened);
    menuBar.add(mission); menuBar.add(animals); menuBar.add(information);
    frame.setMenuBar(menuBar);
    frame.setSize(500, 500);
    frame.setVisible(true);
}
