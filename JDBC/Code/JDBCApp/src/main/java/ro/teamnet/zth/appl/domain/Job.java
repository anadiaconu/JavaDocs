package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

@Table(name="jobs")
public class Job {

    @Id(name="job_id")
    private String id;

    @Column(name="job_title")
    private String title;

    @Column(name="min_salary")
    private Long minSal;

    @Column(name="max_salary")
    private Long maxSal;

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

    public Long getMinSal() {
        return minSal;
    }

    public void setMinSal(Long minSal) {
        this.minSal = minSal;
    }

    public Long getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(Long maxSal) {
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
