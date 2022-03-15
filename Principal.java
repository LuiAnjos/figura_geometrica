import java.util.Scanner;
public class Principal {
    
    public static void main(String [] args) {
        Quadrado quadrado = new Quadrado();
        System.out.println("Digite o lado do quadrado");
        Scanner leia = new Scanner(System.in);
        quadrado.setLado(leia.nextDouble());

        Triangulo triangulo = new Triangulo();
            System.out.println("Digite o primeiro lado do triângulo");
            triangulo.setLadoA(leia.nextDouble());

            System.out.println("Digite o segundo lado do triângulo");
            triangulo.setLadoB(leia.nextDouble());
            
            System.out.println("Digite o terceiro lado do triângulo");
            triangulo.setLadoC(leia.nextDouble());

        leia.close();

        System.out.println(triangulo.getPerimetro());
        System.out.println(triangulo.getArea());
        System.out.println(quadrado.getPerimetro());
        System.out.println(quadrado.getArea());

    }
}
