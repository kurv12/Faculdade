/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaçãopolonesa;

/**
 *
 * @author Keven
 */
public class CalculadoraRPN {

	public static void main(String[] args) {
		// Pilha de operandos (máximo 100 operandos aninhados).
		PilhaSeq<Double> pilha = new PilhaSeq<>(100);

		for (String op : args) {
			if ("+-/*".contains(op)) {
				// Termo é um operador.
				char operador = op.charAt(0);

				// Desempilha operandos em ordem inversa.
				double operando2 = pilha.desempilhar();
				double operando1 = pilha.desempilhar();

				// Executa operação e empilha resultado.
				switch (operador) {
				case '+':
					pilha.empilhar(operando1 + operando2);
					break;
				case '-':
					pilha.empilhar(operando1 - operando2);
					break;
				case '*':
					pilha.empilhar(operando1 * operando2);
					break;
				case '/':
					pilha.empilhar(operando1 / operando2);
					break;
				default:
					System.err.printf("Operador inválido: %c\n", operador);
					System.exit(1);
				}
			} else
				// Termo é um operando.
				pilha.empilhar(Double.parseDouble(op));
		}

		// Exibe resultado.
		System.out.println(pilha.desempilhar());
	}

}
