//common functionality
//-open file
//- read file
//- abstract method  produce report()
//- send via email/slack
public class File {
    public static void main(String[] args)
    {
           WordFile wordFile=new WordFile();
           wordFile.closeFile();
           wordFile.openFile();
           wordFile.produceReport();
           wordFile.send();
    }
}
