
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlightBookingSystem extends JFrame implements ActionListener {

    private JComboBox<String> flightTypeCombo, classCombo;
    private JTextField pickUpField, destinationField;
    private JButton checkAvailabilityBtn, bookBtn;
    private JLabel availabilityLabel, rateLabel;

    public FlightBookingSystem() {
        setTitle("Flight Booking System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create UI elements
        JLabel pickUpLabel = new JLabel("Pick-Up Location:");
        pickUpField = new JTextField(15);

        JLabel destinationLabel = new JLabel("Destination:");
        destinationField = new JTextField(15);

        JLabel flightTypeLabel = new JLabel("Flight Type:");
        flightTypeCombo = new JComboBox<>(new String[]{"National", "International"});

        JLabel classLabel = new JLabel("Class:");
        classCombo = new JComboBox<>(new String[]{"Economy", "Business", "First Class"});

        checkAvailabilityBtn = new JButton("Check Availability");
        checkAvailabilityBtn.addActionListener(this);

        availabilityLabel = new JLabel("Seats available: ");
        rateLabel = new JLabel("Real-time rate: ");

        bookBtn = new JButton("Book Flight");
        bookBtn.addActionListener(this);

        // Layout setup
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.add(pickUpLabel);
        panel.add(pickUpField);
        panel.add(destinationLabel);
        panel.add(destinationField);
        panel.add(flightTypeLabel);
        panel.add(flightTypeCombo);
        panel.add(classLabel);
        panel.add(classCombo);
        panel.add(checkAvailabilityBtn);
        panel.add(availabilityLabel);
        panel.add(rateLabel);
        panel.add(bookBtn);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkAvailabilityBtn) {
            // Here you would implement the logic to check seat availability
            // Simulating availability and rate update
            availabilityLabel.setText("Seats available: 25");
            rateLabel.setText("Real-time rate: $500");
        } else if (e.getSource() == bookBtn) {
            // Simulate booking confirmation
            JOptionPane.showMessageDialog(this, "Flight Booked Successfully!");
        }
    }

    public static void main(String[] args) {
        FlightBookingSystem frame = new FlightBookingSystem();
        frame.setVisible(true);
    }
}
