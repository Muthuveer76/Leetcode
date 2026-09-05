class UndergroundSystem {
    private final Map<Integer, CheckIn> checkIns = new HashMap<>();
    private final Map<String, long[]> routes = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn checkIn = checkIns.remove(id);
        String route = checkIn.station + "#" + stationName;

        long[] data = routes.computeIfAbsent(route, x -> new long[2]);
        data[0] += t - checkIn.time;
        data[1]++;
    }

    public double getAverageTime(String startStation, String endStation) {
        long[] data = routes.get(startStation + "#" + endStation);
        return (double) data[0] / data[1];
    }

    private static class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */