public class Main {
    public static void main(String[] args) {

        // Задание 1, Задача 1.
        System.out.println("Задание 1, Задача 1.");
        // 1.
        int[] bloke = new int[3];
        bloke[0] = 1;
        bloke[1] = 2;
        bloke[2] = 3;
        System.out.println(bloke[0] + ", " + bloke[1] + ", " + bloke[2]);


        // 2.
        double[] legend = {1.57, 7.654, 9.986};
        System.out.println(legend[1]);

        //3.
        byte[] kristal = new byte[]{14, 18, 88, 23};
        System.out.println(kristal[0]);

        System.out.println();

        // Задание 1, Задача 2.
        System.out.println("Задание 1, Задача 2.");
        for (int n = 0; n < bloke.length; n++) {
            if (n > 0) {
                System.out.print(", ");
            }
            System.out.print(bloke[n]);
        }

        System.out.println();

        for (int z = 0; z < legend.length; z++) {
            if (z > 0) {
                System.out.print(", ");
            }
            System.out.print(legend[z]);
        }

        System.out.println();

        for (int r = 0; r < kristal.length; r++) {
            if (r > 0) {
                System.out.print(", ");
            }
            System.out.print(kristal[r]);
        }

        //System.out.printf("%d, %d, %d \n", bloke[0], bloke[1], bloke[2]);
        //System.out.printf("%f, %f, %f \n", legend[0], legend[1], legend[2]);
        //System.out.printf("%d, %d, %d, %d \n", kristal[0], kristal[1], kristal[2], kristal[3]);


        System.out.println();
        System.out.println();

        // Задание 1, Задача 3.
        System.out.println("Задание 1, Задача 3.");

        int i = bloke.length - 1;
        for (; i >= 0; i--) {
            System.out.print(bloke[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int j = legend.length - 1;
        for (; j >= 0; j--) {
            System.out.print(legend[j]);
            if (j != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int g = kristal.length - 1;
        for (; g >= 0; g--) {
            System.out.print(kristal[g]);
            if (g != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        // Задание 1, Задача 4.
        System.out.println("Задание 1, Задача 4.");

        for (int l = 0; l < bloke.length; l++){
            if (bloke[l] % 2 != 0) {
                System.out.print(bloke[l] + 1 + ", ");
            }
        }
    }
}

