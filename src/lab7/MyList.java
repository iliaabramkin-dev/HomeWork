package lab7;

import java.util.AbstractList;

public class MyList extends AbstractList<Integer> {

    private Object[] arr;

    public MyList() {
        this.arr = new Object[0];
    }

    @Override
    public Integer get(int index) {
        return (Integer) arr[index];
    }

    @Override
    public boolean add(Integer value) {
        if (value == null) return false;
        Object[] newArr = new Object[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        arr = newArr;
        return true;
    }

    public boolean addFirst(Integer value) {
        if (value == null) return false;
        Object[] newArr = new Object[arr.length + 1];
        newArr[0] = value;
        for(int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        arr = newArr;
        return true;
    }

    @Override
    public Integer remove(int index) {
        if(index > arr.length) throw new ArrayIndexOutOfBoundsException();
        Object[] newArr = new Object[arr.length - 1];
        int n_i = 0;
        Integer res = null;
        for(int i = 0; i < arr.length; i++) {
            if (i == index) {
                res = (Integer) arr[index];
                continue;
            }
            newArr[n_i++] = arr[i];
        }
        arr = newArr;
        return res;
    }

    @Override
    public boolean remove(Object o) {
        if(o == null) throw new NullPointerException();
        Object[] newArr = new Object[arr.length - 1];
        int n_i = 0;
        boolean res = false;
        for (Object value : arr) {
            if (value.equals(o)) {
                res = true;
                continue;
            }
            newArr[n_i++] = value;
        }
        arr = newArr;
        return res;
    }

    @Override
    public int size() {
        return arr.length;
    }
}
