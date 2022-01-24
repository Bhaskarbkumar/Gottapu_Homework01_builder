package Builder;

import Builder.export.PdfDocument;

public class PdfBuilder implements PresentationBuilder{
    private PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }
    public PdfDocument getPdfDocument(){
        return this.document;
    }
}
