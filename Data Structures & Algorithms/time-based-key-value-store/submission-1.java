class TimeMap {

    static class Pair{
        int timestamp;
        String value;

        Pair(int timestamp,String value){
            this.timestamp = timestamp;
            this.value= value;
        }
    }

    HashMap<String,List<Pair>> timeMap;
    public TimeMap() {
        timeMap=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
    if(timeMap.containsKey(key)){
        List<Pair> timestampMap = timeMap.get(key);
        timestampMap.add(new Pair(timestamp,value));
    }else{
        List<Pair> newTimeStampMap = new ArrayList();
        Pair newPair = new Pair(timestamp,value);

        newTimeStampMap.add(newPair);
        timeMap.put(key,newTimeStampMap);
    }    
    }
    
    public String get(String key, int timestamp) {
        List<Pair> binaryArray = timeMap.get(key);
        if(binaryArray==null || binaryArray.isEmpty() || binaryArray.get(0).timestamp>timestamp) return "";

        int i=0,j=binaryArray.size()-1;

        while(i<=j){
            int mid = (i+j)/2;
            if(binaryArray.get(mid).timestamp == timestamp){
                return binaryArray.get(mid).value;
            }else if(binaryArray.get(mid).timestamp > timestamp){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return binaryArray.get(j).value;
    }
}
