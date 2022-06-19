public class Assignment1 {
    public static void main(String[] args) {
        /* TELUSKO */

                /* T */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > 0 && j != 2){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println();

                /* E */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 1 || i == 3){
                    System.out.print(" * ");
                    break;
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println();

                /* L */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != 4){
                    System.out.print(" * ");
                    break;
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println();

                 /* U */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != 4 && (j == 0 || j == 4)){
                    System.out.print(" * ");
                }else if(i == 4){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println();

        /* S */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

            }
            System.out.print(" * ");
        }

    }
}
