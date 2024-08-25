package lista7_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_1 {
    public static void main(String[] args) {
        final int LIMITEMAX = 100;
        final int LINHA = 6;
        final int COLUNA = 4;
        String escolha;
        int vet[][] = new int [LINHA][COLUNA];
        int vet2[][] = new int [LINHA][COLUNA];
        int maior[] = new int [LINHA];
        do{
            for(int x=0; x < LINHA; x++){
                for(int y=0; y < COLUNA; y++){
                    vet[x][y] = (int) (Math.random() * (LIMITEMAX+1));
                    if(y == 0){
                        maior[x] = vet[x][y];
                    }
                    if(maior[x] < vet[x][y]){
                        maior[x] = vet[x][y];
                    }
                }
            }
            for(int x=0; x < LINHA; x++){
                for(int y=0; y < COLUNA; y++){
                    vet2[x][y] = vet[x][y] * maior[x];
                }
            }
            String vetorOriginal = "";
            for (int x = 0; x < LINHA; x++) {
                vetorOriginal += Arrays.toString(vet[x]) + "\n";
            }
            String vetor2 = "";
            for (int x = 0; x < LINHA; x++) {
                vetor2 += Arrays.toString(vet2[x]) + "\n";
            }
            escolha = JOptionPane.showInputDialog(null, "Matriz original: \n" +vetorOriginal+ "\n\nVetor recalculado: \n" +vetor2+
                    "\nDigite 's' para sair ou qualquer outra letra para reiniciar o programa");
        }while(!"s".equals(escolha) && !"S".equals(escolha));
    }    
}
