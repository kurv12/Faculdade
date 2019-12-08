package edoo2019.pkg1;

//import br.ufms.facom.edpoo.TS;
//import br.ufms.facom.edpoo.TSVetor;
//import edu.princeton.cs.algs4.StdOut;

public class TestaTS {

	public static void main(String[] args) {
		// TS<String, String> ts = new TSEncadeada<>();
		// TS<String, String> ts = new TSArvoreBinariaBusca<>();
		TS<String, String> ts = new TSVetor<>();

		ts.put("joão", "silva");
		ts.put("joana", "ferreira");
		ts.put("pedro", "martins");

		StdOut.printf("Tamaho: %d\n", ts.tamanho());

		for (String nome : ts)
			StdOut.printf("Nome: %s / Sobrenome: %s\n", nome, ts.get(nome));

		StdOut.println("********************************");

		StdOut.println("Removendo 'joana'...");
		ts.remove("joana");

		StdOut.printf("Tamaho: %d\n", ts.tamanho());

		for (String nome : ts)
			StdOut.printf("Nome: %s / Sobrenome: %s\n", nome, ts.get(nome));
		
		StdOut.println("Alterando sobrenome de 'pedro'...");

		ts.put("pedro", "reis");

		StdOut.printf("Tamaho: %d\n", ts.tamanho());

		for (String nome : ts)
			StdOut.printf("Nome: %s / Sobrenome: %s\n", nome, ts.get(nome));
	}

}
