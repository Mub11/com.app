package app;

import java.io.*;
public class UserwriImpl implements Userwri {
    @Override
    public void save() {
        try {
            BufferedReader stdin =
                    new BufferedReader(
                            new InputStreamReader(System.in));
            System.out.println("Enter Username");
            String line = stdin.readLine();
            System.out.println("Enter password");
            String line0 = stdin.readLine();
            BufferedWriter fout =
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("Userinfomation.txt")));
            //   fout.write();
            fout.write(line);
            fout.write(line0);
            fout.close();
        } catch (IOException e) {
            System.out.println("...");
        }
    }
}
