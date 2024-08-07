package adit;

import java.io.file;
import java.io.IOException;

public class Handling{
  public static void main(String[] args) throws IOException{
    file myfile = new File("Arshad.txt");
    myfile = createnewfile();
    System.out.println(myfile.exists());
  }

}
