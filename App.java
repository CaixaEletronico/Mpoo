package loginv01;

//import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("ze", "1234");
		Usuario user2 = new Usuario("maria", "MariaAIluminada");
		BaseDados.getUsuarios().add(user1);
		BaseDados.getUsuarios().add(user2);
		
		Usuario user3 = new Usuario("eu", "Eu");
		BaseDados.getUsuarios().add(user3);
		
		Usuario user4 = new Usuario("ze1", "12321");
		System.out.println(BaseDados.adicionarUsuario(user4));
		
		System.out.println(BaseDados.getUsuarios().get(0).getLogin());
		System.out.println(BaseDados.getUsuarios().get(0).getSenha());
//		System.out.println(Validador.validarUsuario(user2));
//		TelaLogin tela = new TelaLogin();
		
//		if(Validador.validarUsuario(user4)) {
//			JOptionPane.showMessageDialog(null, "Logado com sucesso", "Confirmação",JOptionPane.INFORMATION_MESSAGE);
//		}else {
//			JOptionPane.showMessageDialog(null, "Usuario inexistente ou login/senha incorretos");;
//		}
		
//		System.out.println(BaseDados.adicionarUsuario(user4));
		
//		System.out.println(BaseDados.buscarUsuario("ze"));
		System.out.println(BaseDados.getUsuarios());
	}

}
