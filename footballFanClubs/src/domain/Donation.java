package domain;

import java.util.Date;
import java.util.Objects;

public class Donation extends AbstractEntity<Long> {
    private long sum;
    private String sponsor;
    private Date date;

    public long getSum() { return sum; }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public Date getDate() { return date; }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Donation donation = (Donation) o;
        return Objects.equals(sum, donation.sum) && Objects.equals(sponsor, donation.sponsor)&& Objects.equals(date, donation.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sum,sponsor,date);
    }

    @Override
    public String toString() {
        return "Donation{"
                + "id='"
                + getId()
                + '\''
                + ", sum='"
                + sum
                + '\''
                + ", sponsor="
                + sponsor
                + '\''
                + ", date="
                + date
                + '\''
                + '}';
    }
}