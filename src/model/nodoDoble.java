package model;

public class nodoDoble {
	
	
	private nodoDoble ligaC;
	private int fila;
	private Object dato;
	private int col;
	private nodoDoble ligaF;
	private nodoDoble l;
	
	public nodoDoble(int fila, int col, Object dato) {
		this.ligaC = null;
	    this.fila = fila;
	    this.dato = dato;
	    this.col = col;
	    this.ligaF = null;
	    this.l = null;
	       
	}
	
	public nodoDoble getL() {
		return l;
	}
	
	public void setL(nodoDoble l) {
	    this.l = l;
	}

	public nodoDoble getLigaC() {
		return ligaC;
	}
	
	public void setLigaC(nodoDoble ligac) {
	    this.ligaC = ligac;
	}

	public int getFila() {
	    return fila;
	}
	
	public void setFila(int fila) {
	    this.fila = fila;
	}
	
	public int getCol() {
	    return col;
	}

	public void setCol(int col) {
	    this.col = col;
	}

	public nodoDoble getLigaF() {
	    return ligaF;
	}

	public void setLigaF(nodoDoble ligaf) {
	    this.ligaF = ligaf;
	}

	public Object getDato() {
	    return dato;
	}

	public void setDato(Object dato) {
	    this.dato = dato;
	}
	   
	public nodoDoble getNodo(){
	    return this;
	}
	   	    
}
