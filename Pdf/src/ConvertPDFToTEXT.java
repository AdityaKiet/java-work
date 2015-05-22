import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PRIndirectReference;
import com.itextpdf.text.pdf.PRStream;
import com.itextpdf.text.pdf.PRTokeniser;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfReader;

public class ConvertPDFToTEXT {
	public static void main(String[] args) throws IOException {
		try {
			Document document = new Document();
			document.open();
			PdfReader reader = new PdfReader("/home/aditya/Desktop/Android Interview Questions.pdf");
			PdfDictionary dictionary = reader.getPageN(1);
			PRIndirectReference reference = (PRIndirectReference) dictionary
					.get(PdfName.CONTENTS);
			PRStream stream = (PRStream) PdfReader.getPdfObject(reference);
			byte[] bytes = PdfReader.getStreamBytes(stream);
			PRTokeniser tokenizer = new PRTokeniser(bytes);
			FileOutputStream fos = new FileOutputStream("/home/aditya/Desktop/n2.txt");
			StringBuffer buffer = new StringBuffer();
			while (tokenizer.nextToken()) {

				buffer.append(tokenizer.getStringValue());
				buffer.append("\n");

			}
			String test = buffer.toString();
			StringReader stReader = new StringReader(test);
			int t;
			while ((t = stReader.read()) > 0)
				fos.write(t);
			document.add(new Paragraph(".."));
			document.close();
			System.out.println();
		} catch (Exception e) {
			System.out.println("exception" + e.getMessage());
		}
	}
}
