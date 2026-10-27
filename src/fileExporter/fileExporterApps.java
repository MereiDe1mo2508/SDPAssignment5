package fileExporter;

import export.Iexporter;

public abstract class fileExporterApps {
    Iexporter exporter;
    public void startExporting() {
        exporter.export();
    }
    public void setExporter(Iexporter exporter) {
        this.exporter = exporter;
    }
}
