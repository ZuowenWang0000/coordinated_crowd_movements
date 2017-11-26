import javax.swing.*;
import java.awt.*;

public class SimulationGUI extends JFrame {

    private SimulationPanel simulationPanel;
    private ControlPanel controlPanel;
    private Simulation simulation;

    public SimulationGUI(Simulation simulation) {
        this.simulation = simulation;
        setTitle("Moshpit Simulation");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initComponents();
        addComponents();
        pack();
    }

    private void initComponents() {
        PositionMatrix matrix = simulation.getMatrix();
        simulationPanel = new SimulationPanel(500, 500, matrix.getIndividuals(), matrix.width * matrix.sectorSize,
                matrix.height * matrix.sectorSize);

        controlPanel = new ControlPanel(simulation);
    }

    private void addComponents() {
        add(simulationPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }
}