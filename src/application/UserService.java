package application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.ArrayList; 
import java.util.List; 
import application.User; 
import application.Connexion;
import application.IDao;
public class  UserService implements IDao<User>{

	public UserService()
	{};
	
	@Override
	public  boolean  create(User o) {
		
			try {
			String req = "insert into User ( prenom,nom,transportation,electricity,food,result) values ('" + o.getPrenom() + "', '"+ o.getNom() + "','" + o.getTransportation() + "','" + o.getElectricity	() + "','" + o.getFood() + "','" + o.getResult() + "')";
			Statement st = Connexion.getCn().createStatement();			if
			(st.executeUpdate(req) == 1) {
			return true;
			} }
			catch (SQLException ex) {
			System.out.println("Erreur SQL");
			} return false;
			 }
    @Override
    public boolean delete(User o) {
        try {
            String req = "DELETE FROM user WHERE nom = '" + o.getNom() + "' AND transportation = '" + o.getTransportation()
                    + "' AND result = '" + o.getResult() + "'";
            Statement st = Connexion.getCn().createStatement();
            if (st.executeUpdate(req) == 1) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur SQL");
        }
        return false;
    }

 

    @Override
    public User findByNom(String nom) {
        try {
            String req = "SELECT * FROM user WHERE nom = ?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String prenom = rs.getString("prenom");
                double transportation = rs.getDouble("transportation");
                double electricity = rs.getDouble("electricity");
                double food = rs.getDouble("food");
                double result = rs.getDouble("result");
                User u = new User(prenom, nom, transportation, electricity, food);
                u.setResult(result);
                return u;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur SQL");
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            String req = "SELECT * FROM user";
            Statement st = Connexion.getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                String prenom = rs.getString("prenom");
                String nom = rs.getString("nom");
                double transportation = rs.getDouble("transportation");
                double electricity = rs.getDouble("electricity");
                double food = rs.getDouble("food");
                double result = rs.getDouble("result");
User u=new User(prenom, nom,transportation, electricity,food);
u.setResult(result);
                userList.add(u);
            }
        } catch (SQLException ex) {
            System.out.println("Erreur SQL");
        }
        return userList;
    }
    
    @Override
    public List<User> findAllNom(String nom) {
        List<User> userList = new ArrayList<>();
        try {
        	String req = "SELECT * FROM user WHERE nom = ?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String prenom = rs.getString("prenom");
                double transportation = rs.getDouble("transportation");
                double electricity = rs.getDouble("electricity");
                double food = rs.getDouble("food");
                double result = rs.getDouble("result");
User u=new User(prenom, nom,transportation, electricity,food);
u.setResult(result);
                userList.add(u);
            }
        } catch (SQLException ex) {
            System.out.println("Erreur SQL");
        }
        return userList;
    }
}




