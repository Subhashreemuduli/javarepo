public class WordFile extends ImageFile implements NewFile{
    @Override
    void produceReport() {
        System.out.println("report is produced");
    }

    @Override
    public void send() {
        System.out.println("send the file");
    }
}
