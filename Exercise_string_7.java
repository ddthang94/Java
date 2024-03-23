public class Exercise_string_7 {
    public static void main(String[] args) {
        /* Get String from a link */
        /* 1. Take file name including extension
        *  2. Take the file name only */
        String path = "D:/DDThang-PC/Music/remix.mp3";
        int lastSlashIndex = path.lastIndexOf('/');
        System.out.println(lastSlashIndex);
        /* file name + extension */
        String fullFileName = path.substring(lastSlashIndex+1);
        System.out.println(fullFileName);
        /* file name only */
        int lastDotIndex = fullFileName.lastIndexOf('.');
        String fileName = fullFileName.substring(0,lastDotIndex);
        System.out.println(fileName);
    }
}
