import java.util.HashMap;
import java.util.Map;

public class Index {

    private final Map<String,String> pages =
            new HashMap<>();

    public void add(
            PdfDocument pdf
    ) {

        pages.put(

                pdf.getName(),

                pdf.getText()

        );

    }

    public Map<String,String> data() {

        return pages;

    }

}
