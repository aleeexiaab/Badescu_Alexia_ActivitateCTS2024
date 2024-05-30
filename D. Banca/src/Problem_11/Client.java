package Problem_11;

public class Client {
    private DocumentProcessingStrategy documentProcessingStrategy;

    public void setDocumentProcessingStrategy(DocumentProcessingStrategy documentProcessingStrategy) {
        this.documentProcessingStrategy = documentProcessingStrategy;
    }

    public void processDocuments() {
        if (documentProcessingStrategy != null) {
            documentProcessingStrategy.processDocuments();
        } else {
            System.out.println("No document processing strategy set.");
        }
    }
}
