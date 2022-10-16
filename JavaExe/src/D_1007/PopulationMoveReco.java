package D_1007;

public class PopulationMoveReco {
    private int fromSido;
    private int toSido;

    public PopulationMoveReco(int fromSido, int toSido){
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public PopulationMoveReco(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    public int getToSido() { // alt+insert getter추가
        return toSido;
    }
    public int getFromSido() {
        return fromSido;
    }

    // contructor추가 fromSido, toSido를 받아서 멤버변수에 넣는 기능



}
