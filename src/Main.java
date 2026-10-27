import export.csvExport;
import export.jsonExport;
import fileExporter.*;

public class Main {
    public static void main(String[] args) {
        fileExporterApps adobe = new adobeAcrobat();
        fileExporterApps free = new freeConvert();
        fileExporterApps quick = new quickConvert();
        fileExporterApps convert = new fileConverter();
        System.out.println("Default file format");
        adobe.startExporting();
        free.startExporting();
        quick.startExporting();
        convert.startExporting();
        System.out.println("Changing file formats");
        quick.setExporter(new csvExport());
        quick.startExporting();
        adobe.setExporter(new jsonExport());
        adobe.startExporting();
    }
}