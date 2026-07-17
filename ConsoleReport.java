import java.util.List;

public class ConsoleReport {

    public void show(

            List<PdfDocument> docs,

            List<SearchResult> results

    ){

        System.out.println(

                "Scanning PDF Library...\n"

        );

        System.out.println("Indexed:\n");

        for(PdfDocument pdf : docs){

            System.out.println(

                    pdf.getName()

            );

        }

        System.out.println();

        System.out.println(

                "Search query:\n"

        );

        System.out.println("docker\n");

        System.out.println("Results\n");

        for(SearchResult r : results){

            System.out.println(

                    r.getFile()

            );

        }

        System.out.println();

        System.out.println(

                "Matches found: "

                        + results.size()

        );

    }

}
