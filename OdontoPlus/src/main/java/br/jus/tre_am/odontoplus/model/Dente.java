package br.jus.tre_am.odontoplus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dente")
public class Dente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "idDente", unique = true, nullable = false)
	private Long idDente;
	
	@Column(name = "txDente", unique = true, nullable = false)
	private String txDente;

	public Long getIdDente() {
		return idDente;
	}

	public void setIdDente(Long idDente) {
		this.idDente = idDente;
	}

	public String getTxDente() {
		return txDente;
	}

	public void setTxDente(String txDente) {
		this.txDente = txDente;
	}
	
}