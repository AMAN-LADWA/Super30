class MyHashSet {
    private boolean storage[][];
    private int buckets;
    private int bucketItems;
    public MyHashSet() {  
        buckets = 1000;
        bucketItems = 1001;
        storage = new boolean[buckets][];
    }
    
    private int getBucket(int key){
        return key%1000;
    }
    
    private int getBucketItem(int key){
        return key/1000;
    }
    
    public void add(int key) {
        int bucket = getBucket(key);
        int bucketItem = getBucketItem(key);
        if(storage[bucket] == null)
            storage[bucket] = new boolean[bucketItems];
        storage[bucket][bucketItem] = true;
    }
    
    public void remove(int key) {
        int bucket = getBucket(key);
        int bucketItem = getBucketItem(key);
        if(storage[bucket] == null)
            return;
        storage[bucket][bucketItem] = false;
    }
    
    public boolean contains(int key) {
        int bucket = getBucket(key);
        int bucketItem = getBucketItem(key);
        if(storage[bucket] == null) return false;
        return (storage[bucket][bucketItem]);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
