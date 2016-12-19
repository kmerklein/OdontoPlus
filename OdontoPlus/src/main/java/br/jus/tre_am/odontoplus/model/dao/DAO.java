package br.jus.tre_am.odontoplus.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;



public class DAO<T> {

	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}
	
	public List<T> listaTodos() {

		
		// obtem a entityManager
		EntityManager em = JPAUtil.getEntityManager();
		
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);

		/**
		 * Criteria crit = sessionFactory.getCurrentSession().createCriteria(EmpData.class).add(Restrictions.eq("EMPLTEAM", "teamxxx");
		 */
		
		query.select(query.from(classe));

		List<T> lista = em.createQuery(query).getResultList();

		for (T t : lista) {
			System.out.println(t.toString());
		}
		
		//em.close();

		return lista;
	}
}
