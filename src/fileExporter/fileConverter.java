package fileExporter;

import export.jsonExport;

public class fileConverter extends fileExporterApps {
    public fileConverter() {
        exporter = new jsonExport();
    }
}
