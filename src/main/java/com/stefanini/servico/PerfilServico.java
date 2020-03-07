package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.PerfilDao;
import com.stefanini.model.Perfil;
import com.stefanini.util.IGenericService;

public class PerfilServico implements IGenericService<Perfil, Long> {

	@Inject
	private PerfilDao dao;

	@Override
	public Perfil salvar(@Valid Perfil entity) {
		return dao.salvar(entity);
	}

	@Override
	public Perfil atualizar(@Valid Perfil entity) {
		return dao.atualizar(entity);
	}

	@Override
	public void remover(Long id) {
		dao.remover(id);
	}

	@Override
	public Optional<List<Perfil>> getList() {
		return Optional.empty();
	}

	@Override
	public Optional<Perfil> encontrar(Long id) {
		return dao.encontrar(id);
	}

}
