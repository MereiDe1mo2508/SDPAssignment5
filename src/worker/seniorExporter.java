package worker;

import export.csvExport;

public class seniorExporter extends worker {
    public seniorExporter() {
        exporter = new csvExport();
    }
}
