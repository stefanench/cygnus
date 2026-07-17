import java.util.List;

public class Main {

    public static void main(String[] args) {

        PdfScanner scanner =

                new PdfScanner();

        List<PdfDocument> docs =

                scanner.scan();

        TextIndexer builder =

                new TextIndexer();

        Index index =

                builder.build(docs);

        List<SearchResult> results =

                new SearchEngine()

                        .search(

                                index,

                                "docker"

                        );

        new ConsoleReport()

                .show(

                        docs,

                        results

                );

    }

}
