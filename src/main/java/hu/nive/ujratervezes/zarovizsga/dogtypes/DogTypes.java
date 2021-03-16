package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {
    private DataSource ds;

    public DogTypes(DataSource ds) {
        this.ds = ds;
    }

    public List<String> getDogsByCountry(String country) {
        try (Connection conn = ds.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement(
                             "SELECT name FROM dog_types WHERE country = ?")) {
            stmt.setString(1, country);
            List<String> x = getStatement(stmt);
            return x;
        } catch (SQLException e) {
            throw new IllegalStateException("select error");
        }
    }

    private List<String> getStatement(PreparedStatement stmt) throws SQLException {
        List<String> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                result.add(rs.getString(1).toLowerCase());
            }
        }
        return result;
    }
}
