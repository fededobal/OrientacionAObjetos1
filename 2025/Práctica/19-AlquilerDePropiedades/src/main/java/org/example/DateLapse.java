package org.example;

import java.time.LocalDate;

public class DateLapse {
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int sizeInDays() {
        return to.compareTo(from);
    }

    public boolean includesDate(LocalDate other) {
        return other.isAfter(from) && other.isBefore(to);
    }

    public boolean overlaps (DateLapse anotherDateLapse) {
        return includesDate(anotherDateLapse.getFrom())
                || includesDate(anotherDateLapse.getTo());
    }
}
