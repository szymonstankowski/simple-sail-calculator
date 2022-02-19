package pl.hanawind.sailcalculator.pdfgenerator;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;
import pl.hanawind.sailcalculator.sail.Sail;
import pl.hanawind.sailcalculator.sail.SailService;
import pl.hanawind.sailcalculator.user.User;
import pl.hanawind.sailcalculator.user.UserService;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Service
public class GeneratePdf {


    private final UserService userService;
    private final SailService sailService;

    public GeneratePdf(UserService userService, SailService sailService) {
        this.userService = userService;
        this.sailService = sailService;
    }

    public Document createPdf(User user, Sail sail){
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\monik\\Desktop\\newSail.pdf"));

            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 22, BaseColor.BLACK);
            StringBuilder sb = new StringBuilder();
            String buyer = sb.append(user.getName() + " " + user.getLastName() + " " + user.getEmail() + " " + user.getPhoneNumber()).toString();

            Chunk buyersCredentials = new Chunk(buyer, font);

            String sailSpec = sb.append(sail.getBoomLength() + " " + sail.getLuffLength() + " " + sail.getLeechLength() + " " +
                    sail.isRacing() + " " + sail.isSliders()).toString();
            Chunk sailDetails = new Chunk(sailSpec, font);

            document.add(buyersCredentials);
            document.add(sailDetails);
            document.close();
        }catch (DocumentException | FileNotFoundException e){
            e.printStackTrace();
        }
        return document;
    }
}

