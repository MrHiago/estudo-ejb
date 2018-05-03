package beans;

import java.io.Serializable;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import services.DataHoraServices;

@Model
public class DataHoraBean implements Serializable {

	private static final long serialVersionUID = -510380578846762931L;

	@Inject
	private DataHoraServices dataHoraServices;

	@Inject
	private UsuarioBean usuarioBean;

	public DataHoraBean() {
		System.out.println("Criou a instância do controleDataHora");
	}

	public String getNomeUsuario() {
		return usuarioBean.getUsuarioService().getUsuario() != null ? usuarioBean.getUsuarioService().getUsuario()
				: "Usuário não informado !";
	}

	public DataHoraServices getDataHoraServices() {
		return dataHoraServices;
	}

	public void setDataHoraServices(DataHoraServices dataHoraServices) {
		this.dataHoraServices = dataHoraServices;
	}

	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}

	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}
