package Exam1;

import java.io.*;
import java.time.LocalDate;
import java.util.Optional;

public class Qn65 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Optional<LocalDate> optional = Optional.of(LocalDate.of(2018, 12, 1));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("F:\\date.ser")));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\date.ser")))
        {
            oos.writeObject(optional);

            Optional<?> object = (Optional<?>)ois.readObject();
            System.out.println(object.get());
        }

    }
}

//note that optional does not implement serializable. For outputstream, it is noted that should implement serializable