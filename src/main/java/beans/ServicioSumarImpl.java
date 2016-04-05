package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.ServicioSumarWS")
public class ServicioSumarImpl implements ServicioSumarWS {
	@Override
	public int sumar(int a, int b) {
		return a + b;
	}

	@Override
	public int restar(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplicar(int a, int b) {
		return a * b;
	}

	@Override
	public int dividir(int a, int b) {
		return a / b;
	}
}