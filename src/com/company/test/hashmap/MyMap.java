package collection;

/**
 * map接口对应
 */
public interface MyMap<K,V> {
    V get(K key);
    V put(K key,V value);

    interface MyEntry<K,V>{
        K getKey();
        V getValue();
    }
}
