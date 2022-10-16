package D_1004;

    public class RanCalc {

        private int num1;
        private int num2;

        public RanCalc(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
        public int plus(){
            return num1 + num2;
        }
        public int minus(){
            return num1 - num2;
        }
        public int multiple(){
            return num1 * num2;
        }
        public float divide(){
            try {
                return (float) num1 / num2;
            }
            catch(Exception e){
                return (float) num1 / num2;
            }
        }


        public static void main(String[] args){
            int N1 = (int)(Math.random()*10);
            int N2 = (int)(Math.random()*10);
            RanCalc cal = new RanCalc(N1, N2);
            System.out.printf("%d\n", cal.plus());
            System.out.printf("%d\n", cal.minus());
            System.out.printf("%d\n", cal.multiple());
            System.out.printf("%f", cal.divide());
        }
    }


