package br.com.questao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {
	
	private static IMatrix matrix;

	@BeforeClass
	public static void initMatrix() {
		matrix = new Matrix();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("Executa antes de cada teste");
	}

	@After
	public void afterEachTest() {
		System.out.println("Executa depois de cada teste");
	}

	@Test
	public void testDiffDiagonal() {
		
		int[][] matrixObj = { {1, 5,  3,  2}, {4, 8, -5,  6}, {7, 3,  4,  5}, {2, 5,  9, -9} };
		
		int result = matrix.diffDiagonal(matrixObj,matrixObj.length);
		
        // Exibe o resultado.
        System.out.printf("A Difereça da Soma das Diagonais é %d.\n", result);

		assertEquals(2, result);
	}

}
