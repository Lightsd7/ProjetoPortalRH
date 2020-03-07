package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_COLABORADOR")
public class Colaborador {

	@Id
	@Column(name = "ID_COLABORADOR", nullable = false, unique = true)
	private int id;

	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;

	@Column(name = "EMAIL", nullable = false, length = 100)
	private String email;

	@Column(name = "TELEFONE", length = 10)
	private String telefone;

	@Column(name = "DEPARTAMENTO", nullable = false, length = 50)
	private String departamento;

	@Column(name = "CARGO", nullable = false, length = 50)
	private String cargo;

	public Colaborador() {

	}

	public Colaborador(int id, String nome, String email, String telefone, String departamento, String cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.departamento = departamento;
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
