package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {

	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception {

		long millis = System.currentTimeMillis();
		Object o = context.proceed();

		String metodo = context.getMethod().getName();
		String classe = context.getTarget().getClass().getSimpleName();

		double tempo =(double) (System.currentTimeMillis() - millis) / 1000;

		System.out.println("Classe: " + classe + "\nMétodo: " + metodo + "\ntempo gasto: " + tempo + "s");

		return o;
	}

}
