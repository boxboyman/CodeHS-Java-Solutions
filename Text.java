public class Text {

        

        public static final String BLACK = "\033[0;30m";
        public static final String RED = "\033[0;31m";
        public static final String GREEN = "\033[0;32m";
        public static final String YELLOW = "\033[0;33m";
        public static final String BLUE = "\033[0;34m";
        public static final String PURPLE = "\033[0;35m";
        public static final String CYAN = "\033[0;36m";
        public static final String WHITE = "\033[0;37m";
    
 
        public static void clear() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        public static void printSmooth(String text, int time) {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                wait(time);
            }
        }
    

        public static void wait(int time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
    }
}
