package ar.edu.unlam.pb2;

import org.junit.Assert;

public class DadoTest {
		
	@org.junit.Test
	
	public void Test() {
		int valorObtenido;
		Dado MiDado=new Dado();
		
		valorObtenido= MiDado.MostrarLanzamiento();
		
		Assert.assertTrue(valorObtenido<=6&&valorObtenido>=1);
		
		
	}

}
