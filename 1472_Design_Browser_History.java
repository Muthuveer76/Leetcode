class BrowserHistory {
    private Deque<String> back = new ArrayDeque<>();
    private Deque<String> forward = new ArrayDeque<>();

    public BrowserHistory(String homepage) {
        back.push(homepage);
    }

    public void visit(String url) {
        back.push(url);
        forward.clear();
    }

    public String back(int steps) {
        while (steps > 0 && back.size() > 1) {
            forward.push(back.pop());
            steps--;
        }

        return back.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && !forward.isEmpty()) {
            back.push(forward.pop());
            steps--;
        }

        return back.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */