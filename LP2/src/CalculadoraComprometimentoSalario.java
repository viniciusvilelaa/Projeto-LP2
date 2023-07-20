import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraComprometimentoSalario extends JFrame {
    private JLabel salarioLabel;
    private JTextField salarioTextField;
    private JLabel gastosLabel;
    private JTextField gastosTextField;
    private JButton calcularButton;
    private JLabel resultadoLabel;

    public CalculadoraComprometimentoSalario() {
        setTitle("Calculadora de Comprometimento de Salário");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        salarioLabel = new JLabel("Salário:");
        salarioTextField = new JTextField();
        gastosLabel = new JLabel("Gastos:");
        gastosTextField = new JTextField();
        calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel();

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularComprometimentoSalario();
            }
        });

        add(salarioLabel);
        add(salarioTextField);
        add(gastosLabel);
        add(gastosTextField);
        add(calcularButton);
        add(resultadoLabel);
    }

    private void calcularComprometimentoSalario() {
        try {
            double salario = Double.parseDouble(salarioTextField.getText());
            double gastos = Double.parseDouble(gastosTextField.getText());

            double porcentagemComprometida = (gastos / salario) * 100;

            resultadoLabel.setText("Porcentagem do salário comprometido: " + porcentagemComprometida + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraComprometimentoSalario().setVisible(true);
            }
        });
    }
}