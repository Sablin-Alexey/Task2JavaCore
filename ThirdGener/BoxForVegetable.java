package ThirdGener;

 class BoxForVegetable<K, T extends Vegetable>{
private  T obj;
private K key;

public BoxForVegetable(K key , T obj) {
        this.obj = obj;
        this.key = key;

        }
public void setObj(T obj) {
        this.obj = obj;
        }
public void setKey(K key){
        this.key = key;
        }
public K getKey(){
        return this.key;
        }

public T getObj() {
        return this.obj;
        }
@Override
public String toString() {
        return "Box{" +
        "key=" + key +
        "; keyType=" + key.getClass().getName() +
        ", obj=" + obj +
        "; objType=" + obj.getClass().getName() +
        '}';
        }
        }