package domain;

import java.util.Objects;

public class FanClub extends AbstractEntity<Long> {

    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        FanClub fanClub = (FanClub) o;
        return Objects.equals(name, fanClub.name) && Objects.equals(country, fanClub.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, country);
    }

    @Override
    public String toString() {
        return "Fan club{"
                + "id='"
                + getId()
                + '\''
                + ", name='"
                + name
                + '\''
                + ", country="
                + country
                + '\''
                + '}';
    }
}