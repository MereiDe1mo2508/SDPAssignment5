package worker;

import export.jsonExport;

public class juniorExporter extends worker {
    public juniorExporter() {
        exporter = new jsonExport();
    }
}
