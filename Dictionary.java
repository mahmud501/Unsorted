package classwork;
public class Dictionary extends Book{

    protected int definitions;

    Dictionary(int numPages, int numDefinitions) {
        super(numPages);
        definitions = numDefinitions;
    }

    public void message() {
        System.out.println("Number of definitions" + 
                           definitions);
        System.out.println("Definitions per page: " + 
                           (definitions/pages));
        super.message();
    }
}