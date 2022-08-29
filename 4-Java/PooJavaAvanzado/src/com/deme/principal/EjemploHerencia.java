package com.deme.principal;

import com.deme.herencia.Hija;
import com.deme.herencia.Hijo;

public class EjemploHerencia {

    public static void main (String[] args)
    {
        Hija h = new Hija();
        h.visualizarA();

        Hijo ho = new Hijo();
        ho.visualizarABC();

    }
}
