package MAR11;

public class FilePermission {


    ///  ASSIGNMENT
    // read only
    // write only
    // read and write only

            ///  read only

    private String filename;
    private int filenumber;

    ///  creating a constructor

    public FilePermission(String filename, int filenumber) {
        this.filename = filename;
        this.filenumber = filenumber;
    }

    public String getFilename() {
        return filename;
    }

    /*public void setFilename(String filename) {
        this.filename = filename;
    }*/

    public int getFilenumber() {
        return filenumber;
    }

    /*public void setFilenumber(int filenumber) {
        this.filenumber = filenumber;
    }*/

    ///  ADDING GETTER AND SETTERS


    public void filedesc(String filename, int filenumber){
        if(this.filename.equalsIgnoreCase(filename)&& this.filenumber == filenumber){
            System.out.println("valid file ");
        }else{
            System.out.println("invalid file ");
        }
    }




}
