package CoachingLog;

import java.util.ArrayList;

public class LiftSession {
    private Lift lift;
    private String date;
    private ArrayList<LoggedSet> sets;

    public LiftSession(Lift lift, String date) throws InvalidEntryException {
        if (lift == null || date == null || date.isBlank()) {
            throw new InvalidEntryException("Lift and date cannot be null or empty.");
        }
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

    public Lift getLift() {
        return lift;
    }

    public String getDate() {
        return date;
    }

    public double getTotalVolume() {
        double total = 0.0;
        for (int i = 0; i < sets.size(); i++) {
            total += sets.get(i).getVolume();
        }
        return total;
    }

    public double getBestEstimated1RM() {
        double best1RM = 0.0;
        for (int i = 0; i < sets.size(); i++) {
            double estimate = lift.calculate1RM(sets.get(i).getWeight(), sets.get(i).getActualReps());
            if (estimate > best1RM && sets.get(i).getActualReps() > 0) {
                best1RM = estimate;
            }
        }
        return best1RM;

    }

}
