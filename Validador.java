package loginv01;

public class Validador {
	
	public static boolean validarUsuario(Usuario usuario) {
		for (Usuario user:BaseDados.getUsuarios()){
			if (usuario.getLogin().equals(user.getLogin())
					&&
				usuario.getSenha().equalsIgnoreCase(user.getSenha())){
				return true;
			}
		}
		return false;
	}
	
	public static boolean validarUsuario(String login, String senha) {
		Usuario usuario = new Usuario(login, senha);
		validarUsuario(usuario);
		return false;
	}
	

}
