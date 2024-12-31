package com.project.movieticketbooking.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	private String adminName;
	private String adminEmail;
	private long adminContact;
	private String adminPassword;
	private String confirmAdminPassword;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Theatre> theatre;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public long getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(long adminContact) {
		this.adminContact = adminContact;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getConfirmAdminPassword() {
		return confirmAdminPassword;
	}
	public void setConfirmAdminPassword(String confirmAdminPassword) {
		this.confirmAdminPassword = confirmAdminPassword;
	}
	public List<Theatre> getTheatre() {
		return theatre;
	}
	public void setTheatre(List<Theatre> theatre) {
		this.theatre = theatre;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminContact=" + adminContact + ", adminPassword=" + adminPassword + ", confirmAdminPassword="
				+ confirmAdminPassword + ", theatre=" + theatre + "]";
	}
	public Admin(int adminId, String adminName, String adminEmail, long adminContact, String adminPassword,
			String confirmAdminPassword, List<Theatre> theatre) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminContact = adminContact;
		this.adminPassword = adminPassword;
		this.confirmAdminPassword = confirmAdminPassword;
		this.theatre = theatre;
	}
	public Admin() {
		super();
	}

}
