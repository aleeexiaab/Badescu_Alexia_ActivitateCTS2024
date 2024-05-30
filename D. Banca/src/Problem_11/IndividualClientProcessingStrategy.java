package Problem_11;

public class IndividualClientProcessingStrategy implements DocumentProcessingStrategy{
    @Override
    public void processDocuments() {
        System.out.println("Processing documents for individual client: ID card and employment certificate required.");
    }
}
