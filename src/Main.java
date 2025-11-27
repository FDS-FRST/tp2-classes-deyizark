public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //vale
        Quadrilatere quad1 = new Quadrilatere(2,4);
        System.out.println("Le perimetre du Quadrilatere 1 est de " + quad1.perimetre()+"cm");
        System.out.println("La surface du Quadrilatere 1 est de " + quad1.surface()+"cm2");

        System.out.println("============================");

        //default
        Quadrilatere quad2 = new Quadrilatere();
        System.out.println("Le perimetre du Quadrilatere 2 est de " + quad2.perimetre()+"cm");
        System.out.println("La surface du Quadrilatere 2 est de " + quad2.surface()+"cm2");
    }
}