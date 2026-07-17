import java.util.List;

public class TextIndexer {

    public Index build(
            List<PdfDocument> docs
    ) {

        Index index = new Index();

        for(PdfDocument pdf : docs){

            index.add(pdf);

        }

        return index;

    }

}
