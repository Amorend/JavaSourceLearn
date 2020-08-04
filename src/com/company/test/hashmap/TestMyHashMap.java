package collection;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap<String,String> hashMap = new MyHashMap<>();
        hashMap.put("张三","张三");
        hashMap.put("李四","李四");
        hashMap.put("重地","重地");
        hashMap.put("重地","哈哈");
        System.out.println(hashMap.get("呵呵"));
    }
}
