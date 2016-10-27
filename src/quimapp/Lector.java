package quimapp;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.sun.pdfview.*;
import quimapp.gui.Ventana;
public class Lector extends PagePanel {
    PagePanel panelpdf;
    JFileChooser selector;
    PDFFile pdffile;
    int indice = 0;
    public Lector(Ventana ventana) {
        panelpdf = new PagePanel();
        indice = 0;
        selector = new JFileChooser();
        int op = selector.showOpenDialog(ventana);
        try {
            File file = selector.getSelectedFile();
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            FileChannel channel = raf.getChannel();
            ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            pdffile = new PDFFile(buf);
            PDFPage pagina = pdffile.getPage(indice);
            panelpdf.showPage(pagina);
            ventana.repaint();
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }

       

    }
}
