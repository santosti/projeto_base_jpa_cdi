package com.stefanini.dao;

import java.util.List;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Pessoa;

/**
 * O Unico objetivo da Dao
 * 
 * @author joaopedromilhome
 *
 */
public class PessoaDao extends GenericDao<Pessoa, Long> {

	public PessoaDao() {
		super(Pessoa.class);
	}

	public List<Pessoa> getList(String nome) {

		return getEntityManager().createNamedQuery("Pessoa.findByNome").setParameter("nome", nome).getResultList();
	}
}
