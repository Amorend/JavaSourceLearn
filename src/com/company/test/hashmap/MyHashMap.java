package collection;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;

public class MyHashMap<K,V> implements MyMap<K,V> {
    Node<K,V>[] table;
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    //链表转换为红黑树的临界值
    static final int TREEIFY_THRESHOLD = 8;
    int size;
    public MyHashMap() {
        table = new Node[DEFAULT_INITIAL_CAPACITY];
    }

    @Override
    public V get(K key) {
        Node<K,V>[] arr = table;
        Node<K,V> p,next;
        int h = hash(key);
        if (arr!=null&&arr.length>0){
            int index = indexForHash(h,table.length);
            p = arr[index];
            if (p==null){
                return null;
            }else{
                if (p.hash==h&&(p.k==key||(key!=null&&key.equals(p.k)))){
                    return p.value;
                }else if(p instanceof TreeNode){

                }else{
                    do{
                        next = p.next;
                        if (next.hash==h&&(next.k==key||(key!=null&&key.equals(next.k)))){
                            return next.value;
                        }
                        p = next;
                    }while(p.next!=null);
                }
            }

        }
        return null;
    }

    /**
     * 生成hashcode方法
     * @param key
     * @return
     */
    public static int hash(Object key){
        int h;
        return key==null?0:((h=key.hashCode())^(h>>>16));
    }

    /**
     * 根据哈希值和容量计算下标
     * @param hash
     * @param capacity
     * @return
     */
    public static int indexForHash(int hash,int capacity){
        return (hash&(capacity-1));
    }

    @Override
    public V put(K key, V value) {
        Node<K,V>[] arr = table;
        int n,index,h=hash(key);
        V oldValue = null;
        Node<K,V> p,e=null;
        if (arr==null||(n=arr.length)==0){
            //初始化
        }else if((p=arr[index = indexForHash(h,n)])==null){
            e = new Node<>(key,h,value,null);
            arr[index] = e;
        }else{
            for (int i = 0; p!=null; ) {
                e = p.next;

                if (p.hash==h&&(p.k==key||(key!=null&&key.equals(p.k)))){
                    e = p;
                    break;
                }
                if(e==null){
                    p.next = new Node<>(key,h,value,null);
                    if (i>=TREEIFY_THRESHOLD-1){
                        //把链表转化为红黑树
                    }
                    break;
                }


                p =e;
            }
            if (e!=null){
                oldValue = e.value;
                e.value = value;
                return oldValue;
            }


        }
        size++;
        return oldValue;
    }

    static class Node<K,V> implements MyEntry{
        final K k;
        final int hash;
        V value;
        Node next;

        public Node(K k, int hash, V value, Node next) {
            this.k = k;
            this.hash = hash;
            this.value = value;
            this.next = next;
        }

        @Override
        public Object getKey() {
            return k;
        }

        @Override
        public Object getValue() {
            return value;
        }
    }

}
