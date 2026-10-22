package worker;

import export.Iexporter;

public abstract class worker {
    Iexporter exporter;
    public void startExporting() {
        exporter.export();
    }
    public void setExporter(Iexporter exporter) {
        this.exporter = exporter;
    }
}
