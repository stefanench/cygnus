import java.util.ArrayList;
import java.util.List;

public class SearchEngine {

    public List<SearchResult> search(

            Index index,

            String keyword

    ){

        List<SearchResult> results =

                new ArrayList<>();

        index.data().forEach(

                (file,text)->{

                    if(text.contains(keyword)){

                        results.add(

                                new SearchResult(file)

                        );

                    }

                }

        );

        return results;

    }

}
