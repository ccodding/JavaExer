package com.objects.parser;

import com.objects.context.Parser;
import com.objects.domain.PopulationMove;

public class PopulationMoveParser implements Parser<PopulationMove> {
    @Override
    public PopulationMove parse(String str) {
        String[] splittedLine = str.split(",");
        return new PopulationMove(splittedLine[6], splittedLine[0]);// 전입to 전출from
    }
}