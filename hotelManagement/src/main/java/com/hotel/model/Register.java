package com.hotel.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {
	private Long id_register;
    private String ktp;
    private String nama;
    private String telpon;
    private String email;
    public Register() {
	}
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId_register() {
		return id_register;
	}
	public void setId_register(Long id_register) {
		this.id_register = id_register;
	}
	public String getKtp() {
		return ktp;
	}
	public void setKtp(String ktp) {
		this.ktp = ktp;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getTelpon() {
		return telpon;
	}
	public void setTelpon(String telpon) {
		this.telpon = telpon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
}
