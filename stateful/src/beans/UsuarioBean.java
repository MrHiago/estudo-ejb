package beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;

import services.UsuarioService;

@Model
@SessionScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 5069536819023828230L;
	
	@EJB
	private UsuarioService usuarioService;

	public UsuarioBean() {
	}

	public String informarUsuario() {
		return "index";
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	
	
}
