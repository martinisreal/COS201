public class Assignment_2 {
    public static void main(String[] args) {
        System.out.print("Single Loop");
        for (int i = 1; i <= 6; i++){
            if (i <= 3){
                System.out.println("* * * * = = = = = = =");
            } else {
                System.out.println("= = = = = = = = = = =");
            }
        }

        System.out.println();

        System.out.print("Nested Loop");
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 12; col++) {
                if (row < 3 && col < 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }
            }
            
            System.out.println();
        }
    }
}
