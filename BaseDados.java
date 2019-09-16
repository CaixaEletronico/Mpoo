package loginv01;

import java.util.ArrayList;

public class BaseDados {
	

	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public static ArrayList<Usuario> buscarUsuarios() {
		return usuarios;
	}
	
	public static ArrayList<Usuario> reatriveUsuarios() {
		return usuarios;
	}
	
	public static boolean adicionarUsuario(Usuario usuario) {
		if (buscarUsuario(usuario.getLogin()) != null){
			return false;
		}usuarios.add(usuario);
		return true;
		
		
//		if (usuarios.contains(usuario)) {
//			return false;
//		}
//		return usuarios.add(usuario);
		
//		Questionamento: Como fazer para saber qual o tipo de erro ocasionado e como tratar
		
	}

	public static Usuario buscarUsuario(String login){
		for(Usuario usuarioAtual : usuarios){
			if (usuarioAtual.getLogin().equals(login)){
				System.out.println(usuarioAtual);
				return usuarioAtual;}}
		return null;
	}
	
	public static ArrayList<String> buscarUsuario(Usuario usuario){
		ArrayList<String> dados = new ArrayList<String>();
		for (Usuario user:usuarios){
			if (usuario.getLogin().equalsIgnoreCase(user.getLogin())){
				dados.add(user.getLogin());
				dados.add(user.getSenha());
			}
		}
		return dados;
	}
	

//	QUESTIONAMENTO - O porquê de existir o ID ZERO, ou seja, o primeiro elemento de um vetor é zero?
//					 E se fosse 1 qual seria a consequencia? E se 2? E se 3? E se N?
	
//	@Override
//	public String toString() {
//		String retorno = "[ ";
//		for (Usuario userAtual:usuarios){
//			retorno += userAtual.toString();
//		}
//		retorno += " ]";
//		return retorno;
//	}
	
//	QUESTIONAMENTO - implementar remover do CRUD(p\ login)
//	QUESTIONAMENTO - implementar update do CRUD(p\ usuario & novoUsuario)
}
