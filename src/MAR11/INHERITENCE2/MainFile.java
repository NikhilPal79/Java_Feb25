package MAR11.INHERITENCE2;

public class MainFile {
    public static void main(String[] args) {

        FilePermission1 filePermission = new FilePermission1("richdad poordad", 1025);
        filePermission.filedesc("richdad poordad",1055);/// invalid file cz filenumber is diffrent
        System.out.println();
        filePermission.filedesc("richdad poordad",1025);/// valid cz both things are same
        System.out.println();

        ///  ADDING GETTER & SETTERS

        ///  CASE 1 => READ ONLY
        ///  COMMENTING OUT BOTH SETTERS

        System.out.println(filePermission.getFilename());
        System.out.println(filePermission.getFilenumber());
        filePermission.filedesc("richdad poordad", 1452);
        filePermission.filedesc("richdad poordad", 1025);

        ///  CASE 2 => WRITE ONLY
        ///  COMMENTING OUT BOTH GETTER

        ///  CASE 3 => READ AND WRITE ONLY
        /// COMMENTING OUT THE SETTER FOR FILENAME AND GETTER FOR FILENUMBER

    }
}
