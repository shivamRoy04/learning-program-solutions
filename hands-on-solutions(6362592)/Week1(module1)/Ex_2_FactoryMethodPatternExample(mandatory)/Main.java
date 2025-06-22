public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfDocumentFactory();
        Document doc = factory.createDocument();
        doc.open();
    }
}