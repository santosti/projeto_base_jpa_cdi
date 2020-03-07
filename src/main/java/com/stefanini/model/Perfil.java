package com.stefanini.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_PERFIL")
	private Long id;

	@Column(name = "NO_PERFIL")
	private String perfil;

	@Column(name = "DS_PERFIL_DESC")
	private String perfilDesc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_HORA_INCLUSAO")
	private Date horaInclusao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_HORA_ALTERACAO")
	private Date horaAlteracao;

	public Perfil() {
	}

	public Perfil(String perfil, String perfilDesc, Date horaInclusao, Date horaAlteracao) {
		super();
		this.perfil = perfil;
		this.perfilDesc = perfilDesc;
		this.horaInclusao = horaInclusao;
		this.horaAlteracao = horaAlteracao;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getPerfilDesc() {
		return perfilDesc;
	}

	public void setPerfilDesc(String perfilDesc) {
		this.perfilDesc = perfilDesc;
	}

	public Date getHoraInclusao() {
		return horaInclusao;
	}

	public void setHoraInclusao(Date horaInclusao) {
		this.horaInclusao = horaInclusao;
	}

	public Date getHoraAlteracao() {
		return horaAlteracao;
	}

	public void setHoraAlteracao(Date horaAlteracao) {
		this.horaAlteracao = horaAlteracao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", perfil=" + perfil + ", perfilDesc=" + perfilDesc + ", horaInclusao="
				+ horaInclusao + ", horaAlteracao=" + horaAlteracao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horaAlteracao == null) ? 0 : horaAlteracao.hashCode());
		result = prime * result + ((horaInclusao == null) ? 0 : horaInclusao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result + ((perfilDesc == null) ? 0 : perfilDesc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (horaAlteracao == null) {
			if (other.horaAlteracao != null)
				return false;
		} else if (!horaAlteracao.equals(other.horaAlteracao))
			return false;
		if (horaInclusao == null) {
			if (other.horaInclusao != null)
				return false;
		} else if (!horaInclusao.equals(other.horaInclusao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		if (perfilDesc == null) {
			if (other.perfilDesc != null)
				return false;
		} else if (!perfilDesc.equals(other.perfilDesc))
			return false;
		return true;
	}

}
