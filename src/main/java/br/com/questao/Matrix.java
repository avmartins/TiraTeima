package br.com.questao;

public class Matrix implements IMatrix{

	public int diffDiagonal(int[][] mtrx, int n) { 
        // Obtém a soma das diagonais.
       int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
       for (int i = 0; i < n; i++) {
           somaDiagonalPrincipal += mtrx[i][i];
           somaDiagonalSecundaria += mtrx[mtrx.length - 1 - i][i];
       }
       
       System.out.printf("A Soma Diagonal Principal  é %d. \n", somaDiagonalPrincipal);
       System.out.printf("A Soma Diagonal Secundaria é %d. \n", somaDiagonalSecundaria);

       // Calcula a diferença das somas.
       int diferenca = somaDiagonalPrincipal - somaDiagonalSecundaria;
       if (diferenca < 0) diferenca *= -1;
        
       return diferenca;     
    }  
	
}
