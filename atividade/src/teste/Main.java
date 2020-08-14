package teste;

import sequecias.SequenciaCubica;
import sequecias.SequenciaQuadratica;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SequenciaCubica sequenciaCubica = new SequenciaCubica();
        SequenciaQuadratica sequenciaQuadratica = new SequenciaQuadratica();

        sequenciaCubica.geradorSequencia(2);
        sequenciaQuadratica.geradorSequencia(6);
    }
}
