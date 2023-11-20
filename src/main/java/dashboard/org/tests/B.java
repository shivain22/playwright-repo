package dashboard.org.tests;


import org.junit.Test;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class B extends A implements Closeable {
    @Override
    public void close() throws IOException {

    }

    public synchronized  int addData(int a, int b) {
        //logic to insert into db
        int c = a/b;
        List<String> l = new ArrayList();
        l.add("Test");

        return c;
    }



}
