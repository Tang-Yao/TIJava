package part.part4;

/**
 * Created by ty on 2016/10/8.
 */

public class Vampire {

    public static void main(String[] args) {
        Vampire vam = new Vampire();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++){
                        int num = i * 1000 + j * 100 + k * 10 + l;

                        Integer[] compare = vam.product(i, j, k, l);

                        for (int m : compare) {
                            if (num == m) {
                                System.out.println(num);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    Integer[] product(int i, int j, int k, int l) {
        Integer[] number = new Integer[12];

        number[0] = (i * 10 + j) * (k * 10 + l);
        number[1] = (i * 10 + j) * (l * 10 + k);
        number[2] = (j * 10 + i) * (k * 10 + l);
        number[3] = (j * 10 + i) * (l * 10 + k);

        number[4] = (i * 10 + k) * (j * 10 + l);
        number[5] = (i * 10 + k) * (l * 10 + j);
        number[6] = (k * 10 + i) * (j * 10 + l);
        number[7] = (k * 10 + i) * (l * 10 + j);

        number[8] = (i * 10 + l) * (j * 10 + k);
        number[9] = (i * 10 + l) * (k * 10 + j);
        number[10] = (l * 10 + i) * (j * 10 + k);
        number[11] = (l * 10 + i) * (k * 10 + j);

        return number;
    }
}
