public class Main {

    public static void main(String[] args) {

        smallStraight(2, 2, 3, 2, 2);

    }

    public static int smallStraight(int a, int b, int c, int d, int e) {
        boolean have1;
        boolean have2;
        boolean have3;
        boolean have4;
        boolean have5;
        boolean have6;

        if (a == 1 || b == 1 || c == 1 || d == 1 || e == 1) {
            have1 = true;
        } else {
            have1 = false;
        }

        if (a == 2 || b == 2 || c == 2 || d == 2 || e == 2) {
            have2 = true;
        } else {
            have2 = false;
        }


        if (a == 3 || b == 3 || c == 3 || d == 3 || e == 3) {
            have3 = true;
        } else {
            have3 = false;
        }

        if (a == 4 || b == 4 || c == 4 || d == 4 || e == 4) {
            have4 = true;
        } else {
            have4 = false;
        }

        if (a == 5 || b == 5 || c == 5 || d == 5 || e == 5) {
            have5 = true;
        } else {
            have5 = false;
        }

        if (a == 6 || b == 6 || c == 6 || d == 6 || e == 6) {
            have6 = true;
        } else {
            have6 = false;
        }

        if ((have1 == true) && (have2 == true) && (have3 == true) && (have4 == true)) {
            return (30);
        } else if ((have2 == true) && (have3 == true) && (have4 == true) && (have5 == true)) {
            return (30);
        } else if ((have3 == true) && (have4 == true) && (have5 == true) && (have6 == true)) {
            return (30);
        } else {
            return 0;
        }
        System.out.print();
    }
}