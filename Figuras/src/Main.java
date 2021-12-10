import Figuras.Circulo;
import Figuras.Quadrado;
import Figuras.Triangulo;

public class Main {

    public static void main(String[] args) {

        Figuras.Triangulo triangulo = new Triangulo();
        triangulo.draw();

        Figuras.Circulo circulo = new Circulo();
        circulo.draw();

        Figuras.Quadrado quadrado = new Quadrado();
        quadrado.draw();

        passaParamentroPorHeranca(quadrado);
    }

    public static void passaParamentroPorHeranca(Figuras.Figura figura) {
        figura.drawShape();
    }

}
