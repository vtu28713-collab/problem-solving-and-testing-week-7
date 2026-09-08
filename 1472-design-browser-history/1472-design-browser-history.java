class BrowserHistory {

    private String[] history;
    private int current;
    private int last;

    public BrowserHistory(String homepage) {
        history = new String[5001];
        history[0] = homepage;
        current = 0;
        last = 0;
    }

    public void visit(String url) {
        current++;
        history[current] = url;
        last = current;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history[current];
    }

    public String forward(int steps) {
        current = Math.min(last, current + steps);
        return history[current];
    }
}