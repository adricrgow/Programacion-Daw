import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TresRayas extends JFrame implements ActionListener {

    private JButton[][] botones = new JButton[3][3];
    private boolean turnoX = true; // true = X, false = O

    public TresRayas() {
        setTitle("3 en Raya");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));
        InicializarBotones();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        // Si el botón ya tiene algo, no hacer nada
        if (!btn.getText().isEmpty()) {
            return;
        }

        // Turno del jugador X
        btn.setText("X");

        // Comprobar si X gana
        if (hayGanador()) {
            JOptionPane.showMessageDialog(null, "¡Gana X!");
            reiniciar();
            return;
        }

        // Comprobar si hay empate antes de que juegue la IA
        if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "Empate");
            reiniciar();
            return;
        }

        // Turno de la IA (O)
        jugadaIA();

        // Comprobar si O gana
        if (hayGanador()) {
            JOptionPane.showMessageDialog(null, "¡Gana O!");
            reiniciar();
            return;
        }

        // Comprobar empate después de la IA
        if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "Empate");
            reiniciar();
        }
    }

    // ---------------- IA ----------------
    private void jugadaIA() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().isEmpty()) {
                    botones[i][j].setText("O");
                    return;
                }
            }
        }
    }

    private boolean hayGanador() {
        // Filas
        for (int i = 0; i < 3; i++) {
            if (!botones[i][0].getText().isEmpty()
                    && botones[i][0].getText().equals(botones[i][1].getText())
                    && botones[i][0].getText().equals(botones[i][2].getText())) {
                return true;
            }
        }
        // Columnas
        for (int j = 0; j < 3; j++) {
            if (!botones[0][j].getText().isEmpty()
                    && botones[0][j].getText().equals(botones[1][j].getText())
                    && botones[0][j].getText().equals(botones[2][j].getText())) {
                return true;
            }
        }
        // Diagonales
        if (!botones[0][0].getText().isEmpty()
                && botones[0][0].getText().equals(botones[1][1].getText())
                && botones[0][0].getText().equals(botones[2][2].getText())) {
            return true;
        }
        if (!botones[0][2].getText().isEmpty()
                && botones[0][2].getText().equals(botones[1][1].getText())
                && botones[0][2].getText().equals(botones[2][0].getText())) {
            return true;
        }
        return false;
    }

    void InicializarBotones() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("");
                botones[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                botones[i][j].addActionListener(this);
                add(botones[i][j]);
            }
        }
    }

    private boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    // ---------------- REINICIAR ----------------
    private void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText("");
            }
        }
        turnoX = true;
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        new TresRayas().setVisible(true);
    }
}
