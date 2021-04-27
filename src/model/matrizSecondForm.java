package model;

import java.util.Random;
import java.util.Scanner;

public class matrizSecondForm {
	

	    private nodoDoble cab;

	    public matrizSecondForm() {
	        this.cab = null;
	    }

	    public nodoDoble getCab() {
	        return cab;
	    }
	    
	    public int[][] crearMatriz(int filas, int columnas) {
	    	Scanner sc = new Scanner(System.in);
	    	Random r = new Random();
	    	//Crea matriz con valores aleatorios
	    	int f = filas;
	    	int c = columnas;
	    	int d;
	    	int matriz[][] = new int [f][c];
	    	for (int i=0; i< f;i++) {
	    		for(int j=0;j<c;j++) {
	    			d = r.nextInt(2) + 0;
	    			matriz[i][j] = d;	    	
	    		}	    	
	    	}
	    	return matriz;
	    	
	    }

	    public void llenarmatriz2(int fila, int columna, int dato) {
	        nodoDoble n = new nodoDoble(fila, columna, dato);
	        if (cab == null) {
	            cab = n;
	            n.setLigaF(cab);
	            n.setLigaC(cab);
	        } else {
	            nodoDoble q = cab.getLigaF();
	            nodoDoble t = cab.getLigaC();
	            while (q.getLigaF() != cab) {
	                q = q.getLigaF();                
	            }
	            while (t.getLigaC() != cab) {
	                t = t.getLigaC();
	            }
	            q.setLigaF(n);
	            t.setLigaC(n);
	            n.setLigaF(cab);
	            n.setLigaC(cab);

	        }

	    }

	    public void mostrar(int matriz[][]) {	    	
	        System.out.println("MATRIZ.");
	        
	        for (int i = 0; i < matriz[0].length; i++) {
	            for (int j = 0; j < matriz[1].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println(" ");
	        }
	        System.out.println(" ");
	        
	    }
	}
