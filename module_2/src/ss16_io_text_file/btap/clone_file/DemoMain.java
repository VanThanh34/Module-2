package ss16_io_text_file.btap.clone_file;

public class DemoMain {
    public static void main(String[] args) {
        CloneFlie cloneFlie = new CloneFlie();
        cloneFlie.writeFile();
        cloneFlie.readFile(CloneFlie.UrlFileTarget);
    }
}
