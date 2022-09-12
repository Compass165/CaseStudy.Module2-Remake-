package crawls;

import storage.FileWriteRead;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLunisolarTools {


    public static void main(String[] args) {
        try {
            URL url = new URL("http://vlcm.zing.vn/su-kien/tran-hung-xung-vuong/tran-hung-xung-vuong.html");
            List<String> list= new ArrayList<>();
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            content = content.replaceAll("\\R","");
            content = content.replaceAll("</strong><strong>","");
            // regex
            Pattern p = Pattern.compile("<td class=\"EvenRow\" style=\"text-align: center;\"><strong>(.*?)</strong></td>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
                list.add(m.group(1));
            }
            FileWriteRead.getInstance().writeFile(list,"E:\\IntelliJ\\CaseStudy.Module2\\src\\crawls\\LunisolarTools.dat");
// close scanner
            scanner.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
