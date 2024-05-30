package Problem_11;

public class BusinessClientProcessingStrategy implements DocumentProcessingStrategy{
    @Override
    public void processDocuments() {
        System.out.println("Processing documents for business client: Company formation documents and proof of registration required.");
    }
}
