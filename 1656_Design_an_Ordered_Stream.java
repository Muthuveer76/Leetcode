class OrderedStream {
    String[] arr;
    int count;
    public OrderedStream(int n) {
        arr = new String[n + 1];
        count = 1;

    }
    
    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        List<String> res = new ArrayList<>();
        while (count < arr.length && arr[count] != null) {
            res.add(arr[count]);
            count++;
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */