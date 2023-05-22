public class Queue implements DataStructure{
    Object[] objects = new Object[100];
    int nextGet = 0;
    int nextPut = 0;
    int count = 0;

    @Override
    public boolean put(Object obj) {
        if(count < 100) {
            objects[nextPut] = obj;
            if (nextPut < 99) {
                nextPut = nextPut + 1;
            } else {
                nextPut = 0;
            }
            count = count + 1;
            return true;
        }
        else{
            System.out.println("put is over 100");
            return false;
        }
    }

    @Override
    public Object get() {
        if (count > 0) {
            Object obj = objects[nextGet];
            count = count - 1;
            if (nextGet <99) {
                nextGet = nextGet + 1;
            } else {
                nextGet = 0;
            }
            return obj;
        } else {
            System.out.println("get is over 100");
            return false;
        }
    }
}
