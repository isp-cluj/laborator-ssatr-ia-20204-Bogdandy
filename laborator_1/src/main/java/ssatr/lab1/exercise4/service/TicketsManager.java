package ssatr.lab1.exercise4.service;

import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import ssatr.lab1.exercise4.model.Ticket;

public class TicketsManager {

    private ArrayList<String> list = new ArrayList<>();
    private EncryptionService es = new EncryptionService(); 
    private QRCodeService qs = new QRCodeService();
    
    public Ticket generateTicket(Ticket ticket){
        System.out.println("Creating new ticket...");
        String et = es.encryptTicket(ticket);
        list.add(et);      
        qs.generateTicket(et);
        
        return ticket;
    }

    boolean validateTicket(String pathToQRCodeImage, String validationIno){
        System.out.println("Validating ticket...");
        System.out.println("Scan QR code and extract content...");
        System.out.println("Verify if information from qr code match some of the tickets from list...");


        return true;
    }

    public boolean checkinTicket(String imagePath, String phoneNumber) throws IOException, NotFoundException {
        File file = new File(imagePath);
        BufferedImage image = ImageIO.read(file);
        LuminanceSource source = new RGBLuminanceSource(image.getWidth(), image.getHeight(), getImageData(image));
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result = new MultiFormatReader().decode(bitmap);
        String qrText = result.getText();
        System.out.println("Validating QR ticket: " + qrText);
        return false;
    }

    private int[] getImageData(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int[] data = new int[width * height];
        image.getRGB(0, 0, width, height, data, 0, width);
        return data;
    }
}