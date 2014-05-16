package com.haribon.repository;

import java.util.List;

import com.haribon.model.Usuario;

public interface UsuarioDAO {

	Usuario insertarUsuario(Usuario a);
	Usuario modificarUsuario(Usuario a);
	Usuario eliminarUsuario(Usuario a);
	List<Usuario> listarUsuario(Usuario a);
	List<Usuario> buscarUsuario(Usuario a);
	
}
