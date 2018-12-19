/* Exercicio do livro Java Como Programar 
 * Capitulo 3 Classe, Pagina 77 Quest�o 3.12
 * Autor: Pedro Rangel Junior
 * Classe Invoice
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Numero do Pedido: ");
		int id = sc.nextInt();
		System.out.print("Descri��o do Produto: ");
		String descricao = sc.next();
	    System.out.print("Quantitade: ");
	    int quantidade = sc.nextInt();
	    System.out.print("Pre�o: ");
	    double preco = sc.nextDouble();
	    
	    Invoice invoice = new Invoice(id, descricao, quantidade, preco);
	    
	    System.out.println(invoice);
	    
		sc.close();
	}

}
