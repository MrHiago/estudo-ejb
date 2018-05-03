package services;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class DataHoraServices {

	public DataHoraServices() {
		System.out.println("Usou o construtor do dataHoraService");
	}

	public String getDataHoraServidor() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:sss");
		return sdf.format(Calendar.getInstance().getTime());
	}

	@PostConstruct
	public void iniciar() {
		System.out.println("Usou o método iniciar do dataHoraServices");
	}

	@PreDestroy
	public void destruir() {
		System.out.println("Usou o método destruir do dataHoraServices");
	}
}
