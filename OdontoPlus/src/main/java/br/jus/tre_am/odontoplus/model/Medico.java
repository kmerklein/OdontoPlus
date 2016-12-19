package br.jus.tre_am.odontoplus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_medico")
public class Medico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idMedico", unique = true, nullable = false)
	private Long idMedico;

	@Column(name = "txMedico", unique = true, nullable = false)
	private String txMedico;

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public String getTxMedico() {
		return txMedico;
	}

	public void setTxMedico(String txMedico) {
		this.txMedico = txMedico;
	}

	

}
