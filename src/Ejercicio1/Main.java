package Ejercicio1;

public class Carpeta {
public static void main(String[] args) {

        Archivo a1 = new Archivo("doc.txt", 0.5);
        Archivo a2 = new Archivo("image.jpg", 3.2);
        Archivo a3 = new Archivo("video.mp4", 100.0);
        Archivo a4 = new Archivo("code.java", 0.1);
        Archivo a5 = new Archivo("report.pdf", 1.5);

        // Carpeta 3
        Carpeta c3 = new Carpeta("C3_Reportes"); // Peso: 1.5 MB
        c3.agregarArchivo(a5);

        // Carpeta 2
        Carpeta c2 = new Carpeta("C2_Media"); // Peso: 3.2 + 100.0 = 103.2 MB
        c2.agregarArchivo(a2);
        c2.agregarArchivo(a3);
        c2.agregarSubcarpeta(c3); // C2 contiene C3

        // Carpeta 1 (Inicio)
        Carpeta c1 = new Carpeta("C1_Root"); // Peso: 0.5 + 0.1 + 103.2 (de C2) = 103.8 MB
        c1.agregarArchivo(a1);
        c1.agregarArchivo(a4);
        c1.agregarSubcarpeta(c2); // C1 contiene C2

        /*
            Estructura:
            C1 (Root)
            |-- doc.txt (0.5)
            |-- code.java (0.1)
            |-- C2 (Media)
                |-- image.jpg (3.2)
                |-- video.mp4 (100.0)
                |-- C3 (Reportes)
                    |-- report.pdf (1.5)

            Peso Total: 0.5 + 0.1 + 3.2 + 100.0 + 1.5 = 105.3 MB
        */

        double pesoTotal = calcularPesoTotal(c1);

        System.out.println("El peso total de la carpeta " + c1.nombre + " es: " + pesoTotal + " MB");
        // Resultado esperado: 105.3
    }

private static double calcularPesoTotal(Carpeta c1) {
	// TODO Auto-generated method stub
	return 0;
}}