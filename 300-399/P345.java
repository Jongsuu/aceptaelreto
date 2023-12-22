import java.util.Scanner;
import java.util.Scanner;

public class P345 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> comprovador = new HashSet<Integer>();

        String[] camps;
        boolean correcte;

        int[][] sudoku;
        int nCasos;

        nCasos = Integer.parseInt(s.nextLine());

        for (int cas = 0; cas < nCasos; cas++) {
            sudoku = new int[9][9];

            // Carregar numeros a la matriu
            for (int fila = 0; fila < 9; fila++) {
                camps = s.nextLine().split(" ");

                for (int col = 0; col < 9; col++)
                    sudoku[fila][col] = Integer.parseInt(camps[col]);
            }

            correcte = ComprovarFiles(sudoku, comprovador) && ComprovarColumnes(sudoku, comprovador)
                    && ComprovarQuadrants(sudoku, comprovador);

            if (correcte)
                System.out.println("SI");
            else
                System.out.println("NO");
        }

        s.close();
    }

    public static boolean ComprovarFiles(int[][] sudoku, HashSet<Integer> comprovador) {
        boolean correcte = true;

        int fil = 0, col = 0;

        while (correcte && fil < 9) {
            while (correcte && col < 9) {
                comprovador.add(sudoku[fil][col]);
                correcte = comprovador.size() == col + 1;

                if (correcte)
                    col++;
            }

            if (correcte) {
                fil++;
                col = 0;
            }

            comprovador.clear();
        }

        return correcte;
    }

    public static boolean ComprovarColumnes(int[][] sudoku, HashSet<Integer> comprovador) {
        boolean correcte = true;

        int fil = 0, col = 0;

        while (correcte && col < 9) {
            while (correcte && fil < 9) {
                comprovador.add(sudoku[fil][col]);
                correcte = comprovador.size() == fil + 1;

                if (correcte)
                    fil++;
            }

            if (correcte) {
                col++;
                fil = 0;
            }

            comprovador.clear();
        }

        return correcte;
    }

    public static boolean ComprovarQuadrants(int[][] sudoku, HashSet<Integer> comprovador) {
        boolean correcte = true;

        int fil = 0;

        while (correcte && fil < 7) {
            correcte = ComprovarFilaQuadrants(sudoku, comprovador, fil);

            if (correcte)
                fil += 3;
        }

        return correcte;
    }

    public static boolean ComprovarFilaQuadrants(int[][] sudoku, HashSet<Integer> comprovador, int fila) {
        boolean correcte = true;

        int fil = fila, col = 0, comptador = 0;

        while (correcte && col < 9) {
            comprovador.add(sudoku[fil][col]);
            comptador++;

            correcte = comprovador.size() == comptador;

            if (correcte) {
                if (fil == fila + 2) {
                    if (col == 2 || col == 5) {
                        comprovador.clear();
                        comptador = 0;
                    }

                    fil = fila;
                    col++;
                }

                else
                    fil++;
            }
        }

        comprovador.clear();

        return correcte;
    }
}
