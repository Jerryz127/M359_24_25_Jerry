package U4.Homework;

public class ChallengingLoops_4_5 {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int k = 1; k < i; k++){
                System.out.print(k);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int a =5; a>0; a--){
            for(int b = 0; b <a; b++){
                System.out.print(a);
            }
            System.out.println(" ");
        }
        everyOtherLetterPyramid("FremdVikings");
    }

        public static void everyOtherLetterPyramid(String str){
            String s ="";
            System.out.println(str);
            for(int p =5; p>0; p-- ) {
                for (int c = 0; c < str.length(); c += 2) {
                    System.out.println(str.substring(c,c+1));
                }
            }
        }
}
