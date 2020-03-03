package br.com.fiap.jpa.entity;

//import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_TREINAMENTO")
@SequenceGenerator(name = "ntreinamento", sequenceName = "TREINAMENTO_SEQ", allocationSize = 1)
public class Treinamento {

	@Id
	@Column(name = "ID_TREINAMENTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ntreinamento")
	private int codigo;

	@Column(name = "NOME", nullable = false, length = 100)
	private String nome;

	@Column(name = "DESCRICAO", nullable = false, length = 155)
	private String descricao;

	@Column(name = "DATA_TREINAMENTO", nullable = false)
//	@Temporal(TemporalType.DATE)
//	private Calendar dataTreinamento;
	private String dataTreinamento;

	@Column(name = "LOCAL_TREINAMENTO", nullable = false, length = 155)
	private String local;

	public Treinamento() {
		super();
	}

	public Treinamento(String nome, String descricao, String dataTreinamento, String local) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dataTreinamento = dataTreinamento;
		this.local = local;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataTreinamento() {
		return dataTreinamento;
	}

	public void setDataTreinamento(String dataTreinamento) {
		this.dataTreinamento = dataTreinamento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
