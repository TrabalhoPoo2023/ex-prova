import prova.Circulo;
import prova.Quadrado;
import prova.Retangulo;
import prova.Triangulo;
public class App {
    public static void main(String[] args) throws Exception {
       Quadrado quadrado = new Quadrado();
       quadrado.setLado1(5);
       quadrado.setLado2(5);
       quadrado.setCor("azul");
       quadrado.toString();

       Triangulo triangulo = new Triangulo();
       triangulo.setAltura(3);
       triangulo.setBase(8);
       triangulo.setCor("preto");
       triangulo.toString();

       Retangulo retangulo = new Retangulo();
       retangulo.setLado1(6);
       retangulo.setLado2(4);
       retangulo.setCor("vermelho");
       retangulo.toString();

       Circulo circulo = new Circulo();
       circulo.setRaio(6);
       circulo.setCor("branco");
       circulo.toString();

    }
}
