package com.condominio.backend.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PerfilUsuario {
	ADMINISTRADOR("ROLE_ADMINISTRADOR");

	private String descricao;
}