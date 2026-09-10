class LRUCache {

    LinkedHashMap<Integer,Integer> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache=new LinkedHashMap<>(capacity,0.75f,true);
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){  
            return cache.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
          if (cache.containsKey(key)) {
            cache.put(key, value);
            return;
        }

        if (cache.size() == capacity) {
            int lruKey = cache.keySet().iterator().next();
            cache.remove(lruKey);
        }

        cache.put(key, value);
    }
}
