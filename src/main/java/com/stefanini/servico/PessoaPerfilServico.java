package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.PessoaPerfilDao;
import com.stefanini.model.PessoaPerfil;
import com.stefanini.util.IGenericService;

public class PessoaPerfilServico implements IGenericService<PessoaPerfil, Long> {

	@Inject
	private PessoaPerfilDao dao;

	@Override
	public PessoaPerfil salvar(@Valid PessoaPerfil entity) {
		return dao.salvar(entity);
	}

	@Override
	public PessoaPerfil atualizar(@Valid PessoaPerfil entity) {
		return dao.atualizar(entity);
	}

	@Override
	public void remover(Long id) {
		dao.remover(id);
	}

	@Override
	public Optional<List<PessoaPerfil>> getList() {
		return Optional.empty();
	}

	@Override
	public Optional<PessoaPerfil> encontrar(Long id) {
		return dao.encontrar(id);
	}

}
