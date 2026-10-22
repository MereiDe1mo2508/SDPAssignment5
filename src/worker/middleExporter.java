package worker;

import export.pdfExport;

public class middleExporter extends worker {
    public middleExporter() {
        exporter = new pdfExport();
    }
}
