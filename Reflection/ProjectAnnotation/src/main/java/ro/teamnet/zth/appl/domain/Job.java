package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;


/**
 * Created by Ana.Diaconu on 12-Jul-17.
 */
@Table(name="JOBS")
public class Job {

    @Id(name="JOB_ID")
    private String id;

    @Id(name="JOB_TITLE")
    private String title;

    @Id(name="MIN_SALARY")
    private double minSal;

    @Id(name="MAX_SALARY")
    private double maxSal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMinSal() {
        return minSal;
    }

    public void setMinSal(double minSal) {
        this.minSal = minSal;
    }

    public double getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(double maxSal) {
        this.maxSal = maxSal;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", minSal=" + minSal +
                ", maxSal=" + maxSal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (Double.compare(job.minSal, minSal) != 0) return false;
        if (Double.compare(job.maxSal, maxSal) != 0) return false;
        if (id != null ? !id.equals(job.id) : job.id != null) return false;
        return title != null ? title.equals(job.title) : job.title == null;
    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (title != null ? title.hashCode() : 0);
//        temp = Double.doubleToLongBits(minSal);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(maxSal);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
}
