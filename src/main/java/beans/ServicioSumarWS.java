package beans;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ServicioSumarWS {
	@WebMethod
	public int sumar(int a, int b);
	
	@WebMethod
	public int restar(int a, int b);
	
	@WebMethod
	public int multiplicar(int a, int b);
	
	@WebMethod
	public int dividir(int a, int b);
}
