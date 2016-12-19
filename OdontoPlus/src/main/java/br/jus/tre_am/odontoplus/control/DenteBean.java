package br.jus.tre_am.odontoplus.control;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.jus.tre_am.odontoplus.model.Dente;
import br.jus.tre_am.odontoplus.model.dao.DAO;

@ManagedBean
@SessionScoped
public class DenteBean {

	private List<Dente> listagem;
	
	private DAO<Dente> dao = new DAO<Dente>(Dente.class);
	
	public DenteBean(){
		this.listagem = dao.listaTodos();
	}

	public List<Dente> getListagem() {
		return listagem;
	}

	public void setListagem(List<Dente> listagem) {
		this.listagem = listagem;
	}

	public DAO<Dente> getDao() {
		return dao;
	}

	public void setDao(DAO<Dente> dao) {
		this.dao = dao;
	}
	
	
}
