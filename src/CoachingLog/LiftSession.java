package CoachingLog;

import java.util.ArrayList;

public class LiftSession {
    private Lift lift;
    private String date;
    private ArrayList<LoggedSet> sets;

    public LiftSession(Lift lift, String date) {
        this.lift = lift;
        this.date = date;
        this.sets = new ArrayList<LoggedSet>();
    }

    public void addSet(LoggedSet set) {
        this.sets.add(set);
    }

    public ArrayList<LoggedSet> getSets() {
        return sets;
    }

}
