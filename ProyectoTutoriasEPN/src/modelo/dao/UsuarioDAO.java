package modelo.dao;

import modelo.entidades.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
	
	public Usuario getUsuarioByUsername(String username);

}
