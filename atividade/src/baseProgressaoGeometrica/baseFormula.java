package baseProgressaoGeometrica;

import java.util.ArrayList;

public class baseFormula {

    private int razao;

    public void geradorSequencia(int primeiroTermo) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(primeiroTermo);
        int base = primeiroTermo;
        for(int i = 1; i <= 10; i++){
            int calculo = this.razao * base;
            lista.add(calculo);
            base = calculo;
        }
        System.out.println("Lista gerada: " + lista);
        System.out.println("Ultimo numero gerado: " + lista.get(lista.size() - 1));
        System.out.println("O proximo numero a ser gerado é: " + lista.get(lista.size() - 1 ) * this.razao);
    }

}
