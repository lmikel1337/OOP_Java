
import java.io.*;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Container implements Containerr, Iterable<String>, Serializable{

    private static final long serialVersionUID = 1L;

    private int size = 0;
    private String[] data = null;

    public Container(){
        data = new String[0];
    }

    @Override
    public void add(String string) {
        if(data.length <= size)
            realloc();
        data[size++] = string;


    }

    public String get(int index){
        return index >= size ? null : data[index];
    }

    @Override
    public void clear() {
        size = 0;
        realloc();
    }

    @Override
    public boolean remove(String string) {
        for(int i = 0; i < size; ++i)
            if(data[i].equals(string)){
                for(int j = i; j < size - 1; ++j)
                    data[j] = data[j + 1];
                size--;
                return true;
            }
        return false;
    }

    @Override
    public Object[] toArray() {
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(String string) {
        for(int i = 0; i < size; ++i)
            if(data[i].equals(string))
                return true;
        return false;
    }

    @Override
    public boolean containsAll(Container container) {
        String[] s = (String[]) container.toArray();
        for(String s1 : s)
            if(!contains(s1))
                return false;
        return true;
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr<String>();
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(Iterator<String> it = iterator(); it.hasNext();)
            sb.append(it.next() + "\n");
        return sb.toString();
    }

    public void sort(){
        qsort(0, size - 1);
    }

    private void qsort(int b, int e){
        String tmp;
        int l = b;
        int r = e;
        int m = (l + r) / 2;
        while(l <= r){
            while(data[l].compareTo(data[m]) < 0)l++;
            while(data[r].compareTo(data[m]) > 0)r--;
            if(l <= r){
                tmp = data[l];
                data[l] = data[r];
                data[r] = tmp;
                l++;
                r--;
            }
        }
        if(b < r)
            qsort(b, r);
        if(e > l)
            qsort(l, e);
    }
    @Override
    public void compare() {

        String equalElems = "";
        int countOfEqual = 0;

        for (int i = 0; i < data.length; ++i) {

            for (int j = i + 1; j < data.length; ++j) {

                if (data[i].equals(data[j])) {

                    equalElems += data[i];
                    countOfEqual++;
                }
            }
        }

        if (equalElems.isEmpty()) {

            System.out.println("Don`t have the same elements");
        } else {

            countOfEqual++;
            System.out.println(equalElems + " - " + countOfEqual);
        }
    }

    private void realloc(){
        String[] buf = data;
        data = new String[size == 0 ? 1 : size * 2];
        for(int i = 0; i < Math.min(buf.length, data.length); ++i)
            data[i] = buf[i];
    }

    public void serealization() {
        try {
            File f = new File("illya.dat");
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f));
            o.writeObject(this);
            o.flush();
            o.close();
        } catch (Exception e) {
            System.err.println("Error serializing object");
        }

    }

    public void deserealization() {
        try {
            File f = new File("illya.dat");
            if(!f.exists())
                f.createNewFile();
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(f));
            Container buf = (Container)o.readObject();
            size = buf.size;
            data = buf.data;
            o.close();
        } catch (Exception e) {
            System.err.println("Error serializing object");
        }
    }

    public void read(){
        System.out.println("press x to stop adding ");
        Scanner in = new Scanner(System.in);
        String s;
        while(!(s = in.nextLine()).equals("x"))
            add(s);
    }

    class Itr<String> implements Iterator{

        int cursor = 0;
        int last = -1;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public Object next() throws NoSuchElementException {
            return cursor == size ? null : data[cursor++];
        }

        @Override
        public void remove() {
            if(last > 0 && last < size)
                Container.this.remove(data[last]);
        }
    }
}
