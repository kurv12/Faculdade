/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keven
 */
public class KMP {

    private String pat;
    private int[][] dfa;

    // Construtor (pré-processamento): calcula autômato dfa[][]
    public KMP(String pat) {
        this.pat = pat;
        int M = pat.length();
        int R = 256;
        dfa = new int[R][M];
        dfa[pat.charAt(0)][0] = 1;

        for (int X = 0, j = 1; j < M; j++) {
            // calcula dfa[][j]
            for (int c = 0; c < R; c++) {
                dfa[c][j] = dfa[c][X];
            }
            dfa[pat.charAt(j)][j] = j + 1;
            X = dfa[pat.charAt(j)][X];
        }
    }

    // Simula funcionamento do DFA sobre o texto txt
    public int search(String txt) {
        int j, M = pat.length();
        int i, N = txt.length();

        for (i = 0, j = 0; i < N && j < M; i++) {
            j = dfa[txt.charAt(i)][j];
        }
        if (j == M) {
            return i - M;
        } else {
            return N;
        }
    }

    // Cliente de teste
    public static void main(String[] args) {
        String pat = args[0];
        String txt = args[1];
        KMP kmp = new KMP(pat);
        StdOut.println("text:    " + txt);
        int offset = kmp.search(txt);
        StdOut.print("pattern: ");
        for (int i = 0; i < offset; i++) {
            StdOut.print(" ");
        }
        StdOut.println(pat);
    }

}
