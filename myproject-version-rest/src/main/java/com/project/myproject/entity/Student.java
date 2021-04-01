package com.project.myproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	//fields
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="prenom")
		private String prenom;
		
		@Column(name="nom")
		private String nom;
		
		@Column(name="email")
		private String email;
		
		
		
	//constructors
		public Student() {
			
		}

		public Student(String prenom, String nom, String email) {
			this.prenom = prenom;
			this.nom = nom;
			this.email = email;
		}
		
		
		
	//getters and setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
	//tostring
		@Override
		public String toString() {
			return "Student [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + "]";
		}
		
		
		
		

}
