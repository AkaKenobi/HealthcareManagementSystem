import java.sql.*;
import java.util.ArrayList;

public class PatientDao {

    // CREATE
    public void insert(Patient p) throws Exception {
        String sql = "INSERT INTO patients(id, name, age) VALUES (?, ?, ?)";

        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setInt(3, p.getAge());
            ps.executeUpdate();
        }
    }

    // READ
    public ArrayList<Patient> getAll() throws Exception {
        ArrayList<Patient> list = new ArrayList<>();
        String sql = "SELECT * FROM patients ORDER BY id";

        try (Connection c = DB.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Patient p = new Patient(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age")
                );
                list.add(p);
            }
        }
        return list;
    }

    // UPDATE
    public void updateAge(int id, int newAge) throws Exception {
        String sql = "UPDATE patients SET age = ? WHERE id = ?";

        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, newAge);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    // DELETE
    public void delete(int id) throws Exception {
        String sql = "DELETE FROM patients WHERE id = ?";

        try (Connection c = DB.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}

