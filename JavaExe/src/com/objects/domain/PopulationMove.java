package com.objects.domain;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private int fromSido;
    private int toSido;
    private String fromSidoKorean;
    private String toSidoKorean;
    private Map<Integer, String> sidoMap = new HashMap<>();

    // constructor추가 fromSido, toSido를 받아서 맴버변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
//        this.setSidoMap();
    }

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
//        this.setSidoMap();
    }

    private void setSidoMap() {
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public String getFromSidoKorean() {
        return fromSidoKorean;
    }

    public String getToSidoKorean() {
        return toSidoKorean;
    }
}
