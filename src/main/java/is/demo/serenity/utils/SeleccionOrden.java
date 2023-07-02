package is.demo.serenity.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SeleccionOrden {

    public static int numeroAleatorioEnRango(int minimo, int maximo) {

        return ThreadLocalRandom.current().nextInt(minimo, maximo);

    }

    public static int numeroAleatorioEnRangoEmpleados(int minimo, int maximo) {

        return ThreadLocalRandom.current().nextInt(minimo, maximo);

    }

}
