package application;

public class User {
	private String prenom;
	private String nom;
	private double transportation;
	private double electricity;
	private double food;
	private double result;
	public User(String prenom, String nom,double transportation,double electricity, double food) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.transportation=transportation;
		this.electricity = electricity;
		this.food = food;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getTransportation() {
		return transportation;
	}
	public void setTransportation(double transportation) {
		this.transportation = transportation;
	}
	public double getElectricity() {
		return electricity;
	}
	public void setElectricity(double electricity) {
		this.electricity = electricity;
	}
	public double getFood() {
		return food;
	}
	public void setFood(double food) {
		this.food = food;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "User [prenom=" + prenom + ", nom=" + nom + ", transportation=" + transportation + ", electricity="
				+ electricity + ", food=" + food + ", result=" + result + "]";
	}

}
