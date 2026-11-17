import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class HotelBookingSystem {
    // Database credentials
    private String url = "jdbc:mysql://localhost:3306/hotel";
    private String username = "hoteluser";
    private String password = "hotelpass";
    private Connection conn;

    // GUI Components
    private JFrame frame;
    private JTextArea roomListArea;
    private JTextField guestNameField, roomNumberField, checkInField, checkOutField;

    public HotelBookingSystem() {
        // 1. Setup the Frame
        frame = new JFrame("Hotel Booking System");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Available Rooms", SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        roomListArea = new JTextArea();
        roomListArea.setEditable(false);
        frame.add(roomListArea, BorderLayout.CENTER);

        // 2. Setup the Booking Form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2));
        frame.add(formPanel, BorderLayout.SOUTH);

        guestNameField = new JTextField();
        roomNumberField = new JTextField();
        checkInField = new JTextField();
        checkOutField = new JTextField();
        JButton bookButton = new JButton("Book Room");

        formPanel.add(new JLabel("Guest Name:")); formPanel.add(guestNameField);
        formPanel.add(new JLabel("Room Number:")); formPanel.add(roomNumberField);
        formPanel.add(new JLabel("Check-in (YYYY-MM-DD):")); formPanel.add(checkInField);
        formPanel.add(new JLabel("Check-out (YYYY-MM-DD):")); formPanel.add(checkOutField);
        formPanel.add(new JLabel("")); formPanel.add(bookButton);

        // 3. Wiring Up the Book Button
        bookButton.addActionListener(e -> {
            try {
                String guestName = guestNameField.getText();
                int roomNumber = Integer.parseInt(roomNumberField.getText());
                String checkIn = checkInField.getText();
                String checkOut = checkOutField.getText();

                boolean success = bookRoom(guestName, roomNumber, checkIn, checkOut);

                if (success) {
                    JOptionPane.showMessageDialog(frame, "Room booked successfully!");
                    loadRooms();
                    // Clear fields after booking
                    guestNameField.setText("");
                    roomNumberField.setText("");
                    checkInField.setText("");
                    checkOutField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Booking failed. Please try again.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid Room Number.");
            }
        });
    }

    // Method to connect to DB
    public boolean connect() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            return true;
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return false;
        }
    }

    // Method to load rooms
    public void loadRooms() {
        if (!connect()) {
            roomListArea.setText("Could not connect to the database");
            return;
        }

        StringBuilder sb = new StringBuilder();
        String sql = "SELECT * FROM rooms";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                sb.append("Room ").append(rs.getInt("room_number"))
                  .append(" - ").append(rs.getString("room_type"))
                  .append(" - $").append(rs.getDouble("price_per_night"))
                  .append("/night\n");
            }
        } catch (SQLException e) {
            sb.append("Error loading rooms: ").append(e.getMessage());
        }
        roomListArea.setText(sb.toString());
    }

    // Method to insert a booking
    public boolean bookRoom(String guestName, int roomNumber, String checkIn, String checkOut) {
        if (!connect()) {
            return false;
        }

        String sql = "INSERT INTO bookings (guest_name, room_number, check_in, check_out) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, guestName);
            ps.setInt(2, roomNumber);
            ps.setString(3, checkIn);
            ps.setString(4, checkOut);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error booking room: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        HotelBookingSystem app = new HotelBookingSystem();
        app.loadRooms();
        app.frame.setSize(500, 500);
        app.frame.setLocationRelativeTo(null);
        app.frame.setVisible(true);
    }
}
