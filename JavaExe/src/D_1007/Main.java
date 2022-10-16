package D_1007;

import com.objects.parser.PopulationMoveParser;
import com.objects.context.ReadLineContext;
import com.objects.domain.PopulationMove;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext<PopulationMove> readLineContext =
                new ReadLineContext<>(new PopulationMoveParser());
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}
