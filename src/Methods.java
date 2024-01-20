import java.io.*;

public class Methods {

    public void serialize(File file, Serializable object) throws Exception{

        OutputStream write = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(write);
        oos.writeObject(object);
        oos.close();
    }

    public void deserealize(File file) throws Exception{
        InputStream read = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(read);
        Serializable object = (Serializable) ois.readObject();
        System.out.println(object);
        ois.close();
        read.close();
    }


}
