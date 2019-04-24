package ar.edu.unlam.pb2;

public class Dado {
	
private Integer cantidad_caras=6;
private Integer resultadoDelLanzamiento=0;


public int MostrarLanzamiento(){
	int lanzamiento=0;
	
	lanzamiento=(int)(Math.random()*cantidad_caras+1);
	resultadoDelLanzamiento=lanzamiento;
	return resultadoDelLanzamiento;
	
  }
	
}

