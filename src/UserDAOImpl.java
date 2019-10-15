import java.io.*;

public class UserDAOImpl implements UserDAO {
    public void saveDAO() {
        try {
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(System.in));
            System.out.println("Enter Username");
            String line = in.readLine();
            System.out.println("Enter password");
            String line0 = in.readLine();
            BufferedWriter out = new BufferedWriter(new FileWriter(line));
            out.write(line + line0);
            out.close();
            System.out.println("user data saved !");
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
