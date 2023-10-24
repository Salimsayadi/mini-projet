package com.example.demo.entities;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity

public class Produit {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private long idProduit;
private String nomProduit;
private Double prixProduit;
private Date dateCreation;
@ManyToOne
private Categorie categorie;


public long getIdProduit() {
	return idProduit;
}
public void setIdProduit(long idProduit) {
	this.idProduit = idProduit;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public Double getPrixProduit() {
	return prixProduit;
}
public void setPrixProduit(Double prixProduit) {
	this.prixProduit = prixProduit;
}
public Date getDateCreaton() {
	return dateCreation;
}
public void setDateCreaton(Date dateCreaton) {
	this.dateCreation = dateCreaton;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(String nomProduit, Double prixProduit, Date dateCreaton) {
	super();
	this.nomProduit = nomProduit;
	this.prixProduit = prixProduit;
	this.dateCreation = dateCreaton;
}
@Override
public String toString() {
	return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
			+ ", dateCreaton=" + dateCreation + "]";
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}

}
