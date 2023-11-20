package dashboard.org.tests;

import java.io.Closeable;
import java.io.Serializable;

public class A implements Serializable, Cloneable,Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String capitalizer(String name){
        return name.substring(0,1).toUpperCase()+name.substring(1,name.length());
    }
}
