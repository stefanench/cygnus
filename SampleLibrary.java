import java.util.List;

public class SampleLibrary {

    public static List<PdfDocument> load() {

        return List.of(

                new PdfDocument(

                        "manual.pdf",

                        "network installation hardware"

                ),

                new PdfDocument(

                        "java-guide.pdf",

                        "java collections streams"

                ),

                new PdfDocument(

                        "linux-notes.pdf",

                        "docker containers linux terminal"

                )

        );

    }

}
