package pagemaker;

import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
    private Writer writer;
    public HtmlWriter(Writer writer) {  // 建構子
        this.writer = writer;
    }
    public void title(String title) throws IOException {    // 輸出標題
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }
    public void paragraph(String msg) throws IOException {  // 輸出段落
        writer.write("<p>" + msg + "</p>\n");
    }
    public void link(String href, String caption) throws IOException {  // 輸出鏈結
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }
    public void mailto(String mailaddr, String username) throws IOException {   // 輸出郵件信箱��
        link("mailto:" + mailaddr, username);
    }
    public void close() throws IOException {    // 關閉檔案
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
