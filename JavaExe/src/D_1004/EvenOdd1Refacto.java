package D_1004;

public class EvenOdd1Refacto {
        private int multipleTargetNum = 2;

        public EvenOdd1Refacto(int multipleTargetNum) {
            this.multipleTargetNum = multipleTargetNum;
        }

        public String isMultiple(int num) {
            // 숫자를 받아서 짝수면 '짝수'리턴 홀수면 '홀수'리턴
            if ( num % this.multipleTargetNum == 0 ){
                return "multiple";
            } else {
                return "not multiple";
            }
        }
        public static void main(String[] args) {
            EvenOdd1Refacto refacto = new EvenOdd1Refacto(7);
            System.out.println(refacto.isMultiple(345));

        }
}
